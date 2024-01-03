/*
 * This file is generated by jOOQ.
 */
package generated.org.jooq.tables.records;


import generated.org.jooq.tables.SeasonTicketOffDays;

import java.time.LocalDate;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SeasonTicketOffDaysRecord extends UpdatableRecordImpl<SeasonTicketOffDaysRecord> implements Record2<LocalDate, Long> {

    private static final long serialVersionUID = -1670772560;

    /**
     * Setter for <code>rs-parking-node.season_ticket_off_days.date</code>.
     */
    public void setDate(LocalDate value) {
        set(0, value);
    }

    /**
     * Getter for <code>rs-parking-node.season_ticket_off_days.date</code>.
     */
    public LocalDate getDate() {
        return (LocalDate) get(0);
    }

    /**
     * Setter for <code>rs-parking-node.season_ticket_off_days.seasonTicketTemplateId</code>.
     */
    public void setSeasontickettemplateid(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>rs-parking-node.season_ticket_off_days.seasonTicketTemplateId</code>.
     */
    public Long getSeasontickettemplateid() {
        return (Long) get(1);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record2<LocalDate, Long> key() {
        return (Record2) super.key();
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row2<LocalDate, Long> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    @Override
    public Row2<LocalDate, Long> valuesRow() {
        return (Row2) super.valuesRow();
    }

    @Override
    public Field<LocalDate> field1() {
        return SeasonTicketOffDays.SEASON_TICKET_OFF_DAYS.DATE;
    }

    @Override
    public Field<Long> field2() {
        return SeasonTicketOffDays.SEASON_TICKET_OFF_DAYS.SEASONTICKETTEMPLATEID;
    }

    @Override
    public LocalDate component1() {
        return getDate();
    }

    @Override
    public Long component2() {
        return getSeasontickettemplateid();
    }

    @Override
    public LocalDate value1() {
        return getDate();
    }

    @Override
    public Long value2() {
        return getSeasontickettemplateid();
    }

    @Override
    public SeasonTicketOffDaysRecord value1(LocalDate value) {
        setDate(value);
        return this;
    }

    @Override
    public SeasonTicketOffDaysRecord value2(Long value) {
        setSeasontickettemplateid(value);
        return this;
    }

    @Override
    public SeasonTicketOffDaysRecord values(LocalDate value1, Long value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached SeasonTicketOffDaysRecord
     */
    public SeasonTicketOffDaysRecord() {
        super(SeasonTicketOffDays.SEASON_TICKET_OFF_DAYS);
    }

    /**
     * Create a detached, initialised SeasonTicketOffDaysRecord
     */
    public SeasonTicketOffDaysRecord(LocalDate date, Long seasontickettemplateid) {
        super(SeasonTicketOffDays.SEASON_TICKET_OFF_DAYS);

        set(0, date);
        set(1, seasontickettemplateid);
    }
}
