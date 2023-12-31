/*
 * This file is generated by jOOQ.
 */
package generated.org.jooq.tables;


import generated.org.jooq.Indexes;
import generated.org.jooq.Keys;
import generated.org.jooq.RsParkingNode;
import generated.org.jooq.tables.records.BlacklistsRecord;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row10;
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
public class Blacklists extends TableImpl<BlacklistsRecord> {

    private static final long serialVersionUID = -1898931762;

    /**
     * The reference instance of <code>rs-parking-node.blacklists</code>
     */
    public static final Blacklists BLACKLISTS = new Blacklists();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<BlacklistsRecord> getRecordType() {
        return BlacklistsRecord.class;
    }

    /**
     * The column <code>rs-parking-node.blacklists.blacklistId</code>.
     */
    public final TableField<BlacklistsRecord, Long> BLACKLISTID = createField(DSL.name("blacklistId"), org.jooq.impl.SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>rs-parking-node.blacklists.created</code>.
     */
    public final TableField<BlacklistsRecord, LocalDateTime> CREATED = createField(DSL.name("created"), org.jooq.impl.SQLDataType.LOCALDATETIME.nullable(false), this, "");

    /**
     * The column <code>rs-parking-node.blacklists.lpn</code>.
     */
    public final TableField<BlacklistsRecord, String> LPN = createField(DSL.name("lpn"), org.jooq.impl.SQLDataType.VARCHAR(16).nullable(false), this, "");

    /**
     * The column <code>rs-parking-node.blacklists.memo</code>.
     */
    public final TableField<BlacklistsRecord, String> MEMO = createField(DSL.name("memo"), org.jooq.impl.SQLDataType.VARCHAR(512).defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>rs-parking-node.blacklists.creatorId</code>.
     */
    public final TableField<BlacklistsRecord, Long> CREATORID = createField(DSL.name("creatorId"), org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>rs-parking-node.blacklists.apiConnectionId</code>.
     */
    public final TableField<BlacklistsRecord, String> APICONNECTIONID = createField(DSL.name("apiConnectionId"), org.jooq.impl.SQLDataType.VARCHAR(16).defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>rs-parking-node.blacklists.aptCode</code>.
     */
    public final TableField<BlacklistsRecord, String> APTCODE = createField(DSL.name("aptCode"), org.jooq.impl.SQLDataType.VARCHAR(64).defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>rs-parking-node.blacklists.lastUpdated</code>.
     */
    public final TableField<BlacklistsRecord, LocalDateTime> LASTUPDATED = createField(DSL.name("lastUpdated"), org.jooq.impl.SQLDataType.LOCALDATETIME.defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>rs-parking-node.blacklists.umid</code>.
     */
    public final TableField<BlacklistsRecord, String> UMID = createField(DSL.name("umid"), org.jooq.impl.SQLDataType.CHAR(32).defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.CHAR)), this, "");

    /**
     * The column <code>rs-parking-node.blacklists.details</code>.
     */
    public final TableField<BlacklistsRecord, String> DETAILS = createField(DSL.name("details"), org.jooq.impl.SQLDataType.CLOB.defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.CLOB)), this, "");

    /**
     * Create a <code>rs-parking-node.blacklists</code> table reference
     */
    public Blacklists() {
        this(DSL.name("blacklists"), null);
    }

    /**
     * Create an aliased <code>rs-parking-node.blacklists</code> table reference
     */
    public Blacklists(String alias) {
        this(DSL.name(alias), BLACKLISTS);
    }

    /**
     * Create an aliased <code>rs-parking-node.blacklists</code> table reference
     */
    public Blacklists(Name alias) {
        this(alias, BLACKLISTS);
    }

    private Blacklists(Name alias, Table<BlacklistsRecord> aliased) {
        this(alias, aliased, null);
    }

    private Blacklists(Name alias, Table<BlacklistsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> Blacklists(Table<O> child, ForeignKey<O, BlacklistsRecord> key) {
        super(child, key, BLACKLISTS);
    }

    @Override
    public Schema getSchema() {
        return RsParkingNode.RS_PARKING_NODE;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.BLACKLISTS_INDEX_LPN);
    }

    @Override
    public Identity<BlacklistsRecord, Long> getIdentity() {
        return Keys.IDENTITY_BLACKLISTS;
    }

    @Override
    public UniqueKey<BlacklistsRecord> getPrimaryKey() {
        return Keys.KEY_BLACKLISTS_PRIMARY;
    }

    @Override
    public List<UniqueKey<BlacklistsRecord>> getKeys() {
        return Arrays.<UniqueKey<BlacklistsRecord>>asList(Keys.KEY_BLACKLISTS_PRIMARY, Keys.KEY_BLACKLISTS_UK_6SHPBBWPP5HHIBGMS2YVFEGAG);
    }

    @Override
    public List<ForeignKey<BlacklistsRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<BlacklistsRecord, ?>>asList(Keys.FKAHDP941UCT09OMUXSTA1P085G);
    }

    public Members members() {
        return new Members(this, Keys.FKAHDP941UCT09OMUXSTA1P085G);
    }

    @Override
    public Blacklists as(String alias) {
        return new Blacklists(DSL.name(alias), this);
    }

    @Override
    public Blacklists as(Name alias) {
        return new Blacklists(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Blacklists rename(String name) {
        return new Blacklists(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Blacklists rename(Name name) {
        return new Blacklists(name, null);
    }

    // -------------------------------------------------------------------------
    // Row10 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row10<Long, LocalDateTime, String, String, Long, String, String, LocalDateTime, String, String> fieldsRow() {
        return (Row10) super.fieldsRow();
    }
}
