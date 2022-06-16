package org.treewalking.wardley.model;

import lombok.ToString;

@ToString
public class Activity extends Capability {
    protected Activity(final String name, final Stage stage) {
        super(name, stage);
    }
}
