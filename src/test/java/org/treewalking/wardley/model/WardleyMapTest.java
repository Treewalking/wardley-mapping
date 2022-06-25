package org.treewalking.wardley.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class WardleyMapTest {

    @Test
    public void testMapShouldHaveAName() {
        final WardleyMap map = givenAWardleyMap();
        assertEquals("foo", map.getName());
    }

    @Test
    public void testMapHasNoTopLevelCapability() {
        final WardleyMap map = givenAWardleyMap();
        assertNull(map.getToplevelCapability());
    }

    private WardleyMap givenAWardleyMap() {
        return new WardleyMap("foo");
    }

}
