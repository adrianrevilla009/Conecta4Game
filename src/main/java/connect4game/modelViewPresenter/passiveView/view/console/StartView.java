package main.java.connect4game.modelViewPresenter.passiveView.view.console;

import main.java.connect4game.modelViewPresenter.passiveView.types.Message;
import main.java.connect4game.modelViewPresenter.passiveView.view.StartViewInterface;

public class StartView implements StartViewInterface {

    public void write() {
        new MessageView().writeln(Message.TITLE);
    }
}
