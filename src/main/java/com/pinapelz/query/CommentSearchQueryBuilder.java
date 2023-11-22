package com.pinapelz.query;

import com.pinapelz.vtuber.Language;
import com.pinapelz.vtuber.Organization;
import com.pinapelz.vtuber.Sort;
import com.pinapelz.vtuber.Type;

import java.util.ArrayList;
import java.util.List;

/**
 * Builder for a comment search query
 * Default values set in constructor
 *
 * @author pinapelz
 * @version $Id: $Id
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

    /**
     * <p>Constructor for CommentSearchQueryBuilder.</p>
     */
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
     * @return a {@link com.pinapelz.query.CommentSearchQueryBuilder} object.
     */
    public CommentSearchQueryBuilder setSort(String sort) {
        this.sort = sort;
        return this;
    }

    /**
     * <p>Setter for the field <code>sort</code>.</p>
     *
     * @param sort a {@link com.pinapelz.vtuber.Sort} object.
     * @return a {@link com.pinapelz.query.CommentSearchQueryBuilder} object.
     */
    public CommentSearchQueryBuilder setSort(Sort sort) {
        this.sort = sort.toString();
        return this;
    }

    /**
     * <p>Getter for the field <code>lang</code>.</p>
     *
     * @return a {@link java.util.List} object.
     */
    public List<String> getLang() {
        return lang;
    }

    /**
     * <p>Setter for the field <code>lang</code>.</p>
     *
     * @param lang a {@link java.lang.String} object.
     * @return a {@link com.pinapelz.query.CommentSearchQueryBuilder} object.
     */
    public CommentSearchQueryBuilder setLang(String lang) {
        this.lang = List.of(lang);
        return this;
    }

    /**
     * <p>Setter for the field <code>lang</code>.</p>
     *
     * @param lang a {@link com.pinapelz.vtuber.Language} object.
     * @return a {@link com.pinapelz.query.CommentSearchQueryBuilder} object.
     */
    public CommentSearchQueryBuilder setLang(Language lang) {
        this.lang = List.of(lang.toString());
        return this;
    }

    /**
     * <p>Setter for the field <code>lang</code>.</p>
     *
     * @param language an array of {@link com.pinapelz.vtuber.Language} objects.
     * @return a {@link com.pinapelz.query.CommentSearchQueryBuilder} object.
     */
    public CommentSearchQueryBuilder setLang(Language[] language) {
        List<String> lang = new ArrayList<String>();
        for (Language l : language) {
            lang.add(l.toString());
        }
        this.lang = lang;
        return this;
    }

    /**
     * <p>Getter for the field <code>target</code>.</p>
     *
     * @return a {@link java.util.List} object.
     */
    public List<String> getTarget() {
        return target;
    }

    /**
     * <p>Setter for the field <code>target</code>.</p>
     *
     * @param target a {@link java.lang.String} object.
     * @return a {@link com.pinapelz.query.CommentSearchQueryBuilder} object.
     */
    public CommentSearchQueryBuilder setTarget(String target) {
        this.target = List.of(target);
        return this;
    }

    /**
     * <p>Setter for the field <code>target</code>.</p>
     *
     * @param target a {@link com.pinapelz.vtuber.Type} object.
     * @return a {@link com.pinapelz.query.CommentSearchQueryBuilder} object.
     */
    public CommentSearchQueryBuilder setTarget(Type target) {
        this.target = List.of(target.toString());
        return this;
    }

    /**
     * <p>Setter for the field <code>target</code>.</p>
     *
     * @param target a {@link java.util.List} object.
     * @return a {@link com.pinapelz.query.CommentSearchQueryBuilder} object.
     */
    public CommentSearchQueryBuilder setTarget(List<Type> target) {
        List<String> targets = new ArrayList<String>();
        for (Type t : target) {
            targets.add(t.toString());
        }
        this.target = targets;
        return this;
    }



    /**
     * <p>Getter for the field <code>conditions</code>.</p>
     *
     * @return a {@link java.util.List} object.
     */
    public List<String> getConditions() {
        return conditions;
    }

    /**
     * <p>Setter for the field <code>conditions</code>.</p>
     *
     * @param conditions a {@link java.util.List} object.
     * @return a {@link com.pinapelz.query.CommentSearchQueryBuilder} object.
     */
    public CommentSearchQueryBuilder setConditions(List<String> conditions) {
        this.conditions = conditions;
        return this;
    }

    /**
     * <p>Getter for the field <code>topic</code>.</p>
     *
     * @return a {@link java.util.List} object.
     */
    public List<String> getTopic() {
        return topic;
    }

    /**
     * <p>Setter for the field <code>topic</code>.</p>
     *
     * @param topic a {@link java.util.List} object.
     * @return a {@link com.pinapelz.query.CommentSearchQueryBuilder} object.
     */
    public CommentSearchQueryBuilder setTopic(List<String> topic) {
        this.topic = topic;
        return this;
    }

    /**
     * <p>Getter for the field <code>vch</code>.</p>
     *
     * @return a {@link java.util.List} object.
     */
    public List<String> getVch() {
        return vch;
    }

    /**
     * <p>Setter for the field <code>vch</code>.</p>
     *
     * @param vch a {@link java.util.List} object.
     * @return a {@link com.pinapelz.query.CommentSearchQueryBuilder} object.
     */
    public CommentSearchQueryBuilder setVch(List<String> vch) {
        this.vch = vch;
        return this;
    }

    /**
     * <p>Getter for the field <code>org</code>.</p>
     *
     * @return a {@link java.util.List} object.
     */
    public List<String> getOrg() {
        return org;
    }

    /**
     * <p>Setter for the field <code>org</code>.</p>
     *
     * @param org a {@link java.lang.String} object.
     * @return a {@link com.pinapelz.query.CommentSearchQueryBuilder} object.
     */
    public CommentSearchQueryBuilder setOrg(String org) {
        this.org = List.of(org);
        return this;
    }

    /**
     * <p>Setter for the field <code>org</code>.</p>
     *
     * @param org a {@link com.pinapelz.vtuber.Organization} object.
     * @return a {@link com.pinapelz.query.CommentSearchQueryBuilder} object.
     */
    public CommentSearchQueryBuilder setOrg(Organization org) {
        this.org = List.of(org.toString());
        return this;
    }

    /**
     * <p>Setter for the field <code>org</code>.</p>
     *
     * @param org a {@link java.util.List} object.
     * @return a {@link com.pinapelz.query.CommentSearchQueryBuilder} object.
     */
    public CommentSearchQueryBuilder setOrg(List<Organization> org) {
        List<String> orgs = new ArrayList<String>();
        for (Organization o : org) {
            orgs.add(o.toString());
        }
        this.org = orgs;
        return this;
    }


    /**
     * <p>Getter for the field <code>comment</code>.</p>
     *
     * @return a {@link java.util.List} object.
     */
    public List<String> getComment() {
        return comment;
    }

    /**
     * <p>Setter for the field <code>comment</code>.</p>
     *
     * @param comment a {@link java.util.List} object.
     * @return a {@link com.pinapelz.query.CommentSearchQueryBuilder} object.
     */
    public CommentSearchQueryBuilder setComment(List<String> comment) {
        this.comment = comment;
        return this;
    }

    /**
     * <p>isPaginated.</p>
     *
     * @return a boolean.
     */
    public boolean isPaginated() {
        return paginated;
    }

    /**
     * <p>Setter for the field <code>paginated</code>.</p>
     *
     * @param paginated a boolean.
     * @return a {@link com.pinapelz.query.CommentSearchQueryBuilder} object.
     */
    public CommentSearchQueryBuilder setPaginated(boolean paginated) {
        this.paginated = paginated;
        return this;
    }

    /**
     * <p>Getter for the field <code>offset</code>.</p>
     *
     * @return a int.
     */
    public int getOffset() {
        return offset;
    }

    /**
     * <p>Setter for the field <code>offset</code>.</p>
     *
     * @param offset a int.
     * @return a {@link com.pinapelz.query.CommentSearchQueryBuilder} object.
     */
    public CommentSearchQueryBuilder setOffset(int offset) {
        this.offset = offset;
        return this;
    }

    /**
     * <p>Getter for the field <code>limit</code>.</p>
     *
     * @return a int.
     */
    public int getLimit() {
        return limit;
    }

    /**
     * <p>Setter for the field <code>limit</code>.</p>
     *
     * @param limit a int.
     * @return a {@link com.pinapelz.query.CommentSearchQueryBuilder} object.
     */
    public CommentSearchQueryBuilder setLimit(int limit) {
        this.limit = limit;
        return this;
    }
}
