package org.treewalking.wardley.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WardleyMapTest {

    @Test
    public void testMapShouldHaveAName() {
        final WardleyMap map = new WardleyMap("foo");
        assertEquals("foo", map.getName());
    }
}
