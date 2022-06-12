package org.treewalking.wardley.model;

import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@ToString
public class Version {

    private final int version;

    private final List<Position> positions = new ArrayList<>();

    public Version(int version) {
        this(version, null);
    }
    public Version(int version, final Version previousVersion) {
        this.version = version;
        if (previousVersion != null) {
            previousVersion.positions.forEach(position -> positions.add(new Position(position)));
        }
    }

    public List<Position> getPositions() {
        return positions;
    }
}
