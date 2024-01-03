/*
 * This file is generated by jOOQ.
 */
package generated.org.jooq.tables;


import generated.org.jooq.Keys;
import generated.org.jooq.RsParkingNode;
import generated.org.jooq.tables.records.MembersRecord;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row22;
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
public class Members extends TableImpl<MembersRecord> {

    private static final long serialVersionUID = -1793921555;

    /**
     * The reference instance of <code>rs-parking-node.members</code>
     */
    public static final Members MEMBERS = new Members();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<MembersRecord> getRecordType() {
        return MembersRecord.class;
    }

    /**
     * The column <code>rs-parking-node.members.memberId</code>.
     */
    public final TableField<MembersRecord, Long> MEMBERID = createField(DSL.name("memberId"), org.jooq.impl.SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>rs-parking-node.members.provider</code>.
     */
    public final TableField<MembersRecord, String> PROVIDER = createField(DSL.name("provider"), org.jooq.impl.SQLDataType.VARCHAR(16).nullable(false), this, "");

    /**
     * The column <code>rs-parking-node.members.username</code>.
     */
    public final TableField<MembersRecord, String> USERNAME = createField(DSL.name("username"), org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>rs-parking-node.members.created</code>.
     */
    public final TableField<MembersRecord, LocalDateTime> CREATED = createField(DSL.name("created"), org.jooq.impl.SQLDataType.LOCALDATETIME.nullable(false), this, "");

    /**
     * The column <code>rs-parking-node.members.name</code>.
     */
    public final TableField<MembersRecord, String> NAME = createField(DSL.name("name"), org.jooq.impl.SQLDataType.VARCHAR(32).nullable(false), this, "");

    /**
     * The column <code>rs-parking-node.members.passwordChanged</code>.
     */
    public final TableField<MembersRecord, LocalDateTime> PASSWORDCHANGED = createField(DSL.name("passwordChanged"), org.jooq.impl.SQLDataType.LOCALDATETIME.defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>rs-parking-node.members.password</code>.
     */
    public final TableField<MembersRecord, String> PASSWORD = createField(DSL.name("password"), org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column <code>rs-parking-node.members.passwordMismatched</code>.
     */
    public final TableField<MembersRecord, Integer> PASSWORDMISMATCHED = createField(DSL.name("passwordMismatched"), org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>rs-parking-node.members.passwordSalt</code>.
     */
    public final TableField<MembersRecord, String> PASSWORDSALT = createField(DSL.name("passwordSalt"), org.jooq.impl.SQLDataType.VARCHAR(32).nullable(false), this, "");

    /**
     * The column <code>rs-parking-node.members.authority</code>.
     */
    public final TableField<MembersRecord, String> AUTHORITY = createField(DSL.name("authority"), org.jooq.impl.SQLDataType.VARCHAR(16).nullable(false), this, "");

    /**
     * The column <code>rs-parking-node.members.dropped</code>.
     */
    public final TableField<MembersRecord, LocalDateTime> DROPPED = createField(DSL.name("dropped"), org.jooq.impl.SQLDataType.LOCALDATETIME.defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>rs-parking-node.members.forbidden</code>.
     */
    public final TableField<MembersRecord, LocalDateTime> FORBIDDEN = createField(DSL.name("forbidden"), org.jooq.impl.SQLDataType.LOCALDATETIME.defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>rs-parking-node.members.memo</code>.
     */
    public final TableField<MembersRecord, String> MEMO = createField(DSL.name("memo"), org.jooq.impl.SQLDataType.VARCHAR(512).defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>rs-parking-node.members.phoneNumber</code>.
     */
    public final TableField<MembersRecord, String> PHONENUMBER = createField(DSL.name("phoneNumber"), org.jooq.impl.SQLDataType.VARCHAR(32).defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>rs-parking-node.members.creatorId</code>.
     */
    public final TableField<MembersRecord, Long> CREATORID = createField(DSL.name("creatorId"), org.jooq.impl.SQLDataType.BIGINT.defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>rs-parking-node.members.dropperId</code>.
     */
    public final TableField<MembersRecord, Long> DROPPERID = createField(DSL.name("dropperId"), org.jooq.impl.SQLDataType.BIGINT.defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>rs-parking-node.members.details</code>.
     */
    public final TableField<MembersRecord, String> DETAILS = createField(DSL.name("details"), org.jooq.impl.SQLDataType.CLOB.defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.CLOB)), this, "");

    /**
     * The column <code>rs-parking-node.members.dong</code>.
     */
    public final TableField<MembersRecord, String> DONG = createField(DSL.name("dong"), org.jooq.impl.SQLDataType.VARCHAR(16).defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>rs-parking-node.members.ho</code>.
     */
    public final TableField<MembersRecord, String> HO = createField(DSL.name("ho"), org.jooq.impl.SQLDataType.VARCHAR(16).defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>rs-parking-node.members.groupId</code>.
     */
    public final TableField<MembersRecord, String> GROUPID = createField(DSL.name("groupId"), org.jooq.impl.SQLDataType.CHAR(32).defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.CHAR)), this, "");

    /**
     * The column <code>rs-parking-node.members.lastUpdated</code>.
     */
    public final TableField<MembersRecord, LocalDateTime> LASTUPDATED = createField(DSL.name("lastUpdated"), org.jooq.impl.SQLDataType.LOCALDATETIME.defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>rs-parking-node.members.umid</code>.
     */
    public final TableField<MembersRecord, String> UMID = createField(DSL.name("umid"), org.jooq.impl.SQLDataType.CHAR(32).defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.CHAR)), this, "");

    /**
     * Create a <code>rs-parking-node.members</code> table reference
     */
    public Members() {
        this(DSL.name("members"), null);
    }

    /**
     * Create an aliased <code>rs-parking-node.members</code> table reference
     */
    public Members(String alias) {
        this(DSL.name(alias), MEMBERS);
    }

    /**
     * Create an aliased <code>rs-parking-node.members</code> table reference
     */
    public Members(Name alias) {
        this(alias, MEMBERS);
    }

    private Members(Name alias, Table<MembersRecord> aliased) {
        this(alias, aliased, null);
    }

    private Members(Name alias, Table<MembersRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> Members(Table<O> child, ForeignKey<O, MembersRecord> key) {
        super(child, key, MEMBERS);
    }

    @Override
    public Schema getSchema() {
        return RsParkingNode.RS_PARKING_NODE;
    }

    @Override
    public Identity<MembersRecord, Long> getIdentity() {
        return Keys.IDENTITY_MEMBERS;
    }

    @Override
    public UniqueKey<MembersRecord> getPrimaryKey() {
        return Keys.KEY_MEMBERS_PRIMARY;
    }

    @Override
    public List<UniqueKey<MembersRecord>> getKeys() {
        return Arrays.<UniqueKey<MembersRecord>>asList(Keys.KEY_MEMBERS_PRIMARY, Keys.KEY_MEMBERS_UKIKWX0TR9PIC807WB8AN96VL1L, Keys.KEY_MEMBERS_UK_P11G20RGIK988O5XPKJOK5H66);
    }

    @Override
    public List<ForeignKey<MembersRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<MembersRecord, ?>>asList(Keys.FKIPHB1G9M5GN0IEAEGG7BRG613, Keys.FKK6SOOINS3YGT7CN5EOHMVREYM, Keys.FK1RI2XDE2I801TDX8IWCILQLIA);
    }

    public Members fkiphb1g9m5gn0ieaegg7brg613() {
        return new Members(this, Keys.FKIPHB1G9M5GN0IEAEGG7BRG613);
    }

    public Members fkk6sooins3ygt7cn5eohmvreym() {
        return new Members(this, Keys.FKK6SOOINS3YGT7CN5EOHMVREYM);
    }

    public MemberGroups memberGroups() {
        return new MemberGroups(this, Keys.FK1RI2XDE2I801TDX8IWCILQLIA);
    }

    @Override
    public Members as(String alias) {
        return new Members(DSL.name(alias), this);
    }

    @Override
    public Members as(Name alias) {
        return new Members(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Members rename(String name) {
        return new Members(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Members rename(Name name) {
        return new Members(name, null);
    }

    // -------------------------------------------------------------------------
    // Row22 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row22<Long, String, String, LocalDateTime, String, LocalDateTime, String, Integer, String, String, LocalDateTime, LocalDateTime, String, String, Long, Long, String, String, String, String, LocalDateTime, String> fieldsRow() {
        return (Row22) super.fieldsRow();
    }
}
