/*
 * This file is generated by jOOQ.
 */
package generated.org.jooq.tables;


import generated.org.jooq.Keys;
import generated.org.jooq.RsParkingNode;
import generated.org.jooq.tables.records.DevicesRecord;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row13;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Devices extends TableImpl<DevicesRecord> {

    private static final long serialVersionUID = -1550817129;

    /**
     * The reference instance of <code>rs-parking-node.devices</code>
     */
    public static final Devices DEVICES = new Devices();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<DevicesRecord> getRecordType() {
        return DevicesRecord.class;
    }

    /**
     * The column <code>rs-parking-node.devices.deviceId</code>.
     */
    public final TableField<DevicesRecord, Long> DEVICEID = createField(DSL.name("deviceId"), org.jooq.impl.SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>rs-parking-node.devices.code</code>.
     */
    public final TableField<DevicesRecord, String> CODE = createField(DSL.name("code"), org.jooq.impl.SQLDataType.VARCHAR(16).defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>rs-parking-node.devices.data</code>.
     */
    public final TableField<DevicesRecord, String> DATA = createField(DSL.name("data"), org.jooq.impl.SQLDataType.CLOB.defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.CLOB)), this, "");

    /**
     * The column <code>rs-parking-node.devices.description</code>.
     */
    public final TableField<DevicesRecord, String> DESCRIPTION = createField(DSL.name("description"), org.jooq.impl.SQLDataType.VARCHAR(2048).defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>rs-parking-node.devices.dropped</code>.
     */
    public final TableField<DevicesRecord, LocalDateTime> DROPPED = createField(DSL.name("dropped"), org.jooq.impl.SQLDataType.LOCALDATETIME.defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>rs-parking-node.devices.name</code>.
     */
    public final TableField<DevicesRecord, String> NAME = createField(DSL.name("name"), org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column <code>rs-parking-node.devices.protocol</code>.
     */
    public final TableField<DevicesRecord, String> PROTOCOL = createField(DSL.name("protocol"), org.jooq.impl.SQLDataType.VARCHAR(16).nullable(false), this, "");

    /**
     * The column <code>rs-parking-node.devices.status</code>.
     */
    public final TableField<DevicesRecord, String> STATUS = createField(DSL.name("status"), org.jooq.impl.SQLDataType.VARCHAR(16).defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>rs-parking-node.devices.machineId</code>.
     */
    public final TableField<DevicesRecord, Long> MACHINEID = createField(DSL.name("machineId"), org.jooq.impl.SQLDataType.BIGINT.defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>rs-parking-node.devices.lat</code>.
     */
    public final TableField<DevicesRecord, BigDecimal> LAT = createField(DSL.name("lat"), org.jooq.impl.SQLDataType.DECIMAL(10, 7).defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.DECIMAL)), this, "");

    /**
     * The column <code>rs-parking-node.devices.lon</code>.
     */
    public final TableField<DevicesRecord, BigDecimal> LON = createField(DSL.name("lon"), org.jooq.impl.SQLDataType.DECIMAL(10, 7).defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.DECIMAL)), this, "");

    /**
     * The column <code>rs-parking-node.devices.details</code>.
     */
    public final TableField<DevicesRecord, String> DETAILS = createField(DSL.name("details"), org.jooq.impl.SQLDataType.CLOB.defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.CLOB)), this, "");

    /**
     * The column <code>rs-parking-node.devices.type</code>.
     */
    public final TableField<DevicesRecord, String> TYPE = createField(DSL.name("type"), org.jooq.impl.SQLDataType.VARCHAR(16).defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * Create a <code>rs-parking-node.devices</code> table reference
     */
    public Devices() {
        this(DSL.name("devices"), null);
    }

    /**
     * Create an aliased <code>rs-parking-node.devices</code> table reference
     */
    public Devices(String alias) {
        this(DSL.name(alias), DEVICES);
    }

    /**
     * Create an aliased <code>rs-parking-node.devices</code> table reference
     */
    public Devices(Name alias) {
        this(alias, DEVICES);
    }

    private Devices(Name alias, Table<DevicesRecord> aliased) {
        this(alias, aliased, null);
    }

    private Devices(Name alias, Table<DevicesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> Devices(Table<O> child, ForeignKey<O, DevicesRecord> key) {
        super(child, key, DEVICES);
    }

    @Override
    public Schema getSchema() {
        return RsParkingNode.RS_PARKING_NODE;
    }

    @Override
    public Identity<DevicesRecord, Long> getIdentity() {
        return Keys.IDENTITY_DEVICES;
    }

    @Override
    public UniqueKey<DevicesRecord> getPrimaryKey() {
        return Keys.KEY_DEVICES_PRIMARY;
    }

    @Override
    public List<UniqueKey<DevicesRecord>> getKeys() {
        return Arrays.<UniqueKey<DevicesRecord>>asList(Keys.KEY_DEVICES_PRIMARY);
    }

    @Override
    public List<ForeignKey<DevicesRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<DevicesRecord, ?>>asList(Keys.FK30APRG1LS6H9A1IO4RCIUUD2D);
    }

    public Machines machines() {
        return new Machines(this, Keys.FK30APRG1LS6H9A1IO4RCIUUD2D);
    }

    @Override
    public Devices as(String alias) {
        return new Devices(DSL.name(alias), this);
    }

    @Override
    public Devices as(Name alias) {
        return new Devices(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Devices rename(String name) {
        return new Devices(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Devices rename(Name name) {
        return new Devices(name, null);
    }

    // -------------------------------------------------------------------------
    // Row13 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row13<Long, String, String, String, LocalDateTime, String, String, String, Long, BigDecimal, BigDecimal, String, String> fieldsRow() {
        return (Row13) super.fieldsRow();
    }
}
