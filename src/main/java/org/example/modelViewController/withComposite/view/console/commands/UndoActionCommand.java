package org.example.modelViewController.withComposite.view.console.commands;

import org.example.modelViewController.withComposite.controller.PlayController;
import org.example.modelViewController.withComposite.types.Message;

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
