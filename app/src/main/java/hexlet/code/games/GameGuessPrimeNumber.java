package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Util;

public class GameGuessPrimeNumber {
    private static final int NUMBER_OF_QUESTIONS = 3;
    private static final int FIRST_ARRAY_SIZE = 3;
    private static final int SECOND_ARRAY_SIZE = 2;
    private static final int UPPER_BORDER_OF_NUMBER = 50;
    private static final String GENERAL_QUESTION ="Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    public static void play() {
        String[][] questionAndAnswerPair = new String[FIRST_ARRAY_SIZE][SECOND_ARRAY_SIZE];
        for (int i = 0; i < NUMBER_OF_QUESTIONS; i++) {
            int number = getOddNumber();
            String question = "Question: " + number + "\nYour answer: ";
            String correctAnswer = checkIfNumberIsPrime(number) ? "yes" : "no";
            questionAndAnswerPair[i][0] = question;
            questionAndAnswerPair[i][1] = correctAnswer;
        }
        Engine.mainEngineMethod(GENERAL_QUESTION, questionAndAnswerPair);
    }
    public static int getOddNumber () {
        int number = Util.getRandomizedNumbers(1, UPPER_BORDER_OF_NUMBER);
        while (number % 2 == 0) {
            number = Util.getRandomizedNumbers(1, UPPER_BORDER_OF_NUMBER);
        }
        return number;
    }
    public static boolean checkIfNumberIsPrime(int number) {
        int dividersCount = 0;
        for (int j = number; j > 0; j--) {
            if (number == 1) {
                dividersCount++;
            }
            if (number % j == 0) {
                dividersCount++;
            }
        }
        return dividersCount == 2;
    }
}
