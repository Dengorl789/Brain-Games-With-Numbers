package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Util;

public class GameToFindGreatestCommonDivider {
    private static final int NUMBER_OF_QUESTIONS = 3;
    private static final int UPPER_BORDER_OF_NUMBER = 50;
    private static final String GENERAL_QUESTION = "Find the greatest common divisor of given numbers.";
    public static void play() {
        String[][] questionAndAnswerPair = Engine.createArrayForQuestionAndAnswerPairs();
        for (int i = 0; i < NUMBER_OF_QUESTIONS; i++) {
            int number1 = Util.getRandomizedNumbers(1, UPPER_BORDER_OF_NUMBER);
            int number2 = Util.getRandomizedNumbers(1, UPPER_BORDER_OF_NUMBER);
            int greatestCommonDivider = findGreaterCommonDivider(number1, number2);
            String correctAnswer = String.valueOf(greatestCommonDivider);

            String question = "Question: " + number1 + " " + number2 + "\nYour answer: ";
            questionAndAnswerPair[i][0] = question;
            questionAndAnswerPair[i][1] = correctAnswer;
        }
        Engine.mainEngineMethod(GENERAL_QUESTION, questionAndAnswerPair);
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
