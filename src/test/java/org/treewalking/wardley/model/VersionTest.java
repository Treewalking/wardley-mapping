package org.treewalking.wardley.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VersionTest {

    @Test
    public void testNewVersionHasACopyOfThePreviousVersionsPositions() {
        final Version previousVersion = new Version(1);
        previousVersion.getPositions().add(new Position(new Component(Type.ACTIVITY,"foo"), Stage.ONE));
        final Version nextVersion = new Version(2, previousVersion);
        assertEquals(previousVersion.getPositions(), nextVersion.getPositions());
    }

    @Test
    public void testToString() {
        final Version version = new Version(1);
        final Position position1 = new Position(new Component(Type.ACTIVITY, "foo-1"), Stage.ONE);
        final Position position2 = new Position(new Component(Type.ACTIVITY, "foo-2"), Stage.ONE);
        position1.getDependencies().add(new Dependency(position2));

        version.getPositions().add(position1);
        version.getPositions().add(position2);

        System.out.println(version);
    }
}
