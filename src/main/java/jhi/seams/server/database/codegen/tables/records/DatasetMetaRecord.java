/*
 * This file is generated by jOOQ.
 */
package jhi.seams.server.database.codegen.tables.records;


import jhi.seams.server.database.codegen.tables.DatasetMeta;
import org.jooq.*;
import org.jooq.impl.UpdatableRecordImpl;

import javax.annotation.Generated;
import java.sql.Timestamp;


// @formatter:off
/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DatasetMetaRecord extends UpdatableRecordImpl<DatasetMetaRecord> implements Record16<Integer, String, String, String, String, String, String, String, String, String, String, String, Timestamp, Timestamp, Timestamp, Timestamp> {

    private static final long serialVersionUID = -175680721;

    /**
     * Setter for <code>seams_db.dataset_meta.dataset_id</code>.
     */
    public void setDatasetId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>seams_db.dataset_meta.dataset_id</code>.
     */
    public Integer getDatasetId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>seams_db.dataset_meta.email</code>.
     */
    public void setEmail(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>seams_db.dataset_meta.email</code>.
     */
    public String getEmail() {
        return (String) get(1);
    }

    /**
     * Setter for <code>seams_db.dataset_meta.tillage</code>.
     */
    public void setTillage(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>seams_db.dataset_meta.tillage</code>.
     */
    public String getTillage() {
        return (String) get(2);
    }

    /**
     * Setter for <code>seams_db.dataset_meta.fertilizer</code>.
     */
    public void setFertilizer(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>seams_db.dataset_meta.fertilizer</code>.
     */
    public String getFertilizer() {
        return (String) get(3);
    }

    /**
     * Setter for <code>seams_db.dataset_meta.herbicide</code>.
     */
    public void setHerbicide(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>seams_db.dataset_meta.herbicide</code>.
     */
    public String getHerbicide() {
        return (String) get(4);
    }

    /**
     * Setter for <code>seams_db.dataset_meta.farm_management</code>.
     */
    public void setFarmManagement(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>seams_db.dataset_meta.farm_management</code>.
     */
    public String getFarmManagement() {
        return (String) get(5);
    }

    /**
     * Setter for <code>seams_db.dataset_meta.weed_cover</code>.
     */
    public void setWeedCover(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>seams_db.dataset_meta.weed_cover</code>.
     */
    public String getWeedCover() {
        return (String) get(6);
    }

    /**
     * Setter for <code>seams_db.dataset_meta.disease</code>.
     */
    public void setDisease(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>seams_db.dataset_meta.disease</code>.
     */
    public String getDisease() {
        return (String) get(7);
    }

    /**
     * Setter for <code>seams_db.dataset_meta.pests</code>.
     */
    public void setPests(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>seams_db.dataset_meta.pests</code>.
     */
    public String getPests() {
        return (String) get(8);
    }

    /**
     * Setter for <code>seams_db.dataset_meta.soil_health</code>.
     */
    public void setSoilHealth(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>seams_db.dataset_meta.soil_health</code>.
     */
    public String getSoilHealth() {
        return (String) get(9);
    }

    /**
     * Setter for <code>seams_db.dataset_meta.biodiversity</code>.
     */
    public void setBiodiversity(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>seams_db.dataset_meta.biodiversity</code>.
     */
    public String getBiodiversity() {
        return (String) get(10);
    }

    /**
     * Setter for <code>seams_db.dataset_meta.cover_crop</code>.
     */
    public void setCoverCrop(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>seams_db.dataset_meta.cover_crop</code>.
     */
    public String getCoverCrop() {
        return (String) get(11);
    }

    /**
     * Setter for <code>seams_db.dataset_meta.sowing_date</code>.
     */
    public void setSowingDate(Timestamp value) {
        set(12, value);
    }

    /**
     * Getter for <code>seams_db.dataset_meta.sowing_date</code>.
     */
    public Timestamp getSowingDate() {
        return (Timestamp) get(12);
    }

    /**
     * Setter for <code>seams_db.dataset_meta.harvest_date</code>.
     */
    public void setHarvestDate(Timestamp value) {
        set(13, value);
    }

    /**
     * Getter for <code>seams_db.dataset_meta.harvest_date</code>.
     */
    public Timestamp getHarvestDate() {
        return (Timestamp) get(13);
    }

    /**
     * Setter for <code>seams_db.dataset_meta.created_on</code>.
     */
    public void setCreatedOn(Timestamp value) {
        set(14, value);
    }

    /**
     * Getter for <code>seams_db.dataset_meta.created_on</code>.
     */
    public Timestamp getCreatedOn() {
        return (Timestamp) get(14);
    }

    /**
     * Setter for <code>seams_db.dataset_meta.updated_on</code>.
     */
    public void setUpdatedOn(Timestamp value) {
        set(15, value);
    }

    /**
     * Getter for <code>seams_db.dataset_meta.updated_on</code>.
     */
    public Timestamp getUpdatedOn() {
        return (Timestamp) get(15);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record16 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row16<Integer, String, String, String, String, String, String, String, String, String, String, String, Timestamp, Timestamp, Timestamp, Timestamp> fieldsRow() {
        return (Row16) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row16<Integer, String, String, String, String, String, String, String, String, String, String, String, Timestamp, Timestamp, Timestamp, Timestamp> valuesRow() {
        return (Row16) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return DatasetMeta.DATASET_META.DATASET_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return DatasetMeta.DATASET_META.EMAIL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return DatasetMeta.DATASET_META.TILLAGE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return DatasetMeta.DATASET_META.FERTILIZER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return DatasetMeta.DATASET_META.HERBICIDE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return DatasetMeta.DATASET_META.FARM_MANAGEMENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return DatasetMeta.DATASET_META.WEED_COVER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return DatasetMeta.DATASET_META.DISEASE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return DatasetMeta.DATASET_META.PESTS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return DatasetMeta.DATASET_META.SOIL_HEALTH;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return DatasetMeta.DATASET_META.BIODIVERSITY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field12() {
        return DatasetMeta.DATASET_META.COVER_CROP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field13() {
        return DatasetMeta.DATASET_META.SOWING_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field14() {
        return DatasetMeta.DATASET_META.HARVEST_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field15() {
        return DatasetMeta.DATASET_META.CREATED_ON;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field16() {
        return DatasetMeta.DATASET_META.UPDATED_ON;
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
        return getEmail();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getTillage();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getFertilizer();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getHerbicide();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getFarmManagement();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getWeedCover();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getDisease();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component9() {
        return getPests();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component10() {
        return getSoilHealth();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component11() {
        return getBiodiversity();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component12() {
        return getCoverCrop();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component13() {
        return getSowingDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component14() {
        return getHarvestDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component15() {
        return getCreatedOn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component16() {
        return getUpdatedOn();
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
        return getEmail();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getTillage();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getFertilizer();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getHerbicide();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getFarmManagement();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getWeedCover();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getDisease();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getPests();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getSoilHealth();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value11() {
        return getBiodiversity();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value12() {
        return getCoverCrop();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value13() {
        return getSowingDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value14() {
        return getHarvestDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value15() {
        return getCreatedOn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value16() {
        return getUpdatedOn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DatasetMetaRecord value1(Integer value) {
        setDatasetId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DatasetMetaRecord value2(String value) {
        setEmail(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DatasetMetaRecord value3(String value) {
        setTillage(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DatasetMetaRecord value4(String value) {
        setFertilizer(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DatasetMetaRecord value5(String value) {
        setHerbicide(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DatasetMetaRecord value6(String value) {
        setFarmManagement(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DatasetMetaRecord value7(String value) {
        setWeedCover(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DatasetMetaRecord value8(String value) {
        setDisease(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DatasetMetaRecord value9(String value) {
        setPests(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DatasetMetaRecord value10(String value) {
        setSoilHealth(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DatasetMetaRecord value11(String value) {
        setBiodiversity(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DatasetMetaRecord value12(String value) {
        setCoverCrop(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DatasetMetaRecord value13(Timestamp value) {
        setSowingDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DatasetMetaRecord value14(Timestamp value) {
        setHarvestDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DatasetMetaRecord value15(Timestamp value) {
        setCreatedOn(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DatasetMetaRecord value16(Timestamp value) {
        setUpdatedOn(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DatasetMetaRecord values(Integer value1, String value2, String value3, String value4, String value5, String value6, String value7, String value8, String value9, String value10, String value11, String value12, Timestamp value13, Timestamp value14, Timestamp value15, Timestamp value16) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached DatasetMetaRecord
     */
    public DatasetMetaRecord() {
        super(DatasetMeta.DATASET_META);
    }

    /**
     * Create a detached, initialised DatasetMetaRecord
     */
    public DatasetMetaRecord(Integer datasetId, String email, String tillage, String fertilizer, String herbicide, String farmManagement, String weedCover, String disease, String pests, String soilHealth, String biodiversity, String coverCrop, Timestamp sowingDate, Timestamp harvestDate, Timestamp createdOn, Timestamp updatedOn) {
        super(DatasetMeta.DATASET_META);

        set(0, datasetId);
        set(1, email);
        set(2, tillage);
        set(3, fertilizer);
        set(4, herbicide);
        set(5, farmManagement);
        set(6, weedCover);
        set(7, disease);
        set(8, pests);
        set(9, soilHealth);
        set(10, biodiversity);
        set(11, coverCrop);
        set(12, sowingDate);
        set(13, harvestDate);
        set(14, createdOn);
        set(15, updatedOn);
    }
// @formatter:on
}