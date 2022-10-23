package main.java.connect4game.modelViewController.withComposite.view.console.commands;

import main.java.connect4game.modelViewController.withComposite.controller.PlayController;
import main.java.connect4game.modelViewController.withComposite.types.Message;

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
