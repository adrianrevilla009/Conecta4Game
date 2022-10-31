package org.example.modelViewPresenter.passiveView.view.console;

import org.example.modelViewPresenter.passiveView.types.Color;
import org.example.modelViewPresenter.passiveView.types.Message;
import org.example.modelViewPresenter.passiveView.view.PlayerViewInterface;

public class PlayerView implements PlayerViewInterface {
    public void writeWinner(Color color) {
        new MessageView().writeln(Message.PLAYER_WIN, color.name());
    }
}
