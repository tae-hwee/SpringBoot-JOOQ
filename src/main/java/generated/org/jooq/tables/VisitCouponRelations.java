/*
 * This file is generated by jOOQ.
 */
package generated.org.jooq.tables;


import generated.org.jooq.Keys;
import generated.org.jooq.RsParkingNode;
import generated.org.jooq.tables.records.VisitCouponRelationsRecord;

import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row4;
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
public class VisitCouponRelations extends TableImpl<VisitCouponRelationsRecord> {

    private static final long serialVersionUID = 1330279070;

    /**
     * The reference instance of <code>rs-parking-node.visit_coupon_relations</code>
     */
    public static final VisitCouponRelations VISIT_COUPON_RELATIONS = new VisitCouponRelations();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<VisitCouponRelationsRecord> getRecordType() {
        return VisitCouponRelationsRecord.class;
    }

    /**
     * The column <code>rs-parking-node.visit_coupon_relations.visitCouponRelationId</code>.
     */
    public final TableField<VisitCouponRelationsRecord, Long> VISITCOUPONRELATIONID = createField(DSL.name("visitCouponRelationId"), org.jooq.impl.SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>rs-parking-node.visit_coupon_relations.numberOfIssuesPerVisit</code>.
     */
    public final TableField<VisitCouponRelationsRecord, Integer> NUMBEROFISSUESPERVISIT = createField(DSL.name("numberOfIssuesPerVisit"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>rs-parking-node.visit_coupon_relations.memberId</code>.
     */
    public final TableField<VisitCouponRelationsRecord, Long> MEMBERID = createField(DSL.name("memberId"), org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>rs-parking-node.visit_coupon_relations.totalMinutesPerVisit</code>.
     */
    public final TableField<VisitCouponRelationsRecord, Integer> TOTALMINUTESPERVISIT = createField(DSL.name("totalMinutesPerVisit"), org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * Create a <code>rs-parking-node.visit_coupon_relations</code> table reference
     */
    public VisitCouponRelations() {
        this(DSL.name("visit_coupon_relations"), null);
    }

    /**
     * Create an aliased <code>rs-parking-node.visit_coupon_relations</code> table reference
     */
    public VisitCouponRelations(String alias) {
        this(DSL.name(alias), VISIT_COUPON_RELATIONS);
    }

    /**
     * Create an aliased <code>rs-parking-node.visit_coupon_relations</code> table reference
     */
    public VisitCouponRelations(Name alias) {
        this(alias, VISIT_COUPON_RELATIONS);
    }

    private VisitCouponRelations(Name alias, Table<VisitCouponRelationsRecord> aliased) {
        this(alias, aliased, null);
    }

    private VisitCouponRelations(Name alias, Table<VisitCouponRelationsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> VisitCouponRelations(Table<O> child, ForeignKey<O, VisitCouponRelationsRecord> key) {
        super(child, key, VISIT_COUPON_RELATIONS);
    }

    @Override
    public Schema getSchema() {
        return RsParkingNode.RS_PARKING_NODE;
    }

    @Override
    public Identity<VisitCouponRelationsRecord, Long> getIdentity() {
        return Keys.IDENTITY_VISIT_COUPON_RELATIONS;
    }

    @Override
    public UniqueKey<VisitCouponRelationsRecord> getPrimaryKey() {
        return Keys.KEY_VISIT_COUPON_RELATIONS_PRIMARY;
    }

    @Override
    public List<UniqueKey<VisitCouponRelationsRecord>> getKeys() {
        return Arrays.<UniqueKey<VisitCouponRelationsRecord>>asList(Keys.KEY_VISIT_COUPON_RELATIONS_PRIMARY);
    }

    @Override
    public List<ForeignKey<VisitCouponRelationsRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<VisitCouponRelationsRecord, ?>>asList(Keys.FKGETTBVPBLPU37V5SS1H28VGY4);
    }

    public Members members() {
        return new Members(this, Keys.FKGETTBVPBLPU37V5SS1H28VGY4);
    }

    @Override
    public VisitCouponRelations as(String alias) {
        return new VisitCouponRelations(DSL.name(alias), this);
    }

    @Override
    public VisitCouponRelations as(Name alias) {
        return new VisitCouponRelations(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public VisitCouponRelations rename(String name) {
        return new VisitCouponRelations(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public VisitCouponRelations rename(Name name) {
        return new VisitCouponRelations(name, null);
    }

    // -------------------------------------------------------------------------
    // Row4 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row4<Long, Integer, Long, Integer> fieldsRow() {
        return (Row4) super.fieldsRow();
    }
}