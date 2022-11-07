package modelViewPresenter.passiveView.controller;

import org.example.modelViewPresenter.passiveView.controller.PlayController;
import org.example.modelViewPresenter.passiveView.domain.Game;
import org.example.modelViewPresenter.passiveView.view.ViewFactory;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class PlayControllerPublic extends PlayController {
    public PlayControllerPublic(Game game, ViewFactory viewFactory) {
        super(game, viewFactory);
    }

    // by inheriting play controller, the aim its to make public putToken method to be accessible for testing
    public void putToken() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method indexOfMethod = PlayController.class.getDeclaredMethod("putToken");
        indexOfMethod.setAccessible(true);
        indexOfMethod.invoke(this);
    }
}
