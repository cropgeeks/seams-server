/*
 * This file is generated by jOOQ.
 */
package jhi.seams.server.database.codegen.tables.pojos;


import javax.annotation.Generated;
import java.io.Serializable;
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
public class Components implements Serializable {

    private static final long serialVersionUID = 1251109490;

    private Integer   id;
    private String    cropName;
    private String    varietyName;
    private String    description;
    private Timestamp createdOn;
    private Timestamp updatedOn;

    public Components() {}

    public Components(Components value) {
        this.id = value.id;
        this.cropName = value.cropName;
        this.varietyName = value.varietyName;
        this.description = value.description;
        this.createdOn = value.createdOn;
        this.updatedOn = value.updatedOn;
    }

    public Components(
        Integer   id,
        String    cropName,
        String    varietyName,
        String    description,
        Timestamp createdOn,
        Timestamp updatedOn
    ) {
        this.id = id;
        this.cropName = cropName;
        this.varietyName = varietyName;
        this.description = description;
        this.createdOn = createdOn;
        this.updatedOn = updatedOn;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCropName() {
        return this.cropName;
    }

    public void setCropName(String cropName) {
        this.cropName = cropName;
    }

    public String getVarietyName() {
        return this.varietyName;
    }

    public void setVarietyName(String varietyName) {
        this.varietyName = varietyName;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
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
        StringBuilder sb = new StringBuilder("Components (");

        sb.append(id);
        sb.append(", ").append(cropName);
        sb.append(", ").append(varietyName);
        sb.append(", ").append(description);
        sb.append(", ").append(createdOn);
        sb.append(", ").append(updatedOn);

        sb.append(")");
        return sb.toString();
    }
// @formatter:on
}