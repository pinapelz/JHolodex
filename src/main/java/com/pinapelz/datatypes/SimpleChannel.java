package com.pinapelz.datatypes;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Simple channel object
 *
 * @author pinapelz
 * @version $Id: $Id
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class SimpleChannel {
    public String id;
    public String name;
    public String english_name;
    public String type;
    public String photo;
    public String org;
}
