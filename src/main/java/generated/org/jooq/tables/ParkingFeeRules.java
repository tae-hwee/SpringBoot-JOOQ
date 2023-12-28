/*
 * This file is generated by jOOQ.
 */
package generated.org.jooq.tables;


import generated.org.jooq.Keys;
import generated.org.jooq.RsParkingNode;
import generated.org.jooq.tables.records.ParkingFeeRulesRecord;

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
public class ParkingFeeRules extends TableImpl<ParkingFeeRulesRecord> {

    private static final long serialVersionUID = 1738780749;

    /**
     * The reference instance of <code>rs-parking-node.parking_fee_rules</code>
     */
    public static final ParkingFeeRules PARKING_FEE_RULES = new ParkingFeeRules();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ParkingFeeRulesRecord> getRecordType() {
        return ParkingFeeRulesRecord.class;
    }

    /**
     * The column <code>rs-parking-node.parking_fee_rules.id</code>.
     */
    public final TableField<ParkingFeeRulesRecord, String> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.CHAR(32).nullable(false), this, "");

    /**
     * The column <code>rs-parking-node.parking_fee_rules.activated</code>.
     */
    public final TableField<ParkingFeeRulesRecord, String> ACTIVATED = createField(DSL.name("activated"), org.jooq.impl.SQLDataType.CHAR(1).defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.CHAR)), this, "");

    /**
     * The column <code>rs-parking-node.parking_fee_rules.applyEnd</code>.
     */
    public final TableField<ParkingFeeRulesRecord, LocalDateTime> APPLYEND = createField(DSL.name("applyEnd"), org.jooq.impl.SQLDataType.LOCALDATETIME.defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>rs-parking-node.parking_fee_rules.applyStart</code>.
     */
    public final TableField<ParkingFeeRulesRecord, LocalDateTime> APPLYSTART = createField(DSL.name("applyStart"), org.jooq.impl.SQLDataType.LOCALDATETIME.defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>rs-parking-node.parking_fee_rules.category</code>.
     */
    public final TableField<ParkingFeeRulesRecord, String> CATEGORY = createField(DSL.name("category"), org.jooq.impl.SQLDataType.VARCHAR(32).defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>rs-parking-node.parking_fee_rules.chargeDeferredInMinutes</code>.
     */
    public final TableField<ParkingFeeRulesRecord, Integer> CHARGEDEFERREDINMINUTES = createField(DSL.name("chargeDeferredInMinutes"), org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>rs-parking-node.parking_fee_rules.chargeFreeInMinutes</code>.
     */
    public final TableField<ParkingFeeRulesRecord, Integer> CHARGEFREEINMINUTES = createField(DSL.name("chargeFreeInMinutes"), org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>rs-parking-node.parking_fee_rules.created</code>.
     */
    public final TableField<ParkingFeeRulesRecord, LocalDateTime> CREATED = createField(DSL.name("created"), org.jooq.impl.SQLDataType.LOCALDATETIME.nullable(false), this, "");

    /**
     * The column <code>rs-parking-node.parking_fee_rules.cutOff</code>.
     */
    public final TableField<ParkingFeeRulesRecord, String> CUTOFF = createField(DSL.name("cutOff"), org.jooq.impl.SQLDataType.VARCHAR(16).nullable(false), this, "");

    /**
     * The column <code>rs-parking-node.parking_fee_rules.details</code>.
     */
    public final TableField<ParkingFeeRulesRecord, String> DETAILS = createField(DSL.name("details"), org.jooq.impl.SQLDataType.CLOB.defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.CLOB)), this, "");

    /**
     * The column <code>rs-parking-node.parking_fee_rules.dropped</code>.
     */
    public final TableField<ParkingFeeRulesRecord, LocalDateTime> DROPPED = createField(DSL.name("dropped"), org.jooq.impl.SQLDataType.LOCALDATETIME.defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>rs-parking-node.parking_fee_rules.graceInMinutes</code>.
     */
    public final TableField<ParkingFeeRulesRecord, Integer> GRACEINMINUTES = createField(DSL.name("graceInMinutes"), org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>rs-parking-node.parking_fee_rules.maxFeePerFriLine</code>.
     */
    public final TableField<ParkingFeeRulesRecord, BigDecimal> MAXFEEPERFRILINE = createField(DSL.name("maxFeePerFriLine"), org.jooq.impl.SQLDataType.DECIMAL(19, 2).defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.DECIMAL)), this, "");

    /**
     * The column <code>rs-parking-node.parking_fee_rules.maxFeePerLine</code>.
     */
    public final TableField<ParkingFeeRulesRecord, BigDecimal> MAXFEEPERLINE = createField(DSL.name("maxFeePerLine"), org.jooq.impl.SQLDataType.DECIMAL(19, 2).defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.DECIMAL)), this, "");

    /**
     * The column <code>rs-parking-node.parking_fee_rules.maxFeePerMonLine</code>.
     */
    public final TableField<ParkingFeeRulesRecord, BigDecimal> MAXFEEPERMONLINE = createField(DSL.name("maxFeePerMonLine"), org.jooq.impl.SQLDataType.DECIMAL(19, 2).defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.DECIMAL)), this, "");

    /**
     * The column <code>rs-parking-node.parking_fee_rules.maxFeePerSatLine</code>.
     */
    public final TableField<ParkingFeeRulesRecord, BigDecimal> MAXFEEPERSATLINE = createField(DSL.name("maxFeePerSatLine"), org.jooq.impl.SQLDataType.DECIMAL(19, 2).defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.DECIMAL)), this, "");

    /**
     * The column <code>rs-parking-node.parking_fee_rules.maxFeePerSunLine</code>.
     */
    public final TableField<ParkingFeeRulesRecord, BigDecimal> MAXFEEPERSUNLINE = createField(DSL.name("maxFeePerSunLine"), org.jooq.impl.SQLDataType.DECIMAL(19, 2).defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.DECIMAL)), this, "");

    /**
     * The column <code>rs-parking-node.parking_fee_rules.maxFeePerThuLine</code>.
     */
    public final TableField<ParkingFeeRulesRecord, BigDecimal> MAXFEEPERTHULINE = createField(DSL.name("maxFeePerThuLine"), org.jooq.impl.SQLDataType.DECIMAL(19, 2).defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.DECIMAL)), this, "");

    /**
     * The column <code>rs-parking-node.parking_fee_rules.maxFeePerTueLine</code>.
     */
    public final TableField<ParkingFeeRulesRecord, BigDecimal> MAXFEEPERTUELINE = createField(DSL.name("maxFeePerTueLine"), org.jooq.impl.SQLDataType.DECIMAL(19, 2).defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.DECIMAL)), this, "");

    /**
     * The column <code>rs-parking-node.parking_fee_rules.maxFeePerWedLine</code>.
     */
    public final TableField<ParkingFeeRulesRecord, BigDecimal> MAXFEEPERWEDLINE = createField(DSL.name("maxFeePerWedLine"), org.jooq.impl.SQLDataType.DECIMAL(19, 2).defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.DECIMAL)), this, "");

    /**
     * The column <code>rs-parking-node.parking_fee_rules.name</code>.
     */
    public final TableField<ParkingFeeRulesRecord, String> NAME = createField(DSL.name("name"), org.jooq.impl.SQLDataType.VARCHAR(32).nullable(false), this, "");

    /**
     * The column <code>rs-parking-node.parking_fee_rules.offTimeExit</code>.
     */
    public final TableField<ParkingFeeRulesRecord, String> OFFTIMEEXIT = createField(DSL.name("offTimeExit"), org.jooq.impl.SQLDataType.VARCHAR(16).nullable(false), this, "");

    /**
     * The column <code>rs-parking-node.parking_fee_rules.priority</code>.
     */
    public final TableField<ParkingFeeRulesRecord, Integer> PRIORITY = createField(DSL.name("priority"), org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>rs-parking-node.parking_fee_rules.weeklyFeeRules</code>.
     */
    public final TableField<ParkingFeeRulesRecord, String> WEEKLYFEERULES = createField(DSL.name("weeklyFeeRules"), org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>rs-parking-node.parking_fee_rules.creatorId</code>.
     */
    public final TableField<ParkingFeeRulesRecord, Long> CREATORID = createField(DSL.name("creatorId"), org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>rs-parking-node.parking_fee_rules.districtId</code>.
     */
    public final TableField<ParkingFeeRulesRecord, Long> DISTRICTID = createField(DSL.name("districtId"), org.jooq.impl.SQLDataType.BIGINT.defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>rs-parking-node.parking_fee_rules.dropperId</code>.
     */
    public final TableField<ParkingFeeRulesRecord, Long> DROPPERID = createField(DSL.name("dropperId"), org.jooq.impl.SQLDataType.BIGINT.defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>rs-parking-node.parking_fee_rules.enterMachineId</code>.
     */
    public final TableField<ParkingFeeRulesRecord, Long> ENTERMACHINEID = createField(DSL.name("enterMachineId"), org.jooq.impl.SQLDataType.BIGINT.defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>rs-parking-node.parking_fee_rules.leaveMachineId</code>.
     */
    public final TableField<ParkingFeeRulesRecord, Long> LEAVEMACHINEID = createField(DSL.name("leaveMachineId"), org.jooq.impl.SQLDataType.BIGINT.defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>rs-parking-node.parking_fee_rules.visitCouponTemplateId</code>.
     */
    public final TableField<ParkingFeeRulesRecord, Long> VISITCOUPONTEMPLATEID = createField(DSL.name("visitCouponTemplateId"), org.jooq.impl.SQLDataType.BIGINT.defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>rs-parking-node.parking_fee_rules.maxFeePerFriLineNight</code>.
     */
    public final TableField<ParkingFeeRulesRecord, BigDecimal> MAXFEEPERFRILINENIGHT = createField(DSL.name("maxFeePerFriLineNight"), org.jooq.impl.SQLDataType.DECIMAL(19, 2).defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.DECIMAL)), this, "");

    /**
     * The column <code>rs-parking-node.parking_fee_rules.maxFeePerSatLineNight</code>.
     */
    public final TableField<ParkingFeeRulesRecord, BigDecimal> MAXFEEPERSATLINENIGHT = createField(DSL.name("maxFeePerSatLineNight"), org.jooq.impl.SQLDataType.DECIMAL(19, 2).defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.DECIMAL)), this, "");

    /**
     * The column <code>rs-parking-node.parking_fee_rules.maxFeePerSunLineNight</code>.
     */
    public final TableField<ParkingFeeRulesRecord, BigDecimal> MAXFEEPERSUNLINENIGHT = createField(DSL.name("maxFeePerSunLineNight"), org.jooq.impl.SQLDataType.DECIMAL(19, 2).defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.DECIMAL)), this, "");

    /**
     * The column <code>rs-parking-node.parking_fee_rules.maxFeePerThuLineNight</code>.
     */
    public final TableField<ParkingFeeRulesRecord, BigDecimal> MAXFEEPERTHULINENIGHT = createField(DSL.name("maxFeePerThuLineNight"), org.jooq.impl.SQLDataType.DECIMAL(19, 2).defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.DECIMAL)), this, "");

    /**
     * The column <code>rs-parking-node.parking_fee_rules.maxFeePerTueLineNight</code>.
     */
    public final TableField<ParkingFeeRulesRecord, BigDecimal> MAXFEEPERTUELINENIGHT = createField(DSL.name("maxFeePerTueLineNight"), org.jooq.impl.SQLDataType.DECIMAL(19, 2).defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.DECIMAL)), this, "");

    /**
     * The column <code>rs-parking-node.parking_fee_rules.maxFeePerWedLineNight</code>.
     */
    public final TableField<ParkingFeeRulesRecord, BigDecimal> MAXFEEPERWEDLINENIGHT = createField(DSL.name("maxFeePerWedLineNight"), org.jooq.impl.SQLDataType.DECIMAL(19, 2).defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.DECIMAL)), this, "");

    /**
     * The column <code>rs-parking-node.parking_fee_rules.dailyAccumulateFeeAllowed</code>.
     */
    public final TableField<ParkingFeeRulesRecord, String> DAILYACCUMULATEFEEALLOWED = createField(DSL.name("dailyAccumulateFeeAllowed"), org.jooq.impl.SQLDataType.VARCHAR(1).defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>rs-parking-node.parking_fee_rules.maxDailyAccumulateFee</code>.
     */
    public final TableField<ParkingFeeRulesRecord, BigDecimal> MAXDAILYACCUMULATEFEE = createField(DSL.name("maxDailyAccumulateFee"), org.jooq.impl.SQLDataType.DECIMAL(19, 2).defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.DECIMAL)), this, "");

    /**
     * The column <code>rs-parking-node.parking_fee_rules.shortPassFee</code>.
     */
    public final TableField<ParkingFeeRulesRecord, BigDecimal> SHORTPASSFEE = createField(DSL.name("shortPassFee"), org.jooq.impl.SQLDataType.DECIMAL(19, 2).defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.DECIMAL)), this, "");

    /**
     * The column <code>rs-parking-node.parking_fee_rules.shortPassLimit</code>.
     */
    public final TableField<ParkingFeeRulesRecord, Integer> SHORTPASSLIMIT = createField(DSL.name("shortPassLimit"), org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * Create a <code>rs-parking-node.parking_fee_rules</code> table reference
     */
    public ParkingFeeRules() {
        this(DSL.name("parking_fee_rules"), null);
    }

    /**
     * Create an aliased <code>rs-parking-node.parking_fee_rules</code> table reference
     */
    public ParkingFeeRules(String alias) {
        this(DSL.name(alias), PARKING_FEE_RULES);
    }

    /**
     * Create an aliased <code>rs-parking-node.parking_fee_rules</code> table reference
     */
    public ParkingFeeRules(Name alias) {
        this(alias, PARKING_FEE_RULES);
    }

    private ParkingFeeRules(Name alias, Table<ParkingFeeRulesRecord> aliased) {
        this(alias, aliased, null);
    }

    private ParkingFeeRules(Name alias, Table<ParkingFeeRulesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> ParkingFeeRules(Table<O> child, ForeignKey<O, ParkingFeeRulesRecord> key) {
        super(child, key, PARKING_FEE_RULES);
    }

    @Override
    public Schema getSchema() {
        return RsParkingNode.RS_PARKING_NODE;
    }

    @Override
    public UniqueKey<ParkingFeeRulesRecord> getPrimaryKey() {
        return Keys.KEY_PARKING_FEE_RULES_PRIMARY;
    }

    @Override
    public List<UniqueKey<ParkingFeeRulesRecord>> getKeys() {
        return Arrays.<UniqueKey<ParkingFeeRulesRecord>>asList(Keys.KEY_PARKING_FEE_RULES_PRIMARY);
    }

    @Override
    public List<ForeignKey<ParkingFeeRulesRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<ParkingFeeRulesRecord, ?>>asList(Keys.FKO921A5PWX9GXRSX5MSJ0WCDCP, Keys.FK14LGLRHT6CB6EE2301U0FT7HW, Keys.FKDQN7GC8PDHBW8UR0DYA4I3KTT, Keys.FKFJLK5H7QATK369082UKCY500T, Keys.FKHXC6PXBW9C9UM14JGDKYS1W0X, Keys.FKDA55TXIQGHFRD4CVA9F7J3FR3);
    }

    public Members fko921a5pwx9gxrsx5msj0wcdcp() {
        return new Members(this, Keys.FKO921A5PWX9GXRSX5MSJ0WCDCP);
    }

    public Districts districts() {
        return new Districts(this, Keys.FK14LGLRHT6CB6EE2301U0FT7HW);
    }

    public Members fkdqn7gc8pdhbw8ur0dya4i3ktt() {
        return new Members(this, Keys.FKDQN7GC8PDHBW8UR0DYA4I3KTT);
    }

    public Machines fkfjlk5h7qatk369082ukcy500t() {
        return new Machines(this, Keys.FKFJLK5H7QATK369082UKCY500T);
    }

    public Machines fkhxc6pxbw9c9um14jgdkys1w0x() {
        return new Machines(this, Keys.FKHXC6PXBW9C9UM14JGDKYS1W0X);
    }

    public VisitCouponTemplates visitCouponTemplates() {
        return new VisitCouponTemplates(this, Keys.FKDA55TXIQGHFRD4CVA9F7J3FR3);
    }

    @Override
    public ParkingFeeRules as(String alias) {
        return new ParkingFeeRules(DSL.name(alias), this);
    }

    @Override
    public ParkingFeeRules as(Name alias) {
        return new ParkingFeeRules(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ParkingFeeRules rename(String name) {
        return new ParkingFeeRules(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ParkingFeeRules rename(Name name) {
        return new ParkingFeeRules(name, null);
    }
}