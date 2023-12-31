/*
 * This file is generated by jOOQ.
 */
package generated.org.jooq.tables;


import generated.org.jooq.Keys;
import generated.org.jooq.RsParkingNode;
import generated.org.jooq.tables.records.SeasonTicketOffDaysRecord;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row2;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SeasonTicketOffDays extends TableImpl<SeasonTicketOffDaysRecord> {

    private static final long serialVersionUID = -918132412;

    /**
     * The reference instance of <code>rs-parking-node.season_ticket_off_days</code>
     */
    public static final SeasonTicketOffDays SEASON_TICKET_OFF_DAYS = new SeasonTicketOffDays();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SeasonTicketOffDaysRecord> getRecordType() {
        return SeasonTicketOffDaysRecord.class;
    }

    /**
     * The column <code>rs-parking-node.season_ticket_off_days.date</code>.
     */
    public final TableField<SeasonTicketOffDaysRecord, LocalDate> DATE = createField(DSL.name("date"), org.jooq.impl.SQLDataType.LOCALDATE.nullable(false), this, "");

    /**
     * The column <code>rs-parking-node.season_ticket_off_days.seasonTicketTemplateId</code>.
     */
    public final TableField<SeasonTicketOffDaysRecord, Long> SEASONTICKETTEMPLATEID = createField(DSL.name("seasonTicketTemplateId"), org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * Create a <code>rs-parking-node.season_ticket_off_days</code> table reference
     */
    public SeasonTicketOffDays() {
        this(DSL.name("season_ticket_off_days"), null);
    }

    /**
     * Create an aliased <code>rs-parking-node.season_ticket_off_days</code> table reference
     */
    public SeasonTicketOffDays(String alias) {
        this(DSL.name(alias), SEASON_TICKET_OFF_DAYS);
    }

    /**
     * Create an aliased <code>rs-parking-node.season_ticket_off_days</code> table reference
     */
    public SeasonTicketOffDays(Name alias) {
        this(alias, SEASON_TICKET_OFF_DAYS);
    }

    private SeasonTicketOffDays(Name alias, Table<SeasonTicketOffDaysRecord> aliased) {
        this(alias, aliased, null);
    }

    private SeasonTicketOffDays(Name alias, Table<SeasonTicketOffDaysRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> SeasonTicketOffDays(Table<O> child, ForeignKey<O, SeasonTicketOffDaysRecord> key) {
        super(child, key, SEASON_TICKET_OFF_DAYS);
    }

    @Override
    public Schema getSchema() {
        return RsParkingNode.RS_PARKING_NODE;
    }

    @Override
    public UniqueKey<SeasonTicketOffDaysRecord> getPrimaryKey() {
        return Keys.KEY_SEASON_TICKET_OFF_DAYS_PRIMARY;
    }

    @Override
    public List<UniqueKey<SeasonTicketOffDaysRecord>> getKeys() {
        return Arrays.<UniqueKey<SeasonTicketOffDaysRecord>>asList(Keys.KEY_SEASON_TICKET_OFF_DAYS_PRIMARY);
    }

    @Override
    public List<ForeignKey<SeasonTicketOffDaysRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<SeasonTicketOffDaysRecord, ?>>asList(Keys.FK1UHAT5NVM9R772YAVBBT67NON);
    }

    public SeasonTicketTemplates seasonTicketTemplates() {
        return new SeasonTicketTemplates(this, Keys.FK1UHAT5NVM9R772YAVBBT67NON);
    }

    @Override
    public SeasonTicketOffDays as(String alias) {
        return new SeasonTicketOffDays(DSL.name(alias), this);
    }

    @Override
    public SeasonTicketOffDays as(Name alias) {
        return new SeasonTicketOffDays(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public SeasonTicketOffDays rename(String name) {
        return new SeasonTicketOffDays(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public SeasonTicketOffDays rename(Name name) {
        return new SeasonTicketOffDays(name, null);
    }

    // -------------------------------------------------------------------------
    // Row2 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row2<LocalDate, Long> fieldsRow() {
        return (Row2) super.fieldsRow();
    }
}
