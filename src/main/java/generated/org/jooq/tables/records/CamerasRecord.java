/*
 * This file is generated by jOOQ.
 */
package generated.org.jooq.tables.records;


import generated.org.jooq.tables.Cameras;

import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record8;
import org.jooq.Row8;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CamerasRecord extends UpdatableRecordImpl<CamerasRecord> implements Record8<String, String, LocalDateTime, String, LocalDateTime, String, String, Long> {

    private static final long serialVersionUID = -373968096;

    /**
     * Setter for <code>rs-parking-node.cameras.cameraId</code>.
     */
    public void setCameraid(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>rs-parking-node.cameras.cameraId</code>.
     */
    public String getCameraid() {
        return (String) get(0);
    }

    /**
     * Setter for <code>rs-parking-node.cameras.channel</code>.
     */
    public void setChannel(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>rs-parking-node.cameras.channel</code>.
     */
    public String getChannel() {
        return (String) get(1);
    }

    /**
     * Setter for <code>rs-parking-node.cameras.created</code>.
     */
    public void setCreated(LocalDateTime value) {
        set(2, value);
    }

    /**
     * Getter for <code>rs-parking-node.cameras.created</code>.
     */
    public LocalDateTime getCreated() {
        return (LocalDateTime) get(2);
    }

    /**
     * Setter for <code>rs-parking-node.cameras.details</code>.
     */
    public void setDetails(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>rs-parking-node.cameras.details</code>.
     */
    public String getDetails() {
        return (String) get(3);
    }

    /**
     * Setter for <code>rs-parking-node.cameras.dropped</code>.
     */
    public void setDropped(LocalDateTime value) {
        set(4, value);
    }

    /**
     * Getter for <code>rs-parking-node.cameras.dropped</code>.
     */
    public LocalDateTime getDropped() {
        return (LocalDateTime) get(4);
    }

    /**
     * Setter for <code>rs-parking-node.cameras.ip</code>.
     */
    public void setIp(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>rs-parking-node.cameras.ip</code>.
     */
    public String getIp() {
        return (String) get(5);
    }

    /**
     * Setter for <code>rs-parking-node.cameras.name</code>.
     */
    public void setName(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>rs-parking-node.cameras.name</code>.
     */
    public String getName() {
        return (String) get(6);
    }

    /**
     * Setter for <code>rs-parking-node.cameras.districtId</code>.
     */
    public void setDistrictid(Long value) {
        set(7, value);
    }

    /**
     * Getter for <code>rs-parking-node.cameras.districtId</code>.
     */
    public Long getDistrictid() {
        return (Long) get(7);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record8 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row8<String, String, LocalDateTime, String, LocalDateTime, String, String, Long> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    @Override
    public Row8<String, String, LocalDateTime, String, LocalDateTime, String, String, Long> valuesRow() {
        return (Row8) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return Cameras.CAMERAS.CAMERAID;
    }

    @Override
    public Field<String> field2() {
        return Cameras.CAMERAS.CHANNEL;
    }

    @Override
    public Field<LocalDateTime> field3() {
        return Cameras.CAMERAS.CREATED;
    }

    @Override
    public Field<String> field4() {
        return Cameras.CAMERAS.DETAILS;
    }

    @Override
    public Field<LocalDateTime> field5() {
        return Cameras.CAMERAS.DROPPED;
    }

    @Override
    public Field<String> field6() {
        return Cameras.CAMERAS.IP;
    }

    @Override
    public Field<String> field7() {
        return Cameras.CAMERAS.NAME;
    }

    @Override
    public Field<Long> field8() {
        return Cameras.CAMERAS.DISTRICTID;
    }

    @Override
    public String component1() {
        return getCameraid();
    }

    @Override
    public String component2() {
        return getChannel();
    }

    @Override
    public LocalDateTime component3() {
        return getCreated();
    }

    @Override
    public String component4() {
        return getDetails();
    }

    @Override
    public LocalDateTime component5() {
        return getDropped();
    }

    @Override
    public String component6() {
        return getIp();
    }

    @Override
    public String component7() {
        return getName();
    }

    @Override
    public Long component8() {
        return getDistrictid();
    }

    @Override
    public String value1() {
        return getCameraid();
    }

    @Override
    public String value2() {
        return getChannel();
    }

    @Override
    public LocalDateTime value3() {
        return getCreated();
    }

    @Override
    public String value4() {
        return getDetails();
    }

    @Override
    public LocalDateTime value5() {
        return getDropped();
    }

    @Override
    public String value6() {
        return getIp();
    }

    @Override
    public String value7() {
        return getName();
    }

    @Override
    public Long value8() {
        return getDistrictid();
    }

    @Override
    public CamerasRecord value1(String value) {
        setCameraid(value);
        return this;
    }

    @Override
    public CamerasRecord value2(String value) {
        setChannel(value);
        return this;
    }

    @Override
    public CamerasRecord value3(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public CamerasRecord value4(String value) {
        setDetails(value);
        return this;
    }

    @Override
    public CamerasRecord value5(LocalDateTime value) {
        setDropped(value);
        return this;
    }

    @Override
    public CamerasRecord value6(String value) {
        setIp(value);
        return this;
    }

    @Override
    public CamerasRecord value7(String value) {
        setName(value);
        return this;
    }

    @Override
    public CamerasRecord value8(Long value) {
        setDistrictid(value);
        return this;
    }

    @Override
    public CamerasRecord values(String value1, String value2, LocalDateTime value3, String value4, LocalDateTime value5, String value6, String value7, Long value8) {
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
     * Create a detached CamerasRecord
     */
    public CamerasRecord() {
        super(Cameras.CAMERAS);
    }

    /**
     * Create a detached, initialised CamerasRecord
     */
    public CamerasRecord(String cameraid, String channel, LocalDateTime created, String details, LocalDateTime dropped, String ip, String name, Long districtid) {
        super(Cameras.CAMERAS);

        set(0, cameraid);
        set(1, channel);
        set(2, created);
        set(3, details);
        set(4, dropped);
        set(5, ip);
        set(6, name);
        set(7, districtid);
    }
}
