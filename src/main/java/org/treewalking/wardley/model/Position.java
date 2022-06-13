package org.treewalking.wardley.model;

import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;


@EqualsAndHashCode
@ToString
public class Position {

    private final Component component;
    private final Stage stage;

    private final List<Dependency> dependencies = new ArrayList<>();

    public Position(Component component, Stage stage) {
        this.component = component;
        this.stage = stage;
    }

    public Position(Position position) {
        this.component = position.component;
        this.stage = position.stage;
        position.dependencies.forEach(dependency -> dependencies.add(new Dependency(dependency)));
    }
    public List<Dependency> getDependencies() {
        return Collections.unmodifiableList(dependencies);
    }

    public Component getComponent() {
        return component;
    }

    public void addDependency(Position dependee) {
        dependencies.add(new Dependency(dependee));
    }
}
