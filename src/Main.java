import main.java.connect4game.domainView.models.Connect4Game;
import main.java.connect4game.domainView.models.Game;

public class Main {
    public static void main(String[] args) {
        // domain
        /*Connect4Game connect4Game = new Connect4Game();
        connect4Game.playGame();*/
        // domain view
        Connect4Game connect4Game = new Connect4Game();
        connect4Game.play();
    }
}