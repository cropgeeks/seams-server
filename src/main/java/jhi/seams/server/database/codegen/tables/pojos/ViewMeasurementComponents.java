/*
 * This file is generated by jOOQ.
 */
package jhi.seams.server.database.codegen.tables.pojos;


import jhi.seams.server.database.codegen.enums.ViewMeasurementComponentsMeasurementType;

import javax.annotation.Generated;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Arrays;


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
public class ViewMeasurementComponents implements Serializable {

    private static final long serialVersionUID = -518750093;

    private Integer[]                                componentIds;
    private Integer                                  measurementId;
    private Integer                                  datasetId;
    private Integer                                  traitId;
    private String                                   traitName;
    private Integer                                  traitUnitId;
    private String                                   traitUnitName;
    private Double                                   measurement;
    private ViewMeasurementComponentsMeasurementType measurementType;
    private Timestamp                                createdOn;

    public ViewMeasurementComponents() {}

    public ViewMeasurementComponents(ViewMeasurementComponents value) {
        this.componentIds = value.componentIds;
        this.measurementId = value.measurementId;
        this.datasetId = value.datasetId;
        this.traitId = value.traitId;
        this.traitName = value.traitName;
        this.traitUnitId = value.traitUnitId;
        this.traitUnitName = value.traitUnitName;
        this.measurement = value.measurement;
        this.measurementType = value.measurementType;
        this.createdOn = value.createdOn;
    }

    public ViewMeasurementComponents(
        Integer[] componentIds,
        Integer measurementId,
        Integer datasetId,
        Integer traitId,
        String traitName,
        Integer traitUnitId,
        String traitUnitName,
        Double measurement,
        ViewMeasurementComponentsMeasurementType measurementType,
        Timestamp createdOn
    ) {
        this.componentIds = componentIds;
        this.measurementId = measurementId;
        this.datasetId = datasetId;
        this.traitId = traitId;
        this.traitName = traitName;
        this.traitUnitId = traitUnitId;
        this.traitUnitName = traitUnitName;
        this.measurement = measurement;
        this.measurementType = measurementType;
        this.createdOn = createdOn;
    }

    public Integer[] getComponentIds()
    {
        return this.componentIds;
    }

    public void setComponentIds(Integer... componentIds)
    {
        this.componentIds = componentIds;
    }

    public Integer getMeasurementId()
    {
        return this.measurementId;
    }

    public void setMeasurementId(Integer measurementId)
    {
        this.measurementId = measurementId;
    }

    public Integer getDatasetId() {
        return this.datasetId;
    }

    public void setDatasetId(Integer datasetId) {
        this.datasetId = datasetId;
    }

    public Integer getTraitId() {
        return this.traitId;
    }

    public void setTraitId(Integer traitId) {
        this.traitId = traitId;
    }

    public String getTraitName() {
        return this.traitName;
    }

    public void setTraitName(String traitName) {
        this.traitName = traitName;
    }

    public Integer getTraitUnitId() {
        return this.traitUnitId;
    }

    public void setTraitUnitId(Integer traitUnitId) {
        this.traitUnitId = traitUnitId;
    }

    public String getTraitUnitName() {
        return this.traitUnitName;
    }

    public void setTraitUnitName(String traitUnitName) {
        this.traitUnitName = traitUnitName;
    }

    public Double getMeasurement() {
        return this.measurement;
    }

    public void setMeasurement(Double measurement) {
        this.measurement = measurement;
    }

    public ViewMeasurementComponentsMeasurementType getMeasurementType() {
        return this.measurementType;
    }

    public void setMeasurementType(ViewMeasurementComponentsMeasurementType measurementType) {
        this.measurementType = measurementType;
    }

    public Timestamp getCreatedOn() {
        return this.createdOn;
    }

    public void setCreatedOn(Timestamp createdOn) {
        this.createdOn = createdOn;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ViewMeasurementComponents (");

        sb.append(Arrays.toString(componentIds));
        sb.append(", ").append(measurementId);
        sb.append(", ").append(datasetId);
        sb.append(", ").append(traitId);
        sb.append(", ").append(traitName);
        sb.append(", ").append(traitUnitId);
        sb.append(", ").append(traitUnitName);
        sb.append(", ").append(measurement);
        sb.append(", ").append(measurementType);
        sb.append(", ").append(createdOn);

        sb.append(")");
        return sb.toString();
    }
// @formatter:on
}
