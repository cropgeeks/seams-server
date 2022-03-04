/*
 * This file is generated by jOOQ.
 */
package jhi.seams.server.database.codegen.tables;


import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;

import jhi.seams.server.binding.IntArrayBinding;
import jhi.seams.server.database.codegen.SeamsDb;
import jhi.seams.server.database.codegen.enums.ViewMeasurementComponentsMeasurementType;
import jhi.seams.server.database.codegen.tables.records.ViewMeasurementComponentsRecord;

import org.jooq.Field;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


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
public class ViewMeasurementComponents extends TableImpl<ViewMeasurementComponentsRecord> {

    private static final long serialVersionUID = 1711141360;

    /**
     * The reference instance of <code>seams_db.view_measurement_components</code>
     */
    public static final ViewMeasurementComponents VIEW_MEASUREMENT_COMPONENTS = new ViewMeasurementComponents();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ViewMeasurementComponentsRecord> getRecordType() {
        return ViewMeasurementComponentsRecord.class;
    }

    /**
     * The column <code>seams_db.view_measurement_components.component_ids</code>.
     */
    public final TableField<ViewMeasurementComponentsRecord, Integer[]> COMPONENT_IDS = createField("component_ids", org.jooq.impl.DefaultDataType.getDefaultDataType("\"seams\".\"view_measurement_components_component_ids\""), this, "", new IntArrayBinding());

    /**
     * The column <code>seams_db.view_measurement_components.measurement_id</code>.
     */
    public final TableField<ViewMeasurementComponentsRecord, Integer> MEASUREMENT_ID = createField("measurement_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>seams_db.view_measurement_components.dataset_id</code>.
     */
    public final TableField<ViewMeasurementComponentsRecord, Integer> DATASET_ID = createField("dataset_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>seams_db.view_measurement_components.trait_id</code>.
     */
    public final TableField<ViewMeasurementComponentsRecord, Integer> TRAIT_ID = createField("trait_id", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>seams_db.view_measurement_components.trait_name</code>.
     */
    public final TableField<ViewMeasurementComponentsRecord, String> TRAIT_NAME = createField("trait_name", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>seams_db.view_measurement_components.trait_unit_id</code>.
     */
    public final TableField<ViewMeasurementComponentsRecord, Integer> TRAIT_UNIT_ID = createField("trait_unit_id", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>seams_db.view_measurement_components.trait_unit_name</code>.
     */
    public final TableField<ViewMeasurementComponentsRecord, String> TRAIT_UNIT_NAME = createField("trait_unit_name", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>seams_db.view_measurement_components.measurement</code>.
     */
    public final TableField<ViewMeasurementComponentsRecord, BigDecimal> MEASUREMENT = createField("measurement", org.jooq.impl.SQLDataType.DECIMAL(12, 6).nullable(false), this, "");

    /**
     * The column <code>seams_db.view_measurement_components.measurement_type</code>.
     */
    public final TableField<ViewMeasurementComponentsRecord, ViewMeasurementComponentsMeasurementType> MEASUREMENT_TYPE = createField("measurement_type", org.jooq.impl.SQLDataType.VARCHAR(4).nullable(false).defaultValue(org.jooq.impl.DSL.inline("mono", org.jooq.impl.SQLDataType.VARCHAR)).asEnumDataType(jhi.seams.server.database.codegen.enums.ViewMeasurementComponentsMeasurementType.class), this, "");

    /**
     * The column <code>seams_db.view_measurement_components.created_on</code>.
     */
    public final TableField<ViewMeasurementComponentsRecord, Timestamp> CREATED_ON = createField("created_on", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0000-00-00 00:00:00", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * Create a <code>seams_db.view_measurement_components</code> table reference
     */
    public ViewMeasurementComponents() {
        this(DSL.name("view_measurement_components"), null);
    }

    /**
     * Create an aliased <code>seams_db.view_measurement_components</code> table reference
     */
    public ViewMeasurementComponents(String alias) {
        this(DSL.name(alias), VIEW_MEASUREMENT_COMPONENTS);
    }

    /**
     * Create an aliased <code>seams_db.view_measurement_components</code> table reference
     */
    public ViewMeasurementComponents(Name alias) {
        this(alias, VIEW_MEASUREMENT_COMPONENTS);
    }

    private ViewMeasurementComponents(Name alias, Table<ViewMeasurementComponentsRecord> aliased) {
        this(alias, aliased, null);
    }

    private ViewMeasurementComponents(Name alias, Table<ViewMeasurementComponentsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("VIEW"));
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
    public ViewMeasurementComponents as(String alias) {
        return new ViewMeasurementComponents(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewMeasurementComponents as(Name alias) {
        return new ViewMeasurementComponents(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ViewMeasurementComponents rename(String name) {
        return new ViewMeasurementComponents(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ViewMeasurementComponents rename(Name name) {
        return new ViewMeasurementComponents(name, null);
    }
// @formatter:on
}
