package main.java.connect4game.domain;

import main.java.connect4game.utils.YesNoDialog;

public class Connect4Game {
    private Board board;
    private Turn turn;

    Connect4Game(){
        this.board = new Board();
        this.turn = new Turn(this.board);
    }

    private void play() {
        do {
            this.playGame();
        } while (this.isResumedGame());
    }

    private void playGame() {
        Message.TITLE.writeln();
        this.board.write();
        do {
            this.turn.play();
            this.board.write();
        } while (!this.isConnect4() && !this.isEqualGame());
        this.writeGameResult();
    }

    private boolean isConnect4() {
        return this.board.isConnect4(this.turn.getActiveColor());
    }

    private boolean isEqualGame() {
        return this.board.isEqualGame();
    }

    private void writeGameResult() {
        if (this.isConnect4()) {
            this.turn.writeWinner();
        } else {
            this.turn.writeEqualGame();
        }
    }

    private boolean isResumedGame() {
        YesNoDialog yesNoDialog = new YesNoDialog();
        yesNoDialog.read(Message.RESUME.toString());
        if (yesNoDialog.isAffirmative()) {
            this.board.reset();
            this.turn.reset();
        }
        return yesNoDialog.isAffirmative();
    }

    public static void main(String[] args) {
        new Connect4Game().play();
    }

}
