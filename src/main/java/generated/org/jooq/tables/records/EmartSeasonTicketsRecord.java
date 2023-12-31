/*
 * This file is generated by jOOQ.
 */
package generated.org.jooq.tables.records;


import generated.org.jooq.tables.EmartSeasonTickets;

import java.math.BigInteger;

import org.jooq.Field;
import org.jooq.Record10;
import org.jooq.Row10;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class EmartSeasonTicketsRecord extends TableRecordImpl<EmartSeasonTicketsRecord> implements Record10<String, String, byte[], String, String, String, String, String, BigInteger, String> {

    private static final long serialVersionUID = 1214791624;

    /**
     * Setter for <code>rs-parking-node.emart_season_tickets.STRCD_HQ</code>. 점포 코드(영업점)
     */
    public void setStrcdHq(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>rs-parking-node.emart_season_tickets.STRCD_HQ</code>. 점포 코드(영업점)
     */
    public String getStrcdHq() {
        return (String) get(0);
    }

    /**
     * Setter for <code>rs-parking-node.emart_season_tickets.SEQ</code>. 순번
     */
    public void setSeq(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>rs-parking-node.emart_season_tickets.SEQ</code>. 순번
     */
    public String getSeq() {
        return (String) get(1);
    }

    /**
     * Setter for <code>rs-parking-node.emart_season_tickets.CARNO</code>. 차량 번호
     */
    public void setCarno(byte[] value) {
        set(2, value);
    }

    /**
     * Getter for <code>rs-parking-node.emart_season_tickets.CARNO</code>. 차량 번호
     */
    public byte[] getCarno() {
        return (byte[]) get(2);
    }

    /**
     * Setter for <code>rs-parking-node.emart_season_tickets.CMTK_STRTDT</code>. 정기권 시작일(YYYYMMDD)
     */
    public void setCmtkStrtdt(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>rs-parking-node.emart_season_tickets.CMTK_STRTDT</code>. 정기권 시작일(YYYYMMDD)
     */
    public String getCmtkStrtdt() {
        return (String) get(3);
    }

    /**
     * Setter for <code>rs-parking-node.emart_season_tickets.CMTK_ENDTDT</code>. 정기권 종료일(YYYYMMDD)
     */
    public void setCmtkEndtdt(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>rs-parking-node.emart_season_tickets.CMTK_ENDTDT</code>. 정기권 종료일(YYYYMMDD)
     */
    public String getCmtkEndtdt() {
        return (String) get(4);
    }

    /**
     * Setter for <code>rs-parking-node.emart_season_tickets.CMTK_PAY_TYPE</code>. 정기권 결제 종류(01:시간주차, 02:일일주차, 03:월정기주차, 04:무료등록주차)
     */
    public void setCmtkPayType(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>rs-parking-node.emart_season_tickets.CMTK_PAY_TYPE</code>. 정기권 결제 종류(01:시간주차, 02:일일주차, 03:월정기주차, 04:무료등록주차)
     */
    public String getCmtkPayType() {
        return (String) get(5);
    }

    /**
     * Setter for <code>rs-parking-node.emart_season_tickets.CMTK_TYPE</code>. 정기권 내외구분(01:내부, 02:외부)
     */
    public void setCmtkType(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>rs-parking-node.emart_season_tickets.CMTK_TYPE</code>. 정기권 내외구분(01:내부, 02:외부)
     */
    public String getCmtkType() {
        return (String) get(6);
    }

    /**
     * Setter for <code>rs-parking-node.emart_season_tickets.REGDT</code>. 등록일(YYYYMMDD)
     */
    public void setRegdt(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>rs-parking-node.emart_season_tickets.REGDT</code>. 등록일(YYYYMMDD)
     */
    public String getRegdt() {
        return (String) get(7);
    }

    /**
     * Setter for <code>rs-parking-node.emart_season_tickets.SALE_AMOUNT</code>. 판매금액
     */
    public void setSaleAmount(BigInteger value) {
        set(8, value);
    }

    /**
     * Getter for <code>rs-parking-node.emart_season_tickets.SALE_AMOUNT</code>. 판매금액
     */
    public BigInteger getSaleAmount() {
        return (BigInteger) get(8);
    }

    /**
     * Setter for <code>rs-parking-node.emart_season_tickets.SALE_DATE_TIME</code>. 판매일시(YYYYMMDD)
     */
    public void setSaleDateTime(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>rs-parking-node.emart_season_tickets.SALE_DATE_TIME</code>. 판매일시(YYYYMMDD)
     */
    public String getSaleDateTime() {
        return (String) get(9);
    }

    // -------------------------------------------------------------------------
    // Record10 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row10<String, String, byte[], String, String, String, String, String, BigInteger, String> fieldsRow() {
        return (Row10) super.fieldsRow();
    }

    @Override
    public Row10<String, String, byte[], String, String, String, String, String, BigInteger, String> valuesRow() {
        return (Row10) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return EmartSeasonTickets.EMART_SEASON_TICKETS.STRCD_HQ;
    }

    @Override
    public Field<String> field2() {
        return EmartSeasonTickets.EMART_SEASON_TICKETS.SEQ;
    }

    @Override
    public Field<byte[]> field3() {
        return EmartSeasonTickets.EMART_SEASON_TICKETS.CARNO;
    }

    @Override
    public Field<String> field4() {
        return EmartSeasonTickets.EMART_SEASON_TICKETS.CMTK_STRTDT;
    }

    @Override
    public Field<String> field5() {
        return EmartSeasonTickets.EMART_SEASON_TICKETS.CMTK_ENDTDT;
    }

    @Override
    public Field<String> field6() {
        return EmartSeasonTickets.EMART_SEASON_TICKETS.CMTK_PAY_TYPE;
    }

    @Override
    public Field<String> field7() {
        return EmartSeasonTickets.EMART_SEASON_TICKETS.CMTK_TYPE;
    }

    @Override
    public Field<String> field8() {
        return EmartSeasonTickets.EMART_SEASON_TICKETS.REGDT;
    }

    @Override
    public Field<BigInteger> field9() {
        return EmartSeasonTickets.EMART_SEASON_TICKETS.SALE_AMOUNT;
    }

    @Override
    public Field<String> field10() {
        return EmartSeasonTickets.EMART_SEASON_TICKETS.SALE_DATE_TIME;
    }

    @Override
    public String component1() {
        return getStrcdHq();
    }

    @Override
    public String component2() {
        return getSeq();
    }

    @Override
    public byte[] component3() {
        return getCarno();
    }

    @Override
    public String component4() {
        return getCmtkStrtdt();
    }

    @Override
    public String component5() {
        return getCmtkEndtdt();
    }

    @Override
    public String component6() {
        return getCmtkPayType();
    }

    @Override
    public String component7() {
        return getCmtkType();
    }

    @Override
    public String component8() {
        return getRegdt();
    }

    @Override
    public BigInteger component9() {
        return getSaleAmount();
    }

    @Override
    public String component10() {
        return getSaleDateTime();
    }

    @Override
    public String value1() {
        return getStrcdHq();
    }

    @Override
    public String value2() {
        return getSeq();
    }

    @Override
    public byte[] value3() {
        return getCarno();
    }

    @Override
    public String value4() {
        return getCmtkStrtdt();
    }

    @Override
    public String value5() {
        return getCmtkEndtdt();
    }

    @Override
    public String value6() {
        return getCmtkPayType();
    }

    @Override
    public String value7() {
        return getCmtkType();
    }

    @Override
    public String value8() {
        return getRegdt();
    }

    @Override
    public BigInteger value9() {
        return getSaleAmount();
    }

    @Override
    public String value10() {
        return getSaleDateTime();
    }

    @Override
    public EmartSeasonTicketsRecord value1(String value) {
        setStrcdHq(value);
        return this;
    }

    @Override
    public EmartSeasonTicketsRecord value2(String value) {
        setSeq(value);
        return this;
    }

    @Override
    public EmartSeasonTicketsRecord value3(byte[] value) {
        setCarno(value);
        return this;
    }

    @Override
    public EmartSeasonTicketsRecord value4(String value) {
        setCmtkStrtdt(value);
        return this;
    }

    @Override
    public EmartSeasonTicketsRecord value5(String value) {
        setCmtkEndtdt(value);
        return this;
    }

    @Override
    public EmartSeasonTicketsRecord value6(String value) {
        setCmtkPayType(value);
        return this;
    }

    @Override
    public EmartSeasonTicketsRecord value7(String value) {
        setCmtkType(value);
        return this;
    }

    @Override
    public EmartSeasonTicketsRecord value8(String value) {
        setRegdt(value);
        return this;
    }

    @Override
    public EmartSeasonTicketsRecord value9(BigInteger value) {
        setSaleAmount(value);
        return this;
    }

    @Override
    public EmartSeasonTicketsRecord value10(String value) {
        setSaleDateTime(value);
        return this;
    }

    @Override
    public EmartSeasonTicketsRecord values(String value1, String value2, byte[] value3, String value4, String value5, String value6, String value7, String value8, BigInteger value9, String value10) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached EmartSeasonTicketsRecord
     */
    public EmartSeasonTicketsRecord() {
        super(EmartSeasonTickets.EMART_SEASON_TICKETS);
    }

    /**
     * Create a detached, initialised EmartSeasonTicketsRecord
     */
    public EmartSeasonTicketsRecord(String strcdHq, String seq, byte[] carno, String cmtkStrtdt, String cmtkEndtdt, String cmtkPayType, String cmtkType, String regdt, BigInteger saleAmount, String saleDateTime) {
        super(EmartSeasonTickets.EMART_SEASON_TICKETS);

        set(0, strcdHq);
        set(1, seq);
        set(2, carno);
        set(3, cmtkStrtdt);
        set(4, cmtkEndtdt);
        set(5, cmtkPayType);
        set(6, cmtkType);
        set(7, regdt);
        set(8, saleAmount);
        set(9, saleDateTime);
    }
}
