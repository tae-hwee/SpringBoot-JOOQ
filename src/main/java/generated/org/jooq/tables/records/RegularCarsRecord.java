/*
 * This file is generated by jOOQ.
 */
package generated.org.jooq.tables.records;


import generated.org.jooq.tables.RegularCars;

import java.math.BigDecimal;
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
public class RegularCarsRecord extends UpdatableRecordImpl<RegularCarsRecord> implements Record13<String, String, LocalDateTime, LocalDateTime, String, Integer, BigDecimal, BigDecimal, String, Long, Long, Long, Long> {

    private static final long serialVersionUID = 1802944415;

    /**
     * Setter for <code>rs-parking-node.regular_cars.id</code>.
     */
    public void setId(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>rs-parking-node.regular_cars.id</code>.
     */
    public String getId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>rs-parking-node.regular_cars.activated</code>.
     */
    public void setActivated(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>rs-parking-node.regular_cars.activated</code>.
     */
    public String getActivated() {
        return (String) get(1);
    }

    /**
     * Setter for <code>rs-parking-node.regular_cars.created</code>.
     */
    public void setCreated(LocalDateTime value) {
        set(2, value);
    }

    /**
     * Getter for <code>rs-parking-node.regular_cars.created</code>.
     */
    public LocalDateTime getCreated() {
        return (LocalDateTime) get(2);
    }

    /**
     * Setter for <code>rs-parking-node.regular_cars.dropped</code>.
     */
    public void setDropped(LocalDateTime value) {
        set(3, value);
    }

    /**
     * Getter for <code>rs-parking-node.regular_cars.dropped</code>.
     */
    public LocalDateTime getDropped() {
        return (LocalDateTime) get(3);
    }

    /**
     * Setter for <code>rs-parking-node.regular_cars.lpn</code>.
     */
    public void setLpn(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>rs-parking-node.regular_cars.lpn</code>.
     */
    public String getLpn() {
        return (String) get(4);
    }

    /**
     * Setter for <code>rs-parking-node.regular_cars.maxCountPerMonth</code>.
     */
    public void setMaxcountpermonth(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>rs-parking-node.regular_cars.maxCountPerMonth</code>.
     */
    public Integer getMaxcountpermonth() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>rs-parking-node.regular_cars.maxDiscountPerDay</code>.
     */
    public void setMaxdiscountperday(BigDecimal value) {
        set(6, value);
    }

    /**
     * Getter for <code>rs-parking-node.regular_cars.maxDiscountPerDay</code>.
     */
    public BigDecimal getMaxdiscountperday() {
        return (BigDecimal) get(6);
    }

    /**
     * Setter for <code>rs-parking-node.regular_cars.maxDiscountPerMonth</code>.
     */
    public void setMaxdiscountpermonth(BigDecimal value) {
        set(7, value);
    }

    /**
     * Getter for <code>rs-parking-node.regular_cars.maxDiscountPerMonth</code>.
     */
    public BigDecimal getMaxdiscountpermonth() {
        return (BigDecimal) get(7);
    }

    /**
     * Setter for <code>rs-parking-node.regular_cars.overLimitEnter</code>.
     */
    public void setOverlimitenter(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>rs-parking-node.regular_cars.overLimitEnter</code>.
     */
    public String getOverlimitenter() {
        return (String) get(8);
    }

    /**
     * Setter for <code>rs-parking-node.regular_cars.creatorId</code>.
     */
    public void setCreatorid(Long value) {
        set(9, value);
    }

    /**
     * Getter for <code>rs-parking-node.regular_cars.creatorId</code>.
     */
    public Long getCreatorid() {
        return (Long) get(9);
    }

    /**
     * Setter for <code>rs-parking-node.regular_cars.districtId</code>.
     */
    public void setDistrictid(Long value) {
        set(10, value);
    }

    /**
     * Getter for <code>rs-parking-node.regular_cars.districtId</code>.
     */
    public Long getDistrictid() {
        return (Long) get(10);
    }

    /**
     * Setter for <code>rs-parking-node.regular_cars.dropperId</code>.
     */
    public void setDropperid(Long value) {
        set(11, value);
    }

    /**
     * Getter for <code>rs-parking-node.regular_cars.dropperId</code>.
     */
    public Long getDropperid() {
        return (Long) get(11);
    }

    /**
     * Setter for <code>rs-parking-node.regular_cars.memberId</code>.
     */
    public void setMemberid(Long value) {
        set(12, value);
    }

    /**
     * Getter for <code>rs-parking-node.regular_cars.memberId</code>.
     */
    public Long getMemberid() {
        return (Long) get(12);
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
    public Row13<String, String, LocalDateTime, LocalDateTime, String, Integer, BigDecimal, BigDecimal, String, Long, Long, Long, Long> fieldsRow() {
        return (Row13) super.fieldsRow();
    }

    @Override
    public Row13<String, String, LocalDateTime, LocalDateTime, String, Integer, BigDecimal, BigDecimal, String, Long, Long, Long, Long> valuesRow() {
        return (Row13) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return RegularCars.REGULAR_CARS.ID;
    }

    @Override
    public Field<String> field2() {
        return RegularCars.REGULAR_CARS.ACTIVATED;
    }

    @Override
    public Field<LocalDateTime> field3() {
        return RegularCars.REGULAR_CARS.CREATED;
    }

    @Override
    public Field<LocalDateTime> field4() {
        return RegularCars.REGULAR_CARS.DROPPED;
    }

    @Override
    public Field<String> field5() {
        return RegularCars.REGULAR_CARS.LPN;
    }

    @Override
    public Field<Integer> field6() {
        return RegularCars.REGULAR_CARS.MAXCOUNTPERMONTH;
    }

    @Override
    public Field<BigDecimal> field7() {
        return RegularCars.REGULAR_CARS.MAXDISCOUNTPERDAY;
    }

    @Override
    public Field<BigDecimal> field8() {
        return RegularCars.REGULAR_CARS.MAXDISCOUNTPERMONTH;
    }

    @Override
    public Field<String> field9() {
        return RegularCars.REGULAR_CARS.OVERLIMITENTER;
    }

    @Override
    public Field<Long> field10() {
        return RegularCars.REGULAR_CARS.CREATORID;
    }

    @Override
    public Field<Long> field11() {
        return RegularCars.REGULAR_CARS.DISTRICTID;
    }

    @Override
    public Field<Long> field12() {
        return RegularCars.REGULAR_CARS.DROPPERID;
    }

    @Override
    public Field<Long> field13() {
        return RegularCars.REGULAR_CARS.MEMBERID;
    }

    @Override
    public String component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getActivated();
    }

    @Override
    public LocalDateTime component3() {
        return getCreated();
    }

    @Override
    public LocalDateTime component4() {
        return getDropped();
    }

    @Override
    public String component5() {
        return getLpn();
    }

    @Override
    public Integer component6() {
        return getMaxcountpermonth();
    }

    @Override
    public BigDecimal component7() {
        return getMaxdiscountperday();
    }

    @Override
    public BigDecimal component8() {
        return getMaxdiscountpermonth();
    }

    @Override
    public String component9() {
        return getOverlimitenter();
    }

    @Override
    public Long component10() {
        return getCreatorid();
    }

    @Override
    public Long component11() {
        return getDistrictid();
    }

    @Override
    public Long component12() {
        return getDropperid();
    }

    @Override
    public Long component13() {
        return getMemberid();
    }

    @Override
    public String value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getActivated();
    }

    @Override
    public LocalDateTime value3() {
        return getCreated();
    }

    @Override
    public LocalDateTime value4() {
        return getDropped();
    }

    @Override
    public String value5() {
        return getLpn();
    }

    @Override
    public Integer value6() {
        return getMaxcountpermonth();
    }

    @Override
    public BigDecimal value7() {
        return getMaxdiscountperday();
    }

    @Override
    public BigDecimal value8() {
        return getMaxdiscountpermonth();
    }

    @Override
    public String value9() {
        return getOverlimitenter();
    }

    @Override
    public Long value10() {
        return getCreatorid();
    }

    @Override
    public Long value11() {
        return getDistrictid();
    }

    @Override
    public Long value12() {
        return getDropperid();
    }

    @Override
    public Long value13() {
        return getMemberid();
    }

    @Override
    public RegularCarsRecord value1(String value) {
        setId(value);
        return this;
    }

    @Override
    public RegularCarsRecord value2(String value) {
        setActivated(value);
        return this;
    }

    @Override
    public RegularCarsRecord value3(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public RegularCarsRecord value4(LocalDateTime value) {
        setDropped(value);
        return this;
    }

    @Override
    public RegularCarsRecord value5(String value) {
        setLpn(value);
        return this;
    }

    @Override
    public RegularCarsRecord value6(Integer value) {
        setMaxcountpermonth(value);
        return this;
    }

    @Override
    public RegularCarsRecord value7(BigDecimal value) {
        setMaxdiscountperday(value);
        return this;
    }

    @Override
    public RegularCarsRecord value8(BigDecimal value) {
        setMaxdiscountpermonth(value);
        return this;
    }

    @Override
    public RegularCarsRecord value9(String value) {
        setOverlimitenter(value);
        return this;
    }

    @Override
    public RegularCarsRecord value10(Long value) {
        setCreatorid(value);
        return this;
    }

    @Override
    public RegularCarsRecord value11(Long value) {
        setDistrictid(value);
        return this;
    }

    @Override
    public RegularCarsRecord value12(Long value) {
        setDropperid(value);
        return this;
    }

    @Override
    public RegularCarsRecord value13(Long value) {
        setMemberid(value);
        return this;
    }

    @Override
    public RegularCarsRecord values(String value1, String value2, LocalDateTime value3, LocalDateTime value4, String value5, Integer value6, BigDecimal value7, BigDecimal value8, String value9, Long value10, Long value11, Long value12, Long value13) {
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
     * Create a detached RegularCarsRecord
     */
    public RegularCarsRecord() {
        super(RegularCars.REGULAR_CARS);
    }

    /**
     * Create a detached, initialised RegularCarsRecord
     */
    public RegularCarsRecord(String id, String activated, LocalDateTime created, LocalDateTime dropped, String lpn, Integer maxcountpermonth, BigDecimal maxdiscountperday, BigDecimal maxdiscountpermonth, String overlimitenter, Long creatorid, Long districtid, Long dropperid, Long memberid) {
        super(RegularCars.REGULAR_CARS);

        set(0, id);
        set(1, activated);
        set(2, created);
        set(3, dropped);
        set(4, lpn);
        set(5, maxcountpermonth);
        set(6, maxdiscountperday);
        set(7, maxdiscountpermonth);
        set(8, overlimitenter);
        set(9, creatorid);
        set(10, districtid);
        set(11, dropperid);
        set(12, memberid);
    }
}
