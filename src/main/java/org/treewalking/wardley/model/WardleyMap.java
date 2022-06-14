package org.treewalking.wardley.model;

import java.util.*;

public class WardleyMap {

    final Map<String, String> names = new HashMap<>();
    final LinkedList<String> valueChain = new LinkedList<>();

    public void addComponent(String name) {
        if (names.containsKey(name)) {
            throw new IllegalArgumentException("Component already exists in the Map");
        }
        names.put(name, name);
        valueChain.addFirst(name);
    }

    public String getComponent(String name) {
        return names.get(name);
    }

    public void addComponentAfter(String before, String after) {
        names.put(after, after);
        final int index = valueChain.indexOf(before);
        if (index == -1) {
            throw new IllegalArgumentException("Before Component does not exist");
        }
        valueChain.add(index+1, after);

    }

    public List<String> getComponents() {
        return valueChain;
    }
}
