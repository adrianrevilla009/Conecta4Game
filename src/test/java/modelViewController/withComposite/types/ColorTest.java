package modelViewController.withComposite.types;

import jdk.jfr.Description;
import org.example.modelViewController.withComposite.types.Color;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ColorTest {
    @Test()
    @Description("Check given an index of the enum color, obtained color exists")
    public void testGivenIndexGetExistingColor() {
        assertThat(Color.get(1), is(Color.BLUE));
    }

    @Test()
    @Description("Check given an index of the enum color, obtained color not exists and throws an exception")
    public void testGivenIndexGetNotExistingColorThrowsAssertion() {
        assertThrows(AssertionError.class, () -> {
            Color.get(5);
        });
    }

    @Test()
    @Description("Check getting color enum list, returns correct number of total colors")
    public void testGetColorsListHasCorrectNumberColors() {
        assertThat(Color.getColors().size(), is(3));
    }

    @Test()
    @Description("Check given color whether it is null or not")
    public void testGivenColorIsNullOrNot() {
        assertThat(Color.BLUE.isNull(), is(false));
        assertThat(Color.GREEN.isNull(), is(false));
        assertThat(Color.NULL.isNull(), is(true));
    }

    @Test()
    @Description("Check given a string with a color name, whether its color enum object is returned")
    public void testGivenColorNameIfColorIsReturned() {
        assertThat(Color.getByName("GREEN"), is(Color.GREEN));
        assertThat(Color.getByName("BLUE"), is(Color.BLUE));
    }

    @Test()
    @Description("Check given a string with a not existing color name, whether an exception is thrown")
    public void testGivenColorNotExistingNameIfExceptionIsThrown() {
        assertThrows(IllegalArgumentException.class, () -> {
            assertThat(Color.getByName("PINK"), is(Color.BLUE));
        });
    }
}
