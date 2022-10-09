package hexlet.code.games;

import hexlet.code.Engine;

public class Even {
    public static String generateGeneralQuestionEven() {
        return "Answer 'yes' if the number is even, otherwise answer 'no'.";
    }
    public static String[] generateQuestionAnswerPairEven() {
        int number = Engine.getRandomizedNumbers(1, 30);
        int parity = number % 2;

        String[] questionAnswerPair = new String[2];
        String question = "Question: " + number + "\nYour answer: ";
        String correctAnswer = parity == 0 ? "yes" : "no";
        questionAnswerPair[0] = question;
        questionAnswerPair[1] = correctAnswer;
        return questionAnswerPair;
    }
}
