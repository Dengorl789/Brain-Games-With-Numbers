package hexlet.code.games;

import hexlet.code.Engine;

public class Even {
    public static void playingGameEven() {
        Engine engine = new Engine();
        String generalQuestion = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        engine.greetAndAskGeneralQuestion(generalQuestion);

        for (int i = 0; i < 3; i++) {
            int number = Engine.getRandomizedNumbers(1, 30);
            int parity = number % 2;

            String correctAnswer = parity == 0 ? "yes" : "no";
            String question = "Question: " + number + "\nYour answer: ";
            engine.getPlayerAnswerAndCompare(correctAnswer, question);
        }
        engine.showCongratulationMessage();
    }
}
