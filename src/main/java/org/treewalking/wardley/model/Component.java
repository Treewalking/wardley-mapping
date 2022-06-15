package org.treewalking.wardley.model;

import lombok.EqualsAndHashCode;
import lombok.ToString;

@ToString @EqualsAndHashCode
public class Component {

    final private String name;
    final private Type type;
    final private Stage stage;

    public Component(String name, Type type, Stage stage) {
        this.name = name;
        this.type = type;
        this.stage = stage;
    }

    public String getName() {
        return name;
    }
}
