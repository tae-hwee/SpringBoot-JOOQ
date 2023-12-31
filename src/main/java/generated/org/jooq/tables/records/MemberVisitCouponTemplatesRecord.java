/*
 * This file is generated by jOOQ.
 */
package generated.org.jooq.tables.records;


import generated.org.jooq.tables.MemberVisitCouponTemplates;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Record8;
import org.jooq.Row8;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class MemberVisitCouponTemplatesRecord extends UpdatableRecordImpl<MemberVisitCouponTemplatesRecord> implements Record8<Long, Long, LocalDateTime, BigDecimal, Integer, String, BigDecimal, String> {

    private static final long serialVersionUID = -945027739;

    /**
     * Setter for <code>rs-parking-node.member_visit_coupon_templates.memberId</code>.
     */
    public void setMemberid(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>rs-parking-node.member_visit_coupon_templates.memberId</code>.
     */
    public Long getMemberid() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>rs-parking-node.member_visit_coupon_templates.visitCouponTemplateId</code>.
     */
    public void setVisitcoupontemplateid(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>rs-parking-node.member_visit_coupon_templates.visitCouponTemplateId</code>.
     */
    public Long getVisitcoupontemplateid() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>rs-parking-node.member_visit_coupon_templates.created</code>.
     */
    public void setCreated(LocalDateTime value) {
        set(2, value);
    }

    /**
     * Getter for <code>rs-parking-node.member_visit_coupon_templates.created</code>.
     */
    public LocalDateTime getCreated() {
        return (LocalDateTime) get(2);
    }

    /**
     * Setter for <code>rs-parking-node.member_visit_coupon_templates.initAmount</code>.
     */
    public void setInitamount(BigDecimal value) {
        set(3, value);
    }

    /**
     * Getter for <code>rs-parking-node.member_visit_coupon_templates.initAmount</code>.
     */
    public BigDecimal getInitamount() {
        return (BigDecimal) get(3);
    }

    /**
     * Setter for <code>rs-parking-node.member_visit_coupon_templates.maxCouponCount</code>.
     */
    public void setMaxcouponcount(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>rs-parking-node.member_visit_coupon_templates.maxCouponCount</code>.
     */
    public Integer getMaxcouponcount() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>rs-parking-node.member_visit_coupon_templates.month</code>.
     */
    public void setMonth(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>rs-parking-node.member_visit_coupon_templates.month</code>.
     */
    public String getMonth() {
        return (String) get(5);
    }

    /**
     * Setter for <code>rs-parking-node.member_visit_coupon_templates.residualAmount</code>.
     */
    public void setResidualamount(BigDecimal value) {
        set(6, value);
    }

    /**
     * Getter for <code>rs-parking-node.member_visit_coupon_templates.residualAmount</code>.
     */
    public BigDecimal getResidualamount() {
        return (BigDecimal) get(6);
    }

    /**
     * Setter for <code>rs-parking-node.member_visit_coupon_templates.status</code>.
     */
    public void setStatus(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>rs-parking-node.member_visit_coupon_templates.status</code>.
     */
    public String getStatus() {
        return (String) get(7);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record2<Long, Long> key() {
        return (Record2) super.key();
    }

    // -------------------------------------------------------------------------
    // Record8 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row8<Long, Long, LocalDateTime, BigDecimal, Integer, String, BigDecimal, String> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    @Override
    public Row8<Long, Long, LocalDateTime, BigDecimal, Integer, String, BigDecimal, String> valuesRow() {
        return (Row8) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return MemberVisitCouponTemplates.MEMBER_VISIT_COUPON_TEMPLATES.MEMBERID;
    }

    @Override
    public Field<Long> field2() {
        return MemberVisitCouponTemplates.MEMBER_VISIT_COUPON_TEMPLATES.VISITCOUPONTEMPLATEID;
    }

    @Override
    public Field<LocalDateTime> field3() {
        return MemberVisitCouponTemplates.MEMBER_VISIT_COUPON_TEMPLATES.CREATED;
    }

    @Override
    public Field<BigDecimal> field4() {
        return MemberVisitCouponTemplates.MEMBER_VISIT_COUPON_TEMPLATES.INITAMOUNT;
    }

    @Override
    public Field<Integer> field5() {
        return MemberVisitCouponTemplates.MEMBER_VISIT_COUPON_TEMPLATES.MAXCOUPONCOUNT;
    }

    @Override
    public Field<String> field6() {
        return MemberVisitCouponTemplates.MEMBER_VISIT_COUPON_TEMPLATES.MONTH;
    }

    @Override
    public Field<BigDecimal> field7() {
        return MemberVisitCouponTemplates.MEMBER_VISIT_COUPON_TEMPLATES.RESIDUALAMOUNT;
    }

    @Override
    public Field<String> field8() {
        return MemberVisitCouponTemplates.MEMBER_VISIT_COUPON_TEMPLATES.STATUS;
    }

    @Override
    public Long component1() {
        return getMemberid();
    }

    @Override
    public Long component2() {
        return getVisitcoupontemplateid();
    }

    @Override
    public LocalDateTime component3() {
        return getCreated();
    }

    @Override
    public BigDecimal component4() {
        return getInitamount();
    }

    @Override
    public Integer component5() {
        return getMaxcouponcount();
    }

    @Override
    public String component6() {
        return getMonth();
    }

    @Override
    public BigDecimal component7() {
        return getResidualamount();
    }

    @Override
    public String component8() {
        return getStatus();
    }

    @Override
    public Long value1() {
        return getMemberid();
    }

    @Override
    public Long value2() {
        return getVisitcoupontemplateid();
    }

    @Override
    public LocalDateTime value3() {
        return getCreated();
    }

    @Override
    public BigDecimal value4() {
        return getInitamount();
    }

    @Override
    public Integer value5() {
        return getMaxcouponcount();
    }

    @Override
    public String value6() {
        return getMonth();
    }

    @Override
    public BigDecimal value7() {
        return getResidualamount();
    }

    @Override
    public String value8() {
        return getStatus();
    }

    @Override
    public MemberVisitCouponTemplatesRecord value1(Long value) {
        setMemberid(value);
        return this;
    }

    @Override
    public MemberVisitCouponTemplatesRecord value2(Long value) {
        setVisitcoupontemplateid(value);
        return this;
    }

    @Override
    public MemberVisitCouponTemplatesRecord value3(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public MemberVisitCouponTemplatesRecord value4(BigDecimal value) {
        setInitamount(value);
        return this;
    }

    @Override
    public MemberVisitCouponTemplatesRecord value5(Integer value) {
        setMaxcouponcount(value);
        return this;
    }

    @Override
    public MemberVisitCouponTemplatesRecord value6(String value) {
        setMonth(value);
        return this;
    }

    @Override
    public MemberVisitCouponTemplatesRecord value7(BigDecimal value) {
        setResidualamount(value);
        return this;
    }

    @Override
    public MemberVisitCouponTemplatesRecord value8(String value) {
        setStatus(value);
        return this;
    }

    @Override
    public MemberVisitCouponTemplatesRecord values(Long value1, Long value2, LocalDateTime value3, BigDecimal value4, Integer value5, String value6, BigDecimal value7, String value8) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached MemberVisitCouponTemplatesRecord
     */
    public MemberVisitCouponTemplatesRecord() {
        super(MemberVisitCouponTemplates.MEMBER_VISIT_COUPON_TEMPLATES);
    }

    /**
     * Create a detached, initialised MemberVisitCouponTemplatesRecord
     */
    public MemberVisitCouponTemplatesRecord(Long memberid, Long visitcoupontemplateid, LocalDateTime created, BigDecimal initamount, Integer maxcouponcount, String month, BigDecimal residualamount, String status) {
        super(MemberVisitCouponTemplates.MEMBER_VISIT_COUPON_TEMPLATES);

        set(0, memberid);
        set(1, visitcoupontemplateid);
        set(2, created);
        set(3, initamount);
        set(4, maxcouponcount);
        set(5, month);
        set(6, residualamount);
        set(7, status);
    }
}
