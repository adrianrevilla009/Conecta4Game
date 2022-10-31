package org.example.modelViewPresenter.passiveView.view.console;

import org.example.modelViewPresenter.passiveView.types.Message;
import org.example.modelViewPresenter.passiveView.view.StartViewInterface;

public class StartView implements StartViewInterface {

    public void write() {
        new MessageView().writeln(Message.TITLE);
    }
}
