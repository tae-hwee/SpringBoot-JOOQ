/*
 * This file is generated by jOOQ.
 */
package generated.org.jooq.tables.records;


import generated.org.jooq.tables.SeoulPreRegists;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record19;
import org.jooq.Row19;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SeoulPreRegistsRecord extends UpdatableRecordImpl<SeoulPreRegistsRecord> implements Record19<String, String, String, Long, String, String, String, LocalDateTime, String, String, String, LocalDate, LocalDate, String, String, String, String, String, String> {

    private static final long serialVersionUID = 1284661774;

    /**
     * Setter for <code>rs-parking-node.seoul_pre_regists.vhcleManageNo</code>.
     */
    public void setVhclemanageno(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>rs-parking-node.seoul_pre_regists.vhcleManageNo</code>.
     */
    public String getVhclemanageno() {
        return (String) get(0);
    }

    /**
     * Setter for <code>rs-parking-node.seoul_pre_regists.ffnlgSetleAgreAt</code>.
     */
    public void setFfnlgsetleagreat(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>rs-parking-node.seoul_pre_regists.ffnlgSetleAgreAt</code>.
     */
    public String getFfnlgsetleagreat() {
        return (String) get(1);
    }

    /**
     * Setter for <code>rs-parking-node.seoul_pre_regists.greenTrnsportFfnlg</code>.
     */
    public void setGreentrnsportffnlg(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>rs-parking-node.seoul_pre_regists.greenTrnsportFfnlg</code>.
     */
    public String getGreentrnsportffnlg() {
        return (String) get(2);
    }

    /**
     * Setter for <code>rs-parking-node.seoul_pre_regists.indexNo</code>.
     */
    public void setIndexno(Long value) {
        set(3, value);
    }

    /**
     * Getter for <code>rs-parking-node.seoul_pre_regists.indexNo</code>.
     */
    public Long getIndexno() {
        return (Long) get(3);
    }

    /**
     * Setter for <code>rs-parking-node.seoul_pre_regists.mberNo</code>.
     */
    public void setMberno(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>rs-parking-node.seoul_pre_regists.mberNo</code>.
     */
    public String getMberno() {
        return (String) get(4);
    }

    /**
     * Setter for <code>rs-parking-node.seoul_pre_regists.namsanFfnlg</code>.
     */
    public void setNamsanffnlg(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>rs-parking-node.seoul_pre_regists.namsanFfnlg</code>.
     */
    public String getNamsanffnlg() {
        return (String) get(5);
    }

    /**
     * Setter for <code>rs-parking-node.seoul_pre_regists.namsanPasmny</code>.
     */
    public void setNamsanpasmny(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>rs-parking-node.seoul_pre_regists.namsanPasmny</code>.
     */
    public String getNamsanpasmny() {
        return (String) get(6);
    }

    /**
     * Setter for <code>rs-parking-node.seoul_pre_regists.registered</code>.
     */
    public void setRegistered(LocalDateTime value) {
        set(7, value);
    }

    /**
     * Getter for <code>rs-parking-node.seoul_pre_regists.registered</code>.
     */
    public LocalDateTime getRegistered() {
        return (LocalDateTime) get(7);
    }

    /**
     * Setter for <code>rs-parking-node.seoul_pre_regists.secsnAt</code>.
     */
    public void setSecsnat(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>rs-parking-node.seoul_pre_regists.secsnAt</code>.
     */
    public String getSecsnat() {
        return (String) get(8);
    }

    /**
     * Setter for <code>rs-parking-node.seoul_pre_regists.suPblmngPrkplce</code>.
     */
    public void setSupblmngprkplce(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>rs-parking-node.seoul_pre_regists.suPblmngPrkplce</code>.
     */
    public String getSupblmngprkplce() {
        return (String) get(9);
    }

    /**
     * Setter for <code>rs-parking-node.seoul_pre_regists.trnsitDscntAt</code>.
     */
    public void setTrnsitdscntat(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>rs-parking-node.seoul_pre_regists.trnsitDscntAt</code>.
     */
    public String getTrnsitdscntat() {
        return (String) get(10);
    }

    /**
     * Setter for <code>rs-parking-node.seoul_pre_regists.useBeginDt</code>.
     */
    public void setUsebegindt(LocalDate value) {
        set(11, value);
    }

    /**
     * Getter for <code>rs-parking-node.seoul_pre_regists.useBeginDt</code>.
     */
    public LocalDate getUsebegindt() {
        return (LocalDate) get(11);
    }

    /**
     * Setter for <code>rs-parking-node.seoul_pre_regists.useEndDt</code>.
     */
    public void setUseenddt(LocalDate value) {
        set(12, value);
    }

    /**
     * Getter for <code>rs-parking-node.seoul_pre_regists.useEndDt</code>.
     */
    public LocalDate getUseenddt() {
        return (LocalDate) get(12);
    }

    /**
     * Setter for <code>rs-parking-node.seoul_pre_regists.usfeeSetleAgreAt</code>.
     */
    public void setUsfeesetleagreat(String value) {
        set(13, value);
    }

    /**
     * Getter for <code>rs-parking-node.seoul_pre_regists.usfeeSetleAgreAt</code>.
     */
    public String getUsfeesetleagreat() {
        return (String) get(13);
    }

    /**
     * Setter for <code>rs-parking-node.seoul_pre_regists.vhcleNo</code>.
     */
    public void setVhcleno(String value) {
        set(14, value);
    }

    /**
     * Getter for <code>rs-parking-node.seoul_pre_regists.vhcleNo</code>.
     */
    public String getVhcleno() {
        return (String) get(14);
    }

    /**
     * Setter for <code>rs-parking-node.seoul_pre_regists.vhclePosesnTy</code>.
     */
    public void setVhcleposesnty(String value) {
        set(15, value);
    }

    /**
     * Getter for <code>rs-parking-node.seoul_pre_regists.vhclePosesnTy</code>.
     */
    public String getVhcleposesnty() {
        return (String) get(15);
    }

    /**
     * Setter for <code>rs-parking-node.seoul_pre_regists.vhcleSttusTy</code>.
     */
    public void setVhclesttusty(String value) {
        set(16, value);
    }

    /**
     * Getter for <code>rs-parking-node.seoul_pre_regists.vhcleSttusTy</code>.
     */
    public String getVhclesttusty() {
        return (String) get(16);
    }

    /**
     * Setter for <code>rs-parking-node.seoul_pre_regists.vkeyCcmpCode1</code>.
     */
    public void setVkeyccmpcode1(String value) {
        set(17, value);
    }

    /**
     * Getter for <code>rs-parking-node.seoul_pre_regists.vkeyCcmpCode1</code>.
     */
    public String getVkeyccmpcode1() {
        return (String) get(17);
    }

    /**
     * Setter for <code>rs-parking-node.seoul_pre_regists.vkeyCcmpCode2</code>.
     */
    public void setVkeyccmpcode2(String value) {
        set(18, value);
    }

    /**
     * Getter for <code>rs-parking-node.seoul_pre_regists.vkeyCcmpCode2</code>.
     */
    public String getVkeyccmpcode2() {
        return (String) get(18);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record19 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row19<String, String, String, Long, String, String, String, LocalDateTime, String, String, String, LocalDate, LocalDate, String, String, String, String, String, String> fieldsRow() {
        return (Row19) super.fieldsRow();
    }

    @Override
    public Row19<String, String, String, Long, String, String, String, LocalDateTime, String, String, String, LocalDate, LocalDate, String, String, String, String, String, String> valuesRow() {
        return (Row19) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return SeoulPreRegists.SEOUL_PRE_REGISTS.VHCLEMANAGENO;
    }

    @Override
    public Field<String> field2() {
        return SeoulPreRegists.SEOUL_PRE_REGISTS.FFNLGSETLEAGREAT;
    }

    @Override
    public Field<String> field3() {
        return SeoulPreRegists.SEOUL_PRE_REGISTS.GREENTRNSPORTFFNLG;
    }

    @Override
    public Field<Long> field4() {
        return SeoulPreRegists.SEOUL_PRE_REGISTS.INDEXNO;
    }

    @Override
    public Field<String> field5() {
        return SeoulPreRegists.SEOUL_PRE_REGISTS.MBERNO;
    }

    @Override
    public Field<String> field6() {
        return SeoulPreRegists.SEOUL_PRE_REGISTS.NAMSANFFNLG;
    }

    @Override
    public Field<String> field7() {
        return SeoulPreRegists.SEOUL_PRE_REGISTS.NAMSANPASMNY;
    }

    @Override
    public Field<LocalDateTime> field8() {
        return SeoulPreRegists.SEOUL_PRE_REGISTS.REGISTERED;
    }

    @Override
    public Field<String> field9() {
        return SeoulPreRegists.SEOUL_PRE_REGISTS.SECSNAT;
    }

    @Override
    public Field<String> field10() {
        return SeoulPreRegists.SEOUL_PRE_REGISTS.SUPBLMNGPRKPLCE;
    }

    @Override
    public Field<String> field11() {
        return SeoulPreRegists.SEOUL_PRE_REGISTS.TRNSITDSCNTAT;
    }

    @Override
    public Field<LocalDate> field12() {
        return SeoulPreRegists.SEOUL_PRE_REGISTS.USEBEGINDT;
    }

    @Override
    public Field<LocalDate> field13() {
        return SeoulPreRegists.SEOUL_PRE_REGISTS.USEENDDT;
    }

    @Override
    public Field<String> field14() {
        return SeoulPreRegists.SEOUL_PRE_REGISTS.USFEESETLEAGREAT;
    }

    @Override
    public Field<String> field15() {
        return SeoulPreRegists.SEOUL_PRE_REGISTS.VHCLENO;
    }

    @Override
    public Field<String> field16() {
        return SeoulPreRegists.SEOUL_PRE_REGISTS.VHCLEPOSESNTY;
    }

    @Override
    public Field<String> field17() {
        return SeoulPreRegists.SEOUL_PRE_REGISTS.VHCLESTTUSTY;
    }

    @Override
    public Field<String> field18() {
        return SeoulPreRegists.SEOUL_PRE_REGISTS.VKEYCCMPCODE1;
    }

    @Override
    public Field<String> field19() {
        return SeoulPreRegists.SEOUL_PRE_REGISTS.VKEYCCMPCODE2;
    }

    @Override
    public String component1() {
        return getVhclemanageno();
    }

    @Override
    public String component2() {
        return getFfnlgsetleagreat();
    }

    @Override
    public String component3() {
        return getGreentrnsportffnlg();
    }

    @Override
    public Long component4() {
        return getIndexno();
    }

    @Override
    public String component5() {
        return getMberno();
    }

    @Override
    public String component6() {
        return getNamsanffnlg();
    }

    @Override
    public String component7() {
        return getNamsanpasmny();
    }

    @Override
    public LocalDateTime component8() {
        return getRegistered();
    }

    @Override
    public String component9() {
        return getSecsnat();
    }

    @Override
    public String component10() {
        return getSupblmngprkplce();
    }

    @Override
    public String component11() {
        return getTrnsitdscntat();
    }

    @Override
    public LocalDate component12() {
        return getUsebegindt();
    }

    @Override
    public LocalDate component13() {
        return getUseenddt();
    }

    @Override
    public String component14() {
        return getUsfeesetleagreat();
    }

    @Override
    public String component15() {
        return getVhcleno();
    }

    @Override
    public String component16() {
        return getVhcleposesnty();
    }

    @Override
    public String component17() {
        return getVhclesttusty();
    }

    @Override
    public String component18() {
        return getVkeyccmpcode1();
    }

    @Override
    public String component19() {
        return getVkeyccmpcode2();
    }

    @Override
    public String value1() {
        return getVhclemanageno();
    }

    @Override
    public String value2() {
        return getFfnlgsetleagreat();
    }

    @Override
    public String value3() {
        return getGreentrnsportffnlg();
    }

    @Override
    public Long value4() {
        return getIndexno();
    }

    @Override
    public String value5() {
        return getMberno();
    }

    @Override
    public String value6() {
        return getNamsanffnlg();
    }

    @Override
    public String value7() {
        return getNamsanpasmny();
    }

    @Override
    public LocalDateTime value8() {
        return getRegistered();
    }

    @Override
    public String value9() {
        return getSecsnat();
    }

    @Override
    public String value10() {
        return getSupblmngprkplce();
    }

    @Override
    public String value11() {
        return getTrnsitdscntat();
    }

    @Override
    public LocalDate value12() {
        return getUsebegindt();
    }

    @Override
    public LocalDate value13() {
        return getUseenddt();
    }

    @Override
    public String value14() {
        return getUsfeesetleagreat();
    }

    @Override
    public String value15() {
        return getVhcleno();
    }

    @Override
    public String value16() {
        return getVhcleposesnty();
    }

    @Override
    public String value17() {
        return getVhclesttusty();
    }

    @Override
    public String value18() {
        return getVkeyccmpcode1();
    }

    @Override
    public String value19() {
        return getVkeyccmpcode2();
    }

    @Override
    public SeoulPreRegistsRecord value1(String value) {
        setVhclemanageno(value);
        return this;
    }

    @Override
    public SeoulPreRegistsRecord value2(String value) {
        setFfnlgsetleagreat(value);
        return this;
    }

    @Override
    public SeoulPreRegistsRecord value3(String value) {
        setGreentrnsportffnlg(value);
        return this;
    }

    @Override
    public SeoulPreRegistsRecord value4(Long value) {
        setIndexno(value);
        return this;
    }

    @Override
    public SeoulPreRegistsRecord value5(String value) {
        setMberno(value);
        return this;
    }

    @Override
    public SeoulPreRegistsRecord value6(String value) {
        setNamsanffnlg(value);
        return this;
    }

    @Override
    public SeoulPreRegistsRecord value7(String value) {
        setNamsanpasmny(value);
        return this;
    }

    @Override
    public SeoulPreRegistsRecord value8(LocalDateTime value) {
        setRegistered(value);
        return this;
    }

    @Override
    public SeoulPreRegistsRecord value9(String value) {
        setSecsnat(value);
        return this;
    }

    @Override
    public SeoulPreRegistsRecord value10(String value) {
        setSupblmngprkplce(value);
        return this;
    }

    @Override
    public SeoulPreRegistsRecord value11(String value) {
        setTrnsitdscntat(value);
        return this;
    }

    @Override
    public SeoulPreRegistsRecord value12(LocalDate value) {
        setUsebegindt(value);
        return this;
    }

    @Override
    public SeoulPreRegistsRecord value13(LocalDate value) {
        setUseenddt(value);
        return this;
    }

    @Override
    public SeoulPreRegistsRecord value14(String value) {
        setUsfeesetleagreat(value);
        return this;
    }

    @Override
    public SeoulPreRegistsRecord value15(String value) {
        setVhcleno(value);
        return this;
    }

    @Override
    public SeoulPreRegistsRecord value16(String value) {
        setVhcleposesnty(value);
        return this;
    }

    @Override
    public SeoulPreRegistsRecord value17(String value) {
        setVhclesttusty(value);
        return this;
    }

    @Override
    public SeoulPreRegistsRecord value18(String value) {
        setVkeyccmpcode1(value);
        return this;
    }

    @Override
    public SeoulPreRegistsRecord value19(String value) {
        setVkeyccmpcode2(value);
        return this;
    }

    @Override
    public SeoulPreRegistsRecord values(String value1, String value2, String value3, Long value4, String value5, String value6, String value7, LocalDateTime value8, String value9, String value10, String value11, LocalDate value12, LocalDate value13, String value14, String value15, String value16, String value17, String value18, String value19) {
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
        value12(value12);
        value13(value13);
        value14(value14);
        value15(value15);
        value16(value16);
        value17(value17);
        value18(value18);
        value19(value19);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached SeoulPreRegistsRecord
     */
    public SeoulPreRegistsRecord() {
        super(SeoulPreRegists.SEOUL_PRE_REGISTS);
    }

    /**
     * Create a detached, initialised SeoulPreRegistsRecord
     */
    public SeoulPreRegistsRecord(String vhclemanageno, String ffnlgsetleagreat, String greentrnsportffnlg, Long indexno, String mberno, String namsanffnlg, String namsanpasmny, LocalDateTime registered, String secsnat, String supblmngprkplce, String trnsitdscntat, LocalDate usebegindt, LocalDate useenddt, String usfeesetleagreat, String vhcleno, String vhcleposesnty, String vhclesttusty, String vkeyccmpcode1, String vkeyccmpcode2) {
        super(SeoulPreRegists.SEOUL_PRE_REGISTS);

        set(0, vhclemanageno);
        set(1, ffnlgsetleagreat);
        set(2, greentrnsportffnlg);
        set(3, indexno);
        set(4, mberno);
        set(5, namsanffnlg);
        set(6, namsanpasmny);
        set(7, registered);
        set(8, secsnat);
        set(9, supblmngprkplce);
        set(10, trnsitdscntat);
        set(11, usebegindt);
        set(12, useenddt);
        set(13, usfeesetleagreat);
        set(14, vhcleno);
        set(15, vhcleposesnty);
        set(16, vhclesttusty);
        set(17, vkeyccmpcode1);
        set(18, vkeyccmpcode2);
    }
}
