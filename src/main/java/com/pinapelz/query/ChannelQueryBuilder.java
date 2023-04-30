package com.pinapelz.query;

import com.pinapelz.vtuber.Language;
import com.pinapelz.vtuber.Order;
import com.pinapelz.vtuber.Organization;
import com.pinapelz.vtuber.Sort;

import java.util.List;

/**
 * Query builder for getting a list of Channels matching the given parameters
 */
public class ChannelQueryBuilder {
    private Integer limit;
    private Integer offset;
    private String type;
    private String lang;
    private String order;
    private String org;
    private String sort;

    public Integer getLimit() {
        return limit;
    }

    public ChannelQueryBuilder setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    public Integer getOffset() {
        return offset;
    }

    public ChannelQueryBuilder setOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    public String getType() {
        return type;
    }

    public ChannelQueryBuilder setType(String type) {
        this.type = type;
        return this;
    }

    public String getLang() {
        return lang;
    }

    public ChannelQueryBuilder setLang(String lang) {
        this.lang = lang;
        return this;
    }

    public ChannelQueryBuilder setLang(Language lang) {
        this.lang = lang.toString();
        return this;
    }

    public ChannelQueryBuilder setLang(List<Language> language) {
        String[] languages = new String[language.size()];
        for (int i = 0; i < language.size(); i++) {
            languages[i] = language.get(i).toString();
        }
        this.lang = String.join(",", languages);
        return this;
    }

    public String getOrder() {
        return order;
    }

    public ChannelQueryBuilder setOrder(String order) {
        this.order = order;
        return this;
    }

    public ChannelQueryBuilder setOrder(Order order){
        this.order = order.toString();
        return this;
    }

    public String getOrg() {
        return org;
    }

    public ChannelQueryBuilder setOrg(String org) {
        this.org = org;
        return this;
    }

    public ChannelQueryBuilder setOrg(Organization org) {
        this.org = org.toString();
        return this;
    }

    public String getSort() {
        return sort;
    }

    public ChannelQueryBuilder setSort(String sort) {
        this.sort = sort;
        return this;
    }

    public ChannelQueryBuilder setSort(Sort sort){
        this.sort = sort.toString();
        return this;
    }


}
