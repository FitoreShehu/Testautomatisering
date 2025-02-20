package uppgiften.HomeworkMorseAndEng;

import java.util.HashMap;
import java.util.Map;

public class LocigMorseAndEng {
    private Map<String, String> map;
    Map<String, String> newMap = new HashMap<>();


    public LocigMorseAndEng() {
        map = new HashMap<>();
        map.put("A", ".-");
        map.put("B", "-...");
        map.put("C", "-.-.");
        map.put("D", "-..");
        map.put("E", ".");
        map.put("F", "..-.");
        map.put("G", "--.");
        map.put("H", "....");
        map.put("I", "..");
        map.put("J", ".---");
        map.put("K", "-.-");
        map.put("L", ".-..");
        map.put("M", "--");
        map.put("N", "-.");
        map.put("O", "---");
        map.put("P", ".--.");
        map.put("Q", "--.-");
        map.put("R", ".-.");
        map.put("S", "...");
        map.put("T", "-");
        map.put("U", "..-");
        map.put("V", "...-");
        map.put("W", ".--");
        map.put("X", "-..-");
        map.put("Y", "-.--");
        map.put("Z", "--..");

        for (String key : map.keySet()) {
            newMap.put(map.get(key), key);
        }
    }

    public String engToMorse(String inputEngText) {
        inputEngText = inputEngText.toUpperCase();
        String resultMurse = "";
        String[] input = inputEngText.split(""); // här delar man varje bokstav när ("") dem sitter ihop.
        for (String inputLetter : input) {
            if (map.containsKey(inputLetter)) {
                resultMurse += map.get(inputLetter)+ " ";
            }
        }
        return resultMurse;
    }


    public String morseToEng(String inputMorseText) {
        String[] inputArrayMorse = inputMorseText.split(" "); // här delar man varje ( "  ") ord.
        String resultEng = "";
        for (String inputmors : inputArrayMorse) {
            resultEng += newMap.get(inputmors);
        }
        if (inputMorseText.contains("?")) {
            return "Fel: Endast morsekod som t.ex. (. och -) tillåts!";
        } else if (inputMorseText == null || inputMorseText.isEmpty()) {
            return "Fel: lägg in text!";
        }

        return resultEng;

    }
}