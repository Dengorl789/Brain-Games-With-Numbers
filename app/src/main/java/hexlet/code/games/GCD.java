package hexlet.code.games;

import hexlet.code.Engine;

public class GCD {
    private static final int NUMBER_OF_QUESTIONS = 3;
    private static final int FIRST_ARRAY_SIZE = 3;
    private static final int SECOND_ARRAY_SIZE = 2;
    private static final int UPPER_BORDER_OF_NUMBER = 50;
    public static void playGameGCD() {
        String generalQuestion = "Find the greatest common divisor of given numbers.";

        String[][] questionAndAnswerPair = new String[FIRST_ARRAY_SIZE][SECOND_ARRAY_SIZE];
        for (int i = 0; i < NUMBER_OF_QUESTIONS; i++) {
            int number1 = Engine.getRandomizedNumbers(1, UPPER_BORDER_OF_NUMBER);
            int number2 = Engine.getRandomizedNumbers(1, UPPER_BORDER_OF_NUMBER);
            int greatestCommonDivider = findGreaterCommonDivider(number1, number2);
            String correctAnswer = String.valueOf(greatestCommonDivider);

            String question = "Question: " + number1 + " " + number2 + "\nYour answer: ";
            questionAndAnswerPair[i][0] = question;
            questionAndAnswerPair[i][1] = correctAnswer;
        }
        Engine.mainEngineMethod(generalQuestion, questionAndAnswerPair);
    }
    public static int findGreaterCommonDivider(int number1, int number2) {
        int a = number1;
        int b = number2;
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        int greatestCommonDivider = a;
        return greatestCommonDivider;
    }
}
