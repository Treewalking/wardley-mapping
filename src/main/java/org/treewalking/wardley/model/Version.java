package org.treewalking.wardley.model;

import lombok.NonNull;
import lombok.ToString;

import java.util.ArrayList;
import java.util.Collections;
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
        return Collections.unmodifiableList(positions);
    }

    public void addPosition(@NonNull Position position) {
        assert !positions.contains(position);
        positions.add(position);
    }

    public void addDependency(@NonNull Position dependant, @NonNull Position dependee) {
        dependant.addDependency(dependee);
    }
}
