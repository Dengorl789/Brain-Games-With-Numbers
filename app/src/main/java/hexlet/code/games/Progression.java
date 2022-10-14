package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Arrays;

public class Progression {
    public static void playGameProgression() {
        String generalQuestion = "What number is missing in the progression?";

        String[][] questionAndAnswerPair = new String[3][2];
        for (int i = 0; i < 3; i++) {
            int progressionLineLength = Engine.getRandomizedNumbers(5, 10);
            String[] progressionLine = new String[progressionLineLength];

            int firstElement = Engine.getRandomizedNumbers(1, 15);
            int progressionStep = Engine.getRandomizedNumbers(2, 5);
            progressionLine[0] = String.valueOf(firstElement);

            for (int j = 1; j < progressionLineLength; j++) {
                int nextElement =  firstElement + (progressionStep * j);
                progressionLine[j] = String.valueOf(nextElement);
            }
            int positionToHide = Engine.getRandomizedNumbers(0, progressionLineLength);
            String correctAnswer = progressionLine[positionToHide];
            progressionLine[positionToHide] = "..";
            String question = "Question: " + Arrays.toString(progressionLine) + "\nYour answer: ";
            questionAndAnswerPair[i][0] = question;
            questionAndAnswerPair[i][1] = correctAnswer;
        }
        Engine.mainEngineMethod(generalQuestion, questionAndAnswerPair);
    }
}
