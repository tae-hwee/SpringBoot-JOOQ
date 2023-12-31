/*
 * This file is generated by jOOQ.
 */
package generated.org.jooq.tables.records;


import generated.org.jooq.tables.SeasonTicketTemplates;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.LocalTime;

import org.jooq.Record1;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SeasonTicketTemplatesRecord extends UpdatableRecordImpl<SeasonTicketTemplatesRecord> {

    private static final long serialVersionUID = 2052798572;

    /**
     * Setter for <code>rs-parking-node.season_ticket_templates.seasonTicketTemplateId</code>.
     */
    public void setSeasontickettemplateid(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>rs-parking-node.season_ticket_templates.seasonTicketTemplateId</code>.
     */
    public Long getSeasontickettemplateid() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>rs-parking-node.season_ticket_templates.bandEnd</code>.
     */
    public void setBandend(LocalTime value) {
        set(1, value);
    }

    /**
     * Getter for <code>rs-parking-node.season_ticket_templates.bandEnd</code>.
     */
    public LocalTime getBandend() {
        return (LocalTime) get(1);
    }

    /**
     * Setter for <code>rs-parking-node.season_ticket_templates.bandStart</code>.
     */
    public void setBandstart(LocalTime value) {
        set(2, value);
    }

    /**
     * Getter for <code>rs-parking-node.season_ticket_templates.bandStart</code>.
     */
    public LocalTime getBandstart() {
        return (LocalTime) get(2);
    }

    /**
     * Setter for <code>rs-parking-node.season_ticket_templates.name</code>.
     */
    public void setName(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>rs-parking-node.season_ticket_templates.name</code>.
     */
    public String getName() {
        return (String) get(3);
    }

    /**
     * Setter for <code>rs-parking-node.season_ticket_templates.districtId</code>.
     */
    public void setDistrictid(Long value) {
        set(4, value);
    }

    /**
     * Getter for <code>rs-parking-node.season_ticket_templates.districtId</code>.
     */
    public Long getDistrictid() {
        return (Long) get(4);
    }

    /**
     * Setter for <code>rs-parking-node.season_ticket_templates.details</code>.
     */
    public void setDetails(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>rs-parking-node.season_ticket_templates.details</code>.
     */
    public String getDetails() {
        return (String) get(5);
    }

    /**
     * Setter for <code>rs-parking-node.season_ticket_templates.finalFee</code>.
     */
    public void setFinalfee(BigDecimal value) {
        set(6, value);
    }

    /**
     * Getter for <code>rs-parking-node.season_ticket_templates.finalFee</code>.
     */
    public BigDecimal getFinalfee() {
        return (BigDecimal) get(6);
    }

    /**
     * Setter for <code>rs-parking-node.season_ticket_templates.precedingSixHoursBeforeWeekday</code>.
     */
    public void setPrecedingsixhoursbeforeweekday(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>rs-parking-node.season_ticket_templates.precedingSixHoursBeforeWeekday</code>.
     */
    public String getPrecedingsixhoursbeforeweekday() {
        return (String) get(7);
    }

    /**
     * Setter for <code>rs-parking-node.season_ticket_templates.weekdayOnly</code>.
     */
    public void setWeekdayonly(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>rs-parking-node.season_ticket_templates.weekdayOnly</code>.
     */
    public String getWeekdayonly() {
        return (String) get(8);
    }

    /**
     * Setter for <code>rs-parking-node.season_ticket_templates.autoRefill</code>.
     */
    public void setAutorefill(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>rs-parking-node.season_ticket_templates.autoRefill</code>.
     */
    public String getAutorefill() {
        return (String) get(9);
    }

    /**
     * Setter for <code>rs-parking-node.season_ticket_templates.carryover</code>.
     */
    public void setCarryover(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>rs-parking-node.season_ticket_templates.carryover</code>.
     */
    public String getCarryover() {
        return (String) get(10);
    }

    /**
     * Setter for <code>rs-parking-node.season_ticket_templates.dropped</code>.
     */
    public void setDropped(LocalDateTime value) {
        set(11, value);
    }

    /**
     * Getter for <code>rs-parking-node.season_ticket_templates.dropped</code>.
     */
    public LocalDateTime getDropped() {
        return (LocalDateTime) get(11);
    }

    /**
     * Setter for <code>rs-parking-node.season_ticket_templates.maxShortCountPerDay</code>.
     */
    public void setMaxshortcountperday(Integer value) {
        set(12, value);
    }

    /**
     * Getter for <code>rs-parking-node.season_ticket_templates.maxShortCountPerDay</code>.
     */
    public Integer getMaxshortcountperday() {
        return (Integer) get(12);
    }

    /**
     * Setter for <code>rs-parking-node.season_ticket_templates.maxShortCountPerMonth</code>.
     */
    public void setMaxshortcountpermonth(Integer value) {
        set(13, value);
    }

    /**
     * Getter for <code>rs-parking-node.season_ticket_templates.maxShortCountPerMonth</code>.
     */
    public Integer getMaxshortcountpermonth() {
        return (Integer) get(13);
    }

    /**
     * Setter for <code>rs-parking-node.season_ticket_templates.maxShortMinutesPerDay</code>.
     */
    public void setMaxshortminutesperday(Integer value) {
        set(14, value);
    }

    /**
     * Getter for <code>rs-parking-node.season_ticket_templates.maxShortMinutesPerDay</code>.
     */
    public Integer getMaxshortminutesperday() {
        return (Integer) get(14);
    }

    /**
     * Setter for <code>rs-parking-node.season_ticket_templates.maxShortMinutesPerMonth</code>.
     */
    public void setMaxshortminutespermonth(Integer value) {
        set(15, value);
    }

    /**
     * Getter for <code>rs-parking-node.season_ticket_templates.maxShortMinutesPerMonth</code>.
     */
    public Integer getMaxshortminutespermonth() {
        return (Integer) get(15);
    }

    /**
     * Setter for <code>rs-parking-node.season_ticket_templates.maxShortMinutesPerVisit</code>.
     */
    public void setMaxshortminutespervisit(Integer value) {
        set(16, value);
    }

    /**
     * Getter for <code>rs-parking-node.season_ticket_templates.maxShortMinutesPerVisit</code>.
     */
    public Integer getMaxshortminutespervisit() {
        return (Integer) get(16);
    }

    /**
     * Setter for <code>rs-parking-node.season_ticket_templates.specialUsage</code>.
     */
    public void setSpecialusage(String value) {
        set(17, value);
    }

    /**
     * Getter for <code>rs-parking-node.season_ticket_templates.specialUsage</code>.
     */
    public String getSpecialusage() {
        return (String) get(17);
    }

    /**
     * Setter for <code>rs-parking-node.season_ticket_templates.timetable</code>.
     */
    public void setTimetable(String value) {
        set(18, value);
    }

    /**
     * Getter for <code>rs-parking-node.season_ticket_templates.timetable</code>.
     */
    public String getTimetable() {
        return (String) get(18);
    }

    /**
     * Setter for <code>rs-parking-node.season_ticket_templates.created</code>.
     */
    public void setCreated(LocalDateTime value) {
        set(19, value);
    }

    /**
     * Getter for <code>rs-parking-node.season_ticket_templates.created</code>.
     */
    public LocalDateTime getCreated() {
        return (LocalDateTime) get(19);
    }

    /**
     * Setter for <code>rs-parking-node.season_ticket_templates.lastUpdated</code>.
     */
    public void setLastupdated(LocalDateTime value) {
        set(20, value);
    }

    /**
     * Getter for <code>rs-parking-node.season_ticket_templates.lastUpdated</code>.
     */
    public LocalDateTime getLastupdated() {
        return (LocalDateTime) get(20);
    }

    /**
     * Setter for <code>rs-parking-node.season_ticket_templates.umMainPark</code>.
     */
    public void setUmmainpark(String value) {
        set(21, value);
    }

    /**
     * Getter for <code>rs-parking-node.season_ticket_templates.umMainPark</code>.
     */
    public String getUmmainpark() {
        return (String) get(21);
    }

    /**
     * Setter for <code>rs-parking-node.season_ticket_templates.umParks</code>.
     */
    public void setUmparks(String value) {
        set(22, value);
    }

    /**
     * Getter for <code>rs-parking-node.season_ticket_templates.umParks</code>.
     */
    public String getUmparks() {
        return (String) get(22);
    }

    /**
     * Setter for <code>rs-parking-node.season_ticket_templates.umid</code>.
     */
    public void setUmid(String value) {
        set(23, value);
    }

    /**
     * Getter for <code>rs-parking-node.season_ticket_templates.umid</code>.
     */
    public String getUmid() {
        return (String) get(23);
    }

    /**
     * Setter for <code>rs-parking-node.season_ticket_templates.useCountLimit</code>.
     */
    public void setUsecountlimit(Integer value) {
        set(24, value);
    }

    /**
     * Getter for <code>rs-parking-node.season_ticket_templates.useCountLimit</code>.
     */
    public Integer getUsecountlimit() {
        return (Integer) get(24);
    }

    /**
     * Setter for <code>rs-parking-node.season_ticket_templates.seasonTicketGroupId</code>.
     */
    public void setSeasonticketgroupid(Long value) {
        set(25, value);
    }

    /**
     * Getter for <code>rs-parking-node.season_ticket_templates.seasonTicketGroupId</code>.
     */
    public Long getSeasonticketgroupid() {
        return (Long) get(25);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached SeasonTicketTemplatesRecord
     */
    public SeasonTicketTemplatesRecord() {
        super(SeasonTicketTemplates.SEASON_TICKET_TEMPLATES);
    }

    /**
     * Create a detached, initialised SeasonTicketTemplatesRecord
     */
    public SeasonTicketTemplatesRecord(Long seasontickettemplateid, LocalTime bandend, LocalTime bandstart, String name, Long districtid, String details, BigDecimal finalfee, String precedingsixhoursbeforeweekday, String weekdayonly, String autorefill, String carryover, LocalDateTime dropped, Integer maxshortcountperday, Integer maxshortcountpermonth, Integer maxshortminutesperday, Integer maxshortminutespermonth, Integer maxshortminutespervisit, String specialusage, String timetable, LocalDateTime created, LocalDateTime lastupdated, String ummainpark, String umparks, String umid, Integer usecountlimit, Long seasonticketgroupid) {
        super(SeasonTicketTemplates.SEASON_TICKET_TEMPLATES);

        set(0, seasontickettemplateid);
        set(1, bandend);
        set(2, bandstart);
        set(3, name);
        set(4, districtid);
        set(5, details);
        set(6, finalfee);
        set(7, precedingsixhoursbeforeweekday);
        set(8, weekdayonly);
        set(9, autorefill);
        set(10, carryover);
        set(11, dropped);
        set(12, maxshortcountperday);
        set(13, maxshortcountpermonth);
        set(14, maxshortminutesperday);
        set(15, maxshortminutespermonth);
        set(16, maxshortminutespervisit);
        set(17, specialusage);
        set(18, timetable);
        set(19, created);
        set(20, lastupdated);
        set(21, ummainpark);
        set(22, umparks);
        set(23, umid);
        set(24, usecountlimit);
        set(25, seasonticketgroupid);
    }
}
