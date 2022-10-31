package org.example.modelViewController.withComposite.view.console;

import org.example.modelViewController.withComposite.controller.PlayController;
import org.example.modelViewController.withComposite.view.console.commands.PlayActionCommand;
import org.example.modelViewController.withComposite.view.console.commands.RedoActionCommand;
import org.example.modelViewController.withComposite.view.console.commands.UndoActionCommand;

public class PlayMenu extends Menu{

    public PlayMenu(PlayController playController) {
        // TODO patron command
        this.addCommand(new PlayActionCommand(playController));
        this.addCommand(new UndoActionCommand(playController));
        this.addCommand(new RedoActionCommand(playController));
    }
}
