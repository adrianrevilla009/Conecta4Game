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
    }

    @Test()
    @Description("Check whether board map where cells are stored, is emptied of not")
    public void testReset() {
        // given
        this.initializeCellMap();
        // when
        this.board.reset();
        //then
        assertEquals(this.board.getCellMap().get(Color.BLUE), new ArrayList<>());
        assertEquals(this.board.getCellMap().get(Color.GREEN), new ArrayList<>());
    }

    @Test()
    @Description("Check whether a token is added in cellMap or not")
    public void testPutToken() {
        // given
        this.initializeCellMap();
        // when
        this.board.putToken(new Cell(3,4), Color.BLUE);
        //then
        assertTrue(this.board.getCellMap().get(Color.BLUE).size() == 3);
    }

    @Test()
    @Description("Check whether a cell is given return its color in the cellMap or not")
    public void testGetColor() {
        // given
        this.initializeCellMap();
        // when
        Color color = this.board.getColor(new Cell(1,1));
        //then
        assertEquals(color, Color.BLUE);
    }

    @Test()
    @Description("Check whether a cell is already added in the cellMap or not")
    public void testIsOccupied() {
        // given
        this.initializeCellMap();
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
        this.initializeCellMap();
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
        this.initializeCellMap();
        this.board.getCellMap().get(Color.BLUE).add(new Cell(1,3));
        this.board.getCellMap().get(Color.BLUE).add(new Cell(1,4));
        // when
        Boolean isConnect4 = this.board.isConnect4(Color.BLUE);
        //then
        assertTrue(isConnect4);
    }

    @Test()
    @Description("Check whether is an equal game or not")
    public void testIsEqualGame() {
        // given
        Map<Color, List<Cell>> cellMap = new HashMap<>();
        cellMap.put(Color.BLUE, new ArrayList<>());
        cellMap.put(Color.GREEN, new ArrayList<>());
        this.board.setCellMap(cellMap);
        // Aqui si en vez de inicializar el mapa, si hubiese llamado al initilaize y luego al reset(),
        // estaria anidando dos test?
        for (int i = 0; i < Cell.ROWS; i++) {
            for (int j = 0; j < Cell.COLUMNS; j++) {
                if (i % 2 == 0) {
                    this.board.getCellMap().get(Color.BLUE).add(new Cell(i,j));
                } else {
                    this.board.getCellMap().get(Color.GREEN).add(new Cell(i,j));
                }
            }
        }
        // when
        Boolean isEqualGame = this.board.isEqualGame();
        //then
        assertTrue(isEqualGame);
    }

    @Test()
    @Description("Check number of already added cells into the cellMap")
    public void testGetOccupiedCells() {
        // given
        this.initializeCellMap();
        // when
        int numberOfOccupiedCells = this.board.getOccupiedCells();
        //then
        assertEquals(numberOfOccupiedCells, 4);
    }

    @Test()
    @Description("Check the color already added into a position of the cellMap")
    public void testGetColorFromCell() {
        // given
        this.initializeCellMap();
        // when
        Color colorIntoACell = this.board.getColorFromCell(new Cell(1,1));
        Color colorIntoACell2 = this.board.getColorFromCell(new Cell(1,3));
        //then
        assertEquals(colorIntoACell, Color.BLUE);
        assertEquals(colorIntoACell2, Color.NULL);
    }

    @Test()
    @Description("Check given a column index the next free row in the cellMap")
    public void testGetNextFreeRow() {
        // given
        this.initializeCellMap();
        Cell cell = new Cell();
        cell.setColumn(1);
        // when
        int nextFreeRow = this.board.getNextFreeRow(cell);
        //then
        assertEquals(nextFreeRow, 0);
        assertNotEquals(nextFreeRow, 3);
    }

    @Test()
    @Description("Check the conversion of the cellMap into a string list is correctly done")
    public void testToCharacterArray() {
        // given
        this.initializeCellMap();
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

    private void initializeCellMap() {
        Map<Color, List<Cell>> cellMap = new HashMap<>();
        cellMap.put(Color.BLUE, new ArrayList<>(Arrays.asList(new Cell(1, 1), new Cell(1, 2))));
        cellMap.put(Color.GREEN, new ArrayList<>(Arrays.asList(new Cell(2, 1), new Cell(2, 2))));
        this.board.setCellMap(cellMap);
    }


}