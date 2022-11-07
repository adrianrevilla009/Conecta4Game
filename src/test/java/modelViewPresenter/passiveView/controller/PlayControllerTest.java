package modelViewPresenter.passiveView.controller;

import jdk.jfr.Description;
import modelViewPresenter.passiveView.domain.GameBuilder;
import org.example.modelViewPresenter.passiveView.types.Color;
import org.example.modelViewPresenter.passiveView.view.console.BoardView;
import org.example.modelViewPresenter.passiveView.domain.Board;
import org.example.modelViewPresenter.passiveView.view.console.CellView;
import org.example.modelViewPresenter.passiveView.domain.Game;
import org.example.modelViewPresenter.passiveView.domain.Cell;
import org.example.modelViewPresenter.passiveView.types.Error;
import org.example.modelViewPresenter.passiveView.view.ViewFactory;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import java.lang.reflect.InvocationTargetException;

import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class PlayControllerTest {

    private final Cell FIRST_CELL = new Cell(0,0);

    @Mock
    private PlayControllerPublic playController;
    @Mock
    private ViewFactory viewFactory;
    @Mock
    private CellView cellView;
    @Mock
    private BoardView boardView;
    @Mock
    private Game game;
    @Mock
    private Board board;

    @BeforeEach
    void setUp() {
        this.game = new GameBuilder()
                .cell(new Cell(1,1), Color.BLUE)
                .cell(new Cell(2,1), Color.GREEN)
                .cell(new Cell(3,1), Color.BLUE)
                .cell(new Cell(4,1), Color.GREEN)
                .build();
        this.playController = spy(new PlayControllerPublic(this.game, this.viewFactory));
    }

    @Test
    @Description("Calling control play controller (sut) method verifies if game (doc) executes putToken method")
    @Disabled // TODO need to ask this, if Game is a Mock why is entering its method body and throwing that assert error?
    public void testPlayControllerPutTokenWhenNotGameIsFinished() {
        // doNothing().when(this.game).putToken(any()); // TODO why this is not working?
        when(this.viewFactory.createCellView()).thenReturn(this.cellView);
        when(this.game.getNextFreeRow(any())).thenReturn(4);
        when(this.game.getPutTokenError(any())).thenReturn(Error.NULL);
        when(this.viewFactory.createBoardView()).thenReturn(this.boardView);
        when(this.cellView.read(any())).thenReturn(this.FIRST_CELL);

        this.playController.control();

        verify(this.game).putToken(this.FIRST_CELL);
    }

    @Test
    @Description("Calling putToken play controller (sut) method verifies if game (doc) getPutTokenError is executed")
    // @Disabled
    public void testPlayControllerGetPutTokenErrorWhenPutToken() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        when(this.viewFactory.createCellView()).thenReturn(this.cellView);
        when(this.cellView.read(any())).thenReturn(this.FIRST_CELL);
        doNothing().when(this.game).putToken(any()); // TODO why this is not working?
        when(this.board.getOccupiedCells()).thenReturn(4);

        this.playController.putToken();

        verify(this.game).getPutTokenError(this.FIRST_CELL);
    }

}
