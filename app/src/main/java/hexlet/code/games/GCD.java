package hexlet.code.games;

import hexlet.code.Engine;

public class GCD {
    public static void playGameGCD() {
        String generalQuestion = "Find the greatest common divisor of given numbers.";

        String[][] questionAndAnswerPair = new String[3][2];
        for (int i = 0; i < 3; i++) {
            int number1 = Engine.getRandomizedNumbers(1, 50);
            int number2 = Engine.getRandomizedNumbers(1, 50);
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
