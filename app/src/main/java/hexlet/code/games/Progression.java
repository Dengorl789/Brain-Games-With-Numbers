package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Arrays;

public class Progression {
    private static final int NUMBER_OF_QUESTIONS = 3;
    private static final int FIRST_ARRAY_SIZE = 3;
    private static final int SECOND_ARRAY_SIZE = 2;
    private static final int UPPER_BORDER_OF_NUMBER = 15;
    private static final int LOWER_BORDER_OF_LINE = 6;
    private static final int UPPER_BORDER_OF_LINE = 10;
    private static final int UPPER_BORDER_OF_STEP = 5;
    public static void playGameProgression() {
        String generalQuestion = "What number is missing in the progression?";

        String[][] questionAndAnswerPair = new String[FIRST_ARRAY_SIZE][SECOND_ARRAY_SIZE];
        for (int i = 0; i < NUMBER_OF_QUESTIONS; i++) {
            int progressionLineLength = Engine.getRandomizedNumbers(LOWER_BORDER_OF_LINE, UPPER_BORDER_OF_LINE);
            String[] progressionLine = new String[progressionLineLength];

            int firstElement = Engine.getRandomizedNumbers(1, UPPER_BORDER_OF_NUMBER);
            int progressionStep = Engine.getRandomizedNumbers(2, UPPER_BORDER_OF_STEP);
            progressionLine[0] = String.valueOf(firstElement);

            for (int j = 1; j < progressionLineLength; j++) {
                int nextElement =  firstElement + (progressionStep * j);
                progressionLine[j] = String.valueOf(nextElement);
            }
            int positionToHide = Engine.getRandomizedNumbers(0, progressionLineLength - 1);
            String correctAnswer = progressionLine[positionToHide];
            progressionLine[positionToHide] = "..";
            String progressionToString = makeFinalViewOfProgressionLine(Arrays.toString(progressionLine));
            String question = "Question: " + progressionToString + "\nYour answer: ";
            questionAndAnswerPair[i][0] = question;
            questionAndAnswerPair[i][1] = correctAnswer;
        }
        Engine.mainEngineMethod(generalQuestion, questionAndAnswerPair);
    }
    public static String makeFinalViewOfProgressionLine(String progressionToString) {
        return progressionToString.replace(",", "")
                .replace("[", "")
                .replace("]", "");

    }
}
