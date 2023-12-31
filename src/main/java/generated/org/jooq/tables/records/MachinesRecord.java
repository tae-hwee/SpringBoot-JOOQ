/*
 * This file is generated by jOOQ.
 */
package generated.org.jooq.tables.records;


import generated.org.jooq.tables.Machines;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record20;
import org.jooq.Row20;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class MachinesRecord extends UpdatableRecordImpl<MachinesRecord> implements Record20<Long, String, String, String, LocalDateTime, String, String, String, Long, String, String, String, BigDecimal, BigDecimal, String, String, String, LocalDateTime, LocalDateTime, String> {

    private static final long serialVersionUID = 758166002;

    /**
     * Setter for <code>rs-parking-node.machines.machineId</code>.
     */
    public void setMachineid(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>rs-parking-node.machines.machineId</code>.
     */
    public Long getMachineid() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>rs-parking-node.machines.code</code>.
     */
    public void setCode(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>rs-parking-node.machines.code</code>.
     */
    public String getCode() {
        return (String) get(1);
    }

    /**
     * Setter for <code>rs-parking-node.machines.details</code>.
     */
    public void setDetails(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>rs-parking-node.machines.details</code>.
     */
    public String getDetails() {
        return (String) get(2);
    }

    /**
     * Setter for <code>rs-parking-node.machines.devices</code>.
     */
    public void setDevices(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>rs-parking-node.machines.devices</code>.
     */
    public String getDevices() {
        return (String) get(3);
    }

    /**
     * Setter for <code>rs-parking-node.machines.dropped</code>.
     */
    public void setDropped(LocalDateTime value) {
        set(4, value);
    }

    /**
     * Getter for <code>rs-parking-node.machines.dropped</code>.
     */
    public LocalDateTime getDropped() {
        return (LocalDateTime) get(4);
    }

    /**
     * Setter for <code>rs-parking-node.machines.name</code>.
     */
    public void setName(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>rs-parking-node.machines.name</code>.
     */
    public String getName() {
        return (String) get(5);
    }

    /**
     * Setter for <code>rs-parking-node.machines.protocol</code>.
     */
    public void setProtocol(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>rs-parking-node.machines.protocol</code>.
     */
    public String getProtocol() {
        return (String) get(6);
    }

    /**
     * Setter for <code>rs-parking-node.machines.type</code>.
     */
    public void setType(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>rs-parking-node.machines.type</code>.
     */
    public String getType() {
        return (String) get(7);
    }

    /**
     * Setter for <code>rs-parking-node.machines.districtId</code>.
     */
    public void setDistrictid(Long value) {
        set(8, value);
    }

    /**
     * Getter for <code>rs-parking-node.machines.districtId</code>.
     */
    public Long getDistrictid() {
        return (Long) get(8);
    }

    /**
     * Setter for <code>rs-parking-node.machines.apiKey</code>.
     */
    public void setApikey(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>rs-parking-node.machines.apiKey</code>.
     */
    public String getApikey() {
        return (String) get(9);
    }

    /**
     * Setter for <code>rs-parking-node.machines.sshPrivateKey</code>.
     */
    public void setSshprivatekey(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>rs-parking-node.machines.sshPrivateKey</code>.
     */
    public String getSshprivatekey() {
        return (String) get(10);
    }

    /**
     * Setter for <code>rs-parking-node.machines.description</code>.
     */
    public void setDescription(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>rs-parking-node.machines.description</code>.
     */
    public String getDescription() {
        return (String) get(11);
    }

    /**
     * Setter for <code>rs-parking-node.machines.lat</code>.
     */
    public void setLat(BigDecimal value) {
        set(12, value);
    }

    /**
     * Getter for <code>rs-parking-node.machines.lat</code>.
     */
    public BigDecimal getLat() {
        return (BigDecimal) get(12);
    }

    /**
     * Setter for <code>rs-parking-node.machines.lon</code>.
     */
    public void setLon(BigDecimal value) {
        set(13, value);
    }

    /**
     * Getter for <code>rs-parking-node.machines.lon</code>.
     */
    public BigDecimal getLon() {
        return (BigDecimal) get(13);
    }

    /**
     * Setter for <code>rs-parking-node.machines.poi</code>.
     */
    public void setPoi(String value) {
        set(14, value);
    }

    /**
     * Getter for <code>rs-parking-node.machines.poi</code>.
     */
    public String getPoi() {
        return (String) get(14);
    }

    /**
     * Setter for <code>rs-parking-node.machines.status</code>.
     */
    public void setStatus(String value) {
        set(15, value);
    }

    /**
     * Getter for <code>rs-parking-node.machines.status</code>.
     */
    public String getStatus() {
        return (String) get(15);
    }

    /**
     * Setter for <code>rs-parking-node.machines.cashBox</code>.
     */
    public void setCashbox(String value) {
        set(16, value);
    }

    /**
     * Getter for <code>rs-parking-node.machines.cashBox</code>.
     */
    public String getCashbox() {
        return (String) get(16);
    }

    /**
     * Setter for <code>rs-parking-node.machines.created</code>.
     */
    public void setCreated(LocalDateTime value) {
        set(17, value);
    }

    /**
     * Getter for <code>rs-parking-node.machines.created</code>.
     */
    public LocalDateTime getCreated() {
        return (LocalDateTime) get(17);
    }

    /**
     * Setter for <code>rs-parking-node.machines.lastUpdated</code>.
     */
    public void setLastupdated(LocalDateTime value) {
        set(18, value);
    }

    /**
     * Getter for <code>rs-parking-node.machines.lastUpdated</code>.
     */
    public LocalDateTime getLastupdated() {
        return (LocalDateTime) get(18);
    }

    /**
     * Setter for <code>rs-parking-node.machines.umid</code>.
     */
    public void setUmid(String value) {
        set(19, value);
    }

    /**
     * Getter for <code>rs-parking-node.machines.umid</code>.
     */
    public String getUmid() {
        return (String) get(19);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record20 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row20<Long, String, String, String, LocalDateTime, String, String, String, Long, String, String, String, BigDecimal, BigDecimal, String, String, String, LocalDateTime, LocalDateTime, String> fieldsRow() {
        return (Row20) super.fieldsRow();
    }

    @Override
    public Row20<Long, String, String, String, LocalDateTime, String, String, String, Long, String, String, String, BigDecimal, BigDecimal, String, String, String, LocalDateTime, LocalDateTime, String> valuesRow() {
        return (Row20) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return Machines.MACHINES.MACHINEID;
    }

    @Override
    public Field<String> field2() {
        return Machines.MACHINES.CODE;
    }

    @Override
    public Field<String> field3() {
        return Machines.MACHINES.DETAILS;
    }

    @Override
    public Field<String> field4() {
        return Machines.MACHINES.DEVICES;
    }

    @Override
    public Field<LocalDateTime> field5() {
        return Machines.MACHINES.DROPPED;
    }

    @Override
    public Field<String> field6() {
        return Machines.MACHINES.NAME;
    }

    @Override
    public Field<String> field7() {
        return Machines.MACHINES.PROTOCOL;
    }

    @Override
    public Field<String> field8() {
        return Machines.MACHINES.TYPE;
    }

    @Override
    public Field<Long> field9() {
        return Machines.MACHINES.DISTRICTID;
    }

    @Override
    public Field<String> field10() {
        return Machines.MACHINES.APIKEY;
    }

    @Override
    public Field<String> field11() {
        return Machines.MACHINES.SSHPRIVATEKEY;
    }

    @Override
    public Field<String> field12() {
        return Machines.MACHINES.DESCRIPTION;
    }

    @Override
    public Field<BigDecimal> field13() {
        return Machines.MACHINES.LAT;
    }

    @Override
    public Field<BigDecimal> field14() {
        return Machines.MACHINES.LON;
    }

    @Override
    public Field<String> field15() {
        return Machines.MACHINES.POI;
    }

    @Override
    public Field<String> field16() {
        return Machines.MACHINES.STATUS;
    }

    @Override
    public Field<String> field17() {
        return Machines.MACHINES.CASHBOX;
    }

    @Override
    public Field<LocalDateTime> field18() {
        return Machines.MACHINES.CREATED;
    }

    @Override
    public Field<LocalDateTime> field19() {
        return Machines.MACHINES.LASTUPDATED;
    }

    @Override
    public Field<String> field20() {
        return Machines.MACHINES.UMID;
    }

    @Override
    public Long component1() {
        return getMachineid();
    }

    @Override
    public String component2() {
        return getCode();
    }

    @Override
    public String component3() {
        return getDetails();
    }

    @Override
    public String component4() {
        return getDevices();
    }

    @Override
    public LocalDateTime component5() {
        return getDropped();
    }

    @Override
    public String component6() {
        return getName();
    }

    @Override
    public String component7() {
        return getProtocol();
    }

    @Override
    public String component8() {
        return getType();
    }

    @Override
    public Long component9() {
        return getDistrictid();
    }

    @Override
    public String component10() {
        return getApikey();
    }

    @Override
    public String component11() {
        return getSshprivatekey();
    }

    @Override
    public String component12() {
        return getDescription();
    }

    @Override
    public BigDecimal component13() {
        return getLat();
    }

    @Override
    public BigDecimal component14() {
        return getLon();
    }

    @Override
    public String component15() {
        return getPoi();
    }

    @Override
    public String component16() {
        return getStatus();
    }

    @Override
    public String component17() {
        return getCashbox();
    }

    @Override
    public LocalDateTime component18() {
        return getCreated();
    }

    @Override
    public LocalDateTime component19() {
        return getLastupdated();
    }

    @Override
    public String component20() {
        return getUmid();
    }

    @Override
    public Long value1() {
        return getMachineid();
    }

    @Override
    public String value2() {
        return getCode();
    }

    @Override
    public String value3() {
        return getDetails();
    }

    @Override
    public String value4() {
        return getDevices();
    }

    @Override
    public LocalDateTime value5() {
        return getDropped();
    }

    @Override
    public String value6() {
        return getName();
    }

    @Override
    public String value7() {
        return getProtocol();
    }

    @Override
    public String value8() {
        return getType();
    }

    @Override
    public Long value9() {
        return getDistrictid();
    }

    @Override
    public String value10() {
        return getApikey();
    }

    @Override
    public String value11() {
        return getSshprivatekey();
    }

    @Override
    public String value12() {
        return getDescription();
    }

    @Override
    public BigDecimal value13() {
        return getLat();
    }

    @Override
    public BigDecimal value14() {
        return getLon();
    }

    @Override
    public String value15() {
        return getPoi();
    }

    @Override
    public String value16() {
        return getStatus();
    }

    @Override
    public String value17() {
        return getCashbox();
    }

    @Override
    public LocalDateTime value18() {
        return getCreated();
    }

    @Override
    public LocalDateTime value19() {
        return getLastupdated();
    }

    @Override
    public String value20() {
        return getUmid();
    }

    @Override
    public MachinesRecord value1(Long value) {
        setMachineid(value);
        return this;
    }

    @Override
    public MachinesRecord value2(String value) {
        setCode(value);
        return this;
    }

    @Override
    public MachinesRecord value3(String value) {
        setDetails(value);
        return this;
    }

    @Override
    public MachinesRecord value4(String value) {
        setDevices(value);
        return this;
    }

    @Override
    public MachinesRecord value5(LocalDateTime value) {
        setDropped(value);
        return this;
    }

    @Override
    public MachinesRecord value6(String value) {
        setName(value);
        return this;
    }

    @Override
    public MachinesRecord value7(String value) {
        setProtocol(value);
        return this;
    }

    @Override
    public MachinesRecord value8(String value) {
        setType(value);
        return this;
    }

    @Override
    public MachinesRecord value9(Long value) {
        setDistrictid(value);
        return this;
    }

    @Override
    public MachinesRecord value10(String value) {
        setApikey(value);
        return this;
    }

    @Override
    public MachinesRecord value11(String value) {
        setSshprivatekey(value);
        return this;
    }

    @Override
    public MachinesRecord value12(String value) {
        setDescription(value);
        return this;
    }

    @Override
    public MachinesRecord value13(BigDecimal value) {
        setLat(value);
        return this;
    }

    @Override
    public MachinesRecord value14(BigDecimal value) {
        setLon(value);
        return this;
    }

    @Override
    public MachinesRecord value15(String value) {
        setPoi(value);
        return this;
    }

    @Override
    public MachinesRecord value16(String value) {
        setStatus(value);
        return this;
    }

    @Override
    public MachinesRecord value17(String value) {
        setCashbox(value);
        return this;
    }

    @Override
    public MachinesRecord value18(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public MachinesRecord value19(LocalDateTime value) {
        setLastupdated(value);
        return this;
    }

    @Override
    public MachinesRecord value20(String value) {
        setUmid(value);
        return this;
    }

    @Override
    public MachinesRecord values(Long value1, String value2, String value3, String value4, LocalDateTime value5, String value6, String value7, String value8, Long value9, String value10, String value11, String value12, BigDecimal value13, BigDecimal value14, String value15, String value16, String value17, LocalDateTime value18, LocalDateTime value19, String value20) {
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
        value14(value14);
        value15(value15);
        value16(value16);
        value17(value17);
        value18(value18);
        value19(value19);
        value20(value20);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached MachinesRecord
     */
    public MachinesRecord() {
        super(Machines.MACHINES);
    }

    /**
     * Create a detached, initialised MachinesRecord
     */
    public MachinesRecord(Long machineid, String code, String details, String devices, LocalDateTime dropped, String name, String protocol, String type, Long districtid, String apikey, String sshprivatekey, String description, BigDecimal lat, BigDecimal lon, String poi, String status, String cashbox, LocalDateTime created, LocalDateTime lastupdated, String umid) {
        super(Machines.MACHINES);

        set(0, machineid);
        set(1, code);
        set(2, details);
        set(3, devices);
        set(4, dropped);
        set(5, name);
        set(6, protocol);
        set(7, type);
        set(8, districtid);
        set(9, apikey);
        set(10, sshprivatekey);
        set(11, description);
        set(12, lat);
        set(13, lon);
        set(14, poi);
        set(15, status);
        set(16, cashbox);
        set(17, created);
        set(18, lastupdated);
        set(19, umid);
    }
}
