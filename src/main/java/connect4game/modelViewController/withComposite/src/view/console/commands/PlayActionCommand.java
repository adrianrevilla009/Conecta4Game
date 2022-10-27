package main.java.connect4game.modelViewController.withComposite.src.view.console.commands;

import main.java.connect4game.modelViewController.withComposite.src.types.Message;
import main.java.connect4game.modelViewController.withComposite.src.view.console.PlayerView;
import main.java.connect4game.modelViewController.withComposite.src.controller.PlayController;

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
