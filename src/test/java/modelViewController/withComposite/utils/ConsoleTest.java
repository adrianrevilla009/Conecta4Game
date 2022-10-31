package modelViewController.withComposite.utils;

import jdk.jfr.Description;
import org.example.modelViewController.withComposite.utils.Console;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.io.BufferedReader;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class ConsoleTest {
    @InjectMocks
    private Console console;
    @Mock
    private BufferedReader bufferedReader;

    @BeforeEach
    public void beforeEach() {
        this.console = Console.getInstance();
    }

    @Test()
    @Description("Check if a value read from console is not int, and throws an exception")
    public void testReadFromConsoleValueWhichIsNotIntAndThrowsException() throws IOException {
        String str = "";
        when(this.bufferedReader.readLine()).thenReturn("1", str);
        assertThrows(AssertionError.class, () -> this.console.readInt("Give me an int"));
    }


}
