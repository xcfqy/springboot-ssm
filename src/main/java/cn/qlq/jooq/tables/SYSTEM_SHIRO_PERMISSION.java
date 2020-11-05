/*
 * This file is generated by jOOQ.
 */
package cn.qlq.jooq.tables;


import cn.qlq.jooq.Indexes;
import cn.qlq.jooq.Keys;
import cn.qlq.jooq.Test1;
import cn.qlq.jooq.tables.records.SystemShiroPermissionRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row4;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SYSTEM_SHIRO_PERMISSION extends TableImpl<SystemShiroPermissionRecord> {

    private static final long serialVersionUID = 1916588635;

    /**
     * The reference instance of <code>test1.system_shiro_permission</code>
     */
    public static final SYSTEM_SHIRO_PERMISSION SYSTEM_SHIRO_PERMISSION = new SYSTEM_SHIRO_PERMISSION();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SystemShiroPermissionRecord> getRecordType() {
        return SystemShiroPermissionRecord.class;
    }

    /**
     * The column <code>test1.system_shiro_permission.id</code>.
     */
    public final TableField<SystemShiroPermissionRecord, Integer> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>test1.system_shiro_permission.description</code>.
     */
    public final TableField<SystemShiroPermissionRecord, String> DESCRIPTION = createField(DSL.name("description"), org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>test1.system_shiro_permission.name</code>.
     */
    public final TableField<SystemShiroPermissionRecord, String> NAME = createField(DSL.name("name"), org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>test1.system_shiro_permission.url</code>.
     */
    public final TableField<SystemShiroPermissionRecord, String> URL = createField(DSL.name("url"), org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * Create a <code>test1.system_shiro_permission</code> table reference
     */
    public SYSTEM_SHIRO_PERMISSION() {
        this(DSL.name("system_shiro_permission"), null);
    }

    /**
     * Create an aliased <code>test1.system_shiro_permission</code> table reference
     */
    public SYSTEM_SHIRO_PERMISSION(String alias) {
        this(DSL.name(alias), SYSTEM_SHIRO_PERMISSION);
    }

    /**
     * Create an aliased <code>test1.system_shiro_permission</code> table reference
     */
    public SYSTEM_SHIRO_PERMISSION(Name alias) {
        this(alias, SYSTEM_SHIRO_PERMISSION);
    }

    private SYSTEM_SHIRO_PERMISSION(Name alias, Table<SystemShiroPermissionRecord> aliased) {
        this(alias, aliased, null);
    }

    private SYSTEM_SHIRO_PERMISSION(Name alias, Table<SystemShiroPermissionRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> SYSTEM_SHIRO_PERMISSION(Table<O> child, ForeignKey<O, SystemShiroPermissionRecord> key) {
        super(child, key, SYSTEM_SHIRO_PERMISSION);
    }

    @Override
    public Schema getSchema() {
        return Test1.TEST1;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.SYSTEM_SHIRO_PERMISSION_PRIMARY);
    }

    @Override
    public UniqueKey<SystemShiroPermissionRecord> getPrimaryKey() {
        return Keys.KEY_SYSTEM_SHIRO_PERMISSION_PRIMARY;
    }

    @Override
    public List<UniqueKey<SystemShiroPermissionRecord>> getKeys() {
        return Arrays.<UniqueKey<SystemShiroPermissionRecord>>asList(Keys.KEY_SYSTEM_SHIRO_PERMISSION_PRIMARY);
    }

    @Override
    public SYSTEM_SHIRO_PERMISSION as(String alias) {
        return new SYSTEM_SHIRO_PERMISSION(DSL.name(alias), this);
    }

    @Override
    public SYSTEM_SHIRO_PERMISSION as(Name alias) {
        return new SYSTEM_SHIRO_PERMISSION(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public SYSTEM_SHIRO_PERMISSION rename(String name) {
        return new SYSTEM_SHIRO_PERMISSION(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public SYSTEM_SHIRO_PERMISSION rename(Name name) {
        return new SYSTEM_SHIRO_PERMISSION(name, null);
    }

    // -------------------------------------------------------------------------
    // Row4 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row4<Integer, String, String, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }
}