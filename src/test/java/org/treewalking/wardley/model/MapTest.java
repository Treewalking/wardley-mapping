package org.treewalking.wardley.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MapTest {
    @Test
    public void testMapsInitialVersionIsZero() {
        final Map map = new Map();
        assertEquals(0, map.getVersion());
    }
}
