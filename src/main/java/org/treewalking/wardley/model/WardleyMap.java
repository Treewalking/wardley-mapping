package org.treewalking.wardley.model;

import lombok.ToString;

import java.util.*;

@ToString
public class WardleyMap {

    private final String name;

    private final Collection<User> users = new ArrayList<>();

    private final Collection<UserNeed> userNeeds = new ArrayList<>();

    private LinkedList<Capability> capabilityValueChain = new LinkedList<>();

    public WardleyMap(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public List<Capability> getCapabilityValueChain() {
        return Collections.unmodifiableList(capabilityValueChain);
    }

    public void addCapabilityAtEnd(Capability capability) {

        if (capabilityValueChain.stream().filter(c -> c.equals(capability)).count() > 0) {
            throw new IllegalArgumentException("A duplicate capability already exists");
        }

        capabilityValueChain.addLast(capability);
    }
}
