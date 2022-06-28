package org.treewalking.wardley.model;

import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.ArrayList;
import java.util.Collection;

@ToString @EqualsAndHashCode
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

    public Object getName() {
        return name;
    }
}
