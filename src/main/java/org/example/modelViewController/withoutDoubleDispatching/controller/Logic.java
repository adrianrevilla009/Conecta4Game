package org.example.modelViewController.withoutDoubleDispatching.controller;

import org.example.modelViewController.withoutDoubleDispatching.domain.Game;
import org.example.modelViewController.withoutDoubleDispatching.domain.State;
import org.example.modelViewController.withoutDoubleDispatching.types.StateValue;

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
