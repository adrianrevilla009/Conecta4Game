package org.example.modelViewPresenter.refactorToPassiveView.view.console;

import org.example.modelViewPresenter.refactorToPassiveView.types.Message;

public class StartView {
    public void write() {
        new MessageView().writeln(Message.TITLE);
    }
}
