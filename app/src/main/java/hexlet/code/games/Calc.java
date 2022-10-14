package hexlet.code.games;

import hexlet.code.Engine;

public class Calc {
    public static void playGameCalc() {
        String generalQuestion = "What is the result of the expression?";

        String[][] questionAndAnswerPair = new String[3][2];
        for (int i = 0; i < 3; i++) {
            int operationNumber = Engine.getRandomizedNumbers(1, 3);
            int number1 = Engine.getRandomizedNumbers(1, 30);
            int number2 = Engine.getRandomizedNumbers(1, 30);
            if (operationNumber == 1) {
                int corrAnswer = number1 + number2;
                String correctAnswer = String.valueOf(corrAnswer);
                String question = "Question: " + number1 + " + " + number2 + "\nYour answer: ";
                questionAndAnswerPair[i][0] = question;
                questionAndAnswerPair[i][1] = correctAnswer;
            } else if (operationNumber == 2) {
                int corrAnswer = number1 - number2;
                String correctAnswer = String.valueOf(corrAnswer);
                String question = "Question: " + number1 + " - " + number2 + "\nYour answer: ";
                questionAndAnswerPair[i][0] = question;
                questionAndAnswerPair[i][1] = correctAnswer;
            } else if (operationNumber == 3) {
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
