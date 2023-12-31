/*
 * This file is generated by jOOQ.
 */
package generated.org.jooq.tables.records;


import generated.org.jooq.tables.RelatedVisitCoupons;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class RelatedVisitCouponsRecord extends UpdatableRecordImpl<RelatedVisitCouponsRecord> implements Record2<Long, Long> {

    private static final long serialVersionUID = -1366627185;

    /**
     * Setter for <code>rs-parking-node.related_visit_coupons.visitCouponRelationId</code>.
     */
    public void setVisitcouponrelationid(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>rs-parking-node.related_visit_coupons.visitCouponRelationId</code>.
     */
    public Long getVisitcouponrelationid() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>rs-parking-node.related_visit_coupons.visitCouponTemplateId</code>.
     */
    public void setVisitcoupontemplateid(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>rs-parking-node.related_visit_coupons.visitCouponTemplateId</code>.
     */
    public Long getVisitcoupontemplateid() {
        return (Long) get(1);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record2<Long, Long> key() {
        return (Record2) super.key();
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row2<Long, Long> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    @Override
    public Row2<Long, Long> valuesRow() {
        return (Row2) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return RelatedVisitCoupons.RELATED_VISIT_COUPONS.VISITCOUPONRELATIONID;
    }

    @Override
    public Field<Long> field2() {
        return RelatedVisitCoupons.RELATED_VISIT_COUPONS.VISITCOUPONTEMPLATEID;
    }

    @Override
    public Long component1() {
        return getVisitcouponrelationid();
    }

    @Override
    public Long component2() {
        return getVisitcoupontemplateid();
    }

    @Override
    public Long value1() {
        return getVisitcouponrelationid();
    }

    @Override
    public Long value2() {
        return getVisitcoupontemplateid();
    }

    @Override
    public RelatedVisitCouponsRecord value1(Long value) {
        setVisitcouponrelationid(value);
        return this;
    }

    @Override
    public RelatedVisitCouponsRecord value2(Long value) {
        setVisitcoupontemplateid(value);
        return this;
    }

    @Override
    public RelatedVisitCouponsRecord values(Long value1, Long value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached RelatedVisitCouponsRecord
     */
    public RelatedVisitCouponsRecord() {
        super(RelatedVisitCoupons.RELATED_VISIT_COUPONS);
    }

    /**
     * Create a detached, initialised RelatedVisitCouponsRecord
     */
    public RelatedVisitCouponsRecord(Long visitcouponrelationid, Long visitcoupontemplateid) {
        super(RelatedVisitCoupons.RELATED_VISIT_COUPONS);

        set(0, visitcouponrelationid);
        set(1, visitcoupontemplateid);
    }
}
