package hexlet.code.games;

import hexlet.code.Engine;

public class Even {
    private static final int NUMBER_OF_QUESTIONS = 3;
    private static final int FIRST_ARRAY_SIZE = 3;
    private static final int SECOND_ARRAY_SIZE = 2;
    private static final int UPPER_BORDER_OF_NUMBER = 30;
    public static void playGameEven() {
        String generalQuestion = "Answer 'yes' if the number is even, otherwise answer 'no'.";

        String[][] questionAndAnswerPair = new String[FIRST_ARRAY_SIZE][SECOND_ARRAY_SIZE];
        for (int i = 0; i < NUMBER_OF_QUESTIONS; i++) {
            int number = Engine.getRandomizedNumbers(1, UPPER_BORDER_OF_NUMBER);
            int parity = number % 2;
            String question = "Question: " + number + "\nYour answer: ";
            String correctAnswer = parity == 0 ? "yes" : "no";
            questionAndAnswerPair[i][0] = question;
            questionAndAnswerPair[i][1] = correctAnswer;
        }
        Engine.mainEngineMethod(generalQuestion, questionAndAnswerPair);
    }
}
