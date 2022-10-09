package hexlet.code.games;

import hexlet.code.Engine;

public class Calc {
    public static String generateGeneralQuestionCalc() {
        return "What is the result of the expression?";
    }
    public static String[] generateQuestionAnswerPairCalc() {
        int operationNumber = Engine.getRandomizedNumbers(1, 3);
        int number1 = Engine.getRandomizedNumbers(1, 30);
        int number2 = Engine.getRandomizedNumbers(1, 30);

        String[] questionAndAnswerPair = new String[2];
        if (operationNumber == 1) {
            int corrAnswer = number1 + number2;
            String correctAnswer = String.valueOf(corrAnswer);
            String question = "Question: " + number1 + " + " + number2 + "\nYour answer: ";
            questionAndAnswerPair[0] = question;
            questionAndAnswerPair[1] = correctAnswer;
        } else if (operationNumber == 2) {
            int corrAnswer = number1 - number2;
            String correctAnswer = String.valueOf(corrAnswer);
            String question = "Question: " + number1 + " - " + number2 + "\nYour answer: ";
            questionAndAnswerPair[0] = question;
            questionAndAnswerPair[1] = correctAnswer;
        } else if (operationNumber == 3) {
            int corrAnswer = number1 * number2;
            String correctAnswer = String.valueOf(corrAnswer);
            String question = "Question: " + number1 + " * " + number2 + "\nYour answer: ";
            questionAndAnswerPair[0] = question;
            questionAndAnswerPair[1] = correctAnswer;
        }
        return questionAndAnswerPair;
    }
}
