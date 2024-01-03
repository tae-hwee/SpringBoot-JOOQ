/*
 * This file is generated by jOOQ.
 */
package generated.org.jooq.tables.records;


import generated.org.jooq.tables.SeasonTicketGroups;

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
public class SeasonTicketGroupsRecord extends UpdatableRecordImpl<SeasonTicketGroupsRecord> implements Record9<Long, String, String, String, String, LocalDateTime, LocalDateTime, String, LocalDateTime> {

    private static final long serialVersionUID = 1632293333;

    /**
     * Setter for <code>rs-parking-node.season_ticket_groups.seasonTicketGroupId</code>.
     */
    public void setSeasonticketgroupid(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>rs-parking-node.season_ticket_groups.seasonTicketGroupId</code>.
     */
    public Long getSeasonticketgroupid() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>rs-parking-node.season_ticket_groups.displayName</code>.
     */
    public void setDisplayname(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>rs-parking-node.season_ticket_groups.displayName</code>.
     */
    public String getDisplayname() {
        return (String) get(1);
    }

    /**
     * Setter for <code>rs-parking-node.season_ticket_groups.name</code>.
     */
    public void setName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>rs-parking-node.season_ticket_groups.name</code>.
     */
    public String getName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>rs-parking-node.season_ticket_groups.apiConnectionId</code>.
     */
    public void setApiconnectionid(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>rs-parking-node.season_ticket_groups.apiConnectionId</code>.
     */
    public String getApiconnectionid() {
        return (String) get(3);
    }

    /**
     * Setter for <code>rs-parking-node.season_ticket_groups.details</code>.
     */
    public void setDetails(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>rs-parking-node.season_ticket_groups.details</code>.
     */
    public String getDetails() {
        return (String) get(4);
    }

    /**
     * Setter for <code>rs-parking-node.season_ticket_groups.created</code>.
     */
    public void setCreated(LocalDateTime value) {
        set(5, value);
    }

    /**
     * Getter for <code>rs-parking-node.season_ticket_groups.created</code>.
     */
    public LocalDateTime getCreated() {
        return (LocalDateTime) get(5);
    }

    /**
     * Setter for <code>rs-parking-node.season_ticket_groups.lastUpdated</code>.
     */
    public void setLastupdated(LocalDateTime value) {
        set(6, value);
    }

    /**
     * Getter for <code>rs-parking-node.season_ticket_groups.lastUpdated</code>.
     */
    public LocalDateTime getLastupdated() {
        return (LocalDateTime) get(6);
    }

    /**
     * Setter for <code>rs-parking-node.season_ticket_groups.umid</code>.
     */
    public void setUmid(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>rs-parking-node.season_ticket_groups.umid</code>.
     */
    public String getUmid() {
        return (String) get(7);
    }

    /**
     * Setter for <code>rs-parking-node.season_ticket_groups.dropped</code>.
     */
    public void setDropped(LocalDateTime value) {
        set(8, value);
    }

    /**
     * Getter for <code>rs-parking-node.season_ticket_groups.dropped</code>.
     */
    public LocalDateTime getDropped() {
        return (LocalDateTime) get(8);
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
    public Row9<Long, String, String, String, String, LocalDateTime, LocalDateTime, String, LocalDateTime> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    @Override
    public Row9<Long, String, String, String, String, LocalDateTime, LocalDateTime, String, LocalDateTime> valuesRow() {
        return (Row9) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return SeasonTicketGroups.SEASON_TICKET_GROUPS.SEASONTICKETGROUPID;
    }

    @Override
    public Field<String> field2() {
        return SeasonTicketGroups.SEASON_TICKET_GROUPS.DISPLAYNAME;
    }

    @Override
    public Field<String> field3() {
        return SeasonTicketGroups.SEASON_TICKET_GROUPS.NAME;
    }

    @Override
    public Field<String> field4() {
        return SeasonTicketGroups.SEASON_TICKET_GROUPS.APICONNECTIONID;
    }

    @Override
    public Field<String> field5() {
        return SeasonTicketGroups.SEASON_TICKET_GROUPS.DETAILS;
    }

    @Override
    public Field<LocalDateTime> field6() {
        return SeasonTicketGroups.SEASON_TICKET_GROUPS.CREATED;
    }

    @Override
    public Field<LocalDateTime> field7() {
        return SeasonTicketGroups.SEASON_TICKET_GROUPS.LASTUPDATED;
    }

    @Override
    public Field<String> field8() {
        return SeasonTicketGroups.SEASON_TICKET_GROUPS.UMID;
    }

    @Override
    public Field<LocalDateTime> field9() {
        return SeasonTicketGroups.SEASON_TICKET_GROUPS.DROPPED;
    }

    @Override
    public Long component1() {
        return getSeasonticketgroupid();
    }

    @Override
    public String component2() {
        return getDisplayname();
    }

    @Override
    public String component3() {
        return getName();
    }

    @Override
    public String component4() {
        return getApiconnectionid();
    }

    @Override
    public String component5() {
        return getDetails();
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
    public LocalDateTime component9() {
        return getDropped();
    }

    @Override
    public Long value1() {
        return getSeasonticketgroupid();
    }

    @Override
    public String value2() {
        return getDisplayname();
    }

    @Override
    public String value3() {
        return getName();
    }

    @Override
    public String value4() {
        return getApiconnectionid();
    }

    @Override
    public String value5() {
        return getDetails();
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
    public LocalDateTime value9() {
        return getDropped();
    }

    @Override
    public SeasonTicketGroupsRecord value1(Long value) {
        setSeasonticketgroupid(value);
        return this;
    }

    @Override
    public SeasonTicketGroupsRecord value2(String value) {
        setDisplayname(value);
        return this;
    }

    @Override
    public SeasonTicketGroupsRecord value3(String value) {
        setName(value);
        return this;
    }

    @Override
    public SeasonTicketGroupsRecord value4(String value) {
        setApiconnectionid(value);
        return this;
    }

    @Override
    public SeasonTicketGroupsRecord value5(String value) {
        setDetails(value);
        return this;
    }

    @Override
    public SeasonTicketGroupsRecord value6(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public SeasonTicketGroupsRecord value7(LocalDateTime value) {
        setLastupdated(value);
        return this;
    }

    @Override
    public SeasonTicketGroupsRecord value8(String value) {
        setUmid(value);
        return this;
    }

    @Override
    public SeasonTicketGroupsRecord value9(LocalDateTime value) {
        setDropped(value);
        return this;
    }

    @Override
    public SeasonTicketGroupsRecord values(Long value1, String value2, String value3, String value4, String value5, LocalDateTime value6, LocalDateTime value7, String value8, LocalDateTime value9) {
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
     * Create a detached SeasonTicketGroupsRecord
     */
    public SeasonTicketGroupsRecord() {
        super(SeasonTicketGroups.SEASON_TICKET_GROUPS);
    }

    /**
     * Create a detached, initialised SeasonTicketGroupsRecord
     */
    public SeasonTicketGroupsRecord(Long seasonticketgroupid, String displayname, String name, String apiconnectionid, String details, LocalDateTime created, LocalDateTime lastupdated, String umid, LocalDateTime dropped) {
        super(SeasonTicketGroups.SEASON_TICKET_GROUPS);

        set(0, seasonticketgroupid);
        set(1, displayname);
        set(2, name);
        set(3, apiconnectionid);
        set(4, details);
        set(5, created);
        set(6, lastupdated);
        set(7, umid);
        set(8, dropped);
    }
}