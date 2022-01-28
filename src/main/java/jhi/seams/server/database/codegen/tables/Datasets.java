/*
 * This file is generated by jOOQ.
 */
package jhi.seams.server.database.codegen.tables;


import jhi.seams.server.database.codegen.SeamsDb;
import jhi.seams.server.database.codegen.tables.records.DatasetsRecord;
import org.jooq.*;
import org.jooq.impl.*;

import javax.annotation.Generated;
import java.sql.Timestamp;
import java.util.*;


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
public class Datasets extends TableImpl<DatasetsRecord> {

    private static final long serialVersionUID = 544279333;

    /**
     * The reference instance of <code>seams_db.datasets</code>
     */
    public static final Datasets DATASETS = new Datasets();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<DatasetsRecord> getRecordType() {
        return DatasetsRecord.class;
    }

    /**
     * The column <code>seams_db.datasets.id</code>.
     */
    public final TableField<DatasetsRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>seams_db.datasets.ext_id</code>.
     */
    public final TableField<DatasetsRecord, Integer> EXT_ID = createField("ext_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>seams_db.datasets.name</code>.
     */
    public final TableField<DatasetsRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>seams_db.datasets.description</code>.
     */
    public final TableField<DatasetsRecord, String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>seams_db.datasets.site_id</code>.
     */
    public final TableField<DatasetsRecord, Integer> SITE_ID = createField("site_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>seams_db.datasets.created_on</code>.
     */
    public final TableField<DatasetsRecord, Timestamp> CREATED_ON = createField("created_on", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>seams_db.datasets.updated_on</code>.
     */
    public final TableField<DatasetsRecord, Timestamp> UPDATED_ON = createField("updated_on", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * Create a <code>seams_db.datasets</code> table reference
     */
    public Datasets() {
        this(DSL.name("datasets"), null);
    }

    /**
     * Create an aliased <code>seams_db.datasets</code> table reference
     */
    public Datasets(String alias) {
        this(DSL.name(alias), DATASETS);
    }

    /**
     * Create an aliased <code>seams_db.datasets</code> table reference
     */
    public Datasets(Name alias) {
        this(alias, DATASETS);
    }

    private Datasets(Name alias, Table<DatasetsRecord> aliased) {
        this(alias, aliased, null);
    }

    private Datasets(Name alias, Table<DatasetsRecord> aliased, Field<?>[] parameters) {
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
    public Identity<DatasetsRecord, Integer> getIdentity() {
        return Internal.createIdentity(jhi.seams.server.database.codegen.tables.Datasets.DATASETS, jhi.seams.server.database.codegen.tables.Datasets.DATASETS.ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<DatasetsRecord> getPrimaryKey() {
        return Internal.createUniqueKey(jhi.seams.server.database.codegen.tables.Datasets.DATASETS, "KEY_datasets_PRIMARY", jhi.seams.server.database.codegen.tables.Datasets.DATASETS.ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<DatasetsRecord>> getKeys() {
        return Arrays.<UniqueKey<DatasetsRecord>>asList(
              Internal.createUniqueKey(jhi.seams.server.database.codegen.tables.Datasets.DATASETS, "KEY_datasets_PRIMARY", jhi.seams.server.database.codegen.tables.Datasets.DATASETS.ID)
        );
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Datasets as(String alias) {
        return new Datasets(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Datasets as(Name alias) {
        return new Datasets(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Datasets rename(String name) {
        return new Datasets(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Datasets rename(Name name) {
        return new Datasets(name, null);
    }
// @formatter:on
}