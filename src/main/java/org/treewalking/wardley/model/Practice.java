package org.treewalking.wardley.model;

import lombok.ToString;

@ToString
public class Practice  extends Capability {
    protected Practice(String name, final Stage stage, final int latitude) {
        super(name, stage, latitude);
    }
}
