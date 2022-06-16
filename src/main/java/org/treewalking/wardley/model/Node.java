package org.treewalking.wardley.model;

import java.util.ArrayList;
import java.util.Collection;

public abstract class Node {
    private String name;

    private Collection<Node> needs = new ArrayList<>();
    protected Node(final String name) {
        this.name = name;
    }

    protected void addNeed(final Node need) {
        assert !needs.contains(need);
        needs.add(need);
    }
}
