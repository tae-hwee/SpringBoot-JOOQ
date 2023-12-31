/*
 * This file is generated by jOOQ.
 */
package generated.org.jooq.tables;


import generated.org.jooq.Keys;
import generated.org.jooq.RsParkingNode;
import generated.org.jooq.tables.records.AttendancesRecord;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row8;
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
public class Attendances extends TableImpl<AttendancesRecord> {

    private static final long serialVersionUID = 229293717;

    /**
     * The reference instance of <code>rs-parking-node.attendances</code>
     */
    public static final Attendances ATTENDANCES = new Attendances();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<AttendancesRecord> getRecordType() {
        return AttendancesRecord.class;
    }

    /**
     * The column <code>rs-parking-node.attendances.attendanceId</code>.
     */
    public final TableField<AttendancesRecord, Long> ATTENDANCEID = createField(DSL.name("attendanceId"), org.jooq.impl.SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>rs-parking-node.attendances.end</code>.
     */
    public final TableField<AttendancesRecord, LocalDateTime> END = createField(DSL.name("end"), org.jooq.impl.SQLDataType.LOCALDATETIME.defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>rs-parking-node.attendances.start</code>.
     */
    public final TableField<AttendancesRecord, LocalDateTime> START = createField(DSL.name("start"), org.jooq.impl.SQLDataType.LOCALDATETIME.nullable(false), this, "");

    /**
     * The column <code>rs-parking-node.attendances.employeeId</code>.
     */
    public final TableField<AttendancesRecord, Long> EMPLOYEEID = createField(DSL.name("employeeId"), org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>rs-parking-node.attendances.postId</code>.
     */
    public final TableField<AttendancesRecord, Long> POSTID = createField(DSL.name("postId"), org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>rs-parking-node.attendances.created</code>.
     */
    public final TableField<AttendancesRecord, LocalDateTime> CREATED = createField(DSL.name("created"), org.jooq.impl.SQLDataType.LOCALDATETIME.defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>rs-parking-node.attendances.lastUpdated</code>.
     */
    public final TableField<AttendancesRecord, LocalDateTime> LASTUPDATED = createField(DSL.name("lastUpdated"), org.jooq.impl.SQLDataType.LOCALDATETIME.defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>rs-parking-node.attendances.umid</code>.
     */
    public final TableField<AttendancesRecord, String> UMID = createField(DSL.name("umid"), org.jooq.impl.SQLDataType.CHAR(32).defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.CHAR)), this, "");

    /**
     * Create a <code>rs-parking-node.attendances</code> table reference
     */
    public Attendances() {
        this(DSL.name("attendances"), null);
    }

    /**
     * Create an aliased <code>rs-parking-node.attendances</code> table reference
     */
    public Attendances(String alias) {
        this(DSL.name(alias), ATTENDANCES);
    }

    /**
     * Create an aliased <code>rs-parking-node.attendances</code> table reference
     */
    public Attendances(Name alias) {
        this(alias, ATTENDANCES);
    }

    private Attendances(Name alias, Table<AttendancesRecord> aliased) {
        this(alias, aliased, null);
    }

    private Attendances(Name alias, Table<AttendancesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> Attendances(Table<O> child, ForeignKey<O, AttendancesRecord> key) {
        super(child, key, ATTENDANCES);
    }

    @Override
    public Schema getSchema() {
        return RsParkingNode.RS_PARKING_NODE;
    }

    @Override
    public Identity<AttendancesRecord, Long> getIdentity() {
        return Keys.IDENTITY_ATTENDANCES;
    }

    @Override
    public UniqueKey<AttendancesRecord> getPrimaryKey() {
        return Keys.KEY_ATTENDANCES_PRIMARY;
    }

    @Override
    public List<UniqueKey<AttendancesRecord>> getKeys() {
        return Arrays.<UniqueKey<AttendancesRecord>>asList(Keys.KEY_ATTENDANCES_PRIMARY, Keys.KEY_ATTENDANCES_UK_G3UW16GX7BNLS5P8K9WDCEWC0);
    }

    @Override
    public List<ForeignKey<AttendancesRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<AttendancesRecord, ?>>asList(Keys.FKR16FALWS4GCUFDOS3S5IYHUKI, Keys.FKGKM6A79QY6F2DXN14BXQOX19A);
    }

    public Employees employees() {
        return new Employees(this, Keys.FKR16FALWS4GCUFDOS3S5IYHUKI);
    }

    public Members members() {
        return new Members(this, Keys.FKGKM6A79QY6F2DXN14BXQOX19A);
    }

    @Override
    public Attendances as(String alias) {
        return new Attendances(DSL.name(alias), this);
    }

    @Override
    public Attendances as(Name alias) {
        return new Attendances(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Attendances rename(String name) {
        return new Attendances(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Attendances rename(Name name) {
        return new Attendances(name, null);
    }

    // -------------------------------------------------------------------------
    // Row8 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row8<Long, LocalDateTime, LocalDateTime, Long, Long, LocalDateTime, LocalDateTime, String> fieldsRow() {
        return (Row8) super.fieldsRow();
    }
}
