package jhi.seams.server.importer;

import jhi.seams.server.Database;
import jhi.seams.server.database.codegen.enums.MeasurementsMeasurementType;
import jhi.seams.server.database.codegen.tables.records.*;
import jhi.seams.server.util.StringUtils;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.jooq.*;
import org.jooq.impl.DSL;

import java.io.*;
import java.sql.*;
import java.util.*;
import java.util.stream.Collectors;

import static jhi.seams.server.database.codegen.tables.Components.*;
import static jhi.seams.server.database.codegen.tables.DatasetMeta.*;
import static jhi.seams.server.database.codegen.tables.Datasets.*;
import static jhi.seams.server.database.codegen.tables.MeasurementComponents.*;
import static jhi.seams.server.database.codegen.tables.Measurements.*;
import static jhi.seams.server.database.codegen.tables.Sites.*;
import static jhi.seams.server.database.codegen.tables.Traits.*;
import static jhi.seams.server.database.codegen.tables.Units.*;

public class DataImporter
{
	public static void main(String[] args)
	{
		File input = new File(args[0]);

		Database.init("localhost", "seams", null, "root", null, false);

		Map<String, ComponentsRecord> dbComponents = new HashMap<>();
		try (Connection conn = Database.getConnection();
			 DSLContext context = Database.getContext(conn))
		{
			context.selectFrom(COMPONENTS).forEach(c -> dbComponents.put(c.getCropName() + "|" + c.getVarietyName(), c));

			try (FileInputStream file = new FileInputStream(input);
				 Workbook wb = new XSSFWorkbook(file))
			{
				Sheet data = wb.getSheet("Form1");

				Row headers = data.getRow(0);

				Map<String, Integer> hm = new HashMap<>();
				for (Cell cell : headers)
				{
					hm.put(cell.getStringCellValue().replace('\u00A0', ' ').replace('\u2007', ' ').replace('\u202F', ' ').replace(' ', ' ').trim(), cell.getColumnIndex());
				}

				System.out.println(hm);

				TraitsRecord yield = context.selectFrom(TRAITS).where(TRAITS.NAME.eq("Yield")).fetchAny();
				TraitsRecord sowingRate = context.selectFrom(TRAITS).where(TRAITS.NAME.eq("Sowing rate")).fetchAny();
				UnitsRecord kgPHa = context.selectFrom(UNITS).where(UNITS.NAME.eq("kg/ha")).fetchAny();
				UnitsRecord tPHa = context.selectFrom(UNITS).where(UNITS.NAME.eq("t/ha")).fetchAny();

				if (yield == null)
				{
					yield = context.newRecord(TRAITS);
					yield.setName("Yield");
					yield.store();
				}
				if (sowingRate == null)
				{
					sowingRate = context.newRecord(TRAITS);
					sowingRate.setName("Sowing rate");
					sowingRate.store();
				}
				if (kgPHa == null)
				{
					kgPHa = context.newRecord(UNITS);
					kgPHa.setName("kg/ha");
					kgPHa.store();
				}
				if (tPHa == null)
				{
					tPHa = context.newRecord(UNITS);
					tPHa.setName("t/ha");
					tPHa.store();
				}

				for (int i = 1; i < data.getPhysicalNumberOfRows(); i++)
				{
					Row row = data.getRow(i);
					Integer id = getInt(row.getCell(hm.get("ID")));
					String email = getOptional(row.getCell(hm.get("Email address (this information will not be shared)")));
					String datasetName = getOptional(row.getCell(hm.get("Trial Identifier/dataset name")));
					String trialSite = getOptional(row.getCell(hm.get("Trial site - please input the first half of your postcode (e.g. DD2)")));
					Double longitude = getDouble(row.getCell(hm.get("Where is the trial - Longitude")));
					Double latitude = getDouble(row.getCell(hm.get("Where is the trial - Latitude")));
					String tillage = getOptional(row.getCell(hm.get("Tillage - please choose your tillage method.")));
					String fertilizer = getOptional(row.getCell(hm.get("Have you used fertiliser?")));
					String fertilizerDetails = getOptional(row.getCell(hm.get("Please give details about your fertiliser application.")));
					String herbicide = getOptional(row.getCell(hm.get("Have you used herbicides or pesticides?")));
					String herbicideDetails = getOptional(row.getCell(hm.get("Please give details about your herbicide and pesticide application.")));
					String farmManagement = getOptional(row.getCell(hm.get("Describe your farm management system e.g. organic, LEAF, conventional")));
					String weedCover = getOptional(row.getCell(hm.get("Weed Cover - if you have recorded weed cover % please record the details here.")));
					String disease = getOptional(row.getCell(hm.get("Disease  - if you have recorded disease incidence please record them here.")));
					String pests = getOptional(row.getCell(hm.get("Pests -if you have pest incidence please record them here.")));
					String soilHealth = getOptional(row.getCell(hm.get("Soil Health - please describe any observations.")));
					String biodiversity = getOptional(row.getCell(hm.get("Bio-diversity - if you have recorded bio-diversity please record your observations here.")));
					String coverCrop = getOptional(row.getCell(hm.get("What cover crop have you grown?")));
					Timestamp sowingDate = getTimestamp(row.getCell(hm.get("This section you will be inputting information about your plant mixtures.\nSowing Date")));
					Timestamp harvestDate = getTimestamp(row.getCell(hm.get("Harvest Date")));
					Integer componentCount = getInt(row.getCell(hm.get("How many components are in your mixture?")));
					if (componentCount == null)
						componentCount = 0;

					DatasetsRecord dataset = context.selectFrom(DATASETS).where(DATASETS.NAME.eq(datasetName).and(DATASETS.EXT_ID.eq(id))).fetchAny();

					if (dataset == null)
					{
						// Site
						SitesRecord site = context.selectFrom(SITES)
												  .where(SITES.NAME.eq(trialSite))
												  .and(SITES.LATITUDE.isNotDistinctFrom(latitude))
												  .and(SITES.LONGITUDE.isDistinctFrom(longitude))
												  .fetchAny();

						if (site == null)
						{
							site = context.newRecord(SITES);
							site.setName(trialSite);
							site.setLatitude(latitude);
							site.setLongitude(longitude);
							site.store();
						}

						// Dataset
						dataset = context.newRecord(DATASETS);
						dataset.setName(datasetName);
						dataset.setExtId(id);
						dataset.setSiteId(site.getId());
						dataset.store();

						// Dataset meta
						DatasetMetaRecord dm = context.newRecord(DATASET_META);
						dm.setDatasetId(dataset.getId());
						dm.setEmail(email);
						dm.setTillage(tillage);
						dm.setFertilizer(fertilizerDetails);
						dm.setHerbicide(herbicideDetails);
						dm.setFarmManagement(farmManagement);
						dm.setWeedCover(weedCover);
						dm.setDisease(disease);
						dm.setPests(pests);
						dm.setSoilHealth(soilHealth);
						dm.setBiodiversity(biodiversity);
						dm.setCoverCrop(coverCrop);
						dm.setSowingDate(sowingDate);
						dm.setHarvestDate(harvestDate);
						dm.store();
					}

					if (componentCount <= 6)
					{
						List<ComponentsRecord> crops = new ArrayList<>();

						Double yieldMixtureAsOne = getDouble(row.getCell(hm.get("Total mixture yield t/ha - " + componentCount + " components")));

						for (int c = 1; c <= componentCount; c++)
						{
							String cropName = row.getCell(hm.get("Component " + c + " of " + componentCount)).getStringCellValue();
							String varietyName = getOptional(row.getCell(hm.get("Component " + c + " of " + componentCount + " - Variety")));

							ComponentsRecord component = dbComponents.get(cropName + "|" + varietyName);

							if (component == null)
							{
								component = context.newRecord(COMPONENTS);
								component.setCropName(cropName);
								component.setVarietyName(varietyName);
								component.store();

								dbComponents.put(cropName + "|" + varietyName, component);
							}

							crops.add(component);

							Double sowingRateMonoculture = getDouble(row.getCell(hm.get("Monoculture - sowing rate kg/ha - component " + c + " of " + componentCount)));
							Double sowingRateMixture = getDouble(row.getCell(hm.get("Mixture - sowing rate kg/ha - component " + c + " of " + componentCount)));
							Double yieldMonoculture = getDouble(row.getCell(hm.get("Monoculture yield t/ha - component " + c + " of " + componentCount)));
							Double yieldMixture = getDouble(row.getCell(hm.get("Mixture yield - t/ha- component " + c + " of " + componentCount)));

							ensureExists(context, dataset.getId(), sowingRate.getId(), kgPHa.getId(), MeasurementsMeasurementType.mono, sowingRateMonoculture, component.getId());
							ensureExists(context, dataset.getId(), sowingRate.getId(), kgPHa.getId(), MeasurementsMeasurementType.mix, sowingRateMixture, component.getId());
							ensureExists(context, dataset.getId(), yield.getId(), tPHa.getId(), MeasurementsMeasurementType.mono, yieldMonoculture, component.getId());
							ensureExists(context, dataset.getId(), yield.getId(), tPHa.getId(), MeasurementsMeasurementType.mix, yieldMixture, component.getId());
						}

						ensureExists(context, dataset.getId(), yield.getId(), tPHa.getId(), MeasurementsMeasurementType.mix, yieldMixtureAsOne, crops.stream().map(ComponentsRecord::getId).toArray(Integer[]::new));
					}
				}

				System.out.println(hm);
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
		catch (SQLException throwables)
		{
			throwables.printStackTrace();
		}
	}

	private static void ensureExists(DSLContext context, int datasetId, int traitId, int unitId, MeasurementsMeasurementType type, Double measurement, Integer... components)
	{
		if (measurement == null || components == null)
			return;

		List<Field<?>> fields = new ArrayList<>(Arrays.asList(MEASUREMENTS.fields()));
		Field<String> componentsField = DSL.groupConcat(MEASUREMENT_COMPONENTS.COMPONENT_ID).orderBy(MEASUREMENT_COMPONENTS.COMPONENT_ID).separator(", ").as("components");
		fields.add(componentsField);

		MeasurementsRecord m = context.select(fields)
									  .from(MEASUREMENTS)
									  .leftJoin(MEASUREMENT_COMPONENTS).on(MEASUREMENT_COMPONENTS.MEASUREMENT_ID.eq(MEASUREMENTS.ID))
									  .where(MEASUREMENTS.DATASET_ID.eq(datasetId))
									  .and(MEASUREMENTS.TRAIT_ID.eq(traitId))
									  .and(MEASUREMENTS.TRAIT_UNIT_ID.eq(unitId))
									  .and(MEASUREMENTS.MEASUREMENT_TYPE.eq(type))
									  .and(MEASUREMENTS.MEASUREMENT.isNotDistinctFrom(measurement))
									  .groupBy(MEASUREMENTS.ID)
									  .having(componentsField.eq(Arrays.stream(components).map(c -> Integer.toString(c)).collect(Collectors.joining(", "))))
									  .fetchAnyInto(MeasurementsRecord.class);

		if (m == null)
		{
			m = context.newRecord(MEASUREMENTS);
			m.setDatasetId(datasetId);
			m.setTraitId(traitId);
			m.setTraitUnitId(unitId);
			m.setMeasurementType(type);
			m.setMeasurement(measurement);
			m.store();

			for (int c : components)
			{
				MeasurementComponentsRecord mc = context.newRecord(MEASUREMENT_COMPONENTS);
				mc.setMeasurementId(m.getId());
				mc.setComponentId(c);
				mc.store();
			}
		}
	}

	private static String getOptional(Cell cell)
	{
		try
		{
			String value = cell.getStringCellValue();

			if (StringUtils.isEmpty(value) || value.equalsIgnoreCase("not recorded") || value.equalsIgnoreCase("none") || value.equalsIgnoreCase("no data"))
			{
				return null;
			}
			else
			{
				return value;
			}
		}
		catch (Exception e)
		{
			return null;
		}
	}

	private static Timestamp getTimestamp(Cell cell)
	{
		try
		{
			if (cell.getCellType() == CellType.BLANK)
			{
				return null;
			}
			return new Timestamp(cell.getDateCellValue().getTime());
		}
		catch (Exception e)
		{
			return null;
		}
	}

	private static Integer getInt(Cell cell)
	{
		try
		{
			if (cell.getCellType() == CellType.BLANK)
			{
				return null;
			}
			return (int) cell.getNumericCellValue();
		}
		catch (Exception e)
		{
			try
			{
				return Integer.parseInt(cell.getStringCellValue());
			}
			catch (Exception e1)
			{
				return null;
			}
		}
	}

	private static Double getDouble(Cell cell)
	{
		try
		{
			if (cell.getCellType() == CellType.BLANK)
			{
				return null;
			}
			return cell.getNumericCellValue();
		}
		catch (Exception e)
		{
			try
			{
				String value = cell.getStringCellValue();
				return Double.parseDouble(value);
			}
			catch (Exception e1)
			{
				return null;
			}
		}
	}
}
