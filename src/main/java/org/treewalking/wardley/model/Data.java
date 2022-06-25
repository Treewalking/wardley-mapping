package org.treewalking.wardley.model;

import lombok.ToString;

@ToString
public class Data extends Capability {
    protected Data(String name, final Stage stage, final int latitude) {
        super(name, stage, latitude);
    }
}
