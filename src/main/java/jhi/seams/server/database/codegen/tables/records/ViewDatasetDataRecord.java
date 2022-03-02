/*
 * This file is generated by jOOQ.
 */
package jhi.seams.server.database.codegen.tables.records;


import jhi.seams.server.database.codegen.enums.ViewDatasetDataMeasurementType;
import jhi.seams.server.database.codegen.tables.ViewDatasetData;
import org.jooq.*;
import org.jooq.impl.TableRecordImpl;

import javax.annotation.Generated;
import java.sql.Timestamp;


// @formatter:off
/**
 * VIEW
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ViewDatasetDataRecord extends TableRecordImpl<ViewDatasetDataRecord> implements Record21<Integer, String, String, Double, Double, String, String, String, String, String, String, String, String, String, String, Timestamp, Timestamp, String[], Double, Double, ViewDatasetDataMeasurementType> {

    private static final long serialVersionUID = 1733898755;

    /**
     * Setter for <code>seams_db.view_dataset_data.dataset_id</code>.
     */
    public void setDatasetId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>seams_db.view_dataset_data.dataset_id</code>.
     */
    public Integer getDatasetId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>seams_db.view_dataset_data.dataset_name</code>.
     */
    public void setDatasetName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>seams_db.view_dataset_data.dataset_name</code>.
     */
    public String getDatasetName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>seams_db.view_dataset_data.site_name</code>.
     */
    public void setSiteName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>seams_db.view_dataset_data.site_name</code>.
     */
    public String getSiteName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>seams_db.view_dataset_data.latitude</code>.
     */
    public void setLatitude(Double value) {
        set(3, value);
    }

    /**
     * Getter for <code>seams_db.view_dataset_data.latitude</code>.
     */
    public Double getLatitude() {
        return (Double) get(3);
    }

    /**
     * Setter for <code>seams_db.view_dataset_data.longitude</code>.
     */
    public void setLongitude(Double value) {
        set(4, value);
    }

    /**
     * Getter for <code>seams_db.view_dataset_data.longitude</code>.
     */
    public Double getLongitude() {
        return (Double) get(4);
    }

    /**
     * Setter for <code>seams_db.view_dataset_data.tillage</code>.
     */
    public void setTillage(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>seams_db.view_dataset_data.tillage</code>.
     */
    public String getTillage() {
        return (String) get(5);
    }

    /**
     * Setter for <code>seams_db.view_dataset_data.fertilizer</code>.
     */
    public void setFertilizer(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>seams_db.view_dataset_data.fertilizer</code>.
     */
    public String getFertilizer() {
        return (String) get(6);
    }

    /**
     * Setter for <code>seams_db.view_dataset_data.herbicide</code>.
     */
    public void setHerbicide(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>seams_db.view_dataset_data.herbicide</code>.
     */
    public String getHerbicide() {
        return (String) get(7);
    }

    /**
     * Setter for <code>seams_db.view_dataset_data.farm_management</code>.
     */
    public void setFarmManagement(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>seams_db.view_dataset_data.farm_management</code>.
     */
    public String getFarmManagement() {
        return (String) get(8);
    }

    /**
     * Setter for <code>seams_db.view_dataset_data.weed_cover</code>.
     */
    public void setWeedCover(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>seams_db.view_dataset_data.weed_cover</code>.
     */
    public String getWeedCover() {
        return (String) get(9);
    }

    /**
     * Setter for <code>seams_db.view_dataset_data.disease</code>.
     */
    public void setDisease(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>seams_db.view_dataset_data.disease</code>.
     */
    public String getDisease() {
        return (String) get(10);
    }

    /**
     * Setter for <code>seams_db.view_dataset_data.pests</code>.
     */
    public void setPests(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>seams_db.view_dataset_data.pests</code>.
     */
    public String getPests() {
        return (String) get(11);
    }

    /**
     * Setter for <code>seams_db.view_dataset_data.soil_health</code>.
     */
    public void setSoilHealth(String value) {
        set(12, value);
    }

    /**
     * Getter for <code>seams_db.view_dataset_data.soil_health</code>.
     */
    public String getSoilHealth() {
        return (String) get(12);
    }

    /**
     * Setter for <code>seams_db.view_dataset_data.biodiversity</code>.
     */
    public void setBiodiversity(String value) {
        set(13, value);
    }

    /**
     * Getter for <code>seams_db.view_dataset_data.biodiversity</code>.
     */
    public String getBiodiversity() {
        return (String) get(13);
    }

    /**
     * Setter for <code>seams_db.view_dataset_data.crop_purpose</code>.
     */
    public void setCropPurpose(String value) {
        set(14, value);
    }

    /**
     * Getter for <code>seams_db.view_dataset_data.crop_purpose</code>.
     */
    public String getCropPurpose() {
        return (String) get(14);
    }

    /**
     * Setter for <code>seams_db.view_dataset_data.sowing_date</code>.
     */
    public void setSowingDate(Timestamp value) {
        set(15, value);
    }

    /**
     * Getter for <code>seams_db.view_dataset_data.sowing_date</code>.
     */
    public Timestamp getSowingDate() {
        return (Timestamp) get(15);
    }

    /**
     * Setter for <code>seams_db.view_dataset_data.harvest_date</code>.
     */
    public void setHarvestDate(Timestamp value) {
        set(16, value);
    }

    /**
     * Getter for <code>seams_db.view_dataset_data.harvest_date</code>.
     */
    public Timestamp getHarvestDate() {
        return (Timestamp) get(16);
    }

    /**
     * Setter for <code>seams_db.view_dataset_data.components</code>.
     */
    public void setComponents(String... value) {
        set(17, value);
    }

    /**
     * Getter for <code>seams_db.view_dataset_data.components</code>.
     */
    public String[] getComponents() {
        return (String[]) get(17);
    }

    /**
     * Setter for <code>seams_db.view_dataset_data.sowing_rate</code>.
     */
    public void setSowingRate(Double value) {
        set(18, value);
    }

    /**
     * Getter for <code>seams_db.view_dataset_data.sowing_rate</code>.
     */
    public Double getSowingRate() {
        return (Double) get(18);
    }

    /**
     * Setter for <code>seams_db.view_dataset_data.yield</code>.
     */
    public void setYield(Double value) {
        set(19, value);
    }

    /**
     * Getter for <code>seams_db.view_dataset_data.yield</code>.
     */
    public Double getYield() {
        return (Double) get(19);
    }

    /**
     * Setter for <code>seams_db.view_dataset_data.measurement_type</code>.
     */
    public void setMeasurementType(ViewDatasetDataMeasurementType value) {
        set(20, value);
    }

    /**
     * Getter for <code>seams_db.view_dataset_data.measurement_type</code>.
     */
    public ViewDatasetDataMeasurementType getMeasurementType() {
        return (ViewDatasetDataMeasurementType) get(20);
    }

    // -------------------------------------------------------------------------
    // Record21 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row21<Integer, String, String, Double, Double, String, String, String, String, String, String, String, String, String, String, Timestamp, Timestamp, String[], Double, Double, ViewDatasetDataMeasurementType> fieldsRow() {
        return (Row21) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row21<Integer, String, String, Double, Double, String, String, String, String, String, String, String, String, String, String, Timestamp, Timestamp, String[], Double, Double, ViewDatasetDataMeasurementType> valuesRow() {
        return (Row21) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return ViewDatasetData.VIEW_DATASET_DATA.DATASET_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return ViewDatasetData.VIEW_DATASET_DATA.DATASET_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return ViewDatasetData.VIEW_DATASET_DATA.SITE_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field4() {
        return ViewDatasetData.VIEW_DATASET_DATA.LATITUDE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field5() {
        return ViewDatasetData.VIEW_DATASET_DATA.LONGITUDE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return ViewDatasetData.VIEW_DATASET_DATA.TILLAGE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return ViewDatasetData.VIEW_DATASET_DATA.FERTILIZER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return ViewDatasetData.VIEW_DATASET_DATA.HERBICIDE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return ViewDatasetData.VIEW_DATASET_DATA.FARM_MANAGEMENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return ViewDatasetData.VIEW_DATASET_DATA.WEED_COVER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return ViewDatasetData.VIEW_DATASET_DATA.DISEASE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field12() {
        return ViewDatasetData.VIEW_DATASET_DATA.PESTS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field13() {
        return ViewDatasetData.VIEW_DATASET_DATA.SOIL_HEALTH;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field14() {
        return ViewDatasetData.VIEW_DATASET_DATA.BIODIVERSITY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field15() {
        return ViewDatasetData.VIEW_DATASET_DATA.CROP_PURPOSE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field16() {
        return ViewDatasetData.VIEW_DATASET_DATA.SOWING_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field17() {
        return ViewDatasetData.VIEW_DATASET_DATA.HARVEST_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String[]> field18() {
        return ViewDatasetData.VIEW_DATASET_DATA.COMPONENTS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field19() {
        return ViewDatasetData.VIEW_DATASET_DATA.SOWING_RATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field20() {
        return ViewDatasetData.VIEW_DATASET_DATA.YIELD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ViewDatasetDataMeasurementType> field21() {
        return ViewDatasetData.VIEW_DATASET_DATA.MEASUREMENT_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getDatasetId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getDatasetName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getSiteName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double component4() {
        return getLatitude();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double component5() {
        return getLongitude();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getTillage();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getFertilizer();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getHerbicide();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component9() {
        return getFarmManagement();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component10() {
        return getWeedCover();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component11() {
        return getDisease();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component12() {
        return getPests();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component13() {
        return getSoilHealth();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component14() {
        return getBiodiversity();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component15() {
        return getCropPurpose();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component16() {
        return getSowingDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component17() {
        return getHarvestDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String[] component18() {
        return getComponents();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double component19() {
        return getSowingRate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double component20() {
        return getYield();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewDatasetDataMeasurementType component21() {
        return getMeasurementType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getDatasetId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getDatasetName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getSiteName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value4() {
        return getLatitude();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value5() {
        return getLongitude();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getTillage();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getFertilizer();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getHerbicide();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getFarmManagement();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getWeedCover();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value11() {
        return getDisease();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value12() {
        return getPests();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value13() {
        return getSoilHealth();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value14() {
        return getBiodiversity();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value15() {
        return getCropPurpose();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value16() {
        return getSowingDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value17() {
        return getHarvestDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String[] value18() {
        return getComponents();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value19() {
        return getSowingRate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value20() {
        return getYield();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewDatasetDataMeasurementType value21() {
        return getMeasurementType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewDatasetDataRecord value1(Integer value) {
        setDatasetId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewDatasetDataRecord value2(String value) {
        setDatasetName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewDatasetDataRecord value3(String value) {
        setSiteName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewDatasetDataRecord value4(Double value) {
        setLatitude(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewDatasetDataRecord value5(Double value) {
        setLongitude(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewDatasetDataRecord value6(String value) {
        setTillage(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewDatasetDataRecord value7(String value) {
        setFertilizer(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewDatasetDataRecord value8(String value) {
        setHerbicide(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewDatasetDataRecord value9(String value) {
        setFarmManagement(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewDatasetDataRecord value10(String value) {
        setWeedCover(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewDatasetDataRecord value11(String value) {
        setDisease(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewDatasetDataRecord value12(String value) {
        setPests(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewDatasetDataRecord value13(String value) {
        setSoilHealth(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewDatasetDataRecord value14(String value) {
        setBiodiversity(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewDatasetDataRecord value15(String value) {
        setCropPurpose(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewDatasetDataRecord value16(Timestamp value) {
        setSowingDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewDatasetDataRecord value17(Timestamp value) {
        setHarvestDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewDatasetDataRecord value18(String... value) {
        setComponents(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewDatasetDataRecord value19(Double value) {
        setSowingRate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewDatasetDataRecord value20(Double value) {
        setYield(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewDatasetDataRecord value21(ViewDatasetDataMeasurementType value) {
        setMeasurementType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewDatasetDataRecord values(Integer value1, String value2, String value3, Double value4, Double value5, String value6, String value7, String value8, String value9, String value10, String value11, String value12, String value13, String value14, String value15, Timestamp value16, Timestamp value17, String[] value18, Double value19, Double value20, ViewDatasetDataMeasurementType value21) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        value13(value13);
        value14(value14);
        value15(value15);
        value16(value16);
        value17(value17);
        value18(value18);
        value19(value19);
        value20(value20);
        value21(value21);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ViewDatasetDataRecord
     */
    public ViewDatasetDataRecord() {
        super(ViewDatasetData.VIEW_DATASET_DATA);
    }

    /**
     * Create a detached, initialised ViewDatasetDataRecord
     */
    public ViewDatasetDataRecord(Integer datasetId, String datasetName, String siteName, Double latitude, Double longitude, String tillage, String fertilizer, String herbicide, String farmManagement, String weedCover, String disease, String pests, String soilHealth, String biodiversity, String cropPurpose, Timestamp sowingDate, Timestamp harvestDate, String[] components, Double sowingRate, Double yield, ViewDatasetDataMeasurementType measurementType) {
        super(ViewDatasetData.VIEW_DATASET_DATA);

        set(0, datasetId);
        set(1, datasetName);
        set(2, siteName);
        set(3, latitude);
        set(4, longitude);
        set(5, tillage);
        set(6, fertilizer);
        set(7, herbicide);
        set(8, farmManagement);
        set(9, weedCover);
        set(10, disease);
        set(11, pests);
        set(12, soilHealth);
        set(13, biodiversity);
        set(14, cropPurpose);
        set(15, sowingDate);
        set(16, harvestDate);
        set(17, components);
        set(18, sowingRate);
        set(19, yield);
        set(20, measurementType);
    }
// @formatter:on
}
