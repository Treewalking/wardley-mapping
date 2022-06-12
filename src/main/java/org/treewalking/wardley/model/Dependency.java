package org.treewalking.wardley.model;

import lombok.EqualsAndHashCode;
import lombok.ToString;

@EqualsAndHashCode
public class Dependency {

    @ToString.Exclude
    private final Position position;

    public Dependency(Position position) {
        this.position = position;
    }
    public Dependency(Dependency dependency) {
        this.position = dependency.position;
    }

    @Override
    public String toString() {
        return "Dependency(" +
                "position=" + position.getComponent().getName() +
                ')';
    }
}
