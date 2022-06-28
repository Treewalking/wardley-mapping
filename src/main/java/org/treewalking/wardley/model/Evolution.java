package org.treewalking.wardley.model;

import lombok.EqualsAndHashCode;
import lombok.ToString;

@ToString
@EqualsAndHashCode
public class Evolution {

    private final Capability capability;

    private Inertia inertia;

    public Evolution(Capability capability) {
        this.capability = capability;
    }
}
