package org.treewalking.wardley.model;

import java.util.ArrayList;
import java.util.Collection;

public class WardleyMap {

    private String Name;

    private String purpose;

    private Collection<User> users = new ArrayList<>();

    private Collection<UserNeed> userNeeds = new ArrayList<>();

    private Capability highestValueCapability;
}
