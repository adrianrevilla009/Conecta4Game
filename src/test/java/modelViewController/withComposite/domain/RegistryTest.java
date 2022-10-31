package modelViewController.withComposite.domain;

import jdk.jfr.Description;
import org.example.modelViewController.withComposite.domain.Game;
import org.example.modelViewController.withComposite.domain.Registry;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RegistryTest {

    private Registry registry;

    @BeforeEach
    public void beforeEach() {
        Game game = new Game();
        this.registry = new Registry(game);
    }

    @Test()
    @Description("Test with an empty registry, that is not possible to undo or redo")
    public void testNotUndoableOrRedoableWithEmptyRegistry() {
        assertFalse(this.registry.undoable());
        assertFalse(this.registry.redoable());
    }

    @Test()
    @Description("Test with a registry with one element (single movement), that it is possible to undo and not to redo")
    public void testUndoableAndNotRedoableWithOneElementRegistry() {
        this.registry.register();
        assertTrue(this.registry.undoable());
        assertFalse(this.registry.redoable());
    }

    @Test()
    @Description("Test with a registry with one element (single movement), that after an undo its not possible to make it again")
    public void testUndoableAfterUndoWithOneElementRegistry() {
        this.registry.register();
        this.registry.undo();
        assertFalse(this.registry.undoable());
    }

    @Test()
    @Description("Test with a registry with one element (single movement), that after an undo it is possible to do a redo")
    public void testRedoableAfterUndoWithOneElementRegistry() {
        this.registry.register();
        this.registry.undo();
        assertTrue(this.registry.redoable());
    }
}
