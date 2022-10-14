package hexlet.code.games;

import hexlet.code.Engine;

public class Prime {
    private static final int NUMBER_OF_QUESTIONS = 3;
    private static final int FIRST_ARRAY_SIZE = 3;
    private static final int SECOND_ARRAY_SIZE = 2;
    private static final int UPPER_BORDER_OF_NUMBER = 50;
    public static void playGamePrime() {
        String generalQuestion = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

        String[][] questionAndAnswerPair = new String[FIRST_ARRAY_SIZE][SECOND_ARRAY_SIZE];
        for (int i = 0; i < NUMBER_OF_QUESTIONS; i++) {
            int number = Engine.getRandomizedNumbers(1, UPPER_BORDER_OF_NUMBER);
            int dividersCount = 0;
            for (int j = number; j > 0; j--) {
                if (number == 1) {
                    dividersCount++;
                }
                if (number % j == 0) {
                    dividersCount++;
                }
            }
            String question = "Question: " + number + "\nYour answer: ";
            String correctAnswer = dividersCount == 2 ? "yes" : "no";
            questionAndAnswerPair[i][0] = question;
            questionAndAnswerPair[i][1] = correctAnswer;
        }
        Engine.mainEngineMethod(generalQuestion, questionAndAnswerPair);
    }
}
