package main.java.connect4game.modelViewController.withComposite.src.controller;

import main.java.connect4game.modelViewController.withComposite.src.domain.Session;
import main.java.connect4game.modelViewController.withComposite.src.types.StateValue;

import java.util.HashMap;
import java.util.Map;

public class Logic {
    // TODO patron standalone
    private Session session;
    private Map<StateValue, AcceptorController> controllerMap;

    public Logic() {
        this.session = new Session();
        this.controllerMap = new HashMap<>();
        this.controllerMap.put(StateValue.INITIAL, new StartController(this.session));
        this.controllerMap.put(StateValue.IN_GAME, new PlayController(this.session));
        this.controllerMap.put(StateValue.RESUME, new ResumeController(this.session));
        this.controllerMap.put(StateValue.EXIT, null);
    }

    public AcceptorController getActualController() {
        return this.controllerMap.get(this.session.getValueState());
    }
}
