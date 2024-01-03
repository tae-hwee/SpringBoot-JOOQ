/*
 * This file is generated by jOOQ.
 */
package generated.org.jooq.tables;


import generated.org.jooq.Keys;
import generated.org.jooq.RsParkingNode;
import generated.org.jooq.tables.records.CarImagesRecord;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row10;
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
public class CarImages extends TableImpl<CarImagesRecord> {

    private static final long serialVersionUID = 1165073995;

    /**
     * The reference instance of <code>rs-parking-node.car_images</code>
     */
    public static final CarImages CAR_IMAGES = new CarImages();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CarImagesRecord> getRecordType() {
        return CarImagesRecord.class;
    }

    /**
     * The column <code>rs-parking-node.car_images.carImageId</code>.
     */
    public final TableField<CarImagesRecord, Long> CARIMAGEID = createField(DSL.name("carImageId"), org.jooq.impl.SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>rs-parking-node.car_images.created</code>.
     */
    public final TableField<CarImagesRecord, LocalDateTime> CREATED = createField(DSL.name("created"), org.jooq.impl.SQLDataType.LOCALDATETIME.nullable(false), this, "");

    /**
     * The column <code>rs-parking-node.car_images.details</code>.
     */
    public final TableField<CarImagesRecord, String> DETAILS = createField(DSL.name("details"), org.jooq.impl.SQLDataType.CLOB.defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.CLOB)), this, "");

    /**
     * The column <code>rs-parking-node.car_images.dropped</code>.
     */
    public final TableField<CarImagesRecord, LocalDateTime> DROPPED = createField(DSL.name("dropped"), org.jooq.impl.SQLDataType.LOCALDATETIME.defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>rs-parking-node.car_images.filepath</code>.
     */
    public final TableField<CarImagesRecord, String> FILEPATH = createField(DSL.name("filepath"), org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>rs-parking-node.car_images.lpn</code>.
     */
    public final TableField<CarImagesRecord, String> LPN = createField(DSL.name("lpn"), org.jooq.impl.SQLDataType.VARCHAR(32).nullable(false), this, "");

    /**
     * The column <code>rs-parking-node.car_images.machineId</code>.
     */
    public final TableField<CarImagesRecord, Long> MACHINEID = createField(DSL.name("machineId"), org.jooq.impl.SQLDataType.BIGINT.defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>rs-parking-node.car_images.visitId</code>.
     */
    public final TableField<CarImagesRecord, Long> VISITID = createField(DSL.name("visitId"), org.jooq.impl.SQLDataType.BIGINT.defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>rs-parking-node.car_images.datetime</code>.
     */
    public final TableField<CarImagesRecord, LocalDateTime> DATETIME = createField(DSL.name("datetime"), org.jooq.impl.SQLDataType.LOCALDATETIME.defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>rs-parking-node.car_images.umid</code>.
     */
    public final TableField<CarImagesRecord, String> UMID = createField(DSL.name("umid"), org.jooq.impl.SQLDataType.CHAR(32).defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.CHAR)), this, "");

    /**
     * Create a <code>rs-parking-node.car_images</code> table reference
     */
    public CarImages() {
        this(DSL.name("car_images"), null);
    }

    /**
     * Create an aliased <code>rs-parking-node.car_images</code> table reference
     */
    public CarImages(String alias) {
        this(DSL.name(alias), CAR_IMAGES);
    }

    /**
     * Create an aliased <code>rs-parking-node.car_images</code> table reference
     */
    public CarImages(Name alias) {
        this(alias, CAR_IMAGES);
    }

    private CarImages(Name alias, Table<CarImagesRecord> aliased) {
        this(alias, aliased, null);
    }

    private CarImages(Name alias, Table<CarImagesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> CarImages(Table<O> child, ForeignKey<O, CarImagesRecord> key) {
        super(child, key, CAR_IMAGES);
    }

    @Override
    public Schema getSchema() {
        return RsParkingNode.RS_PARKING_NODE;
    }

    @Override
    public Identity<CarImagesRecord, Long> getIdentity() {
        return Keys.IDENTITY_CAR_IMAGES;
    }

    @Override
    public UniqueKey<CarImagesRecord> getPrimaryKey() {
        return Keys.KEY_CAR_IMAGES_PRIMARY;
    }

    @Override
    public List<UniqueKey<CarImagesRecord>> getKeys() {
        return Arrays.<UniqueKey<CarImagesRecord>>asList(Keys.KEY_CAR_IMAGES_PRIMARY, Keys.KEY_CAR_IMAGES_UK_S3IHOF8FV2QF4MMTNRT96SW7M);
    }

    @Override
    public List<ForeignKey<CarImagesRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<CarImagesRecord, ?>>asList(Keys.FKOWH60K8VHLDVJPSBFW2X5K1GB, Keys.FK4L4KVTQ5RV4LQEP4276OH8SGI);
    }

    public Machines machines() {
        return new Machines(this, Keys.FKOWH60K8VHLDVJPSBFW2X5K1GB);
    }

    public Visits visits() {
        return new Visits(this, Keys.FK4L4KVTQ5RV4LQEP4276OH8SGI);
    }

    @Override
    public CarImages as(String alias) {
        return new CarImages(DSL.name(alias), this);
    }

    @Override
    public CarImages as(Name alias) {
        return new CarImages(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public CarImages rename(String name) {
        return new CarImages(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public CarImages rename(Name name) {
        return new CarImages(name, null);
    }

    // -------------------------------------------------------------------------
    // Row10 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row10<Long, LocalDateTime, String, LocalDateTime, String, String, Long, Long, LocalDateTime, String> fieldsRow() {
        return (Row10) super.fieldsRow();
    }
}
