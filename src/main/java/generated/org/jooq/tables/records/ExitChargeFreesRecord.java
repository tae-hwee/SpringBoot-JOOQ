/*
 * This file is generated by jOOQ.
 */
package generated.org.jooq.tables.records;


import generated.org.jooq.tables.ExitChargeFrees;

import java.time.LocalTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ExitChargeFreesRecord extends UpdatableRecordImpl<ExitChargeFreesRecord> implements Record5<Long, String, LocalTime, String, LocalTime> {

    private static final long serialVersionUID = -1670772843;

    /**
     * Setter for <code>rs-parking-node.exit_charge_frees.eixitChargeFreeId</code>.
     */
    public void setEixitchargefreeid(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>rs-parking-node.exit_charge_frees.eixitChargeFreeId</code>.
     */
    public Long getEixitchargefreeid() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>rs-parking-node.exit_charge_frees.active</code>.
     */
    public void setActive(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>rs-parking-node.exit_charge_frees.active</code>.
     */
    public String getActive() {
        return (String) get(1);
    }

    /**
     * Setter for <code>rs-parking-node.exit_charge_frees.end</code>.
     */
    public void setEnd(LocalTime value) {
        set(2, value);
    }

    /**
     * Getter for <code>rs-parking-node.exit_charge_frees.end</code>.
     */
    public LocalTime getEnd() {
        return (LocalTime) get(2);
    }

    /**
     * Setter for <code>rs-parking-node.exit_charge_frees.name</code>.
     */
    public void setName(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>rs-parking-node.exit_charge_frees.name</code>.
     */
    public String getName() {
        return (String) get(3);
    }

    /**
     * Setter for <code>rs-parking-node.exit_charge_frees.start</code>.
     */
    public void setStart(LocalTime value) {
        set(4, value);
    }

    /**
     * Getter for <code>rs-parking-node.exit_charge_frees.start</code>.
     */
    public LocalTime getStart() {
        return (LocalTime) get(4);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row5<Long, String, LocalTime, String, LocalTime> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    @Override
    public Row5<Long, String, LocalTime, String, LocalTime> valuesRow() {
        return (Row5) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return ExitChargeFrees.EXIT_CHARGE_FREES.EIXITCHARGEFREEID;
    }

    @Override
    public Field<String> field2() {
        return ExitChargeFrees.EXIT_CHARGE_FREES.ACTIVE;
    }

    @Override
    public Field<LocalTime> field3() {
        return ExitChargeFrees.EXIT_CHARGE_FREES.END;
    }

    @Override
    public Field<String> field4() {
        return ExitChargeFrees.EXIT_CHARGE_FREES.NAME;
    }

    @Override
    public Field<LocalTime> field5() {
        return ExitChargeFrees.EXIT_CHARGE_FREES.START;
    }

    @Override
    public Long component1() {
        return getEixitchargefreeid();
    }

    @Override
    public String component2() {
        return getActive();
    }

    @Override
    public LocalTime component3() {
        return getEnd();
    }

    @Override
    public String component4() {
        return getName();
    }

    @Override
    public LocalTime component5() {
        return getStart();
    }

    @Override
    public Long value1() {
        return getEixitchargefreeid();
    }

    @Override
    public String value2() {
        return getActive();
    }

    @Override
    public LocalTime value3() {
        return getEnd();
    }

    @Override
    public String value4() {
        return getName();
    }

    @Override
    public LocalTime value5() {
        return getStart();
    }

    @Override
    public ExitChargeFreesRecord value1(Long value) {
        setEixitchargefreeid(value);
        return this;
    }

    @Override
    public ExitChargeFreesRecord value2(String value) {
        setActive(value);
        return this;
    }

    @Override
    public ExitChargeFreesRecord value3(LocalTime value) {
        setEnd(value);
        return this;
    }

    @Override
    public ExitChargeFreesRecord value4(String value) {
        setName(value);
        return this;
    }

    @Override
    public ExitChargeFreesRecord value5(LocalTime value) {
        setStart(value);
        return this;
    }

    @Override
    public ExitChargeFreesRecord values(Long value1, String value2, LocalTime value3, String value4, LocalTime value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ExitChargeFreesRecord
     */
    public ExitChargeFreesRecord() {
        super(ExitChargeFrees.EXIT_CHARGE_FREES);
    }

    /**
     * Create a detached, initialised ExitChargeFreesRecord
     */
    public ExitChargeFreesRecord(Long eixitchargefreeid, String active, LocalTime end, String name, LocalTime start) {
        super(ExitChargeFrees.EXIT_CHARGE_FREES);

        set(0, eixitchargefreeid);
        set(1, active);
        set(2, end);
        set(3, name);
        set(4, start);
    }
}
