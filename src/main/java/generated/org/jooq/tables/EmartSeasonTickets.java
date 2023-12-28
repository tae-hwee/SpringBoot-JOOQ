/*
 * This file is generated by jOOQ.
 */
package generated.org.jooq.tables;


import generated.org.jooq.RsParkingNode;
import generated.org.jooq.tables.records.EmartSeasonTicketsRecord;

import java.math.BigInteger;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row10;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class EmartSeasonTickets extends TableImpl<EmartSeasonTicketsRecord> {

    private static final long serialVersionUID = -1288742629;

    /**
     * The reference instance of <code>rs-parking-node.emart_season_tickets</code>
     */
    public static final EmartSeasonTickets EMART_SEASON_TICKETS = new EmartSeasonTickets();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<EmartSeasonTicketsRecord> getRecordType() {
        return EmartSeasonTicketsRecord.class;
    }

    /**
     * The column <code>rs-parking-node.emart_season_tickets.STRCD_HQ</code>. 점포 코드(영업점)
     */
    public final TableField<EmartSeasonTicketsRecord, String> STRCD_HQ = createField(DSL.name("STRCD_HQ"), org.jooq.impl.SQLDataType.CHAR(4).nullable(false), this, "점포 코드(영업점)");

    /**
     * The column <code>rs-parking-node.emart_season_tickets.SEQ</code>. 순번
     */
    public final TableField<EmartSeasonTicketsRecord, String> SEQ = createField(DSL.name("SEQ"), org.jooq.impl.SQLDataType.VARCHAR(10).nullable(false), this, "순번");

    /**
     * The column <code>rs-parking-node.emart_season_tickets.CARNO</code>. 차량 번호
     */
    public final TableField<EmartSeasonTicketsRecord, byte[]> CARNO = createField(DSL.name("CARNO"), org.jooq.impl.SQLDataType.VARBINARY(2000).defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.VARBINARY)), this, "차량 번호");

    /**
     * The column <code>rs-parking-node.emart_season_tickets.CMTK_STRTDT</code>. 정기권 시작일(YYYYMMDD)
     */
    public final TableField<EmartSeasonTicketsRecord, String> CMTK_STRTDT = createField(DSL.name("CMTK_STRTDT"), org.jooq.impl.SQLDataType.VARCHAR(8).defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "정기권 시작일(YYYYMMDD)");

    /**
     * The column <code>rs-parking-node.emart_season_tickets.CMTK_ENDTDT</code>. 정기권 종료일(YYYYMMDD)
     */
    public final TableField<EmartSeasonTicketsRecord, String> CMTK_ENDTDT = createField(DSL.name("CMTK_ENDTDT"), org.jooq.impl.SQLDataType.VARCHAR(8).defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "정기권 종료일(YYYYMMDD)");

    /**
     * The column <code>rs-parking-node.emart_season_tickets.CMTK_PAY_TYPE</code>. 정기권 결제 종류(01:시간주차, 02:일일주차, 03:월정기주차, 04:무료등록주차)
     */
    public final TableField<EmartSeasonTicketsRecord, String> CMTK_PAY_TYPE = createField(DSL.name("CMTK_PAY_TYPE"), org.jooq.impl.SQLDataType.CHAR(2).defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.CHAR)), this, "정기권 결제 종류(01:시간주차, 02:일일주차, 03:월정기주차, 04:무료등록주차)");

    /**
     * The column <code>rs-parking-node.emart_season_tickets.CMTK_TYPE</code>. 정기권 내외구분(01:내부, 02:외부)
     */
    public final TableField<EmartSeasonTicketsRecord, String> CMTK_TYPE = createField(DSL.name("CMTK_TYPE"), org.jooq.impl.SQLDataType.CHAR(2).defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.CHAR)), this, "정기권 내외구분(01:내부, 02:외부)");

    /**
     * The column <code>rs-parking-node.emart_season_tickets.REGDT</code>. 등록일(YYYYMMDD)
     */
    public final TableField<EmartSeasonTicketsRecord, String> REGDT = createField(DSL.name("REGDT"), org.jooq.impl.SQLDataType.VARCHAR(8).defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "등록일(YYYYMMDD)");

    /**
     * The column <code>rs-parking-node.emart_season_tickets.SALE_AMOUNT</code>. 판매금액
     */
    public final TableField<EmartSeasonTicketsRecord, BigInteger> SALE_AMOUNT = createField(DSL.name("SALE_AMOUNT"), org.jooq.impl.SQLDataType.DECIMAL_INTEGER.precision(20).defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.DECIMAL_INTEGER)), this, "판매금액");

    /**
     * The column <code>rs-parking-node.emart_season_tickets.SALE_DATE_TIME</code>. 판매일시(YYYYMMDD)
     */
    public final TableField<EmartSeasonTicketsRecord, String> SALE_DATE_TIME = createField(DSL.name("SALE_DATE_TIME"), org.jooq.impl.SQLDataType.VARCHAR(8).defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "판매일시(YYYYMMDD)");

    /**
     * Create a <code>rs-parking-node.emart_season_tickets</code> table reference
     */
    public EmartSeasonTickets() {
        this(DSL.name("emart_season_tickets"), null);
    }

    /**
     * Create an aliased <code>rs-parking-node.emart_season_tickets</code> table reference
     */
    public EmartSeasonTickets(String alias) {
        this(DSL.name(alias), EMART_SEASON_TICKETS);
    }

    /**
     * Create an aliased <code>rs-parking-node.emart_season_tickets</code> table reference
     */
    public EmartSeasonTickets(Name alias) {
        this(alias, EMART_SEASON_TICKETS);
    }

    private EmartSeasonTickets(Name alias, Table<EmartSeasonTicketsRecord> aliased) {
        this(alias, aliased, null);
    }

    private EmartSeasonTickets(Name alias, Table<EmartSeasonTicketsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> EmartSeasonTickets(Table<O> child, ForeignKey<O, EmartSeasonTicketsRecord> key) {
        super(child, key, EMART_SEASON_TICKETS);
    }

    @Override
    public Schema getSchema() {
        return RsParkingNode.RS_PARKING_NODE;
    }

    @Override
    public EmartSeasonTickets as(String alias) {
        return new EmartSeasonTickets(DSL.name(alias), this);
    }

    @Override
    public EmartSeasonTickets as(Name alias) {
        return new EmartSeasonTickets(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public EmartSeasonTickets rename(String name) {
        return new EmartSeasonTickets(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public EmartSeasonTickets rename(Name name) {
        return new EmartSeasonTickets(name, null);
    }

    // -------------------------------------------------------------------------
    // Row10 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row10<String, String, byte[], String, String, String, String, String, BigInteger, String> fieldsRow() {
        return (Row10) super.fieldsRow();
    }
}
