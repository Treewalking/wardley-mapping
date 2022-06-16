package org.treewalking.wardley.model;

public abstract class Capability extends Node {

    private Stage stage;

    protected Capability(final String name, final Stage stage) {
        super(name);
        this.stage = stage;
    }

    private Capability lowerValueCapability;
}
