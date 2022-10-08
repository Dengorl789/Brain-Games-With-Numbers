package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Engine {
    Cli player = new Cli();
    public String playerName = player.getPlayerName();
    public static int getRandomizedNumbers(int bottomBorder, int upperBorder) {
        int diff = upperBorder - bottomBorder;
        Random rn = new Random();
        return rn.nextInt(diff + 1) + bottomBorder;
    }
    public void greetAndAskGeneralQuestion(String generalQuestion) {
        var player = new Cli();
        player.greetPlayer();
        System.out.println(generalQuestion);
    }

    public String getPlayerAnswerAndCompare(String correctAnswer, String question) {
        System.out.print(question);

        Scanner scan = new Scanner(System.in);
        String answer = scan.nextLine();

        String correctMessage = "Correct!";
        String incorrectMessage = "'" + answer + "' is wrong answer ;(. Correct answer was "
                    + "'" + correctAnswer + "'." + "\nLet's try again, " + playerName + "!";
        String message = answer.equals(correctAnswer) ? correctMessage : incorrectMessage;
        System.out.println(message);
        return answer;
    }
    public void showCongratulationMessage() {
        String congrats = "Congratulations, " + playerName + "!";
        System.out.println(congrats);
    }
}



