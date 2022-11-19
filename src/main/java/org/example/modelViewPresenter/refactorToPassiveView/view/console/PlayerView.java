package org.example.modelViewPresenter.refactorToPassiveView.view.console;

import org.example.modelViewPresenter.refactorToPassiveView.types.Color;
import org.example.modelViewPresenter.refactorToPassiveView.types.Message;

public class PlayerView {

    public void writeWinner(Color color) {
        new MessageView().writeln(Message.PLAYER_WIN, color.name());
    }


}
