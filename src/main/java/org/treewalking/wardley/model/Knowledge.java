package org.treewalking.wardley.model;

import lombok.ToString;

@ToString
public class Knowledge extends Capability {
    protected Knowledge(String name, final Stage stage) {
        super(name, stage);
    }
}
