package hexlet.code.games;

import hexlet.code.Engine;

public class GCD {
    public static String generateGeneralQuestionGCD() {
        return "Find the greatest common divisor of given numbers.";
    }
    public static String[] generateQuestionAnswerPairGCD() {
        int number1 = Engine.getRandomizedNumbers(1, 50);
        int number2 = Engine.getRandomizedNumbers(1, 50);

        int greatestCommonDivider = findGreaterCommonDivider(number1, number2);
        String correctAnswer = String.valueOf(greatestCommonDivider);

        String[] questionAndAnswerPair = new String[2];
        String question = "Question: " + number1 + " " + number2 + "\nYour answer: ";
        questionAndAnswerPair[0] = question;
        questionAndAnswerPair[1] = correctAnswer;
        return questionAndAnswerPair;
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
