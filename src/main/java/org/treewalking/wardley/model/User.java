package org.treewalking.wardley.model;

import lombok.EqualsAndHashCode;
import lombok.ToString;

@ToString @EqualsAndHashCode
public class User extends Node {
    protected User(String name) {
        super(name);
    }

    @Override
    public void addNeed(final Node need) {
        if (need instanceof User) {
            throw new IllegalArgumentException("A User cannot express a Need on another User");
        }
        super.addNeed(need);
    }
}
