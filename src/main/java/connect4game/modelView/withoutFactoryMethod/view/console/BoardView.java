package main.java.connect4game.modelView.withoutFactoryMethod.view.console;

import main.java.connect4game.modelView.withoutFactoryMethod.domain.Cell;
import main.java.connect4game.modelView.withoutFactoryMethod.domain.Game;
import main.java.connect4game.modelView.withoutFactoryMethod.types.Message;
import main.java.connect4game.modelView.withoutFactoryMethod.utils.Console;
import main.java.connect4game.modelView.withoutFactoryMethod.view.WithGameView;

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
