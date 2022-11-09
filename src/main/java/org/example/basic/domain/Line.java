package org.example.basic.domain;

public class Line {

	public static int LENGTH = 4;

	private Cell origin;
	private Cell Cells[] = new Cell[4];
	private Direction oppositeDirection = Direction.EAST;

	public Line(Cell Cell) {
		this.origin = Cell;

	}

	public void set(Direction direction) {
		this.Cells[0] = this.origin;
		for(int i = 1;  i < this.LENGTH; i++){
			this.Cells[i] = this.Cells[i-1].shifted(direction.getCell());
		}
		this.oppositeDirection = direction.getOpposite();
	}

	public void shift() {
		for (int i = 0; i < this.LENGTH; i++) {
			this.Cells[i] = this.Cells[i].shifted(this.oppositeDirection.getCell());
		}
	}

	public Cell[] getCells() {
		return Cells;
	}

	public void setCells(Cell[] Cells) {
		this.Cells = Cells;
	}

}