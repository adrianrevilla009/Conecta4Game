package main.java.connect4game.modelViewController.withoutDoubleDispatching.controller;

import main.java.connect4game.modelViewController.withoutDoubleDispatching.domain.Cell;
import main.java.connect4game.modelViewController.withoutDoubleDispatching.domain.Game;
import main.java.connect4game.modelViewController.withoutDoubleDispatching.domain.State;
import main.java.connect4game.modelViewController.withoutDoubleDispatching.domain.StateValue;
import main.java.connect4game.modelViewController.withoutDoubleDispatching.types.Color;
import main.java.connect4game.modelViewController.withoutDoubleDispatching.types.Error;

import java.util.HashMap;
import java.util.Map;

public class Logic {
    private Game game;
    private State state;
    private Map<StateValue, Controller> controllerMap;

    public Logic() {
        this.state = new State();
        this.game = new Game();
        this.controllerMap = new HashMap();
        this.controllerMap.put(StateValue.INITIAL, new StartController(this.game, this.state));
        this.controllerMap.put(StateValue.IN_GAME, new PlayController(this.game, this.state));
        this.controllerMap.put(StateValue.RESUME, new ResumeController(this.game, this.state));
        this.controllerMap.put(StateValue.EXIT, null);
    }

    public Controller getController() {
        return this.controllerMap.get(this.state.getValueState());
    }

}
