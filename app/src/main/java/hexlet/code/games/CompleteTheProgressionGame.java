package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Util;

import java.util.Arrays;

public class CompleteTheProgressionGame {
    private static final int NUMBER_OF_QUESTIONS = 3;
    private static final int UPPER_BORDER_OF_NUMBER = 15;
    private static final int LOWER_BORDER_OF_LINE = 6;
    private static final int UPPER_BORDER_OF_LINE = 10;
    private static final int UPPER_BORDER_OF_STEP = 5;
    private static final String GENERAL_QUESTION = "What number is missing in the progression?";
    public static void play() {
        String[][] questionAndAnswerPair = new String[Engine.FIRST_ARRAY_SIZE][Engine.SECOND_ARRAY_SIZE];
        for (int i = 0; i < NUMBER_OF_QUESTIONS; i++) {
            int progressionLineLength = Util.getRandomizedNumbers(LOWER_BORDER_OF_LINE, UPPER_BORDER_OF_LINE);
            int firstElement = Util.getRandomizedNumbers(1, UPPER_BORDER_OF_NUMBER);
            int progressionStep = Util.getRandomizedNumbers(2, UPPER_BORDER_OF_STEP);
            int[] progressionLine = createNewProgressionLine(progressionLineLength, firstElement, progressionStep);

            int hiddenPosition = Util.getRandomizedNumbers(0, progressionLineLength - 1);
            String correctAnswer = String.valueOf(progressionLine[hiddenPosition]);

            String finalViewOfProgression = hideElementAndConvertToString(progressionLine, hiddenPosition);
            questionAndAnswerPair[i][0] = finalViewOfProgression;
            questionAndAnswerPair[i][1] = correctAnswer;
        }
        Engine.runGame(GENERAL_QUESTION, questionAndAnswerPair);
    }
    public static int[] createNewProgressionLine(int progressionLineLength, int firstElement, int progressionStep) {
        int[] progressionLine = new int[progressionLineLength];
        progressionLine[0] = firstElement;

        for (int i = 1; i < progressionLineLength; i++) {
            int nextElement =  firstElement + (progressionStep * i);
            progressionLine[i] = nextElement;
        }
        return progressionLine;
    }
    public static String hideElementAndConvertToString(int[] progressionLine, int hiddenPosition) {
        String[] progressionToString = new String[progressionLine.length];

        for (int i = 0; i < progressionLine.length; i++) {
            progressionToString[i] = String.valueOf(progressionLine[i]);
        }
        progressionToString[hiddenPosition] = "..";
        String finalViewOfProgression = Arrays.toString(progressionToString)
                .replace(",", "")
                .replace("[", "")
                .replace("]", "");
        return finalViewOfProgression;
    }
}
