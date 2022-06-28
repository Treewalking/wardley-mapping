package org.treewalking.wardley.model;

import lombok.EqualsAndHashCode;
import lombok.ToString;

@ToString @EqualsAndHashCode
public class Activity extends Capability {
    protected Activity(final String name, final Stage stage, final int latitude) {
        super(name, stage, latitude);
    }
}
