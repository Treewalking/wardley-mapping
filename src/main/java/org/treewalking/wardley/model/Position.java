package org.treewalking.wardley.model;

import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.ArrayList;
import java.util.Collection;


@EqualsAndHashCode
@ToString
public class Position {

    private final Component component;
    private final Stage stage;

    private final Collection<Dependency> dependencies = new ArrayList<>();

    public Position(Component component, Stage stage) {
        this.component = component;
        this.stage = stage;
    }

    public Position(Position position) {
        this.component = position.component;
        this.stage = position.stage;
        position.dependencies.forEach(dependency -> dependencies.add(new Dependency(dependency)));
    }
    public Collection<Dependency> getDependencies() {
        return dependencies;
    }

    public Component getComponent() {
        return component;
    }
}
