package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;

import java.util.Random;
import java.util.Scanner;

public class Engine {
    public static void mainEngineMethod(int gameNumber) {
        Cli.greetPlayer();
        String playerName = Cli.getPlayerName();
        String generalQuestion;
        switch (gameNumber) {
            case 2 -> {
                generalQuestion = Even.generateGeneralQuestionEven();
                System.out.println(generalQuestion);
            }
            case 3 -> {
                generalQuestion = Calc.generateGeneralQuestionCalc();
                System.out.println(generalQuestion);
            }
            case 4 -> {
                generalQuestion = GCD.generateGeneralQuestionGCD();
                System.out.println(generalQuestion);
            }
            default -> {
            }
        }
        int numberOfRounds = 3;
        for (int i = 0; i < numberOfRounds; i++) {
            String[] questionAnswerPair = new String[2];
            if (gameNumber == 2) {
                questionAnswerPair = Even.generateQuestionAnswerPairEven();
            } else if (gameNumber == 3) {
                questionAnswerPair = Calc.generateQuestionAnswerPairCalc();
            } else if (gameNumber == 4) {
                questionAnswerPair = GCD.generateQuestionAnswerPairGCD();
            }
            String question = questionAnswerPair[0];
            String correctAnswer = questionAnswerPair[1];
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
            String congrats = "Congratulations, " + playerName + "!";
            System.out.println(congrats);
        }
    }
    public static int getRandomizedNumbers(int bottomBorder, int upperBorder) {
        int diff = upperBorder - bottomBorder;
        Random rn = new Random();
        return rn.nextInt(diff + 1) + bottomBorder;
    }
}



