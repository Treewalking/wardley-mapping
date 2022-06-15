package org.treewalking.wardley.model;

import java.util.*;
import java.util.stream.Collectors;

public class WardleyMap {

    final Map<String, Component> names = new HashMap<>();
    final LinkedList<Component> valueChain = new LinkedList<>();

    public void addComponent(String name, Type type, Stage stage) {
        if (names.containsKey(name)) {
            throw new IllegalArgumentException("Component already exists in the Map");
        }

        final Component component = new Component(name, type, stage);
        names.put(name, component);
        valueChain.addFirst(component);
    }

    public Component getComponent(String name) {
        return names.get(name);
    }

    public void addComponentAfter(String before, String name, Type type, Stage stage) {
        final int index =
                valueChain.stream()
                        .map(Component::getName)
                        .collect(Collectors.toList())
                        .indexOf(before);

        if (index == -1) {
            throw new IllegalArgumentException("Before Component does not exist");
        }
        final Component component = new Component(name, type, stage);
        names.put(name, component);
        valueChain.add(index+1, component);
    }

    public List<Component> getComponents() {
        return valueChain;
    }
}
