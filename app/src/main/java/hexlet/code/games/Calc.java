package hexlet.code.games;

import hexlet.code.Engine;

public class Calc {
    private static final int NUMBER_OF_QUESTIONS = 3;
    private static final int FIRST_ARRAY_SIZE = 3;
    private static final int SECOND_ARRAY_SIZE = 2;
    private static final int UPPER_BORDER_OF_NUMBER = 30;
    private static final int UPPER_BORDER_OF_OPERATION = 3;
    private static final int OPERATION_ADD = 1;
    private static final int OPERATION_SUBTRACTION = 2;
    private static final int OPERATION_PRODUCT = 3;
    public static void playGameCalc() {
        String generalQuestion = "What is the result of the expression?";

        String[][] questionAndAnswerPair = new String[FIRST_ARRAY_SIZE][SECOND_ARRAY_SIZE];
        for (int i = 0; i < NUMBER_OF_QUESTIONS; i++) {
            int operationNumber = Engine.getRandomizedNumbers(1, UPPER_BORDER_OF_OPERATION);
            int number1 = Engine.getRandomizedNumbers(1, UPPER_BORDER_OF_NUMBER);
            int number2 = Engine.getRandomizedNumbers(1, UPPER_BORDER_OF_NUMBER);
            if (operationNumber == OPERATION_ADD) {
                int corrAnswer = number1 + number2;
                String correctAnswer = String.valueOf(corrAnswer);
                String question = "Question: " + number1 + " + " + number2 + "\nYour answer: ";
                questionAndAnswerPair[i][0] = question;
                questionAndAnswerPair[i][1] = correctAnswer;
            } else if (operationNumber == OPERATION_SUBTRACTION) {
                int corrAnswer = number1 - number2;
                String correctAnswer = String.valueOf(corrAnswer);
                String question = "Question: " + number1 + " - " + number2 + "\nYour answer: ";
                questionAndAnswerPair[i][0] = question;
                questionAndAnswerPair[i][1] = correctAnswer;
            } else if (operationNumber == OPERATION_PRODUCT) {
                int corrAnswer = number1 * number2;
                String correctAnswer = String.valueOf(corrAnswer);
                String question = "Question: " + number1 + " * " + number2 + "\nYour answer: ";
                questionAndAnswerPair[i][0] = question;
                questionAndAnswerPair[i][1] = correctAnswer;
            }
        }
        Engine.mainEngineMethod(generalQuestion, questionAndAnswerPair);
    }
}
