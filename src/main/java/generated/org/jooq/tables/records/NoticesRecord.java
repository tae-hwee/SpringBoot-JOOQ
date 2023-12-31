/*
 * This file is generated by jOOQ.
 */
package generated.org.jooq.tables.records;


import generated.org.jooq.tables.Notices;

import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record9;
import org.jooq.Row9;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class NoticesRecord extends UpdatableRecordImpl<NoticesRecord> implements Record9<Long, String, LocalDateTime, LocalDateTime, String, Long, LocalDateTime, String, Long> {

    private static final long serialVersionUID = 235353293;

    /**
     * Setter for <code>rs-parking-node.notices.noticeId</code>.
     */
    public void setNoticeid(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>rs-parking-node.notices.noticeId</code>.
     */
    public Long getNoticeid() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>rs-parking-node.notices.contents</code>.
     */
    public void setContents(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>rs-parking-node.notices.contents</code>.
     */
    public String getContents() {
        return (String) get(1);
    }

    /**
     * Setter for <code>rs-parking-node.notices.created</code>.
     */
    public void setCreated(LocalDateTime value) {
        set(2, value);
    }

    /**
     * Getter for <code>rs-parking-node.notices.created</code>.
     */
    public LocalDateTime getCreated() {
        return (LocalDateTime) get(2);
    }

    /**
     * Setter for <code>rs-parking-node.notices.end</code>.
     */
    public void setEnd(LocalDateTime value) {
        set(3, value);
    }

    /**
     * Getter for <code>rs-parking-node.notices.end</code>.
     */
    public LocalDateTime getEnd() {
        return (LocalDateTime) get(3);
    }

    /**
     * Setter for <code>rs-parking-node.notices.hidden</code>.
     */
    public void setHidden(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>rs-parking-node.notices.hidden</code>.
     */
    public String getHidden() {
        return (String) get(4);
    }

    /**
     * Setter for <code>rs-parking-node.notices.priority</code>.
     */
    public void setPriority(Long value) {
        set(5, value);
    }

    /**
     * Getter for <code>rs-parking-node.notices.priority</code>.
     */
    public Long getPriority() {
        return (Long) get(5);
    }

    /**
     * Setter for <code>rs-parking-node.notices.start</code>.
     */
    public void setStart(LocalDateTime value) {
        set(6, value);
    }

    /**
     * Getter for <code>rs-parking-node.notices.start</code>.
     */
    public LocalDateTime getStart() {
        return (LocalDateTime) get(6);
    }

    /**
     * Setter for <code>rs-parking-node.notices.title</code>.
     */
    public void setTitle(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>rs-parking-node.notices.title</code>.
     */
    public String getTitle() {
        return (String) get(7);
    }

    /**
     * Setter for <code>rs-parking-node.notices.creatorId</code>.
     */
    public void setCreatorid(Long value) {
        set(8, value);
    }

    /**
     * Getter for <code>rs-parking-node.notices.creatorId</code>.
     */
    public Long getCreatorid() {
        return (Long) get(8);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record9 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row9<Long, String, LocalDateTime, LocalDateTime, String, Long, LocalDateTime, String, Long> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    @Override
    public Row9<Long, String, LocalDateTime, LocalDateTime, String, Long, LocalDateTime, String, Long> valuesRow() {
        return (Row9) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return Notices.NOTICES.NOTICEID;
    }

    @Override
    public Field<String> field2() {
        return Notices.NOTICES.CONTENTS;
    }

    @Override
    public Field<LocalDateTime> field3() {
        return Notices.NOTICES.CREATED;
    }

    @Override
    public Field<LocalDateTime> field4() {
        return Notices.NOTICES.END;
    }

    @Override
    public Field<String> field5() {
        return Notices.NOTICES.HIDDEN;
    }

    @Override
    public Field<Long> field6() {
        return Notices.NOTICES.PRIORITY;
    }

    @Override
    public Field<LocalDateTime> field7() {
        return Notices.NOTICES.START;
    }

    @Override
    public Field<String> field8() {
        return Notices.NOTICES.TITLE;
    }

    @Override
    public Field<Long> field9() {
        return Notices.NOTICES.CREATORID;
    }

    @Override
    public Long component1() {
        return getNoticeid();
    }

    @Override
    public String component2() {
        return getContents();
    }

    @Override
    public LocalDateTime component3() {
        return getCreated();
    }

    @Override
    public LocalDateTime component4() {
        return getEnd();
    }

    @Override
    public String component5() {
        return getHidden();
    }

    @Override
    public Long component6() {
        return getPriority();
    }

    @Override
    public LocalDateTime component7() {
        return getStart();
    }

    @Override
    public String component8() {
        return getTitle();
    }

    @Override
    public Long component9() {
        return getCreatorid();
    }

    @Override
    public Long value1() {
        return getNoticeid();
    }

    @Override
    public String value2() {
        return getContents();
    }

    @Override
    public LocalDateTime value3() {
        return getCreated();
    }

    @Override
    public LocalDateTime value4() {
        return getEnd();
    }

    @Override
    public String value5() {
        return getHidden();
    }

    @Override
    public Long value6() {
        return getPriority();
    }

    @Override
    public LocalDateTime value7() {
        return getStart();
    }

    @Override
    public String value8() {
        return getTitle();
    }

    @Override
    public Long value9() {
        return getCreatorid();
    }

    @Override
    public NoticesRecord value1(Long value) {
        setNoticeid(value);
        return this;
    }

    @Override
    public NoticesRecord value2(String value) {
        setContents(value);
        return this;
    }

    @Override
    public NoticesRecord value3(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public NoticesRecord value4(LocalDateTime value) {
        setEnd(value);
        return this;
    }

    @Override
    public NoticesRecord value5(String value) {
        setHidden(value);
        return this;
    }

    @Override
    public NoticesRecord value6(Long value) {
        setPriority(value);
        return this;
    }

    @Override
    public NoticesRecord value7(LocalDateTime value) {
        setStart(value);
        return this;
    }

    @Override
    public NoticesRecord value8(String value) {
        setTitle(value);
        return this;
    }

    @Override
    public NoticesRecord value9(Long value) {
        setCreatorid(value);
        return this;
    }

    @Override
    public NoticesRecord values(Long value1, String value2, LocalDateTime value3, LocalDateTime value4, String value5, Long value6, LocalDateTime value7, String value8, Long value9) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached NoticesRecord
     */
    public NoticesRecord() {
        super(Notices.NOTICES);
    }

    /**
     * Create a detached, initialised NoticesRecord
     */
    public NoticesRecord(Long noticeid, String contents, LocalDateTime created, LocalDateTime end, String hidden, Long priority, LocalDateTime start, String title, Long creatorid) {
        super(Notices.NOTICES);

        set(0, noticeid);
        set(1, contents);
        set(2, created);
        set(3, end);
        set(4, hidden);
        set(5, priority);
        set(6, start);
        set(7, title);
        set(8, creatorid);
    }
}
