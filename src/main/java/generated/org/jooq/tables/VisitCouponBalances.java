/*
 * This file is generated by jOOQ.
 */
package generated.org.jooq.tables;


import generated.org.jooq.Keys;
import generated.org.jooq.RsParkingNode;
import generated.org.jooq.tables.records.VisitCouponBalancesRecord;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row13;
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
public class VisitCouponBalances extends TableImpl<VisitCouponBalancesRecord> {

    private static final long serialVersionUID = -1626966314;

    /**
     * The reference instance of <code>rs-parking-node.visit_coupon_balances</code>
     */
    public static final VisitCouponBalances VISIT_COUPON_BALANCES = new VisitCouponBalances();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<VisitCouponBalancesRecord> getRecordType() {
        return VisitCouponBalancesRecord.class;
    }

    /**
     * The column <code>rs-parking-node.visit_coupon_balances.id</code>.
     */
    public final TableField<VisitCouponBalancesRecord, String> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.CHAR(32).nullable(false), this, "");

    /**
     * The column <code>rs-parking-node.visit_coupon_balances.cancelTarget</code>.
     */
    public final TableField<VisitCouponBalancesRecord, String> CANCELTARGET = createField(DSL.name("cancelTarget"), org.jooq.impl.SQLDataType.CHAR(32).defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.CHAR)), this, "");

    /**
     * The column <code>rs-parking-node.visit_coupon_balances.closed</code>.
     */
    public final TableField<VisitCouponBalancesRecord, LocalDateTime> CLOSED = createField(DSL.name("closed"), org.jooq.impl.SQLDataType.LOCALDATETIME.defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>rs-parking-node.visit_coupon_balances.created</code>.
     */
    public final TableField<VisitCouponBalancesRecord, LocalDateTime> CREATED = createField(DSL.name("created"), org.jooq.impl.SQLDataType.LOCALDATETIME.nullable(false), this, "");

    /**
     * The column <code>rs-parking-node.visit_coupon_balances.discard</code>.
     */
    public final TableField<VisitCouponBalancesRecord, LocalDateTime> DISCARD = createField(DSL.name("discard"), org.jooq.impl.SQLDataType.LOCALDATETIME.defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>rs-parking-node.visit_coupon_balances.points</code>.
     */
    public final TableField<VisitCouponBalancesRecord, Integer> POINTS = createField(DSL.name("points"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>rs-parking-node.visit_coupon_balances.pointsBalance</code>.
     */
    public final TableField<VisitCouponBalancesRecord, Integer> POINTSBALANCE = createField(DSL.name("pointsBalance"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>rs-parking-node.visit_coupon_balances.type</code>.
     */
    public final TableField<VisitCouponBalancesRecord, String> TYPE = createField(DSL.name("type"), org.jooq.impl.SQLDataType.VARCHAR(16).nullable(false), this, "");

    /**
     * The column <code>rs-parking-node.visit_coupon_balances.visitCouponId</code>.
     */
    public final TableField<VisitCouponBalancesRecord, String> VISITCOUPONID = createField(DSL.name("visitCouponId"), org.jooq.impl.SQLDataType.VARCHAR(20).defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>rs-parking-node.visit_coupon_balances.creatorId</code>.
     */
    public final TableField<VisitCouponBalancesRecord, Long> CREATORID = createField(DSL.name("creatorId"), org.jooq.impl.SQLDataType.BIGINT.defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>rs-parking-node.visit_coupon_balances.memberId</code>.
     */
    public final TableField<VisitCouponBalancesRecord, Long> MEMBERID = createField(DSL.name("memberId"), org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>rs-parking-node.visit_coupon_balances.visitCouponTemplateId</code>.
     */
    public final TableField<VisitCouponBalancesRecord, Long> VISITCOUPONTEMPLATEID = createField(DSL.name("visitCouponTemplateId"), org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>rs-parking-node.visit_coupon_balances.autoRefillPoints</code>.
     */
    public final TableField<VisitCouponBalancesRecord, Integer> AUTOREFILLPOINTS = createField(DSL.name("autoRefillPoints"), org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * Create a <code>rs-parking-node.visit_coupon_balances</code> table reference
     */
    public VisitCouponBalances() {
        this(DSL.name("visit_coupon_balances"), null);
    }

    /**
     * Create an aliased <code>rs-parking-node.visit_coupon_balances</code> table reference
     */
    public VisitCouponBalances(String alias) {
        this(DSL.name(alias), VISIT_COUPON_BALANCES);
    }

    /**
     * Create an aliased <code>rs-parking-node.visit_coupon_balances</code> table reference
     */
    public VisitCouponBalances(Name alias) {
        this(alias, VISIT_COUPON_BALANCES);
    }

    private VisitCouponBalances(Name alias, Table<VisitCouponBalancesRecord> aliased) {
        this(alias, aliased, null);
    }

    private VisitCouponBalances(Name alias, Table<VisitCouponBalancesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> VisitCouponBalances(Table<O> child, ForeignKey<O, VisitCouponBalancesRecord> key) {
        super(child, key, VISIT_COUPON_BALANCES);
    }

    @Override
    public Schema getSchema() {
        return RsParkingNode.RS_PARKING_NODE;
    }

    @Override
    public UniqueKey<VisitCouponBalancesRecord> getPrimaryKey() {
        return Keys.KEY_VISIT_COUPON_BALANCES_PRIMARY;
    }

    @Override
    public List<UniqueKey<VisitCouponBalancesRecord>> getKeys() {
        return Arrays.<UniqueKey<VisitCouponBalancesRecord>>asList(Keys.KEY_VISIT_COUPON_BALANCES_PRIMARY);
    }

    @Override
    public List<ForeignKey<VisitCouponBalancesRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<VisitCouponBalancesRecord, ?>>asList(Keys.FKAQ8HRBLNRKSA1ODAM702MG07E, Keys.FK5EWQ0EXKSI64NV1G7FRI08PBS, Keys.FKCFMW3B4UOEXL4YOCJJ3SKFYCM, Keys.FKNP22GJPIJ6HXVCJMT7OB897WL);
    }

    public VisitCoupons visitCoupons() {
        return new VisitCoupons(this, Keys.FKAQ8HRBLNRKSA1ODAM702MG07E);
    }

    public Members fk5ewq0exksi64nv1g7fri08pbs() {
        return new Members(this, Keys.FK5EWQ0EXKSI64NV1G7FRI08PBS);
    }

    public Members fkcfmw3b4uoexl4yocjj3skfycm() {
        return new Members(this, Keys.FKCFMW3B4UOEXL4YOCJJ3SKFYCM);
    }

    public VisitCouponTemplates visitCouponTemplates() {
        return new VisitCouponTemplates(this, Keys.FKNP22GJPIJ6HXVCJMT7OB897WL);
    }

    @Override
    public VisitCouponBalances as(String alias) {
        return new VisitCouponBalances(DSL.name(alias), this);
    }

    @Override
    public VisitCouponBalances as(Name alias) {
        return new VisitCouponBalances(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public VisitCouponBalances rename(String name) {
        return new VisitCouponBalances(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public VisitCouponBalances rename(Name name) {
        return new VisitCouponBalances(name, null);
    }

    // -------------------------------------------------------------------------
    // Row13 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row13<String, String, LocalDateTime, LocalDateTime, LocalDateTime, Integer, Integer, String, String, Long, Long, Long, Integer> fieldsRow() {
        return (Row13) super.fieldsRow();
    }
}