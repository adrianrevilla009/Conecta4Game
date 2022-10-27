package main.java.connect4game.modelViewController.withComposite.src.view.console.commands;

import main.java.connect4game.modelViewController.withComposite.src.controller.PlayController;
import main.java.connect4game.modelViewController.withComposite.src.types.Message;

public class UndoActionCommand extends CommandAction {
    public UndoActionCommand(PlayController playController) {
        super(Message.UNDO_COMMAND.toString(), playController);
    }

    @Override
    public void execute() {
        this.playController.undo();
        super.execute();
    }

    @Override
    public boolean isActive() {
        return this.playController.undoable();
    }
}
