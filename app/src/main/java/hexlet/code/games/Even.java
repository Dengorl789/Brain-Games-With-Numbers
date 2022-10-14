package hexlet.code.games;

import hexlet.code.Engine;

public class Even {
    public static void playGameEven() {
        String generalQuestion = "Answer 'yes' if the number is even, otherwise answer 'no'.";

        String[][] questionAndAnswerPair = new String[3][2];
        for (int i = 0; i < 3; i++) {
            int number = Engine.getRandomizedNumbers(1, 30);
            int parity = number % 2;
            String question = "Question: " + number + "\nYour answer: ";
            String correctAnswer = parity == 0 ? "yes" : "no";
            questionAndAnswerPair[i][0] = question;
            questionAndAnswerPair[i][1] = correctAnswer;
        }
        Engine.mainEngineMethod(generalQuestion, questionAndAnswerPair);
    }
}
