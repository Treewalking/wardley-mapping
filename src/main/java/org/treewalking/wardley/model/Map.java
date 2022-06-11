package org.treewalking.wardley.model;

import java.util.ArrayList;
import java.util.List;

public class Map {

    private final List<Version> versions = new ArrayList<>();
    private int currentVersion = 0;

    public Map() {
        versions.add(new Version(currentVersion));
    }
    public int getVersion() {
        return currentVersion;
    }

    public List<Version> getVersions() {
        return versions;
    }

    public void incrementVersion() {
        versions.add(new Version(++currentVersion));
    }
}
