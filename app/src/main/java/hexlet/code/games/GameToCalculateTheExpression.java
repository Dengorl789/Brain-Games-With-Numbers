package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Util;

public class GameToCalculateTheExpression {
    private static final int NUMBER_OF_QUESTIONS = 3;
    private static final int FIRST_ARRAY_SIZE = 3;
    private static final int SECOND_ARRAY_SIZE = 2;
    private static final int UPPER_BORDER_OF_NUMBER = 30;
    private static final int UPPER_BORDER_OF_OPERATION = 3;
    private static final int OPERATION_ADD = 1;
    private static final int OPERATION_SUBTRACTION = 2;
    private static final int OPERATION_PRODUCT = 3;
    private static final String GENERAL_QUESTION = "What is the result of the expression?";
    public static void play() {
        String[][] questionAndAnswerPair = new String[FIRST_ARRAY_SIZE][SECOND_ARRAY_SIZE];
        for (int i = 0; i < NUMBER_OF_QUESTIONS; i++) {
            int number1 = Util.getRandomizedNumbers(1, UPPER_BORDER_OF_NUMBER);
            int number2 = Util.getRandomizedNumbers(1, UPPER_BORDER_OF_NUMBER);
            int operationNumber = getOperationNumber();
            String[] pairQuestionAnswer = new String[SECOND_ARRAY_SIZE];
            switch (operationNumber) {
                case OPERATION_ADD -> pairQuestionAnswer = makeQuestionsForOperationAdd(number1, number2);
                case OPERATION_SUBTRACTION -> pairQuestionAnswer = makeQuestionsForOperationSubtraction(number1, number2);
                case OPERATION_PRODUCT -> pairQuestionAnswer = makeQuestionsForOperationProduct(number1, number2);
            }
            questionAndAnswerPair[i][0] = pairQuestionAnswer[0];
            questionAndAnswerPair[i][1] = pairQuestionAnswer[1];
        }
        Engine.mainEngineMethod(GENERAL_QUESTION, questionAndAnswerPair);
    }
    public static int getOperationNumber() {
        return Util.getRandomizedNumbers(1, UPPER_BORDER_OF_OPERATION);

    }
    public static String[] makeQuestionsForOperationAdd(int number1, int number2) {
        String[] pairQuestionAnswer = new String[SECOND_ARRAY_SIZE];
        int corrAnswer = number1 + number2;
        pairQuestionAnswer[0] = "Question: " + number1 + " + " + number2 + "\nYour answer: ";
        pairQuestionAnswer[1] = String.valueOf(corrAnswer);
        return pairQuestionAnswer;
    }
    public static String[] makeQuestionsForOperationSubtraction(int number1, int number2) {
        String[] pairQuestionAnswer = new String[SECOND_ARRAY_SIZE];
        int corrAnswer = number1 - number2;
        pairQuestionAnswer[0] = "Question: " + number1 + " - " + number2 + "\nYour answer: ";
        pairQuestionAnswer[1] = String.valueOf(corrAnswer);
        return pairQuestionAnswer;
    }
    public static String[] makeQuestionsForOperationProduct(int number1, int number2) {
        String[] pairQuestionAnswer = new String[SECOND_ARRAY_SIZE];
        int corrAnswer = number1 * number2;
        pairQuestionAnswer[0] = "Question: " + number1 + " * " + number2 + "\nYour answer: ";
        pairQuestionAnswer[1] = String.valueOf(corrAnswer);
        return pairQuestionAnswer;
    }
}
