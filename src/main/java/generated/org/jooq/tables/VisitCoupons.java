/*
 * This file is generated by jOOQ.
 */
package generated.org.jooq.tables;


import generated.org.jooq.Keys;
import generated.org.jooq.RsParkingNode;
import generated.org.jooq.tables.records.VisitCouponsRecord;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
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
public class VisitCoupons extends TableImpl<VisitCouponsRecord> {

    private static final long serialVersionUID = -151518299;

    /**
     * The reference instance of <code>rs-parking-node.visit_coupons</code>
     */
    public static final VisitCoupons VISIT_COUPONS = new VisitCoupons();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<VisitCouponsRecord> getRecordType() {
        return VisitCouponsRecord.class;
    }

    /**
     * The column <code>rs-parking-node.visit_coupons.visitCouponId</code>.
     */
    public final TableField<VisitCouponsRecord, String> VISITCOUPONID = createField(DSL.name("visitCouponId"), org.jooq.impl.SQLDataType.VARCHAR(20).nullable(false), this, "");

    /**
     * The column <code>rs-parking-node.visit_coupons.amount</code>.
     */
    public final TableField<VisitCouponsRecord, BigDecimal> AMOUNT = createField(DSL.name("amount"), org.jooq.impl.SQLDataType.DECIMAL(19, 2).defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.DECIMAL)), this, "");

    /**
     * The column <code>rs-parking-node.visit_coupons.created</code>.
     */
    public final TableField<VisitCouponsRecord, LocalDateTime> CREATED = createField(DSL.name("created"), org.jooq.impl.SQLDataType.LOCALDATETIME.nullable(false), this, "");

    /**
     * The column <code>rs-parking-node.visit_coupons.minutes</code>.
     */
    public final TableField<VisitCouponsRecord, Integer> MINUTES = createField(DSL.name("minutes"), org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>rs-parking-node.visit_coupons.passable</code>.
     */
    public final TableField<VisitCouponsRecord, String> PASSABLE = createField(DSL.name("passable"), org.jooq.impl.SQLDataType.VARCHAR(1).nullable(false), this, "");

    /**
     * The column <code>rs-parking-node.visit_coupons.rate</code>.
     */
    public final TableField<VisitCouponsRecord, BigDecimal> RATE = createField(DSL.name("rate"), org.jooq.impl.SQLDataType.DECIMAL(19, 2).defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.DECIMAL)), this, "");

    /**
     * The column <code>rs-parking-node.visit_coupons.creatorId</code>.
     */
    public final TableField<VisitCouponsRecord, Long> CREATORID = createField(DSL.name("creatorId"), org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>rs-parking-node.visit_coupons.ownerId</code>.
     */
    public final TableField<VisitCouponsRecord, Long> OWNERID = createField(DSL.name("ownerId"), org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>rs-parking-node.visit_coupons.visitId</code>.
     */
    public final TableField<VisitCouponsRecord, Long> VISITID = createField(DSL.name("visitId"), org.jooq.impl.SQLDataType.BIGINT.defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>rs-parking-node.visit_coupons.code</code>.
     */
    public final TableField<VisitCouponsRecord, String> CODE = createField(DSL.name("code"), org.jooq.impl.SQLDataType.VARCHAR(16).defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>rs-parking-node.visit_coupons.barcode</code>.
     */
    public final TableField<VisitCouponsRecord, String> BARCODE = createField(DSL.name("barcode"), org.jooq.impl.SQLDataType.VARCHAR(64).defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>rs-parking-node.visit_coupons.reservedDurationEnd</code>.
     */
    public final TableField<VisitCouponsRecord, LocalDateTime> RESERVEDDURATIONEND = createField(DSL.name("reservedDurationEnd"), org.jooq.impl.SQLDataType.LOCALDATETIME.defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>rs-parking-node.visit_coupons.reservedDurationStart</code>.
     */
    public final TableField<VisitCouponsRecord, LocalDateTime> RESERVEDDURATIONSTART = createField(DSL.name("reservedDurationStart"), org.jooq.impl.SQLDataType.LOCALDATETIME.defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>rs-parking-node.visit_coupons.reservedLpn</code>.
     */
    public final TableField<VisitCouponsRecord, String> RESERVEDLPN = createField(DSL.name("reservedLpn"), org.jooq.impl.SQLDataType.VARCHAR(32).defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>rs-parking-node.visit_coupons.reservedDistrictId</code>.
     */
    public final TableField<VisitCouponsRecord, Long> RESERVEDDISTRICTID = createField(DSL.name("reservedDistrictId"), org.jooq.impl.SQLDataType.BIGINT.defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>rs-parking-node.visit_coupons.visitCouponTemplateId</code>.
     */
    public final TableField<VisitCouponsRecord, Long> VISITCOUPONTEMPLATEID = createField(DSL.name("visitCouponTemplateId"), org.jooq.impl.SQLDataType.BIGINT.defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>rs-parking-node.visit_coupons.end</code>.
     */
    public final TableField<VisitCouponsRecord, LocalDateTime> END = createField(DSL.name("end"), org.jooq.impl.SQLDataType.LOCALDATETIME.defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>rs-parking-node.visit_coupons.fixable</code>.
     */
    public final TableField<VisitCouponsRecord, String> FIXABLE = createField(DSL.name("fixable"), org.jooq.impl.SQLDataType.VARCHAR(1).defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>rs-parking-node.visit_coupons.start</code>.
     */
    public final TableField<VisitCouponsRecord, LocalDateTime> START = createField(DSL.name("start"), org.jooq.impl.SQLDataType.LOCALDATETIME.defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>rs-parking-node.visit_coupons.discountedMinutes</code>.
     */
    public final TableField<VisitCouponsRecord, Integer> DISCOUNTEDMINUTES = createField(DSL.name("discountedMinutes"), org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>rs-parking-node.visit_coupons.numberOfVehiclesFromDiscountedMinutes</code>.
     */
    public final TableField<VisitCouponsRecord, BigDecimal> NUMBEROFVEHICLESFROMDISCOUNTEDMINUTES = createField(DSL.name("numberOfVehiclesFromDiscountedMinutes"), org.jooq.impl.SQLDataType.DECIMAL(19, 2).defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.DECIMAL)), this, "");

    /**
     * The column <code>rs-parking-node.visit_coupons.oneDay</code>.
     */
    public final TableField<VisitCouponsRecord, String> ONEDAY = createField(DSL.name("oneDay"), org.jooq.impl.SQLDataType.VARCHAR(16).defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>rs-parking-node.visit_coupons.reductionDirection</code>.
     */
    public final TableField<VisitCouponsRecord, String> REDUCTIONDIRECTION = createField(DSL.name("reductionDirection"), org.jooq.impl.SQLDataType.VARCHAR(16).defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>rs-parking-node.visit_coupons.estmiatedPoints</code>.
     */
    public final TableField<VisitCouponsRecord, Integer> ESTMIATEDPOINTS = createField(DSL.name("estmiatedPoints"), org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>rs-parking-node.visit_coupons.label</code>.
     */
    public final TableField<VisitCouponsRecord, String> LABEL = createField(DSL.name("label"), org.jooq.impl.SQLDataType.VARCHAR(32).defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>rs-parking-node.visit_coupons.serviceTime</code>.
     */
    public final TableField<VisitCouponsRecord, Integer> SERVICETIME = createField(DSL.name("serviceTime"), org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>rs-parking-node.visit_coupons.valuatedAmount</code>.
     */
    public final TableField<VisitCouponsRecord, BigDecimal> VALUATEDAMOUNT = createField(DSL.name("valuatedAmount"), org.jooq.impl.SQLDataType.DECIMAL(11, 2).defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.DECIMAL)), this, "");

    /**
     * The column <code>rs-parking-node.visit_coupons.feeFixing</code>.
     */
    public final TableField<VisitCouponsRecord, BigDecimal> FEEFIXING = createField(DSL.name("feeFixing"), org.jooq.impl.SQLDataType.DECIMAL(19, 2).defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.DECIMAL)), this, "");

    /**
     * The column <code>rs-parking-node.visit_coupons.lastUpdated</code>.
     */
    public final TableField<VisitCouponsRecord, LocalDateTime> LASTUPDATED = createField(DSL.name("lastUpdated"), org.jooq.impl.SQLDataType.LOCALDATETIME.defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>rs-parking-node.visit_coupons.umid</code>.
     */
    public final TableField<VisitCouponsRecord, String> UMID = createField(DSL.name("umid"), org.jooq.impl.SQLDataType.CHAR(32).defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.CHAR)), this, "");

    /**
     * The column <code>rs-parking-node.visit_coupons.idnoa</code>.
     */
    public final TableField<VisitCouponsRecord, String> IDNOA = createField(DSL.name("idnoa"), org.jooq.impl.SQLDataType.VARCHAR(1024).defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>rs-parking-node.visit_coupons.ocr</code>.
     */
    public final TableField<VisitCouponsRecord, String> OCR = createField(DSL.name("ocr"), org.jooq.impl.SQLDataType.VARCHAR(16).defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>rs-parking-node.visit_coupons.maxFeeFixing</code>.
     */
    public final TableField<VisitCouponsRecord, BigDecimal> MAXFEEFIXING = createField(DSL.name("maxFeeFixing"), org.jooq.impl.SQLDataType.DECIMAL(19, 2).defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.DECIMAL)), this, "");

    /**
     * The column <code>rs-parking-node.visit_coupons.maxNightFeeFixing</code>.
     */
    public final TableField<VisitCouponsRecord, BigDecimal> MAXNIGHTFEEFIXING = createField(DSL.name("maxNightFeeFixing"), org.jooq.impl.SQLDataType.DECIMAL(19, 2).defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.DECIMAL)), this, "");

    /**
     * Create a <code>rs-parking-node.visit_coupons</code> table reference
     */
    public VisitCoupons() {
        this(DSL.name("visit_coupons"), null);
    }

    /**
     * Create an aliased <code>rs-parking-node.visit_coupons</code> table reference
     */
    public VisitCoupons(String alias) {
        this(DSL.name(alias), VISIT_COUPONS);
    }

    /**
     * Create an aliased <code>rs-parking-node.visit_coupons</code> table reference
     */
    public VisitCoupons(Name alias) {
        this(alias, VISIT_COUPONS);
    }

    private VisitCoupons(Name alias, Table<VisitCouponsRecord> aliased) {
        this(alias, aliased, null);
    }

    private VisitCoupons(Name alias, Table<VisitCouponsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> VisitCoupons(Table<O> child, ForeignKey<O, VisitCouponsRecord> key) {
        super(child, key, VISIT_COUPONS);
    }

    @Override
    public Schema getSchema() {
        return RsParkingNode.RS_PARKING_NODE;
    }

    @Override
    public UniqueKey<VisitCouponsRecord> getPrimaryKey() {
        return Keys.KEY_VISIT_COUPONS_PRIMARY;
    }

    @Override
    public List<UniqueKey<VisitCouponsRecord>> getKeys() {
        return Arrays.<UniqueKey<VisitCouponsRecord>>asList(Keys.KEY_VISIT_COUPONS_PRIMARY, Keys.KEY_VISIT_COUPONS_UK_ANSOXNB8298OUYTOB21QK1A5B);
    }

    @Override
    public List<ForeignKey<VisitCouponsRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<VisitCouponsRecord, ?>>asList(Keys.FKGX3T0BCOKHV5F52OJSOI5NHGG, Keys.FKMY4R7OOSJT00QJNHAX424K39V, Keys.FKRONNJ0FMVSK81J9TA9M8BUL2C, Keys.FKJ76DF88VQ0A8J1COSUV2ILQW0, Keys.FKJ0JR8MPQEA6FDLY0NL2TRSGK8);
    }

    public Members fkgx3t0bcokhv5f52ojsoi5nhgg() {
        return new Members(this, Keys.FKGX3T0BCOKHV5F52OJSOI5NHGG);
    }

    public Members fkmy4r7oosjt00qjnhax424k39v() {
        return new Members(this, Keys.FKMY4R7OOSJT00QJNHAX424K39V);
    }

    public Visits visits() {
        return new Visits(this, Keys.FKRONNJ0FMVSK81J9TA9M8BUL2C);
    }

    public Districts districts() {
        return new Districts(this, Keys.FKJ76DF88VQ0A8J1COSUV2ILQW0);
    }

    public VisitCouponTemplates visitCouponTemplates() {
        return new VisitCouponTemplates(this, Keys.FKJ0JR8MPQEA6FDLY0NL2TRSGK8);
    }

    @Override
    public VisitCoupons as(String alias) {
        return new VisitCoupons(DSL.name(alias), this);
    }

    @Override
    public VisitCoupons as(Name alias) {
        return new VisitCoupons(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public VisitCoupons rename(String name) {
        return new VisitCoupons(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public VisitCoupons rename(Name name) {
        return new VisitCoupons(name, null);
    }
}
