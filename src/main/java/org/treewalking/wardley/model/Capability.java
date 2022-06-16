package org.treewalking.wardley.model;

import lombok.ToString;

@ToString
public abstract class Capability extends Node {

    private final Stage stage;

    protected Capability(final String name, final Stage stage) {
        super(name);
        this.stage = stage;
    }

    private Capability lowerValueCapability;

    @Override
    public void addNeed(final Node need) {
        if (need instanceof User) {
            throw new IllegalArgumentException("A Capability cannot express a Need on a User");
        }

        if (need instanceof UserNeed) {
            throw new IllegalArgumentException("A Capability cannot express a Need on a User Need");
        }

        super.addNeed(need);
    }

}
