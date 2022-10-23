package main.java.connect4game.modelViewPresenter.passiveView.view.console;

import main.java.connect4game.modelViewPresenter.passiveView.types.Color;
import main.java.connect4game.modelViewPresenter.passiveView.types.Message;
import main.java.connect4game.modelViewPresenter.passiveView.view.PlayerViewInterface;

public class PlayerView implements PlayerViewInterface {
    public void writeWinner(Color color) {
        new MessageView().writeln(Message.PLAYER_WIN, color.name());
    }
}
