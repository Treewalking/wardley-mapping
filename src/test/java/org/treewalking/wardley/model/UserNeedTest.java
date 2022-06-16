package org.treewalking.wardley.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class UserNeedTest {

    @Test
    public void testCannotAddNeedBetweenUserNeedAnduser() {
        final UserNeed userNeed = new UserNeed("user need");
        final User user = new User("user");
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            userNeed.addNeed(user);
        });
        assertEquals("A User Need cannot express a Need on a User", exception.getMessage());
    }
}
