/*
 * This file is generated by jOOQ.
 */
package jhi.seams.server.database.codegen.tables;


import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import jhi.seams.server.database.codegen.SeamsDb;
import jhi.seams.server.database.codegen.tables.records.DatasetMetaRecord;

import org.jooq.Field;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.Internal;
import org.jooq.impl.TableImpl;


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
public class DatasetMeta extends TableImpl<DatasetMetaRecord> {

    private static final long serialVersionUID = 21606851;

    /**
     * The reference instance of <code>seams_db.dataset_meta</code>
     */
    public static final DatasetMeta DATASET_META = new DatasetMeta();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<DatasetMetaRecord> getRecordType() {
        return DatasetMetaRecord.class;
    }

    /**
     * The column <code>seams_db.dataset_meta.dataset_id</code>.
     */
    public final TableField<DatasetMetaRecord, Integer> DATASET_ID = createField("dataset_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>seams_db.dataset_meta.email</code>.
     */
    public final TableField<DatasetMetaRecord, String> EMAIL = createField("email", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>seams_db.dataset_meta.tillage</code>.
     */
    public final TableField<DatasetMetaRecord, String> TILLAGE = createField("tillage", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>seams_db.dataset_meta.fertilizer</code>.
     */
    public final TableField<DatasetMetaRecord, String> FERTILIZER = createField("fertilizer", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>seams_db.dataset_meta.herbicide</code>.
     */
    public final TableField<DatasetMetaRecord, String> HERBICIDE = createField("herbicide", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>seams_db.dataset_meta.farm_management</code>.
     */
    public final TableField<DatasetMetaRecord, String> FARM_MANAGEMENT = createField("farm_management", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>seams_db.dataset_meta.weed_cover</code>.
     */
    public final TableField<DatasetMetaRecord, String> WEED_COVER = createField("weed_cover", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>seams_db.dataset_meta.disease</code>.
     */
    public final TableField<DatasetMetaRecord, String> DISEASE = createField("disease", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>seams_db.dataset_meta.pests</code>.
     */
    public final TableField<DatasetMetaRecord, String> PESTS = createField("pests", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>seams_db.dataset_meta.soil_health</code>.
     */
    public final TableField<DatasetMetaRecord, String> SOIL_HEALTH = createField("soil_health", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>seams_db.dataset_meta.biodiversity</code>.
     */
    public final TableField<DatasetMetaRecord, String> BIODIVERSITY = createField("biodiversity", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>seams_db.dataset_meta.crop_purpose</code>.
     */
    public final TableField<DatasetMetaRecord, String> CROP_PURPOSE = createField("crop_purpose", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>seams_db.dataset_meta.sowing_date</code>.
     */
    public final TableField<DatasetMetaRecord, Timestamp> SOWING_DATE = createField("sowing_date", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>seams_db.dataset_meta.harvest_date</code>.
     */
    public final TableField<DatasetMetaRecord, Timestamp> HARVEST_DATE = createField("harvest_date", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>seams_db.dataset_meta.created_on</code>.
     */
    public final TableField<DatasetMetaRecord, Timestamp> CREATED_ON = createField("created_on", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>seams_db.dataset_meta.updated_on</code>.
     */
    public final TableField<DatasetMetaRecord, Timestamp> UPDATED_ON = createField("updated_on", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * Create a <code>seams_db.dataset_meta</code> table reference
     */
    public DatasetMeta() {
        this(DSL.name("dataset_meta"), null);
    }

    /**
     * Create an aliased <code>seams_db.dataset_meta</code> table reference
     */
    public DatasetMeta(String alias) {
        this(DSL.name(alias), DATASET_META);
    }

    /**
     * Create an aliased <code>seams_db.dataset_meta</code> table reference
     */
    public DatasetMeta(Name alias) {
        this(alias, DATASET_META);
    }

    private DatasetMeta(Name alias, Table<DatasetMetaRecord> aliased) {
        this(alias, aliased, null);
    }

    private DatasetMeta(Name alias, Table<DatasetMetaRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return SeamsDb.SEAMS_DB;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<DatasetMetaRecord> getPrimaryKey() {
        return Internal.createUniqueKey(jhi.seams.server.database.codegen.tables.DatasetMeta.DATASET_META, "KEY_dataset_meta_PRIMARY", jhi.seams.server.database.codegen.tables.DatasetMeta.DATASET_META.DATASET_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<DatasetMetaRecord>> getKeys() {
        return Arrays.<UniqueKey<DatasetMetaRecord>>asList(
              Internal.createUniqueKey(jhi.seams.server.database.codegen.tables.DatasetMeta.DATASET_META, "KEY_dataset_meta_PRIMARY", jhi.seams.server.database.codegen.tables.DatasetMeta.DATASET_META.DATASET_ID)
        );
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DatasetMeta as(String alias) {
        return new DatasetMeta(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DatasetMeta as(Name alias) {
        return new DatasetMeta(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public DatasetMeta rename(String name) {
        return new DatasetMeta(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public DatasetMeta rename(Name name) {
        return new DatasetMeta(name, null);
    }
// @formatter:on
}
