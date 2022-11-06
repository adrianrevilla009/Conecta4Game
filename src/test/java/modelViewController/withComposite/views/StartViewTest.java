package modelViewController.withComposite.views;

import jdk.jfr.Description;
import org.example.modelViewController.withComposite.controller.StartController;
import org.example.modelViewController.withComposite.domain.Session;
import org.example.modelViewController.withComposite.utils.Console;
import org.example.modelViewController.withComposite.view.console.StartView;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class StartViewTest {
    @Mock
    private Console console;

    private StartController startController;

    private StartView startView;

    @BeforeEach
    public void beforeEach() {
        MockitoAnnotations.openMocks(this);
        this.startController = new StartController(new Session());
        this.startView = new StartView();
    }

    @Test
    @Description("Given an excepted console output for the first board memento, captures first interact methods console output " +
            "with an argument captor, and compares it with expected console output")
    public void testStartViewInteractThenConsoleOutput() {
        try (MockedStatic<Console> console = mockStatic(Console.class)) {
            console.when(Console::getInstance).thenReturn(this.console);
            //prepare expected data
            String boardStr = "[--- CONNECT 4 GAME ---, ---------------, ---------------,  | ,  ,  | ,  ,  | ,  ,  | ,  ,  " +
                    "| ,  ,  | ,  ,  | ,  ,  | ,  | ,  ,  | ,  ,  | ,  ,  | ,  ,  | ,  ,  | ,  ,  | ,  ,  | ,  | ,  ,  | ,  ,  " +
                    "| ,  ,  | ,  ,  | ,  ,  | ,  ,  | ,  ,  | ,  | ,  ,  | ,  ,  | ,  ,  | ,  ,  | ,  ,  | ,  ,  | ,  ,  | ,  " +
                    "| ,  ,  | ,  ,  | ,  ,  | ,  ,  | ,  ,  | ,  ,  | ,  ,  | ]";

            this.startView.interact(this.startController);
            // capture console output
            ArgumentCaptor<String> argumentCaptor = ArgumentCaptor.forClass(String.class);
            verify(this.console, atLeast(0)).writeln(argumentCaptor.capture());
            verify(this.console, atLeast(0)).write(argumentCaptor.capture());
            // get captured output
            List<String> argumentCaptorValues = argumentCaptor.getAllValues();
            // verify
            assertThat(Arrays.toString(argumentCaptorValues.toArray()), is(boardStr));
        }

    }

}
