/*
 * This file is generated by jOOQ.
 */
package generated.org.jooq.tables;


import generated.org.jooq.Keys;
import generated.org.jooq.RsParkingNode;
import generated.org.jooq.tables.records.CarDiscountsRecord;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row15;
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
public class CarDiscounts extends TableImpl<CarDiscountsRecord> {

    private static final long serialVersionUID = 1052373937;

    /**
     * The reference instance of <code>rs-parking-node.car_discounts</code>
     */
    public static final CarDiscounts CAR_DISCOUNTS = new CarDiscounts();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CarDiscountsRecord> getRecordType() {
        return CarDiscountsRecord.class;
    }

    /**
     * The column <code>rs-parking-node.car_discounts.id</code>.
     */
    public final TableField<CarDiscountsRecord, String> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.CHAR(32).nullable(false), this, "");

    /**
     * The column <code>rs-parking-node.car_discounts.carType</code>.
     */
    public final TableField<CarDiscountsRecord, String> CARTYPE = createField(DSL.name("carType"), org.jooq.impl.SQLDataType.VARCHAR(64).defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>rs-parking-node.car_discounts.code</code>.
     */
    public final TableField<CarDiscountsRecord, String> CODE = createField(DSL.name("code"), org.jooq.impl.SQLDataType.VARCHAR(32).defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>rs-parking-node.car_discounts.department</code>.
     */
    public final TableField<CarDiscountsRecord, String> DEPARTMENT = createField(DSL.name("department"), org.jooq.impl.SQLDataType.VARCHAR(64).defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>rs-parking-node.car_discounts.end</code>.
     */
    public final TableField<CarDiscountsRecord, LocalDateTime> END = createField(DSL.name("end"), org.jooq.impl.SQLDataType.LOCALDATETIME.defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>rs-parking-node.car_discounts.lpn</code>.
     */
    public final TableField<CarDiscountsRecord, String> LPN = createField(DSL.name("lpn"), org.jooq.impl.SQLDataType.VARCHAR(16).nullable(false), this, "");

    /**
     * The column <code>rs-parking-node.car_discounts.organization</code>.
     */
    public final TableField<CarDiscountsRecord, String> ORGANIZATION = createField(DSL.name("organization"), org.jooq.impl.SQLDataType.VARCHAR(64).defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>rs-parking-node.car_discounts.phoneNumber</code>.
     */
    public final TableField<CarDiscountsRecord, String> PHONENUMBER = createField(DSL.name("phoneNumber"), org.jooq.impl.SQLDataType.VARCHAR(32).defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>rs-parking-node.car_discounts.publicDiscountCode</code>.
     */
    public final TableField<CarDiscountsRecord, String> PUBLICDISCOUNTCODE = createField(DSL.name("publicDiscountCode"), org.jooq.impl.SQLDataType.VARCHAR(16).defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>rs-parking-node.car_discounts.registrant</code>.
     */
    public final TableField<CarDiscountsRecord, String> REGISTRANT = createField(DSL.name("registrant"), org.jooq.impl.SQLDataType.VARCHAR(64).defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>rs-parking-node.car_discounts.remarks</code>.
     */
    public final TableField<CarDiscountsRecord, String> REMARKS = createField(DSL.name("remarks"), org.jooq.impl.SQLDataType.VARCHAR(1024).defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>rs-parking-node.car_discounts.start</code>.
     */
    public final TableField<CarDiscountsRecord, LocalDateTime> START = createField(DSL.name("start"), org.jooq.impl.SQLDataType.LOCALDATETIME.defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>rs-parking-node.car_discounts.districtId</code>.
     */
    public final TableField<CarDiscountsRecord, Long> DISTRICTID = createField(DSL.name("districtId"), org.jooq.impl.SQLDataType.BIGINT.defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>rs-parking-node.car_discounts.visitCouponTemplateId</code>.
     */
    public final TableField<CarDiscountsRecord, Long> VISITCOUPONTEMPLATEID = createField(DSL.name("visitCouponTemplateId"), org.jooq.impl.SQLDataType.BIGINT.defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>rs-parking-node.car_discounts.created</code>.
     */
    public final TableField<CarDiscountsRecord, LocalDateTime> CREATED = createField(DSL.name("created"), org.jooq.impl.SQLDataType.LOCALDATETIME.defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.LOCALDATETIME)), this, "");

    /**
     * Create a <code>rs-parking-node.car_discounts</code> table reference
     */
    public CarDiscounts() {
        this(DSL.name("car_discounts"), null);
    }

    /**
     * Create an aliased <code>rs-parking-node.car_discounts</code> table reference
     */
    public CarDiscounts(String alias) {
        this(DSL.name(alias), CAR_DISCOUNTS);
    }

    /**
     * Create an aliased <code>rs-parking-node.car_discounts</code> table reference
     */
    public CarDiscounts(Name alias) {
        this(alias, CAR_DISCOUNTS);
    }

    private CarDiscounts(Name alias, Table<CarDiscountsRecord> aliased) {
        this(alias, aliased, null);
    }

    private CarDiscounts(Name alias, Table<CarDiscountsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> CarDiscounts(Table<O> child, ForeignKey<O, CarDiscountsRecord> key) {
        super(child, key, CAR_DISCOUNTS);
    }

    @Override
    public Schema getSchema() {
        return RsParkingNode.RS_PARKING_NODE;
    }

    @Override
    public UniqueKey<CarDiscountsRecord> getPrimaryKey() {
        return Keys.KEY_CAR_DISCOUNTS_PRIMARY;
    }

    @Override
    public List<UniqueKey<CarDiscountsRecord>> getKeys() {
        return Arrays.<UniqueKey<CarDiscountsRecord>>asList(Keys.KEY_CAR_DISCOUNTS_PRIMARY);
    }

    @Override
    public List<ForeignKey<CarDiscountsRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<CarDiscountsRecord, ?>>asList(Keys.FKFDAMOSSWEVHBSWI618LH907GM, Keys.FK5RAJXUR6376964RWN362JOXIL);
    }

    public Districts districts() {
        return new Districts(this, Keys.FKFDAMOSSWEVHBSWI618LH907GM);
    }

    public VisitCouponTemplates visitCouponTemplates() {
        return new VisitCouponTemplates(this, Keys.FK5RAJXUR6376964RWN362JOXIL);
    }

    @Override
    public CarDiscounts as(String alias) {
        return new CarDiscounts(DSL.name(alias), this);
    }

    @Override
    public CarDiscounts as(Name alias) {
        return new CarDiscounts(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public CarDiscounts rename(String name) {
        return new CarDiscounts(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public CarDiscounts rename(Name name) {
        return new CarDiscounts(name, null);
    }

    // -------------------------------------------------------------------------
    // Row15 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row15<String, String, String, String, LocalDateTime, String, String, String, String, String, String, LocalDateTime, Long, Long, LocalDateTime> fieldsRow() {
        return (Row15) super.fieldsRow();
    }
}