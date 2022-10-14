package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Engine {
    private static final int NUMBER_OF_ROUNDS = 3;
    public static void mainEngineMethod(String generalQuestion, String[][] questionAndAnswerPair) {
        Cli.greetPlayer();
        String playerName = Cli.getPlayerName();
        System.out.println(generalQuestion);

        for (int i = 0; i < NUMBER_OF_ROUNDS; i++) {
            String question = questionAndAnswerPair[i][0];
            String correctAnswer = questionAndAnswerPair[i][1];
            System.out.print(question);

            Scanner scan = new Scanner(System.in);
            String answer = scan.nextLine();

            String correctMessage = "Correct!";
            String incorrectMessage = "'" + answer + "' is wrong answer ;(. Correct answer was "
                    + "'" + correctAnswer + "'." + "\nLet's try again, " + playerName + "!";
            String message = answer.equals(correctAnswer) ? correctMessage : incorrectMessage;
            System.out.println(message);
            if (message.equals(incorrectMessage)) {
                return;
            }
        }
        String congrats = "Congratulations, " + playerName + "!";
        System.out.println(congrats);
    }
    public static int getRandomizedNumbers(int bottomBorder, int upperBorder) {
        int diff = upperBorder - bottomBorder;
        Random rn = new Random();
        return rn.nextInt(diff + 1) + bottomBorder;
    }
}



