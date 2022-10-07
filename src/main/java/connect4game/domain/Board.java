package main.java.connect4game.domain;

public class Board {
    private Cell[][] cells;

    public Board() {
        this.cells = new Cell[5][7];
        // test method to initialize cells
        for (int i = 0; i < this.cells.length; i++) {
            for (int j = 0; j < this.cells[i].length; j++) {
                Cell cell = new Cell();
                if (i % 3 == 0) {
                    cell.setColor(Color.getColor(Color.BLUE));
                } else {
                    cell.setColor(Color.getColor(Color.GREEN));
                }
                this.cells[i][j] = cell;
            }
        }
    }

    public boolean isGameFinished() {
        // check algorithm
        return false;
    }

    public void write() {
        for (int i = 0; i < this.cells.length; i++) {
            for (int j = 0; j < this.cells[i].length; j++) {
                System.out.print(this.cells[i][j].getColor() + " ");
            }
            System.out.println();
        }
    }

    public void makeMovement() {
        System.out.println("Making a movement");
    }

}
