package main.java.connect4game.domainModel.basic.domain;

public class Player {
    private Color color;
    private Board board;
    private int putTokens;

    Player(Color color, Board board) {
        assert !color.isNull();
        assert board != null;

        this.color = color;
        this.board = board;
        this.putTokens = 0;
    }

    void play() {
        if (this.putTokens < Cell.getNumberCells()) {
            this.putToken();
        }
    }

    private void putToken() {
        Cell cell;
        Error error;
        do {
            cell = this.getCell(Message.ENTER_COORDINATE_TO_PUT);
            error = this.getTokenError(cell);
        } while (!error.isNull());
        this.board.putToken(cell, this.color);
        this.putTokens++;
    }

    Cell getCell(Message message){
        assert message != null;

        Cell cell = new Cell();
        cell.read(message.toString());
        cell.setRow(this.board.getNextFreeRow(cell));
        return cell;
    }

    private Error getTokenError(Cell cell) {
        assert cell != null;

        Error error = Error.NULL;
        if (!this.board.isEmpty(cell)) {
            error = Error.NOT_EMPTY;
        }
        if (this.board.getNextFreeRow(cell) < 0) {
            error = Error.FULL_COLUMN;
        }
        error.writeln();
        return error;
    }

    void writeWinner() {
        Message.PLAYER_WIN.writeln(this.color.name());
    }

    Color getColor() {
        return this.color;
    }
}
