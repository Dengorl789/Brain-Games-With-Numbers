package hexlet.code.games;

import hexlet.code.Engine;

public class Prime {
    public static void playGamePrime() {
        String generalQuestion = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

        String[][] questionAndAnswerPair = new String[3][2];
        for (int i = 0; i < 3; i++) {
            int number = Engine.getRandomizedNumbers(1, 50);
            int dividersCount = 0;
            for (int j = number; j > 0; j--) {
                if (number % j == 0) {
                    dividersCount++;
                }
            }
            String question = "Question: " + number +"\nYour answer: ";
            String correctAnswer = dividersCount == 2 ? "yes" : "no";
            questionAndAnswerPair[i][0] = question;
            questionAndAnswerPair[i][1] = correctAnswer;
        }
        Engine.mainEngineMethod(generalQuestion, questionAndAnswerPair);
    }
}
