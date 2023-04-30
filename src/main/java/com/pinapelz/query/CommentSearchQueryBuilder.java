package com.pinapelz.query;

import com.pinapelz.vtuber.Language;
import com.pinapelz.vtuber.Sort;
import com.pinapelz.vtuber.Type;

import java.util.ArrayList;
import java.util.List;

/**
 * Builder for a comment search query
 * Default values set in constructor
 */
public class CommentSearchQueryBuilder {
    private String sort;
    private List<String> target;
    private List<String> conditions;
    private List<String> topic;
    private List<String> vch;
    private List<String> org;
    private List<String> comment;
    private boolean paginated;
    private int offset;
    private int limit;
    private List<String> lang;

    public CommentSearchQueryBuilder(){
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

    public CommentSearchQueryBuilder setSort(String sort) {
        this.sort = sort;
        return this;
    }

    public CommentSearchQueryBuilder setSort(Sort sort) {
        this.sort = sort.toString();
        return this;
    }

    public List<String> getLang() {
        return lang;
    }

    public CommentSearchQueryBuilder setLang(String lang) {
        this.lang = List.of(lang);
        return this;
    }

    public CommentSearchQueryBuilder setLang(Language lang) {
        this.lang = List.of(lang.toString());
        return this;
    }

    public CommentSearchQueryBuilder setLang(Language[] language) {
        List<String> lang = new ArrayList<String>();
        for (Language l : language) {
            lang.add(l.toString());
        }
        this.lang = lang;
        return this;
    }

    public List<String> getTarget() {
        return target;
    }

    public CommentSearchQueryBuilder setTarget(String target) {
        this.target = List.of(target);
        return this;
    }

    public CommentSearchQueryBuilder setTarget(Type target) {
        this.target = List.of(target.toString());
        return this;
    }

    public CommentSearchQueryBuilder setTarget(List<Type> target) {
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

    public CommentSearchQueryBuilder setConditions(List<String> conditions) {
        this.conditions = conditions;
        return this;
    }

    public List<String> getTopic() {
        return topic;
    }

    public CommentSearchQueryBuilder setTopic(List<String> topic) {
        this.topic = topic;
        return this;
    }

    public List<String> getVch() {
        return vch;
    }

    public CommentSearchQueryBuilder setVch(List<String> vch) {
        this.vch = vch;
        return this;
    }

    public List<String> getOrg() {
        return org;
    }

    public CommentSearchQueryBuilder setOrg(List<String> org) {
        this.org = org;
        return this;
    }

    public List<String> getComment() {
        return comment;
    }

    public CommentSearchQueryBuilder setComment(List<String> comment) {
        this.comment = comment;
        return this;
    }

    public boolean isPaginated() {
        return paginated;
    }

    public CommentSearchQueryBuilder setPaginated(boolean paginated) {
        this.paginated = paginated;
        return this;
    }

    public int getOffset() {
        return offset;
    }

    public CommentSearchQueryBuilder setOffset(int offset) {
        this.offset = offset;
        return this;
    }

    public int getLimit() {
        return limit;
    }

    public CommentSearchQueryBuilder setLimit(int limit) {
        this.limit = limit;
        return this;
    }
}
