package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Util;

public class GameToCalculateTheExpression {
    private static final int NUMBER_OF_QUESTIONS = 3;
    private static final int UPPER_BORDER_OF_NUMBER = 30;
    private static final int UPPER_BORDER_OF_OPERATION = 3;
    private static final int OPERATION_ADD = 1;
    private static final int OPERATION_SUBTRACTION = 2;
    private static final int OPERATION_PRODUCT = 3;
    private static final String GENERAL_QUESTION = "What is the result of the expression?";
    private static final int NUMBER_OF_QUESTION_AND_ANSWER = 2;
    private static String[] pairQuestionAndAnswer = new String[NUMBER_OF_QUESTION_AND_ANSWER];
    public static void play() throws Exception {
        String[][] questionAndAnswerPair = Engine.createArrayForQuestionAndAnswerPairs();
        for (int i = 0; i < NUMBER_OF_QUESTIONS; i++) {
            int number1 = Util.getRandomizedNumbers(1, UPPER_BORDER_OF_NUMBER);
            int number2 = Util.getRandomizedNumbers(1, UPPER_BORDER_OF_NUMBER);
            int operationNumber = getOperationNumber();

            switch (operationNumber) {
                case OPERATION_ADD:
                    pairQuestionAndAnswer = makeQuestionsForOperationAdd(number1, number2);
                    break;
                case OPERATION_SUBTRACTION:
                    pairQuestionAndAnswer = makeQuestionsForOperationSubtraction(number1, number2);
                    break;
                case OPERATION_PRODUCT:
                    pairQuestionAndAnswer = makeQuestionsForOperationProduct(number1, number2);
                    break;
                default:
                    throw new Exception("Unknown operation");
            }
            questionAndAnswerPair[i][0] = pairQuestionAndAnswer[0];
            questionAndAnswerPair[i][1] = pairQuestionAndAnswer[1];
        }
        Engine.mainEngineMethod(GENERAL_QUESTION, questionAndAnswerPair);
    }
    public static int getOperationNumber() {
        return Util.getRandomizedNumbers(1, UPPER_BORDER_OF_OPERATION);

    }
    public static String[] makeQuestionsForOperationAdd(int number1, int number2) {
        int corrAnswer = number1 + number2;
        pairQuestionAndAnswer[0] = "Question: " + number1 + " + " + number2 + "\nYour answer: ";
        pairQuestionAndAnswer[1] = String.valueOf(corrAnswer);
        return pairQuestionAndAnswer;
    }
    public static String[] makeQuestionsForOperationSubtraction(int number1, int number2) {
        int corrAnswer = number1 - number2;
        pairQuestionAndAnswer[0] = "Question: " + number1 + " - " + number2 + "\nYour answer: ";
        pairQuestionAndAnswer[1] = String.valueOf(corrAnswer);
        return pairQuestionAndAnswer;
    }
    public static String[] makeQuestionsForOperationProduct(int number1, int number2) {
        int corrAnswer = number1 * number2;
        pairQuestionAndAnswer[0] = "Question: " + number1 + " * " + number2 + "\nYour answer: ";
        pairQuestionAndAnswer[1] = String.valueOf(corrAnswer);
        return pairQuestionAndAnswer;
    }
}
