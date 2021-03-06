/*
 * This file is generated by jOOQ.
 */
package jhi.seams.server.database.codegen.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;


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
public class MeasurementComponents implements Serializable {

    private static final long serialVersionUID = 141149952;

    private Integer   measurementId;
    private Integer   componentId;
    private Timestamp createdOn;
    private Timestamp updatedOn;

    public MeasurementComponents() {}

    public MeasurementComponents(MeasurementComponents value) {
        this.measurementId = value.measurementId;
        this.componentId = value.componentId;
        this.createdOn = value.createdOn;
        this.updatedOn = value.updatedOn;
    }

    public MeasurementComponents(
        Integer   measurementId,
        Integer   componentId,
        Timestamp createdOn,
        Timestamp updatedOn
    ) {
        this.measurementId = measurementId;
        this.componentId = componentId;
        this.createdOn = createdOn;
        this.updatedOn = updatedOn;
    }

    public Integer getMeasurementId() {
        return this.measurementId;
    }

    public void setMeasurementId(Integer measurementId) {
        this.measurementId = measurementId;
    }

    public Integer getComponentId() {
        return this.componentId;
    }

    public void setComponentId(Integer componentId) {
        this.componentId = componentId;
    }

    public Timestamp getCreatedOn() {
        return this.createdOn;
    }

    public void setCreatedOn(Timestamp createdOn) {
        this.createdOn = createdOn;
    }

    public Timestamp getUpdatedOn() {
        return this.updatedOn;
    }

    public void setUpdatedOn(Timestamp updatedOn) {
        this.updatedOn = updatedOn;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("MeasurementComponents (");

        sb.append(measurementId);
        sb.append(", ").append(componentId);
        sb.append(", ").append(createdOn);
        sb.append(", ").append(updatedOn);

        sb.append(")");
        return sb.toString();
    }
// @formatter:on
}
