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
public class DatasetMeta implements Serializable {

    private static final long serialVersionUID = -946381529;

    private Integer   datasetId;
    private String    email;
    private String    tillage;
    private String    fertilizer;
    private String    herbicide;
    private String    farmManagement;
    private String    weedCover;
    private String    disease;
    private String    pests;
    private String    soilHealth;
    private String    biodiversity;
    private String    cropPurpose;
    private Timestamp sowingDate;
    private Timestamp harvestDate;
    private Timestamp createdOn;
    private Timestamp updatedOn;

    public DatasetMeta() {}

    public DatasetMeta(DatasetMeta value) {
        this.datasetId = value.datasetId;
        this.email = value.email;
        this.tillage = value.tillage;
        this.fertilizer = value.fertilizer;
        this.herbicide = value.herbicide;
        this.farmManagement = value.farmManagement;
        this.weedCover = value.weedCover;
        this.disease = value.disease;
        this.pests = value.pests;
        this.soilHealth = value.soilHealth;
        this.biodiversity = value.biodiversity;
        this.cropPurpose = value.cropPurpose;
        this.sowingDate = value.sowingDate;
        this.harvestDate = value.harvestDate;
        this.createdOn = value.createdOn;
        this.updatedOn = value.updatedOn;
    }

    public DatasetMeta(
        Integer   datasetId,
        String    email,
        String    tillage,
        String    fertilizer,
        String    herbicide,
        String    farmManagement,
        String    weedCover,
        String    disease,
        String    pests,
        String    soilHealth,
        String    biodiversity,
        String    cropPurpose,
        Timestamp sowingDate,
        Timestamp harvestDate,
        Timestamp createdOn,
        Timestamp updatedOn
    ) {
        this.datasetId = datasetId;
        this.email = email;
        this.tillage = tillage;
        this.fertilizer = fertilizer;
        this.herbicide = herbicide;
        this.farmManagement = farmManagement;
        this.weedCover = weedCover;
        this.disease = disease;
        this.pests = pests;
        this.soilHealth = soilHealth;
        this.biodiversity = biodiversity;
        this.cropPurpose = cropPurpose;
        this.sowingDate = sowingDate;
        this.harvestDate = harvestDate;
        this.createdOn = createdOn;
        this.updatedOn = updatedOn;
    }

    public Integer getDatasetId() {
        return this.datasetId;
    }

    public void setDatasetId(Integer datasetId) {
        this.datasetId = datasetId;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTillage() {
        return this.tillage;
    }

    public void setTillage(String tillage) {
        this.tillage = tillage;
    }

    public String getFertilizer() {
        return this.fertilizer;
    }

    public void setFertilizer(String fertilizer) {
        this.fertilizer = fertilizer;
    }

    public String getHerbicide() {
        return this.herbicide;
    }

    public void setHerbicide(String herbicide) {
        this.herbicide = herbicide;
    }

    public String getFarmManagement() {
        return this.farmManagement;
    }

    public void setFarmManagement(String farmManagement) {
        this.farmManagement = farmManagement;
    }

    public String getWeedCover() {
        return this.weedCover;
    }

    public void setWeedCover(String weedCover) {
        this.weedCover = weedCover;
    }

    public String getDisease() {
        return this.disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public String getPests() {
        return this.pests;
    }

    public void setPests(String pests) {
        this.pests = pests;
    }

    public String getSoilHealth() {
        return this.soilHealth;
    }

    public void setSoilHealth(String soilHealth) {
        this.soilHealth = soilHealth;
    }

    public String getBiodiversity() {
        return this.biodiversity;
    }

    public void setBiodiversity(String biodiversity) {
        this.biodiversity = biodiversity;
    }

    public String getCropPurpose() {
        return this.cropPurpose;
    }

    public void setCropPurpose(String cropPurpose) {
        this.cropPurpose = cropPurpose;
    }

    public Timestamp getSowingDate() {
        return this.sowingDate;
    }

    public void setSowingDate(Timestamp sowingDate) {
        this.sowingDate = sowingDate;
    }

    public Timestamp getHarvestDate() {
        return this.harvestDate;
    }

    public void setHarvestDate(Timestamp harvestDate) {
        this.harvestDate = harvestDate;
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
        StringBuilder sb = new StringBuilder("DatasetMeta (");

        sb.append(datasetId);
        sb.append(", ").append(email);
        sb.append(", ").append(tillage);
        sb.append(", ").append(fertilizer);
        sb.append(", ").append(herbicide);
        sb.append(", ").append(farmManagement);
        sb.append(", ").append(weedCover);
        sb.append(", ").append(disease);
        sb.append(", ").append(pests);
        sb.append(", ").append(soilHealth);
        sb.append(", ").append(biodiversity);
        sb.append(", ").append(cropPurpose);
        sb.append(", ").append(sowingDate);
        sb.append(", ").append(harvestDate);
        sb.append(", ").append(createdOn);
        sb.append(", ").append(updatedOn);

        sb.append(")");
        return sb.toString();
    }
// @formatter:on
}
