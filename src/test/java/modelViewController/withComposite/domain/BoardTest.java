package modelViewController.withComposite.domain;

import jdk.jfr.Description;
import org.example.modelViewController.withComposite.domain.Board;
import org.example.modelViewController.withComposite.domain.Cell;
import org.example.modelViewController.withComposite.types.Color;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;

import static java.util.Map.entry;
import static org.junit.jupiter.api.Assertions.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class BoardTest {

    private Board board;
    private BoardBuilder boardBuilder;

    @BeforeEach
    public void beforeEach() {
        this.board = new Board();
        this.board.putToken(new Cell(4,1), Color.BLUE);
        this.board.putToken(new Cell(4,2), Color.BLUE);
        this.board.putToken(new Cell(3,1), Color.GREEN);
        this.board.putToken(new Cell(3,2), Color.GREEN);
        // with builder
        this.boardBuilder = new BoardBuilder();
    }

    @Test()
    @Description("Check whether board has occupied positions when it is reset or not")
    public void testEmptyBoardWhenReset() {
        this.board.reset();
        assertEquals(this.board.getOccupiedCells(), 0);
    }

    @Test()
    @Description("Check whether a token is added in the board, that token has been stored or not")
    public void testWhenPutTokenBoardCellNumberIncreased() {
        this.board.putToken(new Cell(3,4), Color.BLUE);
        int numberOfBlueCellsInBoard = this.board.getOccupiedCells() - 2;
        // trying to assert that (hamcrest)
        assertThat(numberOfBlueCellsInBoard, is(3));
    }

    @Test()
    @Description("Check whether a token with NULL color is added in the board, the assert statement is triggered")
    public void testWhenPutTokenWithNullColorAssertIsThrown() {
        assertThrows(AssertionError.class, () -> {
            this.board.putToken(new Cell(3,4), Color.NULL);
        });
    }

    @Test()
    @Description("Check whether a cell is given return its color of the board or not")
    public void testCorrectColorWhenGetColorFromACellInBoard() {
        Color color = this.board.getColor(new Cell(4,1));
        assertEquals(color, Color.BLUE);
    }

    @Test()
    @Description("Check given some i and j positions of the board, whether a cell of a color is already added in or not")
    public void testGivenCoordinateAndColorIfBoardCellIsOccupied() {
        assertTrue(this.board.isOccupied(new Cell(4,1), Color.BLUE));
        assertFalse(this.board.isOccupied(new Cell(4,1), Color.GREEN));
        assertFalse(this.board.isOccupied(new Cell(1,3), Color.BLUE));
    }

    @Test()
    @Description("Check given some i and j positions of the board, whether a cell is added or not")
    public void testGivenACellIfBoardPositionIsEmpty() {
        assertFalse(this.board.isEmpty(new Cell(4,1)));
        assertTrue(this.board.isEmpty(new Cell(1,5)));
    }

    @Test()
    @Description("Check given some coordinates to make 4 in a row in the board, whether the algorithm identifies it as a " +
            "concrete color win play")
    public void testGiven4SameColorCellsIfIsConnect4() {
        this.board.putToken(new Cell(4,3), Color.BLUE);
        this.board.putToken(new Cell(4,4), Color.BLUE);
        assertTrue(this.board.isConnect4(Color.BLUE));
    }

    @Test()
    @Description("Check given some coordinates to make 4 in a row in the board, an assert exception is triggered when" +
            "NULL color is tested as a winner color")
    public void testGiven4SameColorCellsNullWinColorAssertIsThrown() {
        this.board.putToken(new Cell(4,3), Color.BLUE);
        this.board.putToken(new Cell(4,4), Color.BLUE);
        assertThrows(AssertionError.class, () -> {
            this.board.isConnect4(Color.NULL);
        });
    }

    @Test()
    @Description("Check populating a board until its limit cell number, whether it is full or not")
    public void testIsFullBoard() {
        this.board.reset();
        for (int i = 0; i < Cell.ROWS; i++) {
            for (int j = 0; j < Cell.COLUMNS; j++) {
                if (i % 2 == 0) {
                    this.board.putToken(new Cell(i,j), Color.BLUE);
                } else {
                    this.board.putToken(new Cell(i,j), Color.GREEN);
                }
            }
        }
        assertTrue(this.board.isFullBoard());
    }

    @Test()
    @Description("Check number of already added cells into the board")
    public void testGetNumberOfTheAlreadyAddedCellsIntoTheBoard() {
        int numberOfOccupiedCells = this.board.getOccupiedCells();
        assertEquals(numberOfOccupiedCells, 4);
    }

    @Test()
    @Description("Check whether a given color matches in an already added cells into the board")
    public void testGivenSomeCellCoordinatesIfTheReturnedColorMatches() {
        Color blueColor = this.board.getColorFromCell(new Cell(4,1));
        Color greenColor = this.board.getColorFromCell(new Cell(1,3));
        assertEquals(blueColor, Color.BLUE);
        assertEquals(greenColor, Color.NULL);
    }

    @Test()
    @Description("Check given a column index the next free row in the board")
    public void testGivenAColumnIndexIfTheNextFreeRowIndexMatches() {
        int nextFreeRow = this.board.getNextFreeRowByColumn(1);
        assertEquals(nextFreeRow, 2);
    }

    // Tambien podriamos montar un builder para que la inicializacion del board este desacoplada de los propios metodos del board
    @Test()
    @Description("Check whether a token is added in the board, that token has been stored or not")
    public void testWhenPutTokenBoardCellNumberIncreasedWithBuilder() {
        this.board.reset();
        List<Cell> player1Cells = Arrays.asList(
                new Cell(4,1),
                new Cell(4,2));
        List<Cell> player2Cells = Arrays.asList(
                new Cell(3,1),
                new Cell(3,2));
        Board board = this.boardBuilder.cells(
                Map.ofEntries(
                        entry(Color.BLUE, player1Cells),
                        entry(Color.GREEN, player2Cells)
                )
        ).build();

        board.putToken(new Cell(3,4), Color.BLUE);
        int numberOfBlueCellsInBoard = board.getOccupiedCells() - 2;
        assertTrue(numberOfBlueCellsInBoard == 3);
    }

}