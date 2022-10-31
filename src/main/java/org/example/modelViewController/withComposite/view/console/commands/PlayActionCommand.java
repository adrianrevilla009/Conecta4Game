package org.example.modelViewController.withComposite.view.console.commands;

import org.example.modelViewController.withComposite.types.Message;
import org.example.modelViewController.withComposite.view.console.PlayerView;
import org.example.modelViewController.withComposite.controller.PlayController;

public class PlayActionCommand extends CommandAction {
    public PlayActionCommand(PlayController playController) {
        super(Message.ACTION_COMMAND.toString(), playController);
    }

    public void execute() {
        new PlayerView(this.playController).interact();
        this.playController.next();
        super.execute();
    }

    public boolean isActive() {
        return true;
    }
}
