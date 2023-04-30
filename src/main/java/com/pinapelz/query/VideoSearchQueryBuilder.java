package com.pinapelz.query;

import com.pinapelz.vtuber.Language;
import com.pinapelz.vtuber.Organization;
import com.pinapelz.vtuber.Sort;
import com.pinapelz.vtuber.Type;

import java.util.ArrayList;
import java.util.List;

/**
 * Builder for a video search query
 * Default values set in constructor
 */
public class VideoSearchQueryBuilder {
    private String sort;
    private List<String> lang;
    private List<String> target;
    private List<String> conditions;
    private List<String> topic;
    private List<String> vch;
    private List<String> org;
    private List<String> comment;
    private boolean paginated;
    private int offset;
    private int limit;

    public VideoSearchQueryBuilder() {
        this.sort = "newest";
        this.paginated = true;
        this.offset = 0;
        this.limit = 10;
        this.topic = new ArrayList<String>();
        this.comment = new ArrayList<String>();
        this.org = List.of("Nijisanji");
        this.vch = new ArrayList<String>();
        this.conditions = new ArrayList<String>();
        this.lang = List.of("en");
    }

    public String getSort() {
        return sort;
    }

    public VideoSearchQueryBuilder setSort(String sort) {
        this.sort = sort;
        return this;
    }

    public VideoSearchQueryBuilder setSort(Sort sort) {
        this.sort = sort.toString();
        return this;
    }

    public List<String> getLang() {
        return lang;
    }

    public VideoSearchQueryBuilder setLang(String lang) {
        this.lang = List.of(lang);
        return this;
    }

    public VideoSearchQueryBuilder setLang(Language lang) {
        this.lang = List.of(lang.toString());
        return this;
    }

    public VideoSearchQueryBuilder setLang(List<String> language) {
        this.lang = language;
        return this;
    }

    public List<String> getTarget() {
        return target;
    }

    public VideoSearchQueryBuilder  setTarget(String target) {
        this.target = List.of(target);
        return this;
    }

    public VideoSearchQueryBuilder  setTarget(Type target) {
        this.target = List.of(target.toString());
        return this;
    }

    public VideoSearchQueryBuilder  setTarget(List<Type> target) {
        List<String> targets = new ArrayList<String>();
        for (Type t : target) {
            targets.add(t.toString());
        }
        this.target = targets;
        return this;
    }


    public List<String> getConditions() {
        return conditions;
    }

    public VideoSearchQueryBuilder setConditions(List<String> conditions) {
        this.conditions = conditions;
        return this;
    }

    public List<String> getTopic() {
        return topic;
    }

    public VideoSearchQueryBuilder setTopic(List<String> topic) {
        this.topic = topic;
        return this;
    }

    public List<String> getVch() {
        return vch;
    }

    public VideoSearchQueryBuilder setVch(List<String> vch) {
        this.vch = vch;
        return this;
    }

    public List<String> getOrg() {
        return org;
    }

    public VideoSearchQueryBuilder setOrg(String org) {
        this.org = List.of(org);
        return this;
    }

    public VideoSearchQueryBuilder setOrg(Organization org) {
        this.org = List.of(org.toString());
        return this;
    }

    public VideoSearchQueryBuilder setOrg(List<Organization> org) {
        List<String> orgs = new ArrayList<String>();
        for (Organization o : org) {
            orgs.add(o.toString());
        }
        this.org = orgs;
        return this;
    }

    public List<String> getComment() {
        return comment;
    }

    public VideoSearchQueryBuilder setComment(List<String> comment) {
        this.comment = comment;
        return this;
    }

    public boolean isPaginated() {
        return paginated;
    }

    public VideoSearchQueryBuilder setPaginated(boolean paginated) {
        this.paginated = paginated;
        return this;
    }

    public int getOffset() {
        return offset;
    }

    public VideoSearchQueryBuilder setOffset(int offset) {
        this.offset = offset;
        return this;
    }

    public int getLimit() {
        return limit;
    }

    public VideoSearchQueryBuilder setLimit(int limit) {
        this.limit = limit;
        return this;
    }
}
