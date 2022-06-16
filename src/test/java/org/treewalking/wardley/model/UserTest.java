package org.treewalking.wardley.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class UserTest {

    @Test
    public void testCannotAddNeedBetweenTwoUsers() {
        final User user1 = new User("user1");
        final User user2 = new User("user2");
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            user1.addNeed(user2);
        });
        assertEquals("A User cannot express a Need on another User", exception.getMessage());
    }
}
