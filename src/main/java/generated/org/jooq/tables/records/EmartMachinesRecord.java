/*
 * This file is generated by jOOQ.
 */
package generated.org.jooq.tables.records;


import generated.org.jooq.tables.EmartMachines;

import org.jooq.Field;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class EmartMachinesRecord extends TableRecordImpl<EmartMachinesRecord> implements Record4<String, String, String, String> {

    private static final long serialVersionUID = -599785616;

    /**
     * Setter for <code>rs-parking-node.emart_machines.STRCD_HQ</code>. 점포 코드(영업점)
     */
    public void setStrcdHq(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>rs-parking-node.emart_machines.STRCD_HQ</code>. 점포 코드(영업점)
     */
    public String getStrcdHq() {
        return (String) get(0);
    }

    /**
     * Setter for <code>rs-parking-node.emart_machines.EQPT_ID</code>. 장비 ID
     */
    public void setEqptId(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>rs-parking-node.emart_machines.EQPT_ID</code>. 장비 ID
     */
    public String getEqptId() {
        return (String) get(1);
    }

    /**
     * Setter for <code>rs-parking-node.emart_machines.EQPT_TYPE</code>. 장비 종류(IN : 입구관제, OT : 출차관제, M : 출구무인, P : 출구유인, K : 사전무인)
     */
    public void setEqptType(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>rs-parking-node.emart_machines.EQPT_TYPE</code>. 장비 종류(IN : 입구관제, OT : 출차관제, M : 출구무인, P : 출구유인, K : 사전무인)
     */
    public String getEqptType() {
        return (String) get(2);
    }

    /**
     * Setter for <code>rs-parking-node.emart_machines.EQPT_EXP</code>. 장비 설명
     */
    public void setEqptExp(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>rs-parking-node.emart_machines.EQPT_EXP</code>. 장비 설명
     */
    public String getEqptExp() {
        return (String) get(3);
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row4<String, String, String, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    @Override
    public Row4<String, String, String, String> valuesRow() {
        return (Row4) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return EmartMachines.EMART_MACHINES.STRCD_HQ;
    }

    @Override
    public Field<String> field2() {
        return EmartMachines.EMART_MACHINES.EQPT_ID;
    }

    @Override
    public Field<String> field3() {
        return EmartMachines.EMART_MACHINES.EQPT_TYPE;
    }

    @Override
    public Field<String> field4() {
        return EmartMachines.EMART_MACHINES.EQPT_EXP;
    }

    @Override
    public String component1() {
        return getStrcdHq();
    }

    @Override
    public String component2() {
        return getEqptId();
    }

    @Override
    public String component3() {
        return getEqptType();
    }

    @Override
    public String component4() {
        return getEqptExp();
    }

    @Override
    public String value1() {
        return getStrcdHq();
    }

    @Override
    public String value2() {
        return getEqptId();
    }

    @Override
    public String value3() {
        return getEqptType();
    }

    @Override
    public String value4() {
        return getEqptExp();
    }

    @Override
    public EmartMachinesRecord value1(String value) {
        setStrcdHq(value);
        return this;
    }

    @Override
    public EmartMachinesRecord value2(String value) {
        setEqptId(value);
        return this;
    }

    @Override
    public EmartMachinesRecord value3(String value) {
        setEqptType(value);
        return this;
    }

    @Override
    public EmartMachinesRecord value4(String value) {
        setEqptExp(value);
        return this;
    }

    @Override
    public EmartMachinesRecord values(String value1, String value2, String value3, String value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached EmartMachinesRecord
     */
    public EmartMachinesRecord() {
        super(EmartMachines.EMART_MACHINES);
    }

    /**
     * Create a detached, initialised EmartMachinesRecord
     */
    public EmartMachinesRecord(String strcdHq, String eqptId, String eqptType, String eqptExp) {
        super(EmartMachines.EMART_MACHINES);

        set(0, strcdHq);
        set(1, eqptId);
        set(2, eqptType);
        set(3, eqptExp);
    }
}