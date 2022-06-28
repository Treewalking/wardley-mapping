package org.treewalking.wardley.model;

import lombok.EqualsAndHashCode;
import lombok.ToString;

@ToString @EqualsAndHashCode
public abstract class Capability extends Node {

    private final Stage stage;
    private final int latitude;

    private Evolution evolution;

    protected Capability(final String name, final Stage stage, final int latitude) {
        super(name);
        this.stage = stage;
        this.latitude = latitude;
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
