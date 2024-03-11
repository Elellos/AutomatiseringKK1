package Inlämningsuppgifter;
import java.util.*;

public class assignmentOneLogic {
    private HashMap<String, String> morseMapping;

    public assignmentOneLogic() {
        morseMapping = new HashMap<>();

        //Alphabet
        morseMapping.put("a", "*-");
        morseMapping.put("b", "-***");
        morseMapping.put("c", "-*-*");
        morseMapping.put("d", "-**");
        morseMapping.put("e", "*");
        morseMapping.put("f", "**-*");
        morseMapping.put("g", "--*");
        morseMapping.put("h", "****");
        morseMapping.put("i", "**");
        morseMapping.put("j", "*---");
        morseMapping.put("k", "-*-");
        morseMapping.put("l", "*-**");
        morseMapping.put("m", "--");
        morseMapping.put("n", "-*");
        morseMapping.put("o", "---");
        morseMapping.put("p", "*--*");
        morseMapping.put("q", "--*-");
        morseMapping.put("r", "*-*");
        morseMapping.put("s", "***");
        morseMapping.put("t", "-");
        morseMapping.put("u", "**-");
        morseMapping.put("v", "***-");
        morseMapping.put("w", "*--");
        morseMapping.put("x", "-**-");
        morseMapping.put("y", "-*--");
        morseMapping.put("z", "--**");

        //Numbers&Symbols
        morseMapping.put("1", "*----");
        morseMapping.put("2", "**---");
        morseMapping.put("3", "***--");
        morseMapping.put("4", "****-");
        morseMapping.put("5", "*****");
        morseMapping.put("6", "-****");
        morseMapping.put("7", "--***");
        morseMapping.put("8", "---**");
        morseMapping.put("9", "----*");
        morseMapping.put("0", "-----");
        morseMapping.put(".", "*-*-*-");
        morseMapping.put(",", "--**--");
        morseMapping.put("?", "**--**");

    }

    //Text to Morse
    public String TextToMorse(String k) {
        String returnValue = "";
        String[] characters = k.split("");
        for (String chars : characters) {
            for (HashMap.Entry<String, String> morseEntry : morseMapping.entrySet()) {
                if (morseEntry.getKey().equalsIgnoreCase(chars)) {
                    returnValue += morseEntry.getValue() + " "; // Adds space between letters.
                }

            }
        }
        return returnValue.trim(); //Removes ending space of the word/letter.
    }


    //Morse to Text
    public String MorseToText(String v) {
        String returnValue = "";
        String[] morse = v.split(" ");
        for (String chars : morse) {
            for (HashMap.Entry<String, String> morseEntry : morseMapping.entrySet()) {
                if (morseEntry.getValue().equals(chars)) {
                    returnValue += morseEntry.getKey();
                }
            }
        }
        return returnValue;
    }
}
