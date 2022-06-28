package org.treewalking.wardley.model;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class WardleyMapTest {

    @Test
    public void testMapShouldHaveAName() {
        final WardleyMap map = givenAWardleyMap();
        assertEquals("foo", map.getName());
    }

    @Test
    public void testNewMapHasNoCapabilities() {
        final WardleyMap map = givenAWardleyMap();
        assertTrue(map.getCapabilityValueChain().isEmpty());
    }

    @Test
    public void testAddTheFirstCapabilityResultsInASingleEntry() {
        final WardleyMap map = givenAWardleyMap();
        map.addCapabilityAtEnd(new Activity("foo", Stage.GENESIS, 0));
        assertEquals(new ArrayList<>(Arrays.asList(new Activity("foo", Stage.GENESIS, 0))),
                map.getCapabilityValueChain());
    }

    @Test
    public void testCannotAddADuplicateCapability() {
        final WardleyMap map = givenAWardleyMap();
        map.addCapabilityAtEnd(new Activity("foo", Stage.GENESIS, 0));
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            map.addCapabilityAtEnd(new Activity("foo", Stage.GENESIS, 0));
        });
        assertEquals("A duplicate capability already exists", exception.getMessage());
    }

    private WardleyMap givenAWardleyMap() {
        return new WardleyMap("foo");
    }
}
