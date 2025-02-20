package uppgiften.HomeworkMorseAndEng;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class ConvertTest {
    LocigMorseAndEng convert = new LocigMorseAndEng();


    @Test
    public void engToMorse() {
        String word = "Anita";
        String expected = ".- -. .. - .- ";
        String actual = convert.engToMorse(word);

        assertEquals(expected, actual);
    }

    @Test
    public void morseToLetterF() {

        String inputMorseText = "..-. ";
        String expected= "F";
        String actual = convert.morseToEng(inputMorseText);

        assertEquals(expected, actual);
    }

    @Test
    public void morseToSwedishHej() {

        String inputMorseText = ".... . .---";
        String expected= "HEJ";
        String actual = convert.morseToEng(inputMorseText);

        assertEquals(expected, actual);
    }

    @Test
    public void letterwithMorsetoWord() {

        String inputMorseText = ".... Hej  .---";
        String expected = "HEJ";
        String actual = convert.morseToEng(inputMorseText);

        assertNotEquals(expected, actual);
    }
    @Test
    public void convertAnothersymbolToLetter() {

        String inputMorseText = "?";
        String expected = "Fel: Endast morsekod som t.ex. (. och -) tillåts!";
        String actual = convert.morseToEng(inputMorseText);

        assertEquals(expected, actual);
    }
    @Test
    public void convertSymbolToLetter() {

        String inputMorseText = "& ! ?";
        String expected = "Fel: Endast morsekod som t.ex. (. och -) tillåts!";
        String actual = convert.morseToEng(inputMorseText);

        assertEquals(expected, actual);
    }
    @Test
    public void convertSpeaceToLetter() {

        String inputMorseText ="";
        String expected = "Fel: lägg in text!";
        String actual = convert.morseToEng(inputMorseText);

        assertEquals(expected, actual);
    }
}
