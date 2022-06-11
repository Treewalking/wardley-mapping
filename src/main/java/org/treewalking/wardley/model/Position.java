package org.treewalking.wardley.model;

import java.util.ArrayList;
import java.util.Collection;

public class Position {

    private final Component component;
    private final Stage stage;
    private  Position nextPosition;

    private final Collection<Dependency> dependencies = new ArrayList<>();

    public Position(Component component, Stage stage) {
        this.component = component;
        this.stage = stage;
    }
}
