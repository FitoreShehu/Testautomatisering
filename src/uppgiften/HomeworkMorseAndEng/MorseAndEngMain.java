package uppgiften.HomeworkMorseAndEng;

import java.util.Scanner;

public class MorseAndEngMain {
    public static void main(String[] args) {
        LocigMorseAndEng logic= new LocigMorseAndEng();
        Scanner scanner= new Scanner(System.in);

        System.out.println("Skriv in ett text i morsekod för att konvertera det till text");

        String inputMorse = scanner.nextLine();
        String resultInEng = logic.morseToEng(inputMorse);
        System.out.println(resultInEng);

        System.out.println("Skriv in ett text för att konvertera det till morsekod");
        String inputEng=scanner.nextLine();
        String resultInMorse=logic.engToMorse(inputEng);
        System.out.println(resultInMorse);


    }
}
