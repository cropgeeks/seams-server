/*
 * This file is generated by jOOQ.
 */
package jhi.seams.server.database.codegen.tables.records;


import jhi.seams.server.database.codegen.enums.ViewMeasurementComponentsMeasurementType;
import jhi.seams.server.database.codegen.tables.ViewMeasurementComponents;
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
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class ViewMeasurementComponentsRecord extends TableRecordImpl<ViewMeasurementComponentsRecord> implements Record10<Integer[], Integer, Integer, Integer, String, Integer, String, Double, ViewMeasurementComponentsMeasurementType, Timestamp>
{

    private static final long serialVersionUID = 1398312968;

    /**
     * Create a detached, initialised ViewMeasurementComponentsRecord
     */
    public ViewMeasurementComponentsRecord(Integer[] componentIds, Integer measurementId, Integer datasetId, Integer traitId, String traitName, Integer traitUnitId, String traitUnitName, Double measurement, ViewMeasurementComponentsMeasurementType measurementType, Timestamp createdOn)
    {
        super(ViewMeasurementComponents.VIEW_MEASUREMENT_COMPONENTS);

        set(0, componentIds);
        set(1, measurementId);
        set(2, datasetId);
        set(3, traitId);
        set(4, traitName);
        set(5, traitUnitId);
        set(6, traitUnitName);
        set(7, measurement);
        set(8, measurementType);
        set(9, createdOn);
    }

    /**
     * Getter for <code>seams_db.view_measurement_components.component_ids</code>.
     */
    public Integer[] getComponentIds()
    {
        return (Integer[]) get(0);
    }

    /**
     * Setter for <code>seams_db.view_measurement_components.measurement_id</code>.
     */
    public void setMeasurementId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>seams_db.view_measurement_components.measurement_id</code>.
     */
    public Integer getMeasurementId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>seams_db.view_measurement_components.dataset_id</code>.
     */
    public void setDatasetId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>seams_db.view_measurement_components.dataset_id</code>.
     */
    public Integer getDatasetId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>seams_db.view_measurement_components.trait_id</code>.
     */
    public void setTraitId(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>seams_db.view_measurement_components.trait_id</code>.
     */
    public Integer getTraitId() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>seams_db.view_measurement_components.trait_name</code>.
     */
    public void setTraitName(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>seams_db.view_measurement_components.trait_name</code>.
     */
    public String getTraitName() {
        return (String) get(4);
    }

    /**
     * Setter for <code>seams_db.view_measurement_components.trait_unit_id</code>.
     */
    public void setTraitUnitId(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>seams_db.view_measurement_components.trait_unit_id</code>.
     */
    public Integer getTraitUnitId() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>seams_db.view_measurement_components.trait_unit_name</code>.
     */
    public void setTraitUnitName(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>seams_db.view_measurement_components.trait_unit_name</code>.
     */
    public String getTraitUnitName() {
        return (String) get(6);
    }

    /**
     * Setter for <code>seams_db.view_measurement_components.measurement</code>.
     */
    public void setMeasurement(Double value) {
        set(7, value);
    }

    /**
     * Getter for <code>seams_db.view_measurement_components.measurement</code>.
     */
    public Double getMeasurement() {
        return (Double) get(7);
    }

    /**
     * Setter for <code>seams_db.view_measurement_components.measurement_type</code>.
     */
    public void setMeasurementType(ViewMeasurementComponentsMeasurementType value) {
        set(8, value);
    }

    /**
     * Getter for <code>seams_db.view_measurement_components.measurement_type</code>.
     */
    public ViewMeasurementComponentsMeasurementType getMeasurementType() {
        return (ViewMeasurementComponentsMeasurementType) get(8);
    }

    /**
     * Setter for <code>seams_db.view_measurement_components.created_on</code>.
     */
    public void setCreatedOn(Timestamp value) {
        set(9, value);
    }

    /**
     * Getter for <code>seams_db.view_measurement_components.created_on</code>.
     */
    public Timestamp getCreatedOn()
    {
        return (Timestamp) get(9);
    }

    // -------------------------------------------------------------------------
    // Record10 type implementation
    // -------------------------------------------------------------------------

    /**
     * Setter for <code>seams_db.view_measurement_components.component_ids</code>.
     */
    public void setComponentIds(Integer... value)
    {
        set(0, value);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<Integer[], Integer, Integer, Integer, String, Integer, String, Double, ViewMeasurementComponentsMeasurementType, Timestamp> fieldsRow()
    {
        return (Row10) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<Integer[], Integer, Integer, Integer, String, Integer, String, Double, ViewMeasurementComponentsMeasurementType, Timestamp> valuesRow()
    {
        return (Row10) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return ViewMeasurementComponents.VIEW_MEASUREMENT_COMPONENTS.MEASUREMENT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return ViewMeasurementComponents.VIEW_MEASUREMENT_COMPONENTS.DATASET_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return ViewMeasurementComponents.VIEW_MEASUREMENT_COMPONENTS.TRAIT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return ViewMeasurementComponents.VIEW_MEASUREMENT_COMPONENTS.TRAIT_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field6() {
        return ViewMeasurementComponents.VIEW_MEASUREMENT_COMPONENTS.TRAIT_UNIT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return ViewMeasurementComponents.VIEW_MEASUREMENT_COMPONENTS.TRAIT_UNIT_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field8() {
        return ViewMeasurementComponents.VIEW_MEASUREMENT_COMPONENTS.MEASUREMENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ViewMeasurementComponentsMeasurementType> field9() {
        return ViewMeasurementComponents.VIEW_MEASUREMENT_COMPONENTS.MEASUREMENT_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field10() {
        return ViewMeasurementComponents.VIEW_MEASUREMENT_COMPONENTS.CREATED_ON;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer[]> field1()
    {
        return ViewMeasurementComponents.VIEW_MEASUREMENT_COMPONENTS.COMPONENT_IDS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component2() {
        return getMeasurementId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component3() {
        return getDatasetId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component4() {
        return getTraitId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getTraitName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component6() {
        return getTraitUnitId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getTraitUnitName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double component8() {
        return getMeasurement();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewMeasurementComponentsMeasurementType component9() {
        return getMeasurementType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component10() {
        return getCreatedOn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer[] component1()
    {
        return getComponentIds();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getMeasurementId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getDatasetId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getTraitId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getTraitName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value6() {
        return getTraitUnitId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getTraitUnitName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value8() {
        return getMeasurement();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewMeasurementComponentsMeasurementType value9() {
        return getMeasurementType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value10() {
        return getCreatedOn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer[] value1()
    {
        return getComponentIds();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewMeasurementComponentsRecord value2(Integer value) {
        setMeasurementId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewMeasurementComponentsRecord value3(Integer value) {
        setDatasetId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewMeasurementComponentsRecord value4(Integer value) {
        setTraitId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewMeasurementComponentsRecord value5(String value) {
        setTraitName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewMeasurementComponentsRecord value6(Integer value) {
        setTraitUnitId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewMeasurementComponentsRecord value7(String value) {
        setTraitUnitName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewMeasurementComponentsRecord value8(Double value) {
        setMeasurement(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewMeasurementComponentsRecord value9(ViewMeasurementComponentsMeasurementType value) {
        setMeasurementType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewMeasurementComponentsRecord value10(Timestamp value)
    {
        setCreatedOn(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewMeasurementComponentsRecord value1(Integer... value)
    {
        setComponentIds(value);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ViewMeasurementComponentsRecord
     */
    public ViewMeasurementComponentsRecord()
    {
        super(ViewMeasurementComponents.VIEW_MEASUREMENT_COMPONENTS);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewMeasurementComponentsRecord values(Integer[] value1, Integer value2, Integer value3, Integer value4, String value5, Integer value6, String value7, Double value8, ViewMeasurementComponentsMeasurementType value9, Timestamp value10)
    {
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
        return this;
    }
// @formatter:on
}
