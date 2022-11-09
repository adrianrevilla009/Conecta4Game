package org.example.basic.domain;

import org.example.basic.utils.YesNoDialog;

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
        } while (!this.isGameFinished());
        this.writeGameResult();
    }

    private boolean isGameFinished() {
        return this.isConnect4() || this.isEqualGame();
    }

    private boolean isConnect4() {
    	return this.board.isWinner();
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
