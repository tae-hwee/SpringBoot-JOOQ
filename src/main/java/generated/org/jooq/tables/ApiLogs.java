/*
 * This file is generated by jOOQ.
 */
package generated.org.jooq.tables;


import generated.org.jooq.Keys;
import generated.org.jooq.RsParkingNode;
import generated.org.jooq.tables.records.ApiLogsRecord;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
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
public class ApiLogs extends TableImpl<ApiLogsRecord> {

    private static final long serialVersionUID = -1411972660;

    /**
     * The reference instance of <code>rs-parking-node.api_logs</code>
     */
    public static final ApiLogs API_LOGS = new ApiLogs();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ApiLogsRecord> getRecordType() {
        return ApiLogsRecord.class;
    }

    /**
     * The column <code>rs-parking-node.api_logs.apiLogId</code>.
     */
    public final TableField<ApiLogsRecord, Long> APILOGID = createField(DSL.name("apiLogId"), org.jooq.impl.SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>rs-parking-node.api_logs.details</code>.
     */
    public final TableField<ApiLogsRecord, String> DETAILS = createField(DSL.name("details"), org.jooq.impl.SQLDataType.CLOB.defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.CLOB)), this, "");

    /**
     * The column <code>rs-parking-node.api_logs.host</code>.
     */
    public final TableField<ApiLogsRecord, String> HOST = createField(DSL.name("host"), org.jooq.impl.SQLDataType.VARCHAR(255).defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>rs-parking-node.api_logs.protocol</code>.
     */
    public final TableField<ApiLogsRecord, String> PROTOCOL = createField(DSL.name("protocol"), org.jooq.impl.SQLDataType.VARCHAR(16).nullable(false), this, "");

    /**
     * The column <code>rs-parking-node.api_logs.request</code>.
     */
    public final TableField<ApiLogsRecord, String> REQUEST = createField(DSL.name("request"), org.jooq.impl.SQLDataType.CLOB.defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.CLOB)), this, "");

    /**
     * The column <code>rs-parking-node.api_logs.requested</code>.
     */
    public final TableField<ApiLogsRecord, LocalDateTime> REQUESTED = createField(DSL.name("requested"), org.jooq.impl.SQLDataType.LOCALDATETIME.defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>rs-parking-node.api_logs.responded</code>.
     */
    public final TableField<ApiLogsRecord, LocalDateTime> RESPONDED = createField(DSL.name("responded"), org.jooq.impl.SQLDataType.LOCALDATETIME.defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>rs-parking-node.api_logs.response</code>.
     */
    public final TableField<ApiLogsRecord, String> RESPONSE = createField(DSL.name("response"), org.jooq.impl.SQLDataType.CLOB.defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.CLOB)), this, "");

    /**
     * The column <code>rs-parking-node.api_logs.statusCode</code>.
     */
    public final TableField<ApiLogsRecord, String> STATUSCODE = createField(DSL.name("statusCode"), org.jooq.impl.SQLDataType.VARCHAR(16).defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>rs-parking-node.api_logs.visitId</code>.
     */
    public final TableField<ApiLogsRecord, Long> VISITID = createField(DSL.name("visitId"), org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * Create a <code>rs-parking-node.api_logs</code> table reference
     */
    public ApiLogs() {
        this(DSL.name("api_logs"), null);
    }

    /**
     * Create an aliased <code>rs-parking-node.api_logs</code> table reference
     */
    public ApiLogs(String alias) {
        this(DSL.name(alias), API_LOGS);
    }

    /**
     * Create an aliased <code>rs-parking-node.api_logs</code> table reference
     */
    public ApiLogs(Name alias) {
        this(alias, API_LOGS);
    }

    private ApiLogs(Name alias, Table<ApiLogsRecord> aliased) {
        this(alias, aliased, null);
    }

    private ApiLogs(Name alias, Table<ApiLogsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> ApiLogs(Table<O> child, ForeignKey<O, ApiLogsRecord> key) {
        super(child, key, API_LOGS);
    }

    @Override
    public Schema getSchema() {
        return RsParkingNode.RS_PARKING_NODE;
    }

    @Override
    public Identity<ApiLogsRecord, Long> getIdentity() {
        return Keys.IDENTITY_API_LOGS;
    }

    @Override
    public UniqueKey<ApiLogsRecord> getPrimaryKey() {
        return Keys.KEY_API_LOGS_PRIMARY;
    }

    @Override
    public List<UniqueKey<ApiLogsRecord>> getKeys() {
        return Arrays.<UniqueKey<ApiLogsRecord>>asList(Keys.KEY_API_LOGS_PRIMARY);
    }

    @Override
    public List<ForeignKey<ApiLogsRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<ApiLogsRecord, ?>>asList(Keys.FKLHKGAENGST8LPHY661TSX3831);
    }

    public Visits visits() {
        return new Visits(this, Keys.FKLHKGAENGST8LPHY661TSX3831);
    }

    @Override
    public ApiLogs as(String alias) {
        return new ApiLogs(DSL.name(alias), this);
    }

    @Override
    public ApiLogs as(Name alias) {
        return new ApiLogs(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ApiLogs rename(String name) {
        return new ApiLogs(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ApiLogs rename(Name name) {
        return new ApiLogs(name, null);
    }

    // -------------------------------------------------------------------------
    // Row10 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row10<Long, String, String, String, String, LocalDateTime, LocalDateTime, String, String, Long> fieldsRow() {
        return (Row10) super.fieldsRow();
    }
}
