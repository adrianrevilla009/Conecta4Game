package main.java.connect4game.modelViewController.withComposite.view.console;

import main.java.connect4game.modelViewController.withComposite.controller.PlayController;
import main.java.connect4game.modelViewController.withComposite.view.console.commands.PlayActionCommand;
import main.java.connect4game.modelViewController.withComposite.view.console.commands.RedoActionCommand;
import main.java.connect4game.modelViewController.withComposite.view.console.commands.UndoActionCommand;

public class PlayMenu extends Menu{

    public PlayMenu(PlayController playController) {
        // TODO patron command
        this.addCommand(new PlayActionCommand(playController));
        this.addCommand(new UndoActionCommand(playController));
        this.addCommand(new RedoActionCommand(playController));
    }
}
