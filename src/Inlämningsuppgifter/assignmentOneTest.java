package Inlämningsuppgifter;

import InlamningTest.ConverterTwo;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class assignmentOneTest {

    @Test
    public void testMorseToText() {
        assignmentOneLogic logic = new assignmentOneLogic();

        // Input Morse code
        String testdata = "*-";

        // Call method from logic class
        String actual = logic.MorseToText(testdata);

        // Expected output
        String expected = "a";

        // Compare expected and actual results
        assertEquals(expected, actual);
    }

    @Test
    public void testTextToMorse(){
        assignmentOneLogic logic = new assignmentOneLogic();
        String testdata = "a";

        String actual = logic.TextToMorse(testdata);

        String expected ="*-";

        assertEquals(expected, actual);

    }

    @Test
    public void testTextToMorseAB(){
        assignmentOneLogic logic = new assignmentOneLogic();
        String testdata = "ab";

        String actual = logic.TextToMorse(testdata);

        String expected ="*- -***";

        assertEquals(expected, actual);

    }


}


