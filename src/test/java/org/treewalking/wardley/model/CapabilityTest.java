package org.treewalking.wardley.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CapabilityTest {

    @Test
    public void testCannotAddNeedBetweenCapabilityAndAUser() {
        final TestCapability capability = new TestCapability("capability");
        final User user = new User("user");
        Exception exception = assertThrows(IllegalArgumentException.class, () -> capability.addNeed(user));
        assertEquals("A Capability cannot express a Need on a User", exception.getMessage());
    }

    @Test
    public void testCannotAddNeedBetweenCapabilityAndAUserNeed() {
        final TestCapability capability = new TestCapability("capability");
        final UserNeed userNeed = new UserNeed("user need");
        Exception exception = assertThrows(IllegalArgumentException.class, () -> capability.addNeed(userNeed));
        assertEquals("A Capability cannot express a Need on a User Need", exception.getMessage());
    }

    static class TestCapability extends Capability {

        protected TestCapability(String name) {
            super(name, Stage.CUSTOM, 0);
        }
    }
}
