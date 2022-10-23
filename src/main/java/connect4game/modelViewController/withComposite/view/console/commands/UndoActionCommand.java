package main.java.connect4game.modelViewController.withComposite.view.console.commands;

import main.java.connect4game.modelViewController.withComposite.controller.PlayController;
import main.java.connect4game.modelViewController.withComposite.types.Message;

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
