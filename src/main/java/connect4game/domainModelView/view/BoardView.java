package main.java.connect4game.domainModelView.view;

import main.java.connect4game.domainModelView.domain.Cell;
import main.java.connect4game.domainModelView.utils.Console;
import main.java.connect4game.domainModelView.domain.Game;
import main.java.connect4game.domainModelView.types.Message;

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
