package org.example.basic.domain;

public enum Direction {

	NORTH(1,0),
	NORTH_EAST(1,1),
	EAST(0,1),
	SOUTH_EAST(-1,1),
	SOUTH(-1,0),
	SOUTH_WEST(-1,-1),
	WEST(0,-1),
	NORTH_WEST(1,-1);

	public Cell cell;

	Direction(int row, int column){
		this.cell = new Cell(row,column);
	}

	public Direction getOpposite() {
		for (Direction direction: Direction.values()) { 
		    if(direction.cell.shifted(this.cell).equals(Cell.origin)) {
		    	return direction;
		    }
		}
		return null;
	}

	public Cell getCell() {
		return this.cell;
	}

}