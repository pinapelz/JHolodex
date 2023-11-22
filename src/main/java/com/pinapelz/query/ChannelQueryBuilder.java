package com.pinapelz.query;

import com.pinapelz.vtuber.Language;
import com.pinapelz.vtuber.Order;
import com.pinapelz.vtuber.Organization;
import com.pinapelz.vtuber.Sort;

import java.util.List;

/**
 * Query builder for getting a list of Channels matching the given parameters
 *
 * @author pinapelz
 * @version $Id: $Id
 */
public class ChannelQueryBuilder {
    private Integer limit;
    private Integer offset;
    private String type;
    private String lang;
    private String order;
    private String org;
    private String sort;

    /**
     * <p>Getter for the field <code>limit</code>.</p>
     *
     * @return a {@link java.lang.Integer} object.
     */
    public Integer getLimit() {
        return limit;
    }

    /**
     * <p>Setter for the field <code>limit</code>.</p>
     *
     * @param limit a {@link java.lang.Integer} object.
     * @return a {@link com.pinapelz.query.ChannelQueryBuilder} object.
     */
    public ChannelQueryBuilder setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * <p>Getter for the field <code>offset</code>.</p>
     *
     * @return a {@link java.lang.Integer} object.
     */
    public Integer getOffset() {
        return offset;
    }

    /**
     * <p>Setter for the field <code>offset</code>.</p>
     *
     * @param offset a {@link java.lang.Integer} object.
     * @return a {@link com.pinapelz.query.ChannelQueryBuilder} object.
     */
    public ChannelQueryBuilder setOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * <p>Getter for the field <code>type</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getType() {
        return type;
    }

    /**
     * <p>Setter for the field <code>type</code>.</p>
     *
     * @param type a {@link java.lang.String} object.
     * @return a {@link com.pinapelz.query.ChannelQueryBuilder} object.
     */
    public ChannelQueryBuilder setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>Getter for the field <code>lang</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getLang() {
        return lang;
    }

    /**
     * <p>Setter for the field <code>lang</code>.</p>
     *
     * @param lang a {@link java.lang.String} object.
     * @return a {@link com.pinapelz.query.ChannelQueryBuilder} object.
     */
    public ChannelQueryBuilder setLang(String lang) {
        this.lang = lang;
        return this;
    }

    /**
     * <p>Setter for the field <code>lang</code>.</p>
     *
     * @param lang a {@link com.pinapelz.vtuber.Language} object.
     * @return a {@link com.pinapelz.query.ChannelQueryBuilder} object.
     */
    public ChannelQueryBuilder setLang(Language lang) {
        this.lang = lang.toString();
        return this;
    }

    /**
     * <p>Setter for the field <code>lang</code>.</p>
     *
     * @param language a {@link java.util.List} object.
     * @return a {@link com.pinapelz.query.ChannelQueryBuilder} object.
     */
    public ChannelQueryBuilder setLang(List<Language> language) {
        String[] languages = new String[language.size()];
        for (int i = 0; i < language.size(); i++) {
            languages[i] = language.get(i).toString();
        }
        this.lang = String.join(",", languages);
        return this;
    }

    /**
     * <p>Getter for the field <code>order</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getOrder() {
        return order;
    }

    /**
     * <p>Setter for the field <code>order</code>.</p>
     *
     * @param order a {@link java.lang.String} object.
     * @return a {@link com.pinapelz.query.ChannelQueryBuilder} object.
     */
    public ChannelQueryBuilder setOrder(String order) {
        this.order = order;
        return this;
    }

    /**
     * <p>Setter for the field <code>order</code>.</p>
     *
     * @param order a {@link com.pinapelz.vtuber.Order} object.
     * @return a {@link com.pinapelz.query.ChannelQueryBuilder} object.
     */
    public ChannelQueryBuilder setOrder(Order order){
        this.order = order.toString();
        return this;
    }

    /**
     * <p>Getter for the field <code>org</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getOrg() {
        return org;
    }

    /**
     * <p>Setter for the field <code>org</code>.</p>
     *
     * @param org a {@link java.lang.String} object.
     * @return a {@link com.pinapelz.query.ChannelQueryBuilder} object.
     */
    public ChannelQueryBuilder setOrg(String org) {
        this.org = org;
        return this;
    }

    /**
     * <p>Setter for the field <code>org</code>.</p>
     *
     * @param org a {@link com.pinapelz.vtuber.Organization} object.
     * @return a {@link com.pinapelz.query.ChannelQueryBuilder} object.
     */
    public ChannelQueryBuilder setOrg(Organization org) {
        this.org = org.toString();
        return this;
    }

    /**
     * <p>Getter for the field <code>sort</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getSort() {
        return sort;
    }

    /**
     * <p>Setter for the field <code>sort</code>.</p>
     *
     * @param sort a {@link java.lang.String} object.
     * @return a {@link com.pinapelz.query.ChannelQueryBuilder} object.
     */
    public ChannelQueryBuilder setSort(String sort) {
        this.sort = sort;
        return this;
    }

    /**
     * <p>Setter for the field <code>sort</code>.</p>
     *
     * @param sort a {@link com.pinapelz.vtuber.Sort} object.
     * @return a {@link com.pinapelz.query.ChannelQueryBuilder} object.
     */
    public ChannelQueryBuilder setSort(Sort sort){
        this.sort = sort.toString();
        return this;
    }


}
