/*
 * This file is generated by jOOQ.
 */
package generated.org.jooq.tables;


import generated.org.jooq.Indexes;
import generated.org.jooq.Keys;
import generated.org.jooq.RsParkingNode;
import generated.org.jooq.tables.records.VisitsRecord;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
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
public class Visits extends TableImpl<VisitsRecord> {

    private static final long serialVersionUID = 798126936;

    /**
     * The reference instance of <code>rs-parking-node.visits</code>
     */
    public static final Visits VISITS = new Visits();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<VisitsRecord> getRecordType() {
        return VisitsRecord.class;
    }

    /**
     * The column <code>rs-parking-node.visits.visitId</code>.
     */
    public final TableField<VisitsRecord, Long> VISITID = createField(DSL.name("visitId"), org.jooq.impl.SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>rs-parking-node.visits.lpn</code>.
     */
    public final TableField<VisitsRecord, String> LPN = createField(DSL.name("lpn"), org.jooq.impl.SQLDataType.VARCHAR(32).nullable(false), this, "");

    /**
     * The column <code>rs-parking-node.visits.entered</code>.
     */
    public final TableField<VisitsRecord, LocalDateTime> ENTERED = createField(DSL.name("entered"), org.jooq.impl.SQLDataType.LOCALDATETIME.nullable(false), this, "");

    /**
     * The column <code>rs-parking-node.visits.settled</code>.
     */
    public final TableField<VisitsRecord, LocalDateTime> SETTLED = createField(DSL.name("settled"), org.jooq.impl.SQLDataType.LOCALDATETIME.defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>rs-parking-node.visits.payed</code>.
     */
    public final TableField<VisitsRecord, LocalDateTime> PAYED = createField(DSL.name("payed"), org.jooq.impl.SQLDataType.LOCALDATETIME.defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>rs-parking-node.visits.leaved</code>.
     */
    public final TableField<VisitsRecord, LocalDateTime> LEAVED = createField(DSL.name("leaved"), org.jooq.impl.SQLDataType.LOCALDATETIME.defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>rs-parking-node.visits.standardFee</code>.
     */
    public final TableField<VisitsRecord, BigDecimal> STANDARDFEE = createField(DSL.name("standardFee"), org.jooq.impl.SQLDataType.DECIMAL(19, 2).defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.DECIMAL)), this, "");

    /**
     * The column <code>rs-parking-node.visits.finalFee</code>.
     */
    public final TableField<VisitsRecord, BigDecimal> FINALFEE = createField(DSL.name("finalFee"), org.jooq.impl.SQLDataType.DECIMAL(19, 2).defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.DECIMAL)), this, "");

    /**
     * The column <code>rs-parking-node.visits.payedFee</code>.
     */
    public final TableField<VisitsRecord, BigDecimal> PAYEDFEE = createField(DSL.name("payedFee"), org.jooq.impl.SQLDataType.DECIMAL(19, 2).defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.DECIMAL)), this, "");

    /**
     * The column <code>rs-parking-node.visits.payedFeeCredit</code>.
     */
    public final TableField<VisitsRecord, BigDecimal> PAYEDFEECREDIT = createField(DSL.name("payedFeeCredit"), org.jooq.impl.SQLDataType.DECIMAL(19, 2).defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.DECIMAL)), this, "");

    /**
     * The column <code>rs-parking-node.visits.payedFeeCash</code>.
     */
    public final TableField<VisitsRecord, BigDecimal> PAYEDFEECASH = createField(DSL.name("payedFeeCash"), org.jooq.impl.SQLDataType.DECIMAL(19, 2).defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.DECIMAL)), this, "");

    /**
     * The column <code>rs-parking-node.visits.payments</code>.
     */
    public final TableField<VisitsRecord, String> PAYMENTS = createField(DSL.name("payments"), org.jooq.impl.SQLDataType.CLOB.defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.CLOB)), this, "");

    /**
     * The column <code>rs-parking-node.visits.machinePayId</code>.
     */
    public final TableField<VisitsRecord, Long> MACHINEPAYID = createField(DSL.name("machinePayId"), org.jooq.impl.SQLDataType.BIGINT.defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>rs-parking-node.visits.details</code>.
     */
    public final TableField<VisitsRecord, String> DETAILS = createField(DSL.name("details"), org.jooq.impl.SQLDataType.CLOB.defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.CLOB)), this, "");

    /**
     * The column <code>rs-parking-node.visits.images</code>.
     */
    public final TableField<VisitsRecord, String> IMAGES = createField(DSL.name("images"), org.jooq.impl.SQLDataType.CLOB.defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.CLOB)), this, "");

    /**
     * The column <code>rs-parking-node.visits.chargeSegments</code>.
     */
    public final TableField<VisitsRecord, String> CHARGESEGMENTS = createField(DSL.name("chargeSegments"), org.jooq.impl.SQLDataType.CLOB.defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.CLOB)), this, "");

    /**
     * The column <code>rs-parking-node.visits.discountAppliedFee</code>.
     */
    public final TableField<VisitsRecord, BigDecimal> DISCOUNTAPPLIEDFEE = createField(DSL.name("discountAppliedFee"), org.jooq.impl.SQLDataType.DECIMAL(19, 2).defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.DECIMAL)), this, "");

    /**
     * The column <code>rs-parking-node.visits.durationalDiscountAppliedFee</code>.
     */
    public final TableField<VisitsRecord, BigDecimal> DURATIONALDISCOUNTAPPLIEDFEE = createField(DSL.name("durationalDiscountAppliedFee"), org.jooq.impl.SQLDataType.DECIMAL(19, 2).defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.DECIMAL)), this, "");

    /**
     * The column <code>rs-parking-node.visits.durationalVisitCouponAppliedFee</code>.
     */
    public final TableField<VisitsRecord, BigDecimal> DURATIONALVISITCOUPONAPPLIEDFEE = createField(DSL.name("durationalVisitCouponAppliedFee"), org.jooq.impl.SQLDataType.DECIMAL(19, 2).defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.DECIMAL)), this, "");

    /**
     * The column <code>rs-parking-node.visits.seasonTicketAppliedFee</code>.
     */
    public final TableField<VisitsRecord, BigDecimal> SEASONTICKETAPPLIEDFEE = createField(DSL.name("seasonTicketAppliedFee"), org.jooq.impl.SQLDataType.DECIMAL(19, 2).defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.DECIMAL)), this, "");

    /**
     * The column <code>rs-parking-node.visits.carSize</code>.
     */
    public final TableField<VisitsRecord, String> CARSIZE = createField(DSL.name("carSize"), org.jooq.impl.SQLDataType.VARCHAR(16).defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>rs-parking-node.visits.created</code>.
     */
    public final TableField<VisitsRecord, LocalDateTime> CREATED = createField(DSL.name("created"), org.jooq.impl.SQLDataType.LOCALDATETIME.nullable(false), this, "");

    /**
     * The column <code>rs-parking-node.visits.dropped</code>.
     */
    public final TableField<VisitsRecord, LocalDateTime> DROPPED = createField(DSL.name("dropped"), org.jooq.impl.SQLDataType.LOCALDATETIME.defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>rs-parking-node.visits.location</code>.
     */
    public final TableField<VisitsRecord, String> LOCATION = createField(DSL.name("location"), org.jooq.impl.SQLDataType.VARCHAR(16).defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>rs-parking-node.visits.districtId</code>.
     */
    public final TableField<VisitsRecord, Long> DISTRICTID = createField(DSL.name("districtId"), org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>rs-parking-node.visits.visitCouponAppliedFee</code>.
     */
    public final TableField<VisitsRecord, BigDecimal> VISITCOUPONAPPLIEDFEE = createField(DSL.name("visitCouponAppliedFee"), org.jooq.impl.SQLDataType.DECIMAL(19, 2).defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.DECIMAL)), this, "");

    /**
     * The column <code>rs-parking-node.visits.numericalDiscountAppliedFee</code>.
     */
    public final TableField<VisitsRecord, BigDecimal> NUMERICALDISCOUNTAPPLIEDFEE = createField(DSL.name("numericalDiscountAppliedFee"), org.jooq.impl.SQLDataType.DECIMAL(19, 2).defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.DECIMAL)), this, "");

    /**
     * The column <code>rs-parking-node.visits.numericalVisitCouponAppliedFee</code>.
     */
    public final TableField<VisitsRecord, BigDecimal> NUMERICALVISITCOUPONAPPLIEDFEE = createField(DSL.name("numericalVisitCouponAppliedFee"), org.jooq.impl.SQLDataType.DECIMAL(19, 2).defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.DECIMAL)), this, "");

    /**
     * The column <code>rs-parking-node.visits.machineEnterId</code>.
     */
    public final TableField<VisitsRecord, Long> MACHINEENTERID = createField(DSL.name("machineEnterId"), org.jooq.impl.SQLDataType.BIGINT.defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>rs-parking-node.visits.machineLeaveId</code>.
     */
    public final TableField<VisitsRecord, Long> MACHINELEAVEID = createField(DSL.name("machineLeaveId"), org.jooq.impl.SQLDataType.BIGINT.defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>rs-parking-node.visits.billEnd</code>.
     */
    public final TableField<VisitsRecord, LocalDateTime> BILLEND = createField(DSL.name("billEnd"), org.jooq.impl.SQLDataType.LOCALDATETIME.defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>rs-parking-node.visits.billStart</code>.
     */
    public final TableField<VisitsRecord, LocalDateTime> BILLSTART = createField(DSL.name("billStart"), org.jooq.impl.SQLDataType.LOCALDATETIME.defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>rs-parking-node.visits.setupInMinutes</code>.
     */
    public final TableField<VisitsRecord, Integer> SETUPINMINUTES = createField(DSL.name("setupInMinutes"), org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>rs-parking-node.visits.adjustFee</code>.
     */
    public final TableField<VisitsRecord, BigDecimal> ADJUSTFEE = createField(DSL.name("adjustFee"), org.jooq.impl.SQLDataType.DECIMAL(19, 2).defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.DECIMAL)), this, "");

    /**
     * The column <code>rs-parking-node.visits.calcOption</code>.
     */
    public final TableField<VisitsRecord, String> CALCOPTION = createField(DSL.name("calcOption"), org.jooq.impl.SQLDataType.VARCHAR(2048).defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>rs-parking-node.visits.chargeDeferredEnd</code>.
     */
    public final TableField<VisitsRecord, LocalDateTime> CHARGEDEFERREDEND = createField(DSL.name("chargeDeferredEnd"), org.jooq.impl.SQLDataType.LOCALDATETIME.defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>rs-parking-node.visits.chargeDeferredStart</code>.
     */
    public final TableField<VisitsRecord, LocalDateTime> CHARGEDEFERREDSTART = createField(DSL.name("chargeDeferredStart"), org.jooq.impl.SQLDataType.LOCALDATETIME.defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>rs-parking-node.visits.chargeEnd</code>.
     */
    public final TableField<VisitsRecord, LocalDateTime> CHARGEEND = createField(DSL.name("chargeEnd"), org.jooq.impl.SQLDataType.LOCALDATETIME.defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>rs-parking-node.visits.chargeStart</code>.
     */
    public final TableField<VisitsRecord, LocalDateTime> CHARGESTART = createField(DSL.name("chargeStart"), org.jooq.impl.SQLDataType.LOCALDATETIME.defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>rs-parking-node.visits.chargeExecutionPlans</code>.
     */
    public final TableField<VisitsRecord, String> CHARGEEXECUTIONPLANS = createField(DSL.name("chargeExecutionPlans"), org.jooq.impl.SQLDataType.CLOB.defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.CLOB)), this, "");

    /**
     * The column <code>rs-parking-node.visits.chargeFreeEnd</code>.
     */
    public final TableField<VisitsRecord, LocalDateTime> CHARGEFREEEND = createField(DSL.name("chargeFreeEnd"), org.jooq.impl.SQLDataType.LOCALDATETIME.defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>rs-parking-node.visits.chargeFreeStart</code>.
     */
    public final TableField<VisitsRecord, LocalDateTime> CHARGEFREESTART = createField(DSL.name("chargeFreeStart"), org.jooq.impl.SQLDataType.LOCALDATETIME.defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>rs-parking-node.visits.cutOff</code>.
     */
    public final TableField<VisitsRecord, String> CUTOFF = createField(DSL.name("cutOff"), org.jooq.impl.SQLDataType.VARCHAR(16).defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>rs-parking-node.visits.lineUnit</code>.
     */
    public final TableField<VisitsRecord, String> LINEUNIT = createField(DSL.name("lineUnit"), org.jooq.impl.SQLDataType.VARCHAR(16).defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>rs-parking-node.visits.maxFeePerLine</code>.
     */
    public final TableField<VisitsRecord, BigDecimal> MAXFEEPERLINE = createField(DSL.name("maxFeePerLine"), org.jooq.impl.SQLDataType.DECIMAL(19, 2).defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.DECIMAL)), this, "");

    /**
     * The column <code>rs-parking-node.visits.reductionDirection</code>.
     */
    public final TableField<VisitsRecord, String> REDUCTIONDIRECTION = createField(DSL.name("reductionDirection"), org.jooq.impl.SQLDataType.VARCHAR(16).defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>rs-parking-node.visits.seasonTickets</code>.
     */
    public final TableField<VisitsRecord, String> SEASONTICKETS = createField(DSL.name("seasonTickets"), org.jooq.impl.SQLDataType.VARCHAR(128).defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>rs-parking-node.visits.settledFee</code>.
     */
    public final TableField<VisitsRecord, BigDecimal> SETTLEDFEE = createField(DSL.name("settledFee"), org.jooq.impl.SQLDataType.DECIMAL(19, 2).defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.DECIMAL)), this, "");

    /**
     * The column <code>rs-parking-node.visits.lastChecked</code>.
     */
    public final TableField<VisitsRecord, LocalDateTime> LASTCHECKED = createField(DSL.name("lastChecked"), org.jooq.impl.SQLDataType.LOCALDATETIME.defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>rs-parking-node.visits.seasonal</code>.
     */
    public final TableField<VisitsRecord, String> SEASONAL = createField(DSL.name("seasonal"), org.jooq.impl.SQLDataType.VARCHAR(32).defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>rs-parking-node.visits.machineSettleId</code>.
     */
    public final TableField<VisitsRecord, Long> MACHINESETTLEID = createField(DSL.name("machineSettleId"), org.jooq.impl.SQLDataType.BIGINT.defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>rs-parking-node.visits.apiLogs</code>.
     */
    public final TableField<VisitsRecord, String> APILOGS = createField(DSL.name("apiLogs"), org.jooq.impl.SQLDataType.CLOB.defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.CLOB)), this, "");

    /**
     * The column <code>rs-parking-node.visits.seasonTicketId</code>.
     */
    public final TableField<VisitsRecord, String> SEASONTICKETID = createField(DSL.name("seasonTicketId"), org.jooq.impl.SQLDataType.VARCHAR(20).defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>rs-parking-node.visits.prevVisitId</code>.
     */
    public final TableField<VisitsRecord, Long> PREVVISITID = createField(DSL.name("prevVisitId"), org.jooq.impl.SQLDataType.BIGINT.defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>rs-parking-node.visits.originalFee</code>.
     */
    public final TableField<VisitsRecord, BigDecimal> ORIGINALFEE = createField(DSL.name("originalFee"), org.jooq.impl.SQLDataType.DECIMAL(19, 2).defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.DECIMAL)), this, "");

    /**
     * The column <code>rs-parking-node.visits.paymentType</code>.
     */
    public final TableField<VisitsRecord, String> PAYMENTTYPE = createField(DSL.name("paymentType"), org.jooq.impl.SQLDataType.VARCHAR(16).defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>rs-parking-node.visits.status</code>.
     */
    public final TableField<VisitsRecord, String> STATUS = createField(DSL.name("status"), org.jooq.impl.SQLDataType.VARCHAR(16).defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>rs-parking-node.visits.lpn4</code>.
     */
    public final TableField<VisitsRecord, String> LPN4 = createField(DSL.name("lpn4"), org.jooq.impl.SQLDataType.VARCHAR(4).defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>rs-parking-node.visits.exitChargeFree</code>.
     */
    public final TableField<VisitsRecord, String> EXITCHARGEFREE = createField(DSL.name("exitChargeFree"), org.jooq.impl.SQLDataType.CLOB.defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.CLOB)), this, "");

    /**
     * The column <code>rs-parking-node.visits.surchargeFee</code>.
     */
    public final TableField<VisitsRecord, BigDecimal> SURCHARGEFEE = createField(DSL.name("surchargeFee"), org.jooq.impl.SQLDataType.DECIMAL(19, 2).defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.DECIMAL)), this, "");

    /**
     * The column <code>rs-parking-node.visits.districtDiscountId</code>.
     */
    public final TableField<VisitsRecord, Long> DISTRICTDISCOUNTID = createField(DSL.name("districtDiscountId"), org.jooq.impl.SQLDataType.BIGINT.defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>rs-parking-node.visits.report</code>.
     */
    public final TableField<VisitsRecord, String> REPORT = createField(DSL.name("report"), org.jooq.impl.SQLDataType.CLOB.defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.CLOB)), this, "");

    /**
     * The column <code>rs-parking-node.visits.category</code>.
     */
    public final TableField<VisitsRecord, String> CATEGORY = createField(DSL.name("category"), org.jooq.impl.SQLDataType.VARCHAR(32).defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>rs-parking-node.visits.kakaoTid</code>.
     */
    public final TableField<VisitsRecord, String> KAKAOTID = createField(DSL.name("kakaoTid"), org.jooq.impl.SQLDataType.VARCHAR(32).defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>rs-parking-node.visits.memo</code>.
     */
    public final TableField<VisitsRecord, String> MEMO = createField(DSL.name("memo"), org.jooq.impl.SQLDataType.VARCHAR(2048).defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>rs-parking-node.visits.masterChargePlanId</code>.
     */
    public final TableField<VisitsRecord, Long> MASTERCHARGEPLANID = createField(DSL.name("masterChargePlanId"), org.jooq.impl.SQLDataType.BIGINT.defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>rs-parking-node.visits.lastUpdated</code>.
     */
    public final TableField<VisitsRecord, LocalDateTime> LASTUPDATED = createField(DSL.name("lastUpdated"), org.jooq.impl.SQLDataType.LOCALDATETIME.defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>rs-parking-node.visits.umid</code>.
     */
    public final TableField<VisitsRecord, String> UMID = createField(DSL.name("umid"), org.jooq.impl.SQLDataType.CHAR(32).defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.CHAR)), this, "");

    /**
     * The column <code>rs-parking-node.visits.unseasonalFee</code>.
     */
    public final TableField<VisitsRecord, BigDecimal> UNSEASONALFEE = createField(DSL.name("unseasonalFee"), org.jooq.impl.SQLDataType.DECIMAL(19, 2).defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.DECIMAL)), this, "");

    /**
     * Create a <code>rs-parking-node.visits</code> table reference
     */
    public Visits() {
        this(DSL.name("visits"), null);
    }

    /**
     * Create an aliased <code>rs-parking-node.visits</code> table reference
     */
    public Visits(String alias) {
        this(DSL.name(alias), VISITS);
    }

    /**
     * Create an aliased <code>rs-parking-node.visits</code> table reference
     */
    public Visits(Name alias) {
        this(alias, VISITS);
    }

    private Visits(Name alias, Table<VisitsRecord> aliased) {
        this(alias, aliased, null);
    }

    private Visits(Name alias, Table<VisitsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> Visits(Table<O> child, ForeignKey<O, VisitsRecord> key) {
        super(child, key, VISITS);
    }

    @Override
    public Schema getSchema() {
        return RsParkingNode.RS_PARKING_NODE;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.VISITS_INDEX_ENTERED, Indexes.VISITS_INDEX_LEAVED, Indexes.VISITS_INDEX_LPN, Indexes.VISITS_INDEX_LPN4, Indexes.VISITS_VISIT_INDEX);
    }

    @Override
    public Identity<VisitsRecord, Long> getIdentity() {
        return Keys.IDENTITY_VISITS;
    }

    @Override
    public UniqueKey<VisitsRecord> getPrimaryKey() {
        return Keys.KEY_VISITS_PRIMARY;
    }

    @Override
    public List<UniqueKey<VisitsRecord>> getKeys() {
        return Arrays.<UniqueKey<VisitsRecord>>asList(Keys.KEY_VISITS_PRIMARY, Keys.KEY_VISITS_UK_4K7VQ25UHYMDQQN4T1F0B76K0);
    }

    @Override
    public List<ForeignKey<VisitsRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<VisitsRecord, ?>>asList(Keys.FK7BWEUOPSE81XI853HDPULP0HV, Keys.FKH7PE71TH2FQAGGA83SYUJ8EUC, Keys.FK40DGHCW4Y20WKHW7Q8RMR2X4S, Keys.FK5EF7YCN98CKG3YJMWD2R644M1, Keys.FK5G6AD2V9LVK2EBIV7OT4I30VB, Keys.FKKPOSY5WA4RRKX5PLU1D4PRIST, Keys.FKG8D7ROIGLJDAJ5860H740AARF, Keys.FKN4RCAL24EI50O8EDXIRUPNBPT, Keys.FKBXTGN0MCD1AYUVS9IE502A3N0);
    }

    public Machines fk7bweuopse81xi853hdpulp0hv() {
        return new Machines(this, Keys.FK7BWEUOPSE81XI853HDPULP0HV);
    }

    public Districts districts() {
        return new Districts(this, Keys.FKH7PE71TH2FQAGGA83SYUJ8EUC);
    }

    public Machines fk40dghcw4y20wkhw7q8rmr2x4s() {
        return new Machines(this, Keys.FK40DGHCW4Y20WKHW7Q8RMR2X4S);
    }

    public Machines fk5ef7ycn98ckg3yjmwd2r644m1() {
        return new Machines(this, Keys.FK5EF7YCN98CKG3YJMWD2R644M1);
    }

    public Machines fk5g6ad2v9lvk2ebiv7ot4i30vb() {
        return new Machines(this, Keys.FK5G6AD2V9LVK2EBIV7OT4I30VB);
    }

    public SeasonTickets seasonTickets() {
        return new SeasonTickets(this, Keys.FKKPOSY5WA4RRKX5PLU1D4PRIST);
    }

    public Visits visits() {
        return new Visits(this, Keys.FKG8D7ROIGLJDAJ5860H740AARF);
    }

    public DistrictDiscounts districtDiscounts() {
        return new DistrictDiscounts(this, Keys.FKN4RCAL24EI50O8EDXIRUPNBPT);
    }

    public MasterChargePlans masterChargePlans() {
        return new MasterChargePlans(this, Keys.FKBXTGN0MCD1AYUVS9IE502A3N0);
    }

    @Override
    public Visits as(String alias) {
        return new Visits(DSL.name(alias), this);
    }

    @Override
    public Visits as(Name alias) {
        return new Visits(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Visits rename(String name) {
        return new Visits(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Visits rename(Name name) {
        return new Visits(name, null);
    }
}