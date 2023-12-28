/*
 * This file is generated by jOOQ.
 */
package generated.org.jooq.tables.records;


import generated.org.jooq.tables.Videos;

import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record11;
import org.jooq.Row11;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class VideosRecord extends UpdatableRecordImpl<VideosRecord> implements Record11<Long, String, String, String, LocalDateTime, String, String, String, String, Long, Long> {

    private static final long serialVersionUID = 1162308905;

    /**
     * Setter for <code>rs-parking-node.videos.videoId</code>.
     */
    public void setVideoid(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>rs-parking-node.videos.videoId</code>.
     */
    public Long getVideoid() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>rs-parking-node.videos.code</code>.
     */
    public void setCode(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>rs-parking-node.videos.code</code>.
     */
    public String getCode() {
        return (String) get(1);
    }

    /**
     * Setter for <code>rs-parking-node.videos.data</code>.
     */
    public void setData(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>rs-parking-node.videos.data</code>.
     */
    public String getData() {
        return (String) get(2);
    }

    /**
     * Setter for <code>rs-parking-node.videos.description</code>.
     */
    public void setDescription(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>rs-parking-node.videos.description</code>.
     */
    public String getDescription() {
        return (String) get(3);
    }

    /**
     * Setter for <code>rs-parking-node.videos.dropped</code>.
     */
    public void setDropped(LocalDateTime value) {
        set(4, value);
    }

    /**
     * Getter for <code>rs-parking-node.videos.dropped</code>.
     */
    public LocalDateTime getDropped() {
        return (LocalDateTime) get(4);
    }

    /**
     * Setter for <code>rs-parking-node.videos.name</code>.
     */
    public void setName(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>rs-parking-node.videos.name</code>.
     */
    public String getName() {
        return (String) get(5);
    }

    /**
     * Setter for <code>rs-parking-node.videos.status</code>.
     */
    public void setStatus(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>rs-parking-node.videos.status</code>.
     */
    public String getStatus() {
        return (String) get(6);
    }

    /**
     * Setter for <code>rs-parking-node.videos.type</code>.
     */
    public void setType(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>rs-parking-node.videos.type</code>.
     */
    public String getType() {
        return (String) get(7);
    }

    /**
     * Setter for <code>rs-parking-node.videos.url</code>.
     */
    public void setUrl(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>rs-parking-node.videos.url</code>.
     */
    public String getUrl() {
        return (String) get(8);
    }

    /**
     * Setter for <code>rs-parking-node.videos.districtId</code>.
     */
    public void setDistrictid(Long value) {
        set(9, value);
    }

    /**
     * Getter for <code>rs-parking-node.videos.districtId</code>.
     */
    public Long getDistrictid() {
        return (Long) get(9);
    }

    /**
     * Setter for <code>rs-parking-node.videos.machineId</code>.
     */
    public void setMachineid(Long value) {
        set(10, value);
    }

    /**
     * Getter for <code>rs-parking-node.videos.machineId</code>.
     */
    public Long getMachineid() {
        return (Long) get(10);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record11 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row11<Long, String, String, String, LocalDateTime, String, String, String, String, Long, Long> fieldsRow() {
        return (Row11) super.fieldsRow();
    }

    @Override
    public Row11<Long, String, String, String, LocalDateTime, String, String, String, String, Long, Long> valuesRow() {
        return (Row11) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return Videos.VIDEOS.VIDEOID;
    }

    @Override
    public Field<String> field2() {
        return Videos.VIDEOS.CODE;
    }

    @Override
    public Field<String> field3() {
        return Videos.VIDEOS.DATA;
    }

    @Override
    public Field<String> field4() {
        return Videos.VIDEOS.DESCRIPTION;
    }

    @Override
    public Field<LocalDateTime> field5() {
        return Videos.VIDEOS.DROPPED;
    }

    @Override
    public Field<String> field6() {
        return Videos.VIDEOS.NAME;
    }

    @Override
    public Field<String> field7() {
        return Videos.VIDEOS.STATUS;
    }

    @Override
    public Field<String> field8() {
        return Videos.VIDEOS.TYPE;
    }

    @Override
    public Field<String> field9() {
        return Videos.VIDEOS.URL;
    }

    @Override
    public Field<Long> field10() {
        return Videos.VIDEOS.DISTRICTID;
    }

    @Override
    public Field<Long> field11() {
        return Videos.VIDEOS.MACHINEID;
    }

    @Override
    public Long component1() {
        return getVideoid();
    }

    @Override
    public String component2() {
        return getCode();
    }

    @Override
    public String component3() {
        return getData();
    }

    @Override
    public String component4() {
        return getDescription();
    }

    @Override
    public LocalDateTime component5() {
        return getDropped();
    }

    @Override
    public String component6() {
        return getName();
    }

    @Override
    public String component7() {
        return getStatus();
    }

    @Override
    public String component8() {
        return getType();
    }

    @Override
    public String component9() {
        return getUrl();
    }

    @Override
    public Long component10() {
        return getDistrictid();
    }

    @Override
    public Long component11() {
        return getMachineid();
    }

    @Override
    public Long value1() {
        return getVideoid();
    }

    @Override
    public String value2() {
        return getCode();
    }

    @Override
    public String value3() {
        return getData();
    }

    @Override
    public String value4() {
        return getDescription();
    }

    @Override
    public LocalDateTime value5() {
        return getDropped();
    }

    @Override
    public String value6() {
        return getName();
    }

    @Override
    public String value7() {
        return getStatus();
    }

    @Override
    public String value8() {
        return getType();
    }

    @Override
    public String value9() {
        return getUrl();
    }

    @Override
    public Long value10() {
        return getDistrictid();
    }

    @Override
    public Long value11() {
        return getMachineid();
    }

    @Override
    public VideosRecord value1(Long value) {
        setVideoid(value);
        return this;
    }

    @Override
    public VideosRecord value2(String value) {
        setCode(value);
        return this;
    }

    @Override
    public VideosRecord value3(String value) {
        setData(value);
        return this;
    }

    @Override
    public VideosRecord value4(String value) {
        setDescription(value);
        return this;
    }

    @Override
    public VideosRecord value5(LocalDateTime value) {
        setDropped(value);
        return this;
    }

    @Override
    public VideosRecord value6(String value) {
        setName(value);
        return this;
    }

    @Override
    public VideosRecord value7(String value) {
        setStatus(value);
        return this;
    }

    @Override
    public VideosRecord value8(String value) {
        setType(value);
        return this;
    }

    @Override
    public VideosRecord value9(String value) {
        setUrl(value);
        return this;
    }

    @Override
    public VideosRecord value10(Long value) {
        setDistrictid(value);
        return this;
    }

    @Override
    public VideosRecord value11(Long value) {
        setMachineid(value);
        return this;
    }

    @Override
    public VideosRecord values(Long value1, String value2, String value3, String value4, LocalDateTime value5, String value6, String value7, String value8, String value9, Long value10, Long value11) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached VideosRecord
     */
    public VideosRecord() {
        super(Videos.VIDEOS);
    }

    /**
     * Create a detached, initialised VideosRecord
     */
    public VideosRecord(Long videoid, String code, String data, String description, LocalDateTime dropped, String name, String status, String type, String url, Long districtid, Long machineid) {
        super(Videos.VIDEOS);

        set(0, videoid);
        set(1, code);
        set(2, data);
        set(3, description);
        set(4, dropped);
        set(5, name);
        set(6, status);
        set(7, type);
        set(8, url);
        set(9, districtid);
        set(10, machineid);
    }
}