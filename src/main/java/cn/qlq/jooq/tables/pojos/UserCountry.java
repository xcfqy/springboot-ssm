/*
 * This file is generated by jOOQ.
 */
package cn.qlq.jooq.tables.pojos;


import cn.qlq.jooq.tables.interfaces.IUserCountry;

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
public class UserCountry implements IUserCountry {

    private static final long serialVersionUID = -183756864;

    private Integer userid;
    private Integer countryid;

    public UserCountry() {}

    public UserCountry(IUserCountry value) {
        this.userid = value.getUserid();
        this.countryid = value.getCountryid();
    }

    public UserCountry(
        Integer userid,
        Integer countryid
    ) {
        this.userid = userid;
        this.countryid = countryid;
    }

    @Override
    public Integer getUserid() {
        return this.userid;
    }

    @Override
    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    @Override
    public Integer getCountryid() {
        return this.countryid;
    }

    @Override
    public void setCountryid(Integer countryid) {
        this.countryid = countryid;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("UserCountry (");

        sb.append(userid);
        sb.append(", ").append(countryid);

        sb.append(")");
        return sb.toString();
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public void from(IUserCountry from) {
        setUserid(from.getUserid());
        setCountryid(from.getCountryid());
    }

    @Override
    public <E extends IUserCountry> E into(E into) {
        into.from(this);
        return into;
    }
}