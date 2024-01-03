/*
 * This file is generated by jOOQ.
 */
package generated.org.jooq.tables.records;


import generated.org.jooq.tables.VisitReceipts;

import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class VisitReceiptsRecord extends UpdatableRecordImpl<VisitReceiptsRecord> implements Record6<String, Integer, LocalDateTime, String, LocalDateTime, Long> {

    private static final long serialVersionUID = 1871598480;

    /**
     * Setter for <code>rs-parking-node.visit_receipts.id</code>.
     */
    public void setId(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>rs-parking-node.visit_receipts.id</code>.
     */
    public String getId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>rs-parking-node.visit_receipts.amount</code>.
     */
    public void setAmount(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>rs-parking-node.visit_receipts.amount</code>.
     */
    public Integer getAmount() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>rs-parking-node.visit_receipts.created</code>.
     */
    public void setCreated(LocalDateTime value) {
        set(2, value);
    }

    /**
     * Getter for <code>rs-parking-node.visit_receipts.created</code>.
     */
    public LocalDateTime getCreated() {
        return (LocalDateTime) get(2);
    }

    /**
     * Setter for <code>rs-parking-node.visit_receipts.posType</code>.
     */
    public void setPostype(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>rs-parking-node.visit_receipts.posType</code>.
     */
    public String getPostype() {
        return (String) get(3);
    }

    /**
     * Setter for <code>rs-parking-node.visit_receipts.purchased</code>.
     */
    public void setPurchased(LocalDateTime value) {
        set(4, value);
    }

    /**
     * Getter for <code>rs-parking-node.visit_receipts.purchased</code>.
     */
    public LocalDateTime getPurchased() {
        return (LocalDateTime) get(4);
    }

    /**
     * Setter for <code>rs-parking-node.visit_receipts.visitId</code>.
     */
    public void setVisitid(Long value) {
        set(5, value);
    }

    /**
     * Getter for <code>rs-parking-node.visit_receipts.visitId</code>.
     */
    public Long getVisitid() {
        return (Long) get(5);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row6<String, Integer, LocalDateTime, String, LocalDateTime, Long> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    @Override
    public Row6<String, Integer, LocalDateTime, String, LocalDateTime, Long> valuesRow() {
        return (Row6) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return VisitReceipts.VISIT_RECEIPTS.ID;
    }

    @Override
    public Field<Integer> field2() {
        return VisitReceipts.VISIT_RECEIPTS.AMOUNT;
    }

    @Override
    public Field<LocalDateTime> field3() {
        return VisitReceipts.VISIT_RECEIPTS.CREATED;
    }

    @Override
    public Field<String> field4() {
        return VisitReceipts.VISIT_RECEIPTS.POSTYPE;
    }

    @Override
    public Field<LocalDateTime> field5() {
        return VisitReceipts.VISIT_RECEIPTS.PURCHASED;
    }

    @Override
    public Field<Long> field6() {
        return VisitReceipts.VISIT_RECEIPTS.VISITID;
    }

    @Override
    public String component1() {
        return getId();
    }

    @Override
    public Integer component2() {
        return getAmount();
    }

    @Override
    public LocalDateTime component3() {
        return getCreated();
    }

    @Override
    public String component4() {
        return getPostype();
    }

    @Override
    public LocalDateTime component5() {
        return getPurchased();
    }

    @Override
    public Long component6() {
        return getVisitid();
    }

    @Override
    public String value1() {
        return getId();
    }

    @Override
    public Integer value2() {
        return getAmount();
    }

    @Override
    public LocalDateTime value3() {
        return getCreated();
    }

    @Override
    public String value4() {
        return getPostype();
    }

    @Override
    public LocalDateTime value5() {
        return getPurchased();
    }

    @Override
    public Long value6() {
        return getVisitid();
    }

    @Override
    public VisitReceiptsRecord value1(String value) {
        setId(value);
        return this;
    }

    @Override
    public VisitReceiptsRecord value2(Integer value) {
        setAmount(value);
        return this;
    }

    @Override
    public VisitReceiptsRecord value3(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public VisitReceiptsRecord value4(String value) {
        setPostype(value);
        return this;
    }

    @Override
    public VisitReceiptsRecord value5(LocalDateTime value) {
        setPurchased(value);
        return this;
    }

    @Override
    public VisitReceiptsRecord value6(Long value) {
        setVisitid(value);
        return this;
    }

    @Override
    public VisitReceiptsRecord values(String value1, Integer value2, LocalDateTime value3, String value4, LocalDateTime value5, Long value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached VisitReceiptsRecord
     */
    public VisitReceiptsRecord() {
        super(VisitReceipts.VISIT_RECEIPTS);
    }

    /**
     * Create a detached, initialised VisitReceiptsRecord
     */
    public VisitReceiptsRecord(String id, Integer amount, LocalDateTime created, String postype, LocalDateTime purchased, Long visitid) {
        super(VisitReceipts.VISIT_RECEIPTS);

        set(0, id);
        set(1, amount);
        set(2, created);
        set(3, postype);
        set(4, purchased);
        set(5, visitid);
    }
}