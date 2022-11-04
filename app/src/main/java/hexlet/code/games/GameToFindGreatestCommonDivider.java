package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Util;

public class GameToFindGreatestCommonDivider {
    private static final int NUMBER_OF_QUESTIONS = 3;
    private static final int UPPER_BORDER_OF_NUMBER = 50;
    private static final String GENERAL_QUESTION = "Find the greatest common divisor of given numbers.";
    public static void play() {
        String[][] questionAndAnswerPair = new String[Engine.FIRST_ARRAY_SIZE][Engine.SECOND_ARRAY_SIZE];
        for (int i = 0; i < NUMBER_OF_QUESTIONS; i++) {
            int number1 = Util.getRandomizedNumbers(1, UPPER_BORDER_OF_NUMBER);
            int number2 = Util.getRandomizedNumbers(1, UPPER_BORDER_OF_NUMBER);
            int greatestCommonDivider = findGreaterCommonDivider(number1, number2);
            String correctAnswer = String.valueOf(greatestCommonDivider);

            String question =  number1 + " " + number2;
            questionAndAnswerPair[i][0] = question;
            questionAndAnswerPair[i][1] = correctAnswer;
        }
        Engine.runGame(GENERAL_QUESTION, questionAndAnswerPair);
    }
    public static int findGreaterCommonDivider(int a, int b) {
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
    }
}
