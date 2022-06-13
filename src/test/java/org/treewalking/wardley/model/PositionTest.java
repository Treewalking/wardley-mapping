package org.treewalking.wardley.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class PositionTest {

    @Test
    public void testCopiedPositionIsEqual() {
        final Position position1 = new Position(new Component(Type.ACTIVITY, "foo-1"), Stage.ONE);
        final Position position2 = new Position(new Component(Type.ACTIVITY, "foo-2"), Stage.ONE);
        position1.addDependency(position2);
        final Position copiedPosition = new Position(position1);

        assertEquals(position1, copiedPosition);
    }

    @Test
    public void testRetrievedDependenciesListIsImmutable() {
        final Position position = new Position(new Component(Type.ACTIVITY, "foo-1"), Stage.ONE);
        assertThrows(UnsupportedOperationException.class, () -> {
            position.getDependencies().add(new Dependency(position)) ;
        });
    }
}
