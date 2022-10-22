package main.java.connect4game.modelViewController.doubleDispatching.controller;

import main.java.connect4game.modelViewController.doubleDispatching.domain.Game;
import main.java.connect4game.modelViewController.doubleDispatching.domain.State;
import main.java.connect4game.modelViewController.doubleDispatching.types.StateValue;

import java.util.HashMap;
import java.util.Map;

public class Logic {
    private Game game;
    private State state;
    private Map<StateValue, Controller> controllerMap;

    public Logic() {
        this.game = new Game();
        this.state = new State();
        this.controllerMap = new HashMap<>();
        this.controllerMap.put(StateValue.INITIAL, new StartController(this.game, this.state));
        this.controllerMap.put(StateValue.IN_GAME, new PlayController(this.game, this.state));
        this.controllerMap.put(StateValue.RESUME, new ResumeController(this.game, this.state));
        this.controllerMap.put(StateValue.EXIT, null);
    }

    public Controller getActualController() {
        return this.controllerMap.get(this.state.getValueState());
    }

    public Game getGame() {
        return game;
    }

}
