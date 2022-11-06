package modelViewController.withComposite.utils;

import jdk.jfr.Description;
import org.example.modelViewController.withComposite.utils.Console;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import java.io.BufferedReader;
import java.io.IOException;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.initMocks;

@ExtendWith(MockitoExtension.class)
public class ConsoleTest {
    @InjectMocks
    private Console console;
    @Mock
    private BufferedReader bufferedReader;

    @BeforeEach
    public void beforeEach() {
        MockitoAnnotations.openMocks(this);
    }

    @Test()
    @Description("Check if a value read from console is expected string")
    public void testReadFromConsoleStringValueWhichIsExcepted() throws IOException {
        when(this.bufferedReader.readLine()).thenReturn("1");
        String consoleRead = this.console.readString("Read str");
        assertThat("1", is(consoleRead));
    }

    @Test()
    @Description("Check if a value read from console is expected int")
    public void testReadFromConsoleIntValueWhichIsExcepted() throws IOException {
        when(this.bufferedReader.readLine()).thenReturn("2");
        Integer consoleRead = this.console.readInt("2");
        assertThat(2, is(consoleRead));
    }

    @Test()
    @Description("Check if a value read from console is not int, and throws an exception")
    @Disabled // TODO why is not capturing the exception if its being thrown?
    public void testReadFromConsoleValueWhichIsNotIntAndThrowsException() throws IOException {
        when(this.bufferedReader.readLine()).thenReturn("@");
        // when(this.console.readString("")).thenReturn("1");
        assertThrows(NumberFormatException.class, () -> this.console.readInt("Give me an int"));
    }
}
