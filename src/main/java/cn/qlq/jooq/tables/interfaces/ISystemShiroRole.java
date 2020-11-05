/*
 * This file is generated by jOOQ.
 */
package cn.qlq.jooq.tables.interfaces;


import java.io.Serializable;

import javax.annotation.Generated;


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
public interface ISystemShiroRole extends Serializable {

    /**
     * Setter for <code>test1.system_shiro_role.id</code>.
     */
    public void setId(Integer value);

    /**
     * Getter for <code>test1.system_shiro_role.id</code>.
     */
    public Integer getId();

    /**
     * Setter for <code>test1.system_shiro_role.description</code>.
     */
    public void setDescription(String value);

    /**
     * Getter for <code>test1.system_shiro_role.description</code>.
     */
    public String getDescription();

    /**
     * Setter for <code>test1.system_shiro_role.name</code>.
     */
    public void setName(String value);

    /**
     * Getter for <code>test1.system_shiro_role.name</code>.
     */
    public String getName();

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common interface ISystemShiroRole
     */
    public void from(cn.qlq.jooq.tables.interfaces.ISystemShiroRole from);

    /**
     * Copy data into another generated Record/POJO implementing the common interface ISystemShiroRole
     */
    public <E extends cn.qlq.jooq.tables.interfaces.ISystemShiroRole> E into(E into);
}