package org.example.modelViewController.withComposite.view.console.commands;

import org.example.modelViewController.withComposite.controller.PlayController;
import org.example.modelViewController.withComposite.types.Message;

public class RedoActionCommand extends CommandAction {
    public RedoActionCommand(PlayController playController) {
        super(Message.REDO_COMMAND.toString(), playController);
    }

    @Override
    public void execute() {
        this.playController.redo();
        super.execute();
    }

    @Override
    public boolean isActive() {
        return this.playController.redoable();
    }
}
