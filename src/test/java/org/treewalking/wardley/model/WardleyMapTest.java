package org.treewalking.wardley.model;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class WardleyMapTest {

    @Test
    public void testCannotAddADuplicateComponent() {
        final WardleyMap map = new WardleyMap();
        map.addComponent("foo");
        assertThrows(IllegalArgumentException.class, () -> {
            map.addComponent("foo");
        });
    }

    @Test
    public void testCanRetrieveAComponentByName() {
        final WardleyMap map = new WardleyMap();
        map.addComponent("foo");
        assertNotNull(map.getComponent("foo"));
    }

    @Test
    public void testCantRetrieveANonExistentComponent() {
        final WardleyMap map = new WardleyMap();
        map.addComponent("foo");
        assertNull(map.getComponent("baa"));
    }

    @Test
    public void testComponentAddedAfterTheDefinedComponent() {
        final WardleyMap map = new WardleyMap();
        map.addComponent("foo");
        map.addComponentAfter("foo", "baa");
        assertIterableEquals(Arrays.asList("foo", "baa"), map.getComponents());
    }

    @Test
    public void testAttemptToAddAComponentAfterANonExistentComponentHasAnException() {
        final WardleyMap map = new WardleyMap();
        assertThrows(IllegalArgumentException.class, () -> {
            map.addComponentAfter("foo", "baa");
        });
    }
}
