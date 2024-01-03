/*
 * This file is generated by jOOQ.
 */
package generated.org.jooq.tables.records;


import generated.org.jooq.tables.PublicDiscounts;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record9;
import org.jooq.Row9;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PublicDiscountsRecord extends UpdatableRecordImpl<PublicDiscountsRecord> implements Record9<Long, String, Long, String, BigDecimal, LocalDateTime, LocalDateTime, String, String> {

    private static final long serialVersionUID = 921133653;

    /**
     * Setter for <code>rs-parking-node.public_discounts.publicDiscountId</code>.
     */
    public void setPublicdiscountid(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>rs-parking-node.public_discounts.publicDiscountId</code>.
     */
    public Long getPublicdiscountid() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>rs-parking-node.public_discounts.code</code>.
     */
    public void setCode(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>rs-parking-node.public_discounts.code</code>.
     */
    public String getCode() {
        return (String) get(1);
    }

    /**
     * Setter for <code>rs-parking-node.public_discounts.visitId</code>.
     */
    public void setVisitid(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>rs-parking-node.public_discounts.visitId</code>.
     */
    public Long getVisitid() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>rs-parking-node.public_discounts.details</code>.
     */
    public void setDetails(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>rs-parking-node.public_discounts.details</code>.
     */
    public String getDetails() {
        return (String) get(3);
    }

    /**
     * Setter for <code>rs-parking-node.public_discounts.valuatedAmount</code>.
     */
    public void setValuatedamount(BigDecimal value) {
        set(4, value);
    }

    /**
     * Getter for <code>rs-parking-node.public_discounts.valuatedAmount</code>.
     */
    public BigDecimal getValuatedamount() {
        return (BigDecimal) get(4);
    }

    /**
     * Setter for <code>rs-parking-node.public_discounts.created</code>.
     */
    public void setCreated(LocalDateTime value) {
        set(5, value);
    }

    /**
     * Getter for <code>rs-parking-node.public_discounts.created</code>.
     */
    public LocalDateTime getCreated() {
        return (LocalDateTime) get(5);
    }

    /**
     * Setter for <code>rs-parking-node.public_discounts.lastUpdated</code>.
     */
    public void setLastupdated(LocalDateTime value) {
        set(6, value);
    }

    /**
     * Getter for <code>rs-parking-node.public_discounts.lastUpdated</code>.
     */
    public LocalDateTime getLastupdated() {
        return (LocalDateTime) get(6);
    }

    /**
     * Setter for <code>rs-parking-node.public_discounts.umid</code>.
     */
    public void setUmid(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>rs-parking-node.public_discounts.umid</code>.
     */
    public String getUmid() {
        return (String) get(7);
    }

    /**
     * Setter for <code>rs-parking-node.public_discounts.barcode</code>.
     */
    public void setBarcode(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>rs-parking-node.public_discounts.barcode</code>.
     */
    public String getBarcode() {
        return (String) get(8);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record9 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row9<Long, String, Long, String, BigDecimal, LocalDateTime, LocalDateTime, String, String> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    @Override
    public Row9<Long, String, Long, String, BigDecimal, LocalDateTime, LocalDateTime, String, String> valuesRow() {
        return (Row9) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return PublicDiscounts.PUBLIC_DISCOUNTS.PUBLICDISCOUNTID;
    }

    @Override
    public Field<String> field2() {
        return PublicDiscounts.PUBLIC_DISCOUNTS.CODE;
    }

    @Override
    public Field<Long> field3() {
        return PublicDiscounts.PUBLIC_DISCOUNTS.VISITID;
    }

    @Override
    public Field<String> field4() {
        return PublicDiscounts.PUBLIC_DISCOUNTS.DETAILS;
    }

    @Override
    public Field<BigDecimal> field5() {
        return PublicDiscounts.PUBLIC_DISCOUNTS.VALUATEDAMOUNT;
    }

    @Override
    public Field<LocalDateTime> field6() {
        return PublicDiscounts.PUBLIC_DISCOUNTS.CREATED;
    }

    @Override
    public Field<LocalDateTime> field7() {
        return PublicDiscounts.PUBLIC_DISCOUNTS.LASTUPDATED;
    }

    @Override
    public Field<String> field8() {
        return PublicDiscounts.PUBLIC_DISCOUNTS.UMID;
    }

    @Override
    public Field<String> field9() {
        return PublicDiscounts.PUBLIC_DISCOUNTS.BARCODE;
    }

    @Override
    public Long component1() {
        return getPublicdiscountid();
    }

    @Override
    public String component2() {
        return getCode();
    }

    @Override
    public Long component3() {
        return getVisitid();
    }

    @Override
    public String component4() {
        return getDetails();
    }

    @Override
    public BigDecimal component5() {
        return getValuatedamount();
    }

    @Override
    public LocalDateTime component6() {
        return getCreated();
    }

    @Override
    public LocalDateTime component7() {
        return getLastupdated();
    }

    @Override
    public String component8() {
        return getUmid();
    }

    @Override
    public String component9() {
        return getBarcode();
    }

    @Override
    public Long value1() {
        return getPublicdiscountid();
    }

    @Override
    public String value2() {
        return getCode();
    }

    @Override
    public Long value3() {
        return getVisitid();
    }

    @Override
    public String value4() {
        return getDetails();
    }

    @Override
    public BigDecimal value5() {
        return getValuatedamount();
    }

    @Override
    public LocalDateTime value6() {
        return getCreated();
    }

    @Override
    public LocalDateTime value7() {
        return getLastupdated();
    }

    @Override
    public String value8() {
        return getUmid();
    }

    @Override
    public String value9() {
        return getBarcode();
    }

    @Override
    public PublicDiscountsRecord value1(Long value) {
        setPublicdiscountid(value);
        return this;
    }

    @Override
    public PublicDiscountsRecord value2(String value) {
        setCode(value);
        return this;
    }

    @Override
    public PublicDiscountsRecord value3(Long value) {
        setVisitid(value);
        return this;
    }

    @Override
    public PublicDiscountsRecord value4(String value) {
        setDetails(value);
        return this;
    }

    @Override
    public PublicDiscountsRecord value5(BigDecimal value) {
        setValuatedamount(value);
        return this;
    }

    @Override
    public PublicDiscountsRecord value6(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public PublicDiscountsRecord value7(LocalDateTime value) {
        setLastupdated(value);
        return this;
    }

    @Override
    public PublicDiscountsRecord value8(String value) {
        setUmid(value);
        return this;
    }

    @Override
    public PublicDiscountsRecord value9(String value) {
        setBarcode(value);
        return this;
    }

    @Override
    public PublicDiscountsRecord values(Long value1, String value2, Long value3, String value4, BigDecimal value5, LocalDateTime value6, LocalDateTime value7, String value8, String value9) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PublicDiscountsRecord
     */
    public PublicDiscountsRecord() {
        super(PublicDiscounts.PUBLIC_DISCOUNTS);
    }

    /**
     * Create a detached, initialised PublicDiscountsRecord
     */
    public PublicDiscountsRecord(Long publicdiscountid, String code, Long visitid, String details, BigDecimal valuatedamount, LocalDateTime created, LocalDateTime lastupdated, String umid, String barcode) {
        super(PublicDiscounts.PUBLIC_DISCOUNTS);

        set(0, publicdiscountid);
        set(1, code);
        set(2, visitid);
        set(3, details);
        set(4, valuatedamount);
        set(5, created);
        set(6, lastupdated);
        set(7, umid);
        set(8, barcode);
    }
}