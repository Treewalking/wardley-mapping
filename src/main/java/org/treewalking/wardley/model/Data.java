package org.treewalking.wardley.model;

import lombok.ToString;

@ToString
public class Data extends Capability {
    protected Data(String name, final Stage stage) {
        super(name, stage);
    }
}
