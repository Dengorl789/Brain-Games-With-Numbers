package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Util;

public class GameOddOrEven {
    private static final int NUMBER_OF_QUESTIONS = 3;
    private static final int UPPER_BORDER_OF_NUMBER = 30;
    private static final String GENERAL_QUESTION = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    public static void play() {
        String[][] questionAndAnswerPair = Engine.createArrayForQuestionAndAnswerPairs();
        for (int i = 0; i < NUMBER_OF_QUESTIONS; i++) {
            int number = Util.getRandomizedNumbers(1, UPPER_BORDER_OF_NUMBER);
            String question = "Question: " + number + "\nYour answer: ";
            String correctAnswer = checkParity(number) ? "yes" : "no";
            questionAndAnswerPair[i][0] = question;
            questionAndAnswerPair[i][1] = correctAnswer;
        }
        Engine.mainEngineMethod(GENERAL_QUESTION, questionAndAnswerPair);
    }
    public static boolean checkParity(int number) {
        return number % 2 == 0;
    }
}
