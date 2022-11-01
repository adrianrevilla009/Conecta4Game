package modelViewController.withComposite.domain;

import jdk.jfr.Description;
import org.example.modelViewController.withComposite.domain.Board;
import org.example.modelViewController.withComposite.domain.Cell;
import org.example.modelViewController.withComposite.domain.Memento;
import org.example.modelViewController.withComposite.domain.Turn;
import org.example.modelViewController.withComposite.types.Color;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class MementoTest {
    private Board board;
    private Memento memento;

    @BeforeEach
    public void beforeEach() {
        this.board = new BoardBuilder()
                .player(Color.BLUE)
                .player(Color.GREEN)
                .cell(new Cell(4,1), Color.BLUE)
                .cell(new Cell(4,2), Color.BLUE)
                .cell(new Cell(3,1), Color.GREEN)
                .cell(new Cell(3,2), Color.GREEN)
                .build();
        this.memento = new Memento(this.board, new Turn(this.board));
    }

    @Test
    @Description("Check given a pre build board, when get board of a memento is called, both boards have the same values")
    public void testGivenABuildBoardCheckGetBoardIsTheSame() {
        // need to make them string, comparing two different memory objects returns assert false
        assertThat(this.memento.getBoard().toCharacterArray(), is(this.board.toCharacterArray()));
    }

    @Test
    @Description("Check given memento from a board, check if active player is correct one")
    public void testActivePlayerFromMementoIsCorrectOne() {
        assertThat(this.memento.getActivePlayer(), is(0));
    }

    /*@Test
    @Description("Check given memento from a board and a movement, check if active player is correct one")
    public void testActivePlayerFromMementoWithAMoveIsCorrectOne() {
        this.board.
        assertThat(this.memento.getActivePlayer(), is(0));
    }*/
}
