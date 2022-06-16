package org.treewalking.wardley.model;

public class UserNeed extends Node {
    protected UserNeed(String name) {
        super(name);
    }

    @Override
    public void addNeed(final Node need) {
        if (need instanceof User) {
            throw new IllegalArgumentException("A User Need cannot express a Need on a User");
        }
        super.addNeed(need);
    }
}
