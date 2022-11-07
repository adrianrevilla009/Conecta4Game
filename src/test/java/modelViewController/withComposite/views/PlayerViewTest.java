package modelViewController.withComposite.views;

import jdk.jfr.Description;
import org.example.modelViewController.withComposite.controller.PlayController;
import org.example.modelViewController.withComposite.domain.Cell;
import org.example.modelViewController.withComposite.types.Error;
import org.example.modelViewController.withComposite.types.Message;
import org.example.modelViewController.withComposite.utils.Console;
import org.example.modelViewController.withComposite.view.console.PlayerView;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.MockedStatic;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class PlayerViewTest {

    final Cell FIRST_CELL = new Cell(0,0);

    private PlayerView playerView;
    @Mock
    private PlayController playController;

    @Mock
    private Console console;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        // we use a spy because we require to execute playerView method's bodies
        // in case we didn't, we couldn't be able for example to execute interact() and be able to reach other method's code
        this.playerView = spy(new PlayerView(this.playController));
    }

    @Test
    @Description("Given a playController (doc) mock, verifies if playerView (sut) interact method triggers correctly " +
            "playController (doc) putToken method.")
    public void testPlayerViewInteractThenPlayControllerPutToken() {
        doReturn(this.FIRST_CELL).when(this.playerView).getCell(any());
        when(this.playController.getOccupiedCells()).thenReturn(0);
        when(this.playController.getPutTokenError(any())).thenReturn(Error.NULL);

        this.playerView.interact();

        verify(this.playController).putToken(this.FIRST_CELL);
    }

    @Test
    @Description("Given a mocked console read data and a getNextFreeRowByColumn method from doc, checks if suts getCell method" +
            "is correctly executed and in that case, if getNextFreeRowByColumn is reached")
    public void testPlayerViewGetCellThenPlayControllerGetNextFreeRowByColumn() {
        // we need to mock console by this way to be able to reach an static method of a mock object. By this way,
        // we have console mock instantiated.
        try (MockedStatic<Console> console = mockStatic(Console.class)) {
            console.when(Console::getInstance).thenReturn(this.console);

            doReturn(1).when(this.console).readInt(any());
            when(this.playController.getNextFreeRowByColumn(0)).thenReturn(4);

            this.playerView.getCell(Message.ENTER_COLUMN_TO_PUT);

            verify(this.playController).getNextFreeRowByColumn(0);
        }
    }

    @Test
    @Description("Given a playController (doc) mock, verifies if a FULL COLUMN error is thrown. That happens when sut's " +
            "getPutToken is mocked to return that error. Is needed to mock console read method as player view is " +
            "an spy and its body is executed so need that data not to fail.")
    public void testPlayerViewGetPutTokenThenVerifyThrownErrorFromConsole() {
        try (MockedStatic<Console> console = mockStatic(Console.class)) {
            console.when(Console::getInstance).thenReturn(this.console);
            when(this.playController.getPutTokenError(any())).thenReturn(Error.FULL_COLUMN);

            this.playerView.getPutTokenError(this.FIRST_CELL);

            verify(this.console).writeln("The column is already full, chose another one");
        }
    }
}
