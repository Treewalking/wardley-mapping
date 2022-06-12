package org.treewalking.wardley.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MapTest {
    @Test
    public void testMapsInitialVersionIsZero() {
        final Map map = new Map();
        assertEquals(0, map.getVersion());
    }

    @Test
    public void testMapHasASingleVersion() {
        final Map map = new Map();
        assertEquals(1, map.getVersions().size());
    }

    @Test
    public void testIncrementingTheVersionResultsInANewVersion() {
        final Map map = new Map();
        map.incrementVersion();
        assertEquals(2, map.getVersions().size());
    }

    @Test
    public void testIncrementingTheVersionOnAnInitialMapHasVersionOfOne() {
        final Map map = new Map();
        map.incrementVersion();
        assertEquals(1, map.getVersion());
    }
}
