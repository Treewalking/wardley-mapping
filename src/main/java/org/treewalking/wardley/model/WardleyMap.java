package org.treewalking.wardley.model;

import lombok.ToString;

import java.util.ArrayList;
import java.util.Collection;

@ToString
public class WardleyMap {

    private final String name;

    private String purpose;

    private final Collection<User> users = new ArrayList<>();

    private final Collection<UserNeed> userNeeds = new ArrayList<>();

    private Capability highestValueCapability = null;

    public WardleyMap(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Object getToplevelCapability() {
        return  highestValueCapability;
    }
}
