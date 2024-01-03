/*
 * This file is generated by jOOQ.
 */
package generated.org.jooq.tables.records;


import generated.org.jooq.tables.Divisions;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DivisionsRecord extends UpdatableRecordImpl<DivisionsRecord> implements Record2<Long, String> {

    private static final long serialVersionUID = 1838964112;

    /**
     * Setter for <code>rs-parking-node.divisions.divisionId</code>.
     */
    public void setDivisionid(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>rs-parking-node.divisions.divisionId</code>.
     */
    public Long getDivisionid() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>rs-parking-node.divisions.name</code>.
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>rs-parking-node.divisions.name</code>.
     */
    public String getName() {
        return (String) get(1);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row2<Long, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    @Override
    public Row2<Long, String> valuesRow() {
        return (Row2) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return Divisions.DIVISIONS.DIVISIONID;
    }

    @Override
    public Field<String> field2() {
        return Divisions.DIVISIONS.NAME;
    }

    @Override
    public Long component1() {
        return getDivisionid();
    }

    @Override
    public String component2() {
        return getName();
    }

    @Override
    public Long value1() {
        return getDivisionid();
    }

    @Override
    public String value2() {
        return getName();
    }

    @Override
    public DivisionsRecord value1(Long value) {
        setDivisionid(value);
        return this;
    }

    @Override
    public DivisionsRecord value2(String value) {
        setName(value);
        return this;
    }

    @Override
    public DivisionsRecord values(Long value1, String value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached DivisionsRecord
     */
    public DivisionsRecord() {
        super(Divisions.DIVISIONS);
    }

    /**
     * Create a detached, initialised DivisionsRecord
     */
    public DivisionsRecord(Long divisionid, String name) {
        super(Divisions.DIVISIONS);

        set(0, divisionid);
        set(1, name);
    }
}
