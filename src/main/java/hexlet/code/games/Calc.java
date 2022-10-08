package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;
import java.util.Scanner;

public class Calc {
    public static void playingGameCalc() {
        Engine engine = new Engine();
        String generalQuestion = "What is the result of the expression?";
        engine.greetAndAskGeneralQuestion(generalQuestion);

        for(int i = 0; i < 3; i++) {
            int operationNumber = Engine.getRandomizedNumbers(1,3);

            if (operationNumber == 1) {
                int number1 = Engine.getRandomizedNumbers(1, 30);
                int number2 = Engine.getRandomizedNumbers(1, 30);

                int corrAnswer = number1 + number2;
                String correctAnswer = "" + corrAnswer;

                String question = "Question: " + number1 + " + " + number2 + "\nYour answer: ";
                engine.getPlayerAnswerAndCompare(correctAnswer, question);
            }
            if (operationNumber == 2) {
                int number1 = Engine.getRandomizedNumbers(1, 30);
                int number2 = Engine.getRandomizedNumbers(1, 30);

                int corrAnswer = number1 - number2;
                String correctAnswer = "" + corrAnswer;

                String question = "Question: " + number1 + " - " + number2 + "\nYour answer: ";
                engine.getPlayerAnswerAndCompare(correctAnswer, question);
            }
            if (operationNumber == 3) {
                int number1 = Engine.getRandomizedNumbers(1, 30);
                int number2 = Engine.getRandomizedNumbers(1, 30);

                int corrAnswer = number1 * number2;
                String correctAnswer = "" + corrAnswer;

                String question = "Question: " + number1 + " * " + number2 + "\nYour answer: ";
                engine.getPlayerAnswerAndCompare(correctAnswer, question);
            }
        }
        engine.showCongratulationMessage();
    }
}
