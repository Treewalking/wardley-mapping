package org.treewalking.wardley.model;

import lombok.EqualsAndHashCode;
import lombok.ToString;

@ToString @EqualsAndHashCode
public class Knowledge extends Capability {
    protected Knowledge(String name, final Stage stage, final int latitude) {
        super(name, stage, latitude);
    }
}
