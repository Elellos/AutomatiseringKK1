package Inlämningsuppgifter;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class assignmentOneTest {

    @Test
    public void testMorseToText() {
        assignmentOneLogic logic = new assignmentOneLogic();

        // Input Morse code
        String testdata = "-**";

        // Call method from logic class
        String actual = logic.MorseToText(testdata);

        // Expected output
        String expected = "d";

        // Compare expected and actual results
        assertEquals(expected, actual);
    }

    @Test
    public void testMorseToText911() {
        assignmentOneLogic logic = new assignmentOneLogic();

        // Input Morse code
        String testdata = "----* *---- *----";

        // Call method from logic class
        String actual = logic.MorseToText(testdata);

        // Expected output
        String expected = "911";

        // Compare expected and actual results
        assertEquals(expected, actual);
    }

    @Test
    public void testTextToMorse(){
        assignmentOneLogic logic = new assignmentOneLogic();

        // Input Morse code
        String testdata = "a";

        // Call method from logic class
        String actual = logic.TextToMorse(testdata);

        // Expected output
        String expected ="*-";

        // Compare expected and actual results
        assertEquals(expected, actual);
    }

    @Test
    public void testTextToMorseStarWars(){
        assignmentOneLogic logic = new assignmentOneLogic();

        // Input Morse code
        String testdata = "StarWars";

        // Call method from logic class
        String actual = logic.TextToMorse(testdata);

        // Expected output
        String expected = "*** - *- *-* *-- *- *-* ***";

        // Compare expected and actual results
        assertEquals(expected, actual);

    }

    @Test
    public void testTextToMorseSwedishLetters(){
        assignmentOneLogic logic = new assignmentOneLogic();

        // Input Morse code
        String testdata = "åäö";

        // Call method from logic class
        String actual = logic.TextToMorse(testdata);

        // Expected output
        String expected ="";

        // Compare expected and actual results
        assertEquals(expected, actual);
    }
}


