/*
 * This file is generated by jOOQ.
 */
package generated.org.jooq.tables;


import generated.org.jooq.Keys;
import generated.org.jooq.RsParkingNode;
import generated.org.jooq.tables.records.AuthorRecord;

import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row3;
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
public class Author extends TableImpl<AuthorRecord> {

    private static final long serialVersionUID = -1018731836;

    /**
     * The reference instance of <code>rs-parking-node.author</code>
     */
    public static final Author AUTHOR = new Author();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<AuthorRecord> getRecordType() {
        return AuthorRecord.class;
    }

    /**
     * The column <code>rs-parking-node.author.id</code>.
     */
    public final TableField<AuthorRecord, Long> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>rs-parking-node.author.authorName</code>.
     */
    public final TableField<AuthorRecord, String> AUTHORNAME = createField(DSL.name("authorName"), org.jooq.impl.SQLDataType.VARCHAR(50).nullable(false), this, "");

    /**
     * The column <code>rs-parking-node.author.penName</code>.
     */
    public final TableField<AuthorRecord, String> PENNAME = createField(DSL.name("penName"), org.jooq.impl.SQLDataType.VARCHAR(50).defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * Create a <code>rs-parking-node.author</code> table reference
     */
    public Author() {
        this(DSL.name("author"), null);
    }

    /**
     * Create an aliased <code>rs-parking-node.author</code> table reference
     */
    public Author(String alias) {
        this(DSL.name(alias), AUTHOR);
    }

    /**
     * Create an aliased <code>rs-parking-node.author</code> table reference
     */
    public Author(Name alias) {
        this(alias, AUTHOR);
    }

    private Author(Name alias, Table<AuthorRecord> aliased) {
        this(alias, aliased, null);
    }

    private Author(Name alias, Table<AuthorRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> Author(Table<O> child, ForeignKey<O, AuthorRecord> key) {
        super(child, key, AUTHOR);
    }

    @Override
    public Schema getSchema() {
        return RsParkingNode.RS_PARKING_NODE;
    }

    @Override
    public UniqueKey<AuthorRecord> getPrimaryKey() {
        return Keys.KEY_AUTHOR_PRIMARY;
    }

    @Override
    public List<UniqueKey<AuthorRecord>> getKeys() {
        return Arrays.<UniqueKey<AuthorRecord>>asList(Keys.KEY_AUTHOR_PRIMARY);
    }

    @Override
    public Author as(String alias) {
        return new Author(DSL.name(alias), this);
    }

    @Override
    public Author as(Name alias) {
        return new Author(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Author rename(String name) {
        return new Author(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Author rename(Name name) {
        return new Author(name, null);
    }

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row3<Long, String, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }
}
