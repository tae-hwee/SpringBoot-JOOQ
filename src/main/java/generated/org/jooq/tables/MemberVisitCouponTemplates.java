/*
 * This file is generated by jOOQ.
 */
package generated.org.jooq.tables;


import generated.org.jooq.Keys;
import generated.org.jooq.RsParkingNode;
import generated.org.jooq.tables.records.MemberVisitCouponTemplatesRecord;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row8;
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
public class MemberVisitCouponTemplates extends TableImpl<MemberVisitCouponTemplatesRecord> {

    private static final long serialVersionUID = 1275919609;

    /**
     * The reference instance of <code>rs-parking-node.member_visit_coupon_templates</code>
     */
    public static final MemberVisitCouponTemplates MEMBER_VISIT_COUPON_TEMPLATES = new MemberVisitCouponTemplates();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<MemberVisitCouponTemplatesRecord> getRecordType() {
        return MemberVisitCouponTemplatesRecord.class;
    }

    /**
     * The column <code>rs-parking-node.member_visit_coupon_templates.memberId</code>.
     */
    public final TableField<MemberVisitCouponTemplatesRecord, Long> MEMBERID = createField(DSL.name("memberId"), org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>rs-parking-node.member_visit_coupon_templates.visitCouponTemplateId</code>.
     */
    public final TableField<MemberVisitCouponTemplatesRecord, Long> VISITCOUPONTEMPLATEID = createField(DSL.name("visitCouponTemplateId"), org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>rs-parking-node.member_visit_coupon_templates.created</code>.
     */
    public final TableField<MemberVisitCouponTemplatesRecord, LocalDateTime> CREATED = createField(DSL.name("created"), org.jooq.impl.SQLDataType.LOCALDATETIME.nullable(false), this, "");

    /**
     * The column <code>rs-parking-node.member_visit_coupon_templates.initAmount</code>.
     */
    public final TableField<MemberVisitCouponTemplatesRecord, BigDecimal> INITAMOUNT = createField(DSL.name("initAmount"), org.jooq.impl.SQLDataType.DECIMAL(19, 2).defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.DECIMAL)), this, "");

    /**
     * The column <code>rs-parking-node.member_visit_coupon_templates.maxCouponCount</code>.
     */
    public final TableField<MemberVisitCouponTemplatesRecord, Integer> MAXCOUPONCOUNT = createField(DSL.name("maxCouponCount"), org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>rs-parking-node.member_visit_coupon_templates.month</code>.
     */
    public final TableField<MemberVisitCouponTemplatesRecord, String> MONTH = createField(DSL.name("month"), org.jooq.impl.SQLDataType.VARCHAR(32).nullable(false), this, "");

    /**
     * The column <code>rs-parking-node.member_visit_coupon_templates.residualAmount</code>.
     */
    public final TableField<MemberVisitCouponTemplatesRecord, BigDecimal> RESIDUALAMOUNT = createField(DSL.name("residualAmount"), org.jooq.impl.SQLDataType.DECIMAL(19, 2).defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.DECIMAL)), this, "");

    /**
     * The column <code>rs-parking-node.member_visit_coupon_templates.status</code>.
     */
    public final TableField<MemberVisitCouponTemplatesRecord, String> STATUS = createField(DSL.name("status"), org.jooq.impl.SQLDataType.VARCHAR(16).nullable(false), this, "");

    /**
     * Create a <code>rs-parking-node.member_visit_coupon_templates</code> table reference
     */
    public MemberVisitCouponTemplates() {
        this(DSL.name("member_visit_coupon_templates"), null);
    }

    /**
     * Create an aliased <code>rs-parking-node.member_visit_coupon_templates</code> table reference
     */
    public MemberVisitCouponTemplates(String alias) {
        this(DSL.name(alias), MEMBER_VISIT_COUPON_TEMPLATES);
    }

    /**
     * Create an aliased <code>rs-parking-node.member_visit_coupon_templates</code> table reference
     */
    public MemberVisitCouponTemplates(Name alias) {
        this(alias, MEMBER_VISIT_COUPON_TEMPLATES);
    }

    private MemberVisitCouponTemplates(Name alias, Table<MemberVisitCouponTemplatesRecord> aliased) {
        this(alias, aliased, null);
    }

    private MemberVisitCouponTemplates(Name alias, Table<MemberVisitCouponTemplatesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> MemberVisitCouponTemplates(Table<O> child, ForeignKey<O, MemberVisitCouponTemplatesRecord> key) {
        super(child, key, MEMBER_VISIT_COUPON_TEMPLATES);
    }

    @Override
    public Schema getSchema() {
        return RsParkingNode.RS_PARKING_NODE;
    }

    @Override
    public UniqueKey<MemberVisitCouponTemplatesRecord> getPrimaryKey() {
        return Keys.KEY_MEMBER_VISIT_COUPON_TEMPLATES_PRIMARY;
    }

    @Override
    public List<UniqueKey<MemberVisitCouponTemplatesRecord>> getKeys() {
        return Arrays.<UniqueKey<MemberVisitCouponTemplatesRecord>>asList(Keys.KEY_MEMBER_VISIT_COUPON_TEMPLATES_PRIMARY);
    }

    @Override
    public List<ForeignKey<MemberVisitCouponTemplatesRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<MemberVisitCouponTemplatesRecord, ?>>asList(Keys.FKRU7TLMJWV4B83QPM7MYTWJNXN, Keys.FKHQFXA6P17LLAM1X0IE8LVGI3);
    }

    public Members members() {
        return new Members(this, Keys.FKRU7TLMJWV4B83QPM7MYTWJNXN);
    }

    public VisitCouponTemplates visitCouponTemplates() {
        return new VisitCouponTemplates(this, Keys.FKHQFXA6P17LLAM1X0IE8LVGI3);
    }

    @Override
    public MemberVisitCouponTemplates as(String alias) {
        return new MemberVisitCouponTemplates(DSL.name(alias), this);
    }

    @Override
    public MemberVisitCouponTemplates as(Name alias) {
        return new MemberVisitCouponTemplates(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public MemberVisitCouponTemplates rename(String name) {
        return new MemberVisitCouponTemplates(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public MemberVisitCouponTemplates rename(Name name) {
        return new MemberVisitCouponTemplates(name, null);
    }

    // -------------------------------------------------------------------------
    // Row8 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row8<Long, Long, LocalDateTime, BigDecimal, Integer, String, BigDecimal, String> fieldsRow() {
        return (Row8) super.fieldsRow();
    }
}