package main.java.connect4game.modelViewController.withComposite.test.domain;

import jdk.jfr.Description;
import main.java.connect4game.modelViewController.withComposite.src.domain.Board;
import main.java.connect4game.modelViewController.withComposite.src.domain.Cell;
import main.java.connect4game.modelViewController.withComposite.src.types.Color;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class BoardTest {

    private Board board;

    @BeforeEach
    public void beforeEach() {
        this.board = new Board();
        Map<Color, List<Cell>> cellMap = new HashMap<>();
        cellMap.put(Color.BLUE, new ArrayList<>(Arrays.asList(new Cell(1, 1), new Cell(1, 2))));
        cellMap.put(Color.GREEN, new ArrayList<>(Arrays.asList(new Cell(2, 1), new Cell(2, 2))));
        this.board.setCellMap(cellMap);
    }

    @Test()
    @Description("Check whether board map where cells are stored, is emptied of not")
    public void testReset() {
        // given
        // when
        this.board.reset();
        //then
        assertEquals(this.board.getOccupiedCells(), 0);
    }

    @Test()
    @Description("Check whether a token is added in cellMap or not")
    public void testPutToken() {
        // given
        // when
        this.board.putToken(new Cell(3,4), Color.BLUE);
        //then
        assertTrue(this.board.getOccupiedCells() == 3);
    }

    @Test()
    @Description("Check whether a cell is given return its color in the cellMap or not")
    public void testGetColor() {
        // given
        // when
        Color color = this.board.getColor(new Cell(1,1));
        //then
        assertEquals(color, Color.BLUE);
    }

    @Test()
    @Description("Check whether a cell is already added in the cellMap or not")
    public void testIsOccupied() {
        // given
        // when
        Boolean isOccupied = this.board.isOccupied(new Cell(1,1), Color.BLUE);
        Boolean isOccupied2 = this.board.isOccupied(new Cell(1,1), Color.GREEN);
        Boolean isOccupied3 = this.board.isOccupied(new Cell(1,3), Color.BLUE);
        //then
        assertTrue(isOccupied);
        assertFalse(isOccupied2);
        assertFalse(isOccupied3);
    }

    @Test()
    @Description("Check whether a cell is not added in the cellMap or it is")
    public void testIsEmpty() {
        // given
        // when
        Boolean isEmpty = this.board.isEmpty(new Cell(1,1));
        Boolean isEmpty2 = this.board.isEmpty(new Cell(1,5));
        //then
        assertFalse(isEmpty);
        assertTrue(isEmpty2);
    }

    @Test()
    @Description("Check whether any player has win the game or not")
    public void testIsConnect4() {
        // given
        this.board.putToken(new Cell(1,3), Color.BLUE);
        this.board.putToken(new Cell(1,4), Color.BLUE);
        // when
        Boolean isConnect4 = this.board.isConnect4(Color.BLUE);
        //then
        assertTrue(isConnect4);
    }

    @Test()
    @Description("Check whether is an equal game or not")
    public void testIsFullBoard() {
        // given
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
        // when
        Boolean isFullBoard = this.board.isFullBoard();
        //then
        assertTrue(isFullBoard);
    }

    @Test()
    @Description("Check number of already added cells into the cellMap")
    public void testGetOccupiedCells() {
        // given
        // when
        int numberOfOccupiedCells = this.board.getOccupiedCells();
        //then
        assertEquals(numberOfOccupiedCells, 4);
    }

    @Test()
    @Description("Check the color already added into a position of the cellMap")
    public void testGetColorFromCell() {
        // given
        // when
        Color colorIntoACell = this.board.getColorFromCell(new Cell(1,1));
        Color colorIntoACell2 = this.board.getColorFromCell(new Cell(1,3));
        //then
        assertEquals(colorIntoACell, Color.BLUE);
        assertEquals(colorIntoACell2, Color.NULL);
    }

    @Test()
    @Description("Check given a column index the next free row in the cellMap")
    public void testGetNextFreeRowByColumn() {
        // given
        // when
        int nextFreeRow = this.board.getNextFreeRowByColumn(1);
        //then
        assertEquals(nextFreeRow, 0);
        assertNotEquals(nextFreeRow, 3);
    }

    @Test()
    @Description("Check the conversion of the cellMap into a string list is correctly done")
    public void testToCharacterArray() {
        // given
        List<String> testArray = new ArrayList<>();
        for (int i = 0; i <= 7; i++) {
            testArray.add("NULL");
        }
        testArray.add("BLUE");
        testArray.add("BLUE");
        for (int i = 0; i <= 4; i++) {
            testArray.add("NULL");
        }
        testArray.add("GREEN");
        testArray.add("GREEN");
        for (int i = 0; i <= 17; i++) {
            testArray.add("NULL");
        }
        // when
        List<String> convertedArray = this.board.toCharacterArray();
        //then
        assertEquals(convertedArray, testArray);
    }


}