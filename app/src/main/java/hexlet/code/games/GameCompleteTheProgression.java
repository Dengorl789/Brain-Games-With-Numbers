package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Util;

import java.util.Arrays;

public class GameCompleteTheProgression {
    private static final int NUMBER_OF_QUESTIONS = 3;
    private static final int FIRST_ARRAY_SIZE = 3;
    private static final int SECOND_ARRAY_SIZE = 2;
    private static final int UPPER_BORDER_OF_NUMBER = 15;
    private static final int LOWER_BORDER_OF_LINE = 6;
    private static final int UPPER_BORDER_OF_LINE = 10;
    private static final int UPPER_BORDER_OF_STEP = 5;
    private static final String GENERAL_QUESTION = "What number is missing in the progression?";
    public static void play() {
        String[][] questionAndAnswerPair = new String[FIRST_ARRAY_SIZE][SECOND_ARRAY_SIZE];
        for (int i = 0; i < NUMBER_OF_QUESTIONS; i++) {
            int progressionLineLength = Util.getRandomizedNumbers(LOWER_BORDER_OF_LINE, UPPER_BORDER_OF_LINE);
            String[] progressionLine = createNewProgressionLine(progressionLineLength);

            int hiddenPosition = Util.getRandomizedNumbers(0, progressionLineLength - 1);
            String correctAnswer = progressionLine[hiddenPosition];

            String finalViewOfProgression = hideElementAndConvertToString(progressionLine, hiddenPosition);
            String question = "Question: " + finalViewOfProgression + "\nYour answer: ";
            questionAndAnswerPair[i][0] = question;
            questionAndAnswerPair[i][1] = correctAnswer;
        }
        Engine.mainEngineMethod(GENERAL_QUESTION, questionAndAnswerPair);
    }
    public static String[] createNewProgressionLine(int progressionLineLength) {
        String[] progressionLine = new String[progressionLineLength];

        int firstElement = Util.getRandomizedNumbers(1, UPPER_BORDER_OF_NUMBER);
        int progressionStep = Util.getRandomizedNumbers(2, UPPER_BORDER_OF_STEP);
        progressionLine[0] = String.valueOf(firstElement);

        for (int i = 1; i < progressionLineLength; i++) {
            int nextElement =  firstElement + (progressionStep * i);
            progressionLine[i] = String.valueOf(nextElement);
        }
        return progressionLine;
    }
    public static String hideElementAndConvertToString(String[] progressionLine, int hiddenPosition) {
        progressionLine[hiddenPosition] = "..";
        String progressionToString = Arrays.toString(progressionLine)
                .replace(",", "")
                .replace("[", "")
                .replace("]", "");
        return progressionToString;
    }
}
