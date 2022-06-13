package org.treewalking.wardley.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class VersionTest {

    @Test
    public void testNewVersionHasACopyOfThePreviousVersionsPositions() {
        final Version previousVersion = new VersionBuilder(1)
                .withPosition("foo-1", Type.ACTIVITY, Stage.ONE)
                .withPosition("foo-2", Type.ACTIVITY, Stage.ONE)
                .build();

        final Version nextVersion = new Version(2, previousVersion);
        assertEquals(previousVersion.getPositions(), nextVersion.getPositions());
    }

    @Test
    public void testCannotAddANullPosition() {
        final Version version = new VersionBuilder(1).build();
        assertThrows(NullPointerException.class, () -> {
            version.addPosition(null);
        });
    }

    @Test
    public void testCannotIntroduceANullDependency() {
        assertThrows(NullPointerException.class, () -> {
            final Version version = new VersionBuilder(1)
                    .withPosition("foo-1", Type.ACTIVITY, Stage.ONE)
                    .withPosition("foo-2", Type.ACTIVITY, Stage.ONE)
                    .withDependency("foo-1", "foo-3")
                    .build();
        });
    }


    class VersionBuilder {

        private Version version;
        public VersionBuilder(final int version) {
            this.version = new Version(version);
        }

        public Version build() {
            return version;
        }

        public VersionBuilder withPosition(final String name, final Type type, final Stage stage) {
            version.addPosition(new Position(new Component(type, name), stage));
            return this;
        }

        public VersionBuilder withDependency(final String dependent, final String dependee) {

            Position dependentPosition = version.getPositions()
                    .stream()
                    .filter(p -> p.getComponent().getName().equals(dependent))
                    .findFirst()
                    .orElseGet(null);

            Position dependeePosition = version.getPositions()
                    .stream()
                    .filter(p -> p.getComponent().getName().equals(dependee))
                    .findFirst()
                    .orElseGet(null);

            version.addDependency(dependentPosition, dependeePosition);
            return this;
        }
    }
}
