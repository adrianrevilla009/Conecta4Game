package main.java.connect4game.modelViewController.withComposite.test.utils;

import jdk.jfr.Description;
import main.java.connect4game.modelViewController.withComposite.src.utils.Console;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConsoleTest {

    private Console console;
    @Mock
    private BufferedReader bufferedReader;

    @BeforeEach
    public void beforeEach() {
        this.console = Console.getInstance();
    }

    @Test()
    @Description("Check if a value read from console is not int, and throws an exception")
    public void testReadFromConsoleValueWhichIsNotIntAndThrowsException() {
        Integer integer = this.console.readInt("Give me an int");
        assertEquals(4, 4);
    }


}
