/*
 * This file is generated by jOOQ.
 */
package jhi.seams.server.database.codegen.tables;


import jhi.seams.server.database.codegen.SeamsDb;
import jhi.seams.server.database.codegen.tables.records.TraitsRecord;
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
public class Traits extends TableImpl<TraitsRecord> {

    private static final long serialVersionUID = -1338200277;

    /**
     * The reference instance of <code>seams_db.traits</code>
     */
    public static final Traits TRAITS = new Traits();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TraitsRecord> getRecordType() {
        return TraitsRecord.class;
    }

    /**
     * The column <code>seams_db.traits.id</code>.
     */
    public final TableField<TraitsRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>seams_db.traits.name</code>.
     */
    public final TableField<TraitsRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>seams_db.traits.description</code>.
     */
    public final TableField<TraitsRecord, String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>seams_db.traits.created_on</code>.
     */
    public final TableField<TraitsRecord, Timestamp> CREATED_ON = createField("created_on", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>seams_db.traits.updated_on</code>.
     */
    public final TableField<TraitsRecord, Timestamp> UPDATED_ON = createField("updated_on", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * Create a <code>seams_db.traits</code> table reference
     */
    public Traits() {
        this(DSL.name("traits"), null);
    }

    /**
     * Create an aliased <code>seams_db.traits</code> table reference
     */
    public Traits(String alias) {
        this(DSL.name(alias), TRAITS);
    }

    /**
     * Create an aliased <code>seams_db.traits</code> table reference
     */
    public Traits(Name alias) {
        this(alias, TRAITS);
    }

    private Traits(Name alias, Table<TraitsRecord> aliased) {
        this(alias, aliased, null);
    }

    private Traits(Name alias, Table<TraitsRecord> aliased, Field<?>[] parameters) {
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
    public Identity<TraitsRecord, Integer> getIdentity() {
        return Internal.createIdentity(jhi.seams.server.database.codegen.tables.Traits.TRAITS, jhi.seams.server.database.codegen.tables.Traits.TRAITS.ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TraitsRecord> getPrimaryKey() {
        return Internal.createUniqueKey(jhi.seams.server.database.codegen.tables.Traits.TRAITS, "KEY_traits_PRIMARY", jhi.seams.server.database.codegen.tables.Traits.TRAITS.ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TraitsRecord>> getKeys() {
        return Arrays.<UniqueKey<TraitsRecord>>asList(
              Internal.createUniqueKey(jhi.seams.server.database.codegen.tables.Traits.TRAITS, "KEY_traits_PRIMARY", jhi.seams.server.database.codegen.tables.Traits.TRAITS.ID)
        );
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Traits as(String alias) {
        return new Traits(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Traits as(Name alias) {
        return new Traits(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Traits rename(String name) {
        return new Traits(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Traits rename(Name name) {
        return new Traits(name, null);
    }
// @formatter:on
}