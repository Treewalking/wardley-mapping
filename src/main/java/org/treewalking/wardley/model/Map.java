package org.treewalking.wardley.model;

import lombok.ToString;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@ToString
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
        return Collections.unmodifiableList(versions);
    }

    public void incrementVersion() {
        versions.add(new Version(++currentVersion, versions.get(versions.size()-1)));
    }
}
