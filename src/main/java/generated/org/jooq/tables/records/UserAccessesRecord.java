/*
 * This file is generated by jOOQ.
 */
package generated.org.jooq.tables.records;


import generated.org.jooq.tables.UserAccesses;

import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UserAccessesRecord extends UpdatableRecordImpl<UserAccessesRecord> implements Record7<String, String, LocalDateTime, String, LocalDateTime, LocalDateTime, Long> {

    private static final long serialVersionUID = 2131503055;

    /**
     * Setter for <code>rs-parking-node.user_accesses.userToken</code>.
     */
    public void setUsertoken(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>rs-parking-node.user_accesses.userToken</code>.
     */
    public String getUsertoken() {
        return (String) get(0);
    }

    /**
     * Setter for <code>rs-parking-node.user_accesses.clientIp</code>.
     */
    public void setClientip(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>rs-parking-node.user_accesses.clientIp</code>.
     */
    public String getClientip() {
        return (String) get(1);
    }

    /**
     * Setter for <code>rs-parking-node.user_accesses.closed</code>.
     */
    public void setClosed(LocalDateTime value) {
        set(2, value);
    }

    /**
     * Getter for <code>rs-parking-node.user_accesses.closed</code>.
     */
    public LocalDateTime getClosed() {
        return (LocalDateTime) get(2);
    }

    /**
     * Setter for <code>rs-parking-node.user_accesses.keptAlive</code>.
     */
    public void setKeptalive(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>rs-parking-node.user_accesses.keptAlive</code>.
     */
    public String getKeptalive() {
        return (String) get(3);
    }

    /**
     * Setter for <code>rs-parking-node.user_accesses.lastAccessed</code>.
     */
    public void setLastaccessed(LocalDateTime value) {
        set(4, value);
    }

    /**
     * Getter for <code>rs-parking-node.user_accesses.lastAccessed</code>.
     */
    public LocalDateTime getLastaccessed() {
        return (LocalDateTime) get(4);
    }

    /**
     * Setter for <code>rs-parking-node.user_accesses.opened</code>.
     */
    public void setOpened(LocalDateTime value) {
        set(5, value);
    }

    /**
     * Getter for <code>rs-parking-node.user_accesses.opened</code>.
     */
    public LocalDateTime getOpened() {
        return (LocalDateTime) get(5);
    }

    /**
     * Setter for <code>rs-parking-node.user_accesses.userId</code>.
     */
    public void setUserid(Long value) {
        set(6, value);
    }

    /**
     * Getter for <code>rs-parking-node.user_accesses.userId</code>.
     */
    public Long getUserid() {
        return (Long) get(6);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row7<String, String, LocalDateTime, String, LocalDateTime, LocalDateTime, Long> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    @Override
    public Row7<String, String, LocalDateTime, String, LocalDateTime, LocalDateTime, Long> valuesRow() {
        return (Row7) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return UserAccesses.USER_ACCESSES.USERTOKEN;
    }

    @Override
    public Field<String> field2() {
        return UserAccesses.USER_ACCESSES.CLIENTIP;
    }

    @Override
    public Field<LocalDateTime> field3() {
        return UserAccesses.USER_ACCESSES.CLOSED;
    }

    @Override
    public Field<String> field4() {
        return UserAccesses.USER_ACCESSES.KEPTALIVE;
    }

    @Override
    public Field<LocalDateTime> field5() {
        return UserAccesses.USER_ACCESSES.LASTACCESSED;
    }

    @Override
    public Field<LocalDateTime> field6() {
        return UserAccesses.USER_ACCESSES.OPENED;
    }

    @Override
    public Field<Long> field7() {
        return UserAccesses.USER_ACCESSES.USERID;
    }

    @Override
    public String component1() {
        return getUsertoken();
    }

    @Override
    public String component2() {
        return getClientip();
    }

    @Override
    public LocalDateTime component3() {
        return getClosed();
    }

    @Override
    public String component4() {
        return getKeptalive();
    }

    @Override
    public LocalDateTime component5() {
        return getLastaccessed();
    }

    @Override
    public LocalDateTime component6() {
        return getOpened();
    }

    @Override
    public Long component7() {
        return getUserid();
    }

    @Override
    public String value1() {
        return getUsertoken();
    }

    @Override
    public String value2() {
        return getClientip();
    }

    @Override
    public LocalDateTime value3() {
        return getClosed();
    }

    @Override
    public String value4() {
        return getKeptalive();
    }

    @Override
    public LocalDateTime value5() {
        return getLastaccessed();
    }

    @Override
    public LocalDateTime value6() {
        return getOpened();
    }

    @Override
    public Long value7() {
        return getUserid();
    }

    @Override
    public UserAccessesRecord value1(String value) {
        setUsertoken(value);
        return this;
    }

    @Override
    public UserAccessesRecord value2(String value) {
        setClientip(value);
        return this;
    }

    @Override
    public UserAccessesRecord value3(LocalDateTime value) {
        setClosed(value);
        return this;
    }

    @Override
    public UserAccessesRecord value4(String value) {
        setKeptalive(value);
        return this;
    }

    @Override
    public UserAccessesRecord value5(LocalDateTime value) {
        setLastaccessed(value);
        return this;
    }

    @Override
    public UserAccessesRecord value6(LocalDateTime value) {
        setOpened(value);
        return this;
    }

    @Override
    public UserAccessesRecord value7(Long value) {
        setUserid(value);
        return this;
    }

    @Override
    public UserAccessesRecord values(String value1, String value2, LocalDateTime value3, String value4, LocalDateTime value5, LocalDateTime value6, Long value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached UserAccessesRecord
     */
    public UserAccessesRecord() {
        super(UserAccesses.USER_ACCESSES);
    }

    /**
     * Create a detached, initialised UserAccessesRecord
     */
    public UserAccessesRecord(String usertoken, String clientip, LocalDateTime closed, String keptalive, LocalDateTime lastaccessed, LocalDateTime opened, Long userid) {
        super(UserAccesses.USER_ACCESSES);

        set(0, usertoken);
        set(1, clientip);
        set(2, closed);
        set(3, keptalive);
        set(4, lastaccessed);
        set(5, opened);
        set(6, userid);
    }
}