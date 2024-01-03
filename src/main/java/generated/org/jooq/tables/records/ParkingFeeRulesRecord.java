/*
 * This file is generated by jOOQ.
 */
package generated.org.jooq.tables.records;


import generated.org.jooq.tables.ParkingFeeRules;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.jooq.Record1;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ParkingFeeRulesRecord extends UpdatableRecordImpl<ParkingFeeRulesRecord> {

    private static final long serialVersionUID = -1335020782;

    /**
     * Setter for <code>rs-parking-node.parking_fee_rules.id</code>.
     */
    public void setId(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>rs-parking-node.parking_fee_rules.id</code>.
     */
    public String getId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>rs-parking-node.parking_fee_rules.activated</code>.
     */
    public void setActivated(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>rs-parking-node.parking_fee_rules.activated</code>.
     */
    public String getActivated() {
        return (String) get(1);
    }

    /**
     * Setter for <code>rs-parking-node.parking_fee_rules.applyEnd</code>.
     */
    public void setApplyend(LocalDateTime value) {
        set(2, value);
    }

    /**
     * Getter for <code>rs-parking-node.parking_fee_rules.applyEnd</code>.
     */
    public LocalDateTime getApplyend() {
        return (LocalDateTime) get(2);
    }

    /**
     * Setter for <code>rs-parking-node.parking_fee_rules.applyStart</code>.
     */
    public void setApplystart(LocalDateTime value) {
        set(3, value);
    }

    /**
     * Getter for <code>rs-parking-node.parking_fee_rules.applyStart</code>.
     */
    public LocalDateTime getApplystart() {
        return (LocalDateTime) get(3);
    }

    /**
     * Setter for <code>rs-parking-node.parking_fee_rules.category</code>.
     */
    public void setCategory(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>rs-parking-node.parking_fee_rules.category</code>.
     */
    public String getCategory() {
        return (String) get(4);
    }

    /**
     * Setter for <code>rs-parking-node.parking_fee_rules.chargeDeferredInMinutes</code>.
     */
    public void setChargedeferredinminutes(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>rs-parking-node.parking_fee_rules.chargeDeferredInMinutes</code>.
     */
    public Integer getChargedeferredinminutes() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>rs-parking-node.parking_fee_rules.chargeFreeInMinutes</code>.
     */
    public void setChargefreeinminutes(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>rs-parking-node.parking_fee_rules.chargeFreeInMinutes</code>.
     */
    public Integer getChargefreeinminutes() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>rs-parking-node.parking_fee_rules.created</code>.
     */
    public void setCreated(LocalDateTime value) {
        set(7, value);
    }

    /**
     * Getter for <code>rs-parking-node.parking_fee_rules.created</code>.
     */
    public LocalDateTime getCreated() {
        return (LocalDateTime) get(7);
    }

    /**
     * Setter for <code>rs-parking-node.parking_fee_rules.cutOff</code>.
     */
    public void setCutoff(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>rs-parking-node.parking_fee_rules.cutOff</code>.
     */
    public String getCutoff() {
        return (String) get(8);
    }

    /**
     * Setter for <code>rs-parking-node.parking_fee_rules.details</code>.
     */
    public void setDetails(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>rs-parking-node.parking_fee_rules.details</code>.
     */
    public String getDetails() {
        return (String) get(9);
    }

    /**
     * Setter for <code>rs-parking-node.parking_fee_rules.dropped</code>.
     */
    public void setDropped(LocalDateTime value) {
        set(10, value);
    }

    /**
     * Getter for <code>rs-parking-node.parking_fee_rules.dropped</code>.
     */
    public LocalDateTime getDropped() {
        return (LocalDateTime) get(10);
    }

    /**
     * Setter for <code>rs-parking-node.parking_fee_rules.graceInMinutes</code>.
     */
    public void setGraceinminutes(Integer value) {
        set(11, value);
    }

    /**
     * Getter for <code>rs-parking-node.parking_fee_rules.graceInMinutes</code>.
     */
    public Integer getGraceinminutes() {
        return (Integer) get(11);
    }

    /**
     * Setter for <code>rs-parking-node.parking_fee_rules.maxFeePerFriLine</code>.
     */
    public void setMaxfeeperfriline(BigDecimal value) {
        set(12, value);
    }

    /**
     * Getter for <code>rs-parking-node.parking_fee_rules.maxFeePerFriLine</code>.
     */
    public BigDecimal getMaxfeeperfriline() {
        return (BigDecimal) get(12);
    }

    /**
     * Setter for <code>rs-parking-node.parking_fee_rules.maxFeePerLine</code>.
     */
    public void setMaxfeeperline(BigDecimal value) {
        set(13, value);
    }

    /**
     * Getter for <code>rs-parking-node.parking_fee_rules.maxFeePerLine</code>.
     */
    public BigDecimal getMaxfeeperline() {
        return (BigDecimal) get(13);
    }

    /**
     * Setter for <code>rs-parking-node.parking_fee_rules.maxFeePerMonLine</code>.
     */
    public void setMaxfeepermonline(BigDecimal value) {
        set(14, value);
    }

    /**
     * Getter for <code>rs-parking-node.parking_fee_rules.maxFeePerMonLine</code>.
     */
    public BigDecimal getMaxfeepermonline() {
        return (BigDecimal) get(14);
    }

    /**
     * Setter for <code>rs-parking-node.parking_fee_rules.maxFeePerSatLine</code>.
     */
    public void setMaxfeepersatline(BigDecimal value) {
        set(15, value);
    }

    /**
     * Getter for <code>rs-parking-node.parking_fee_rules.maxFeePerSatLine</code>.
     */
    public BigDecimal getMaxfeepersatline() {
        return (BigDecimal) get(15);
    }

    /**
     * Setter for <code>rs-parking-node.parking_fee_rules.maxFeePerSunLine</code>.
     */
    public void setMaxfeepersunline(BigDecimal value) {
        set(16, value);
    }

    /**
     * Getter for <code>rs-parking-node.parking_fee_rules.maxFeePerSunLine</code>.
     */
    public BigDecimal getMaxfeepersunline() {
        return (BigDecimal) get(16);
    }

    /**
     * Setter for <code>rs-parking-node.parking_fee_rules.maxFeePerThuLine</code>.
     */
    public void setMaxfeeperthuline(BigDecimal value) {
        set(17, value);
    }

    /**
     * Getter for <code>rs-parking-node.parking_fee_rules.maxFeePerThuLine</code>.
     */
    public BigDecimal getMaxfeeperthuline() {
        return (BigDecimal) get(17);
    }

    /**
     * Setter for <code>rs-parking-node.parking_fee_rules.maxFeePerTueLine</code>.
     */
    public void setMaxfeepertueline(BigDecimal value) {
        set(18, value);
    }

    /**
     * Getter for <code>rs-parking-node.parking_fee_rules.maxFeePerTueLine</code>.
     */
    public BigDecimal getMaxfeepertueline() {
        return (BigDecimal) get(18);
    }

    /**
     * Setter for <code>rs-parking-node.parking_fee_rules.maxFeePerWedLine</code>.
     */
    public void setMaxfeeperwedline(BigDecimal value) {
        set(19, value);
    }

    /**
     * Getter for <code>rs-parking-node.parking_fee_rules.maxFeePerWedLine</code>.
     */
    public BigDecimal getMaxfeeperwedline() {
        return (BigDecimal) get(19);
    }

    /**
     * Setter for <code>rs-parking-node.parking_fee_rules.name</code>.
     */
    public void setName(String value) {
        set(20, value);
    }

    /**
     * Getter for <code>rs-parking-node.parking_fee_rules.name</code>.
     */
    public String getName() {
        return (String) get(20);
    }

    /**
     * Setter for <code>rs-parking-node.parking_fee_rules.offTimeExit</code>.
     */
    public void setOfftimeexit(String value) {
        set(21, value);
    }

    /**
     * Getter for <code>rs-parking-node.parking_fee_rules.offTimeExit</code>.
     */
    public String getOfftimeexit() {
        return (String) get(21);
    }

    /**
     * Setter for <code>rs-parking-node.parking_fee_rules.priority</code>.
     */
    public void setPriority(Integer value) {
        set(22, value);
    }

    /**
     * Getter for <code>rs-parking-node.parking_fee_rules.priority</code>.
     */
    public Integer getPriority() {
        return (Integer) get(22);
    }

    /**
     * Setter for <code>rs-parking-node.parking_fee_rules.weeklyFeeRules</code>.
     */
    public void setWeeklyfeerules(String value) {
        set(23, value);
    }

    /**
     * Getter for <code>rs-parking-node.parking_fee_rules.weeklyFeeRules</code>.
     */
    public String getWeeklyfeerules() {
        return (String) get(23);
    }

    /**
     * Setter for <code>rs-parking-node.parking_fee_rules.creatorId</code>.
     */
    public void setCreatorid(Long value) {
        set(24, value);
    }

    /**
     * Getter for <code>rs-parking-node.parking_fee_rules.creatorId</code>.
     */
    public Long getCreatorid() {
        return (Long) get(24);
    }

    /**
     * Setter for <code>rs-parking-node.parking_fee_rules.districtId</code>.
     */
    public void setDistrictid(Long value) {
        set(25, value);
    }

    /**
     * Getter for <code>rs-parking-node.parking_fee_rules.districtId</code>.
     */
    public Long getDistrictid() {
        return (Long) get(25);
    }

    /**
     * Setter for <code>rs-parking-node.parking_fee_rules.dropperId</code>.
     */
    public void setDropperid(Long value) {
        set(26, value);
    }

    /**
     * Getter for <code>rs-parking-node.parking_fee_rules.dropperId</code>.
     */
    public Long getDropperid() {
        return (Long) get(26);
    }

    /**
     * Setter for <code>rs-parking-node.parking_fee_rules.enterMachineId</code>.
     */
    public void setEntermachineid(Long value) {
        set(27, value);
    }

    /**
     * Getter for <code>rs-parking-node.parking_fee_rules.enterMachineId</code>.
     */
    public Long getEntermachineid() {
        return (Long) get(27);
    }

    /**
     * Setter for <code>rs-parking-node.parking_fee_rules.leaveMachineId</code>.
     */
    public void setLeavemachineid(Long value) {
        set(28, value);
    }

    /**
     * Getter for <code>rs-parking-node.parking_fee_rules.leaveMachineId</code>.
     */
    public Long getLeavemachineid() {
        return (Long) get(28);
    }

    /**
     * Setter for <code>rs-parking-node.parking_fee_rules.visitCouponTemplateId</code>.
     */
    public void setVisitcoupontemplateid(Long value) {
        set(29, value);
    }

    /**
     * Getter for <code>rs-parking-node.parking_fee_rules.visitCouponTemplateId</code>.
     */
    public Long getVisitcoupontemplateid() {
        return (Long) get(29);
    }

    /**
     * Setter for <code>rs-parking-node.parking_fee_rules.maxFeePerFriLineNight</code>.
     */
    public void setMaxfeeperfrilinenight(BigDecimal value) {
        set(30, value);
    }

    /**
     * Getter for <code>rs-parking-node.parking_fee_rules.maxFeePerFriLineNight</code>.
     */
    public BigDecimal getMaxfeeperfrilinenight() {
        return (BigDecimal) get(30);
    }

    /**
     * Setter for <code>rs-parking-node.parking_fee_rules.maxFeePerSatLineNight</code>.
     */
    public void setMaxfeepersatlinenight(BigDecimal value) {
        set(31, value);
    }

    /**
     * Getter for <code>rs-parking-node.parking_fee_rules.maxFeePerSatLineNight</code>.
     */
    public BigDecimal getMaxfeepersatlinenight() {
        return (BigDecimal) get(31);
    }

    /**
     * Setter for <code>rs-parking-node.parking_fee_rules.maxFeePerSunLineNight</code>.
     */
    public void setMaxfeepersunlinenight(BigDecimal value) {
        set(32, value);
    }

    /**
     * Getter for <code>rs-parking-node.parking_fee_rules.maxFeePerSunLineNight</code>.
     */
    public BigDecimal getMaxfeepersunlinenight() {
        return (BigDecimal) get(32);
    }

    /**
     * Setter for <code>rs-parking-node.parking_fee_rules.maxFeePerThuLineNight</code>.
     */
    public void setMaxfeeperthulinenight(BigDecimal value) {
        set(33, value);
    }

    /**
     * Getter for <code>rs-parking-node.parking_fee_rules.maxFeePerThuLineNight</code>.
     */
    public BigDecimal getMaxfeeperthulinenight() {
        return (BigDecimal) get(33);
    }

    /**
     * Setter for <code>rs-parking-node.parking_fee_rules.maxFeePerTueLineNight</code>.
     */
    public void setMaxfeepertuelinenight(BigDecimal value) {
        set(34, value);
    }

    /**
     * Getter for <code>rs-parking-node.parking_fee_rules.maxFeePerTueLineNight</code>.
     */
    public BigDecimal getMaxfeepertuelinenight() {
        return (BigDecimal) get(34);
    }

    /**
     * Setter for <code>rs-parking-node.parking_fee_rules.maxFeePerWedLineNight</code>.
     */
    public void setMaxfeeperwedlinenight(BigDecimal value) {
        set(35, value);
    }

    /**
     * Getter for <code>rs-parking-node.parking_fee_rules.maxFeePerWedLineNight</code>.
     */
    public BigDecimal getMaxfeeperwedlinenight() {
        return (BigDecimal) get(35);
    }

    /**
     * Setter for <code>rs-parking-node.parking_fee_rules.dailyAccumulateFeeAllowed</code>.
     */
    public void setDailyaccumulatefeeallowed(String value) {
        set(36, value);
    }

    /**
     * Getter for <code>rs-parking-node.parking_fee_rules.dailyAccumulateFeeAllowed</code>.
     */
    public String getDailyaccumulatefeeallowed() {
        return (String) get(36);
    }

    /**
     * Setter for <code>rs-parking-node.parking_fee_rules.maxDailyAccumulateFee</code>.
     */
    public void setMaxdailyaccumulatefee(BigDecimal value) {
        set(37, value);
    }

    /**
     * Getter for <code>rs-parking-node.parking_fee_rules.maxDailyAccumulateFee</code>.
     */
    public BigDecimal getMaxdailyaccumulatefee() {
        return (BigDecimal) get(37);
    }

    /**
     * Setter for <code>rs-parking-node.parking_fee_rules.shortPassFee</code>.
     */
    public void setShortpassfee(BigDecimal value) {
        set(38, value);
    }

    /**
     * Getter for <code>rs-parking-node.parking_fee_rules.shortPassFee</code>.
     */
    public BigDecimal getShortpassfee() {
        return (BigDecimal) get(38);
    }

    /**
     * Setter for <code>rs-parking-node.parking_fee_rules.shortPassLimit</code>.
     */
    public void setShortpasslimit(Integer value) {
        set(39, value);
    }

    /**
     * Getter for <code>rs-parking-node.parking_fee_rules.shortPassLimit</code>.
     */
    public Integer getShortpasslimit() {
        return (Integer) get(39);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ParkingFeeRulesRecord
     */
    public ParkingFeeRulesRecord() {
        super(ParkingFeeRules.PARKING_FEE_RULES);
    }

    /**
     * Create a detached, initialised ParkingFeeRulesRecord
     */
    public ParkingFeeRulesRecord(String id, String activated, LocalDateTime applyend, LocalDateTime applystart, String category, Integer chargedeferredinminutes, Integer chargefreeinminutes, LocalDateTime created, String cutoff, String details, LocalDateTime dropped, Integer graceinminutes, BigDecimal maxfeeperfriline, BigDecimal maxfeeperline, BigDecimal maxfeepermonline, BigDecimal maxfeepersatline, BigDecimal maxfeepersunline, BigDecimal maxfeeperthuline, BigDecimal maxfeepertueline, BigDecimal maxfeeperwedline, String name, String offtimeexit, Integer priority, String weeklyfeerules, Long creatorid, Long districtid, Long dropperid, Long entermachineid, Long leavemachineid, Long visitcoupontemplateid, BigDecimal maxfeeperfrilinenight, BigDecimal maxfeepersatlinenight, BigDecimal maxfeepersunlinenight, BigDecimal maxfeeperthulinenight, BigDecimal maxfeepertuelinenight, BigDecimal maxfeeperwedlinenight, String dailyaccumulatefeeallowed, BigDecimal maxdailyaccumulatefee, BigDecimal shortpassfee, Integer shortpasslimit) {
        super(ParkingFeeRules.PARKING_FEE_RULES);

        set(0, id);
        set(1, activated);
        set(2, applyend);
        set(3, applystart);
        set(4, category);
        set(5, chargedeferredinminutes);
        set(6, chargefreeinminutes);
        set(7, created);
        set(8, cutoff);
        set(9, details);
        set(10, dropped);
        set(11, graceinminutes);
        set(12, maxfeeperfriline);
        set(13, maxfeeperline);
        set(14, maxfeepermonline);
        set(15, maxfeepersatline);
        set(16, maxfeepersunline);
        set(17, maxfeeperthuline);
        set(18, maxfeepertueline);
        set(19, maxfeeperwedline);
        set(20, name);
        set(21, offtimeexit);
        set(22, priority);
        set(23, weeklyfeerules);
        set(24, creatorid);
        set(25, districtid);
        set(26, dropperid);
        set(27, entermachineid);
        set(28, leavemachineid);
        set(29, visitcoupontemplateid);
        set(30, maxfeeperfrilinenight);
        set(31, maxfeepersatlinenight);
        set(32, maxfeepersunlinenight);
        set(33, maxfeeperthulinenight);
        set(34, maxfeepertuelinenight);
        set(35, maxfeeperwedlinenight);
        set(36, dailyaccumulatefeeallowed);
        set(37, maxdailyaccumulatefee);
        set(38, shortpassfee);
        set(39, shortpasslimit);
    }
}
