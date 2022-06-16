package org.treewalking.wardley.model;

import lombok.ToString;

import java.util.ArrayList;
import java.util.Collection;

@ToString
public abstract class Node {
    private final String name;

    private final Collection<Node> needs = new ArrayList<>();
    protected Node(final String name) {
        this.name = name;
    }

    protected void addNeed(final Node need) {
        assert !needs.contains(need);
        needs.add(need);
    }
}
