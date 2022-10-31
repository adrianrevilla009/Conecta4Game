package org.example.modelView.withFactoryMethod.view.console;

import org.example.modelView.withFactoryMethod.domain.Cell;
import org.example.modelView.withFactoryMethod.domain.Game;
import org.example.modelView.withFactoryMethod.types.Message;
import org.example.modelView.withFactoryMethod.utils.Console;
import org.example.modelView.withFactoryMethod.view.WithGameView;

public class BoardView extends WithGameView {

    BoardView(Game game) {
        super(game);
    }
    void write() {
        new MessageView(this.game).writeln(Message.HORIZONTAL_LINE);
        for (int i = 0; i < Cell.ROWS; i++) {
            new MessageView(this.game).write(Message.VERTICAL_LINE);
            for (int j = 0; j < Cell.COLUMNS; j++) {
                new ColorView().write(this.game.getColor(new Cell(i, j)));
                new MessageView(this.game).write(Message.VERTICAL_LINE);
            }
            Console.getInstance().writeln();
        }
        new MessageView(this.game).writeln(Message.HORIZONTAL_LINE);
    }
}
