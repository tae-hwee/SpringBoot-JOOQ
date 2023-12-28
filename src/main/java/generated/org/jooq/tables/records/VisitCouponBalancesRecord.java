/*
 * This file is generated by jOOQ.
 */
package generated.org.jooq.tables.records;


import generated.org.jooq.tables.VisitCouponBalances;

import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record13;
import org.jooq.Row13;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class VisitCouponBalancesRecord extends UpdatableRecordImpl<VisitCouponBalancesRecord> implements Record13<String, String, LocalDateTime, LocalDateTime, LocalDateTime, Integer, Integer, String, String, Long, Long, Long, Integer> {

    private static final long serialVersionUID = -828453980;

    /**
     * Setter for <code>rs-parking-node.visit_coupon_balances.id</code>.
     */
    public void setId(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>rs-parking-node.visit_coupon_balances.id</code>.
     */
    public String getId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>rs-parking-node.visit_coupon_balances.cancelTarget</code>.
     */
    public void setCanceltarget(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>rs-parking-node.visit_coupon_balances.cancelTarget</code>.
     */
    public String getCanceltarget() {
        return (String) get(1);
    }

    /**
     * Setter for <code>rs-parking-node.visit_coupon_balances.closed</code>.
     */
    public void setClosed(LocalDateTime value) {
        set(2, value);
    }

    /**
     * Getter for <code>rs-parking-node.visit_coupon_balances.closed</code>.
     */
    public LocalDateTime getClosed() {
        return (LocalDateTime) get(2);
    }

    /**
     * Setter for <code>rs-parking-node.visit_coupon_balances.created</code>.
     */
    public void setCreated(LocalDateTime value) {
        set(3, value);
    }

    /**
     * Getter for <code>rs-parking-node.visit_coupon_balances.created</code>.
     */
    public LocalDateTime getCreated() {
        return (LocalDateTime) get(3);
    }

    /**
     * Setter for <code>rs-parking-node.visit_coupon_balances.discard</code>.
     */
    public void setDiscard(LocalDateTime value) {
        set(4, value);
    }

    /**
     * Getter for <code>rs-parking-node.visit_coupon_balances.discard</code>.
     */
    public LocalDateTime getDiscard() {
        return (LocalDateTime) get(4);
    }

    /**
     * Setter for <code>rs-parking-node.visit_coupon_balances.points</code>.
     */
    public void setPoints(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>rs-parking-node.visit_coupon_balances.points</code>.
     */
    public Integer getPoints() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>rs-parking-node.visit_coupon_balances.pointsBalance</code>.
     */
    public void setPointsbalance(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>rs-parking-node.visit_coupon_balances.pointsBalance</code>.
     */
    public Integer getPointsbalance() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>rs-parking-node.visit_coupon_balances.type</code>.
     */
    public void setType(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>rs-parking-node.visit_coupon_balances.type</code>.
     */
    public String getType() {
        return (String) get(7);
    }

    /**
     * Setter for <code>rs-parking-node.visit_coupon_balances.visitCouponId</code>.
     */
    public void setVisitcouponid(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>rs-parking-node.visit_coupon_balances.visitCouponId</code>.
     */
    public String getVisitcouponid() {
        return (String) get(8);
    }

    /**
     * Setter for <code>rs-parking-node.visit_coupon_balances.creatorId</code>.
     */
    public void setCreatorid(Long value) {
        set(9, value);
    }

    /**
     * Getter for <code>rs-parking-node.visit_coupon_balances.creatorId</code>.
     */
    public Long getCreatorid() {
        return (Long) get(9);
    }

    /**
     * Setter for <code>rs-parking-node.visit_coupon_balances.memberId</code>.
     */
    public void setMemberid(Long value) {
        set(10, value);
    }

    /**
     * Getter for <code>rs-parking-node.visit_coupon_balances.memberId</code>.
     */
    public Long getMemberid() {
        return (Long) get(10);
    }

    /**
     * Setter for <code>rs-parking-node.visit_coupon_balances.visitCouponTemplateId</code>.
     */
    public void setVisitcoupontemplateid(Long value) {
        set(11, value);
    }

    /**
     * Getter for <code>rs-parking-node.visit_coupon_balances.visitCouponTemplateId</code>.
     */
    public Long getVisitcoupontemplateid() {
        return (Long) get(11);
    }

    /**
     * Setter for <code>rs-parking-node.visit_coupon_balances.autoRefillPoints</code>.
     */
    public void setAutorefillpoints(Integer value) {
        set(12, value);
    }

    /**
     * Getter for <code>rs-parking-node.visit_coupon_balances.autoRefillPoints</code>.
     */
    public Integer getAutorefillpoints() {
        return (Integer) get(12);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record13 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row13<String, String, LocalDateTime, LocalDateTime, LocalDateTime, Integer, Integer, String, String, Long, Long, Long, Integer> fieldsRow() {
        return (Row13) super.fieldsRow();
    }

    @Override
    public Row13<String, String, LocalDateTime, LocalDateTime, LocalDateTime, Integer, Integer, String, String, Long, Long, Long, Integer> valuesRow() {
        return (Row13) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return VisitCouponBalances.VISIT_COUPON_BALANCES.ID;
    }

    @Override
    public Field<String> field2() {
        return VisitCouponBalances.VISIT_COUPON_BALANCES.CANCELTARGET;
    }

    @Override
    public Field<LocalDateTime> field3() {
        return VisitCouponBalances.VISIT_COUPON_BALANCES.CLOSED;
    }

    @Override
    public Field<LocalDateTime> field4() {
        return VisitCouponBalances.VISIT_COUPON_BALANCES.CREATED;
    }

    @Override
    public Field<LocalDateTime> field5() {
        return VisitCouponBalances.VISIT_COUPON_BALANCES.DISCARD;
    }

    @Override
    public Field<Integer> field6() {
        return VisitCouponBalances.VISIT_COUPON_BALANCES.POINTS;
    }

    @Override
    public Field<Integer> field7() {
        return VisitCouponBalances.VISIT_COUPON_BALANCES.POINTSBALANCE;
    }

    @Override
    public Field<String> field8() {
        return VisitCouponBalances.VISIT_COUPON_BALANCES.TYPE;
    }

    @Override
    public Field<String> field9() {
        return VisitCouponBalances.VISIT_COUPON_BALANCES.VISITCOUPONID;
    }

    @Override
    public Field<Long> field10() {
        return VisitCouponBalances.VISIT_COUPON_BALANCES.CREATORID;
    }

    @Override
    public Field<Long> field11() {
        return VisitCouponBalances.VISIT_COUPON_BALANCES.MEMBERID;
    }

    @Override
    public Field<Long> field12() {
        return VisitCouponBalances.VISIT_COUPON_BALANCES.VISITCOUPONTEMPLATEID;
    }

    @Override
    public Field<Integer> field13() {
        return VisitCouponBalances.VISIT_COUPON_BALANCES.AUTOREFILLPOINTS;
    }

    @Override
    public String component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getCanceltarget();
    }

    @Override
    public LocalDateTime component3() {
        return getClosed();
    }

    @Override
    public LocalDateTime component4() {
        return getCreated();
    }

    @Override
    public LocalDateTime component5() {
        return getDiscard();
    }

    @Override
    public Integer component6() {
        return getPoints();
    }

    @Override
    public Integer component7() {
        return getPointsbalance();
    }

    @Override
    public String component8() {
        return getType();
    }

    @Override
    public String component9() {
        return getVisitcouponid();
    }

    @Override
    public Long component10() {
        return getCreatorid();
    }

    @Override
    public Long component11() {
        return getMemberid();
    }

    @Override
    public Long component12() {
        return getVisitcoupontemplateid();
    }

    @Override
    public Integer component13() {
        return getAutorefillpoints();
    }

    @Override
    public String value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getCanceltarget();
    }

    @Override
    public LocalDateTime value3() {
        return getClosed();
    }

    @Override
    public LocalDateTime value4() {
        return getCreated();
    }

    @Override
    public LocalDateTime value5() {
        return getDiscard();
    }

    @Override
    public Integer value6() {
        return getPoints();
    }

    @Override
    public Integer value7() {
        return getPointsbalance();
    }

    @Override
    public String value8() {
        return getType();
    }

    @Override
    public String value9() {
        return getVisitcouponid();
    }

    @Override
    public Long value10() {
        return getCreatorid();
    }

    @Override
    public Long value11() {
        return getMemberid();
    }

    @Override
    public Long value12() {
        return getVisitcoupontemplateid();
    }

    @Override
    public Integer value13() {
        return getAutorefillpoints();
    }

    @Override
    public VisitCouponBalancesRecord value1(String value) {
        setId(value);
        return this;
    }

    @Override
    public VisitCouponBalancesRecord value2(String value) {
        setCanceltarget(value);
        return this;
    }

    @Override
    public VisitCouponBalancesRecord value3(LocalDateTime value) {
        setClosed(value);
        return this;
    }

    @Override
    public VisitCouponBalancesRecord value4(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public VisitCouponBalancesRecord value5(LocalDateTime value) {
        setDiscard(value);
        return this;
    }

    @Override
    public VisitCouponBalancesRecord value6(Integer value) {
        setPoints(value);
        return this;
    }

    @Override
    public VisitCouponBalancesRecord value7(Integer value) {
        setPointsbalance(value);
        return this;
    }

    @Override
    public VisitCouponBalancesRecord value8(String value) {
        setType(value);
        return this;
    }

    @Override
    public VisitCouponBalancesRecord value9(String value) {
        setVisitcouponid(value);
        return this;
    }

    @Override
    public VisitCouponBalancesRecord value10(Long value) {
        setCreatorid(value);
        return this;
    }

    @Override
    public VisitCouponBalancesRecord value11(Long value) {
        setMemberid(value);
        return this;
    }

    @Override
    public VisitCouponBalancesRecord value12(Long value) {
        setVisitcoupontemplateid(value);
        return this;
    }

    @Override
    public VisitCouponBalancesRecord value13(Integer value) {
        setAutorefillpoints(value);
        return this;
    }

    @Override
    public VisitCouponBalancesRecord values(String value1, String value2, LocalDateTime value3, LocalDateTime value4, LocalDateTime value5, Integer value6, Integer value7, String value8, String value9, Long value10, Long value11, Long value12, Integer value13) {
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
        value11(value11);
        value12(value12);
        value13(value13);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached VisitCouponBalancesRecord
     */
    public VisitCouponBalancesRecord() {
        super(VisitCouponBalances.VISIT_COUPON_BALANCES);
    }

    /**
     * Create a detached, initialised VisitCouponBalancesRecord
     */
    public VisitCouponBalancesRecord(String id, String canceltarget, LocalDateTime closed, LocalDateTime created, LocalDateTime discard, Integer points, Integer pointsbalance, String type, String visitcouponid, Long creatorid, Long memberid, Long visitcoupontemplateid, Integer autorefillpoints) {
        super(VisitCouponBalances.VISIT_COUPON_BALANCES);

        set(0, id);
        set(1, canceltarget);
        set(2, closed);
        set(3, created);
        set(4, discard);
        set(5, points);
        set(6, pointsbalance);
        set(7, type);
        set(8, visitcouponid);
        set(9, creatorid);
        set(10, memberid);
        set(11, visitcoupontemplateid);
        set(12, autorefillpoints);
    }
}