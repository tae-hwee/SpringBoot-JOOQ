/*
 * This file is generated by jOOQ.
 */
package generated.org.jooq.tables.records;


import generated.org.jooq.tables.SeasonTicketsHistory;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.LocalTime;

import org.jooq.Record1;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SeasonTicketsHistoryRecord extends UpdatableRecordImpl<SeasonTicketsHistoryRecord> {

    private static final long serialVersionUID = -1063920300;

    /**
     * Setter for <code>rs-parking-node.season_tickets_history.seasonTicketHistoryId</code>.
     */
    public void setSeasontickethistoryid(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>rs-parking-node.season_tickets_history.seasonTicketHistoryId</code>.
     */
    public Long getSeasontickethistoryid() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>rs-parking-node.season_tickets_history.bandEnd</code>.
     */
    public void setBandend(LocalTime value) {
        set(1, value);
    }

    /**
     * Getter for <code>rs-parking-node.season_tickets_history.bandEnd</code>.
     */
    public LocalTime getBandend() {
        return (LocalTime) get(1);
    }

    /**
     * Setter for <code>rs-parking-node.season_tickets_history.bandStart</code>.
     */
    public void setBandstart(LocalTime value) {
        set(2, value);
    }

    /**
     * Getter for <code>rs-parking-node.season_tickets_history.bandStart</code>.
     */
    public LocalTime getBandstart() {
        return (LocalTime) get(2);
    }

    /**
     * Setter for <code>rs-parking-node.season_tickets_history.created</code>.
     */
    public void setCreated(LocalDateTime value) {
        set(3, value);
    }

    /**
     * Getter for <code>rs-parking-node.season_tickets_history.created</code>.
     */
    public LocalDateTime getCreated() {
        return (LocalDateTime) get(3);
    }

    /**
     * Setter for <code>rs-parking-node.season_tickets_history.data</code>.
     */
    public void setData(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>rs-parking-node.season_tickets_history.data</code>.
     */
    public String getData() {
        return (String) get(4);
    }

    /**
     * Setter for <code>rs-parking-node.season_tickets_history.department</code>.
     */
    public void setDepartment(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>rs-parking-node.season_tickets_history.department</code>.
     */
    public String getDepartment() {
        return (String) get(5);
    }

    /**
     * Setter for <code>rs-parking-node.season_tickets_history.lpn</code>.
     */
    public void setLpn(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>rs-parking-node.season_tickets_history.lpn</code>.
     */
    public String getLpn() {
        return (String) get(6);
    }

    /**
     * Setter for <code>rs-parking-node.season_tickets_history.modifiedColumns</code>.
     */
    public void setModifiedcolumns(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>rs-parking-node.season_tickets_history.modifiedColumns</code>.
     */
    public String getModifiedcolumns() {
        return (String) get(7);
    }

    /**
     * Setter for <code>rs-parking-node.season_tickets_history.organization</code>.
     */
    public void setOrganization(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>rs-parking-node.season_tickets_history.organization</code>.
     */
    public String getOrganization() {
        return (String) get(8);
    }

    /**
     * Setter for <code>rs-parking-node.season_tickets_history.payed</code>.
     */
    public void setPayed(LocalDateTime value) {
        set(9, value);
    }

    /**
     * Getter for <code>rs-parking-node.season_tickets_history.payed</code>.
     */
    public LocalDateTime getPayed() {
        return (LocalDateTime) get(9);
    }

    /**
     * Setter for <code>rs-parking-node.season_tickets_history.payedFee</code>.
     */
    public void setPayedfee(BigDecimal value) {
        set(10, value);
    }

    /**
     * Getter for <code>rs-parking-node.season_tickets_history.payedFee</code>.
     */
    public BigDecimal getPayedfee() {
        return (BigDecimal) get(10);
    }

    /**
     * Setter for <code>rs-parking-node.season_tickets_history.paymentType</code>.
     */
    public void setPaymenttype(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>rs-parking-node.season_tickets_history.paymentType</code>.
     */
    public String getPaymenttype() {
        return (String) get(11);
    }

    /**
     * Setter for <code>rs-parking-node.season_tickets_history.phoneNumber</code>.
     */
    public void setPhonenumber(String value) {
        set(12, value);
    }

    /**
     * Getter for <code>rs-parking-node.season_tickets_history.phoneNumber</code>.
     */
    public String getPhonenumber() {
        return (String) get(12);
    }

    /**
     * Setter for <code>rs-parking-node.season_tickets_history.registrant</code>.
     */
    public void setRegistrant(String value) {
        set(13, value);
    }

    /**
     * Getter for <code>rs-parking-node.season_tickets_history.registrant</code>.
     */
    public String getRegistrant() {
        return (String) get(13);
    }

    /**
     * Setter for <code>rs-parking-node.season_tickets_history.end</code>.
     */
    public void setEnd(LocalDateTime value) {
        set(14, value);
    }

    /**
     * Getter for <code>rs-parking-node.season_tickets_history.end</code>.
     */
    public LocalDateTime getEnd() {
        return (LocalDateTime) get(14);
    }

    /**
     * Setter for <code>rs-parking-node.season_tickets_history.start</code>.
     */
    public void setStart(LocalDateTime value) {
        set(15, value);
    }

    /**
     * Getter for <code>rs-parking-node.season_tickets_history.start</code>.
     */
    public LocalDateTime getStart() {
        return (LocalDateTime) get(15);
    }

    /**
     * Setter for <code>rs-parking-node.season_tickets_history.type</code>.
     */
    public void setType(String value) {
        set(16, value);
    }

    /**
     * Getter for <code>rs-parking-node.season_tickets_history.type</code>.
     */
    public String getType() {
        return (String) get(16);
    }

    /**
     * Setter for <code>rs-parking-node.season_tickets_history.creatorId</code>.
     */
    public void setCreatorid(Long value) {
        set(17, value);
    }

    /**
     * Getter for <code>rs-parking-node.season_tickets_history.creatorId</code>.
     */
    public Long getCreatorid() {
        return (Long) get(17);
    }

    /**
     * Setter for <code>rs-parking-node.season_tickets_history.districtId</code>.
     */
    public void setDistrictid(Long value) {
        set(18, value);
    }

    /**
     * Getter for <code>rs-parking-node.season_tickets_history.districtId</code>.
     */
    public Long getDistrictid() {
        return (Long) get(18);
    }

    /**
     * Setter for <code>rs-parking-node.season_tickets_history.masterSeasonTicketId</code>.
     */
    public void setMasterseasonticketid(String value) {
        set(19, value);
    }

    /**
     * Getter for <code>rs-parking-node.season_tickets_history.masterSeasonTicketId</code>.
     */
    public String getMasterseasonticketid() {
        return (String) get(19);
    }

    /**
     * Setter for <code>rs-parking-node.season_tickets_history.ownerId</code>.
     */
    public void setOwnerid(Long value) {
        set(20, value);
    }

    /**
     * Getter for <code>rs-parking-node.season_tickets_history.ownerId</code>.
     */
    public Long getOwnerid() {
        return (Long) get(20);
    }

    /**
     * Setter for <code>rs-parking-node.season_tickets_history.seasonTicketId</code>.
     */
    public void setSeasonticketid(String value) {
        set(21, value);
    }

    /**
     * Getter for <code>rs-parking-node.season_tickets_history.seasonTicketId</code>.
     */
    public String getSeasonticketid() {
        return (String) get(21);
    }

    /**
     * Setter for <code>rs-parking-node.season_tickets_history.seasonTicketGroupId</code>.
     */
    public void setSeasonticketgroupid(Long value) {
        set(22, value);
    }

    /**
     * Getter for <code>rs-parking-node.season_tickets_history.seasonTicketGroupId</code>.
     */
    public Long getSeasonticketgroupid() {
        return (Long) get(22);
    }

    /**
     * Setter for <code>rs-parking-node.season_tickets_history.seasonTicketTemplateId</code>.
     */
    public void setSeasontickettemplateid(Long value) {
        set(23, value);
    }

    /**
     * Getter for <code>rs-parking-node.season_tickets_history.seasonTicketTemplateId</code>.
     */
    public Long getSeasontickettemplateid() {
        return (Long) get(23);
    }

    /**
     * Setter for <code>rs-parking-node.season_tickets_history.payInfo</code>.
     */
    public void setPayinfo(String value) {
        set(24, value);
    }

    /**
     * Getter for <code>rs-parking-node.season_tickets_history.payInfo</code>.
     */
    public String getPayinfo() {
        return (String) get(24);
    }

    /**
     * Setter for <code>rs-parking-node.season_tickets_history.paymentId</code>.
     */
    public void setPaymentid(String value) {
        set(25, value);
    }

    /**
     * Getter for <code>rs-parking-node.season_tickets_history.paymentId</code>.
     */
    public String getPaymentid() {
        return (String) get(25);
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
     * Create a detached SeasonTicketsHistoryRecord
     */
    public SeasonTicketsHistoryRecord() {
        super(SeasonTicketsHistory.SEASON_TICKETS_HISTORY);
    }

    /**
     * Create a detached, initialised SeasonTicketsHistoryRecord
     */
    public SeasonTicketsHistoryRecord(Long seasontickethistoryid, LocalTime bandend, LocalTime bandstart, LocalDateTime created, String data, String department, String lpn, String modifiedcolumns, String organization, LocalDateTime payed, BigDecimal payedfee, String paymenttype, String phonenumber, String registrant, LocalDateTime end, LocalDateTime start, String type, Long creatorid, Long districtid, String masterseasonticketid, Long ownerid, String seasonticketid, Long seasonticketgroupid, Long seasontickettemplateid, String payinfo, String paymentid) {
        super(SeasonTicketsHistory.SEASON_TICKETS_HISTORY);

        set(0, seasontickethistoryid);
        set(1, bandend);
        set(2, bandstart);
        set(3, created);
        set(4, data);
        set(5, department);
        set(6, lpn);
        set(7, modifiedcolumns);
        set(8, organization);
        set(9, payed);
        set(10, payedfee);
        set(11, paymenttype);
        set(12, phonenumber);
        set(13, registrant);
        set(14, end);
        set(15, start);
        set(16, type);
        set(17, creatorid);
        set(18, districtid);
        set(19, masterseasonticketid);
        set(20, ownerid);
        set(21, seasonticketid);
        set(22, seasonticketgroupid);
        set(23, seasontickettemplateid);
        set(24, payinfo);
        set(25, paymentid);
    }
}
