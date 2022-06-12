package org.treewalking.wardley.model;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode
public class Component {
    private final Type type;
    private final String name;

    public Component(Type type, String name) {
        this.type = type;
        this.name = name;
    }

    public Type getType() {
        return type;
    }

    public String getName() {
        return name;
    }
}
