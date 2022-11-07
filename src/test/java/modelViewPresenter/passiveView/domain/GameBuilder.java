package modelViewPresenter.passiveView.domain;

import modelViewController.withComposite.domain.BoardBuilder;
import org.example.modelViewPresenter.passiveView.domain.Board;
import org.example.modelViewPresenter.passiveView.domain.Cell;
import org.example.modelViewPresenter.passiveView.domain.Game;
import org.example.modelViewPresenter.passiveView.types.Color;

import java.util.*;

public class GameBuilder {

    private List<Cell> cellList = new ArrayList<>();
    private Game game;

    public GameBuilder cell(Cell cell, Color color) {
        assert cell.isValid();
        assert !color.isNull();

        this.cellList.add(cell);
        return this;
    }

    public Game build() {
        this.game = new Game();
        this.buildGame();
        return this.game;
    }

    private void buildGame() {
        int count = 0;
        this.game.reset();
        while (count < this.cellList.size()) {
            this.game.putToken(this.cellList.get(count));
            this.game.next();
            count++;
        }
    }


}
