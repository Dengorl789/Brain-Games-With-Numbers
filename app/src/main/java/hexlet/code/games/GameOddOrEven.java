package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Util;

public class GameOddOrEven {
    private static final int NUMBER_OF_QUESTIONS = 3;
    private static final int UPPER_BORDER_OF_NUMBER = 30;
    private static final String GENERAL_QUESTION = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    public static void play() {
        String[][] questionAndAnswerPair = new String[Engine.FIRST_ARRAY_SIZE][Engine.SECOND_ARRAY_SIZE];
        for (int i = 0; i < NUMBER_OF_QUESTIONS; i++) {
            int number = Util.getRandomizedNumbers(1, UPPER_BORDER_OF_NUMBER);
            String correctAnswer = isEven(number) ? "yes" : "no";
            questionAndAnswerPair[i][0] = String.valueOf(number);
            questionAndAnswerPair[i][1] = correctAnswer;
        }
        Engine.runGame(GENERAL_QUESTION, questionAndAnswerPair);
    }
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
