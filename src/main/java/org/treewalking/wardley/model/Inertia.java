package org.treewalking.wardley.model;

import lombok.EqualsAndHashCode;
import lombok.ToString;

@ToString
@EqualsAndHashCode
public class Inertia {

    private final InertiaType inertiaType;
    private final String narrative;

    public Inertia(InertiaType inertiaType, String narrative) {
        this.inertiaType = inertiaType;
        this.narrative = narrative;
    }
}
