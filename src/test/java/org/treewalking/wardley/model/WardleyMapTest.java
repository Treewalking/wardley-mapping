package org.treewalking.wardley.model;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class WardleyMapTest {

    @Test
    public void testCannotAddADuplicateComponent() {
        final WardleyMap map = new WardleyMap();
        map.addComponent("foo", Type.ACTIVITY, Stage.GENISIS);
        assertThrows(IllegalArgumentException.class, () -> map.addComponent("foo", Type.ACTIVITY, Stage.GENISIS));
    }

    @Test
    public void testCanRetrieveAComponentByName() {
        final WardleyMap map = new WardleyMap();
        map.addComponent("foo", Type.ACTIVITY, Stage.GENISIS);
        assertNotNull(map.getComponent("foo"));
    }

    @Test
    public void testCantRetrieveANonExistentComponent() {
        final WardleyMap map = new WardleyMap();
        map.addComponent("foo", Type.ACTIVITY, Stage.GENISIS);
        assertNull(map.getComponent("baa"));
    }

    @Test
    public void testComponentAddedAfterTheDefinedComponent() {
        final WardleyMap map = new WardleyMap();
        map.addComponent("foo", Type.ACTIVITY, Stage.GENISIS);
        map.addComponentAfter("foo", "baa", Type.ACTIVITY, Stage.GENISIS);
        assertIterableEquals(
                Arrays.asList(new Component("foo", Type.ACTIVITY, Stage.GENISIS),
                              new Component("baa", Type.ACTIVITY, Stage.GENISIS)),
                map.getComponents());
    }

    @Test
    public void testAttemptToAddAComponentAfterANonExistentComponentHasAnException() {
        final WardleyMap map = new WardleyMap();
        assertThrows(IllegalArgumentException.class, () -> map.addComponentAfter("foo", "baa", Type.ACTIVITY, Stage.GENISIS));
    }

    @Test
    public void testAddedComponentHasCorrectName() {
        final WardleyMap map = new WardleyMap();
        map.addComponent("foo", Type.ACTIVITY, Stage.GENISIS);
        final Component component = map.getComponent("foo");
        assertEquals("foo", component.getName());
    }
}
