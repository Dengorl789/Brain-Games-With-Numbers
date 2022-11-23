package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int FIRST_ARRAY_SIZE = 3;
    public static final int SECOND_ARRAY_SIZE = 2;
    private static final int NUMBER_OF_ROUNDS = 3;
    private static final String GREETING_MESSAGE = "Welcome to the Brain Games!\nMay I have your name? ";
    public static void runGame(String generalQuestion, String[][] questionAndAnswerPair) {
        System.out.print(GREETING_MESSAGE);
        Scanner sc = new Scanner(System.in);
        String playerName = sc.nextLine().trim();
        System.out.println("Hello, " + playerName + "!");
        System.out.println(generalQuestion);

        for (int i = 0; i < NUMBER_OF_ROUNDS; i++) {
            String question = "Question: " + questionAndAnswerPair[i][0] + "\nYour answer: ";
            System.out.print(question);

            Scanner scan = new Scanner(System.in);
            String answer = scan.nextLine();

            String correctAnswer = questionAndAnswerPair[i][1];
            String correctMessage = "Correct!";
            String incorrectMessage = "'" + answer + "' is wrong answer ;(. Correct answer was "
                    + "'" + correctAnswer + "'." + "\nLet's try again, " + playerName + "!";
            if (answer.equals(correctAnswer)) {
                System.out.println(incorrectMessage);
                return;
            }
            System.out.println(correctMessage);
        }
        String congrats = "Congratulations, " + playerName + "!";
        System.out.println(congrats);
    }
}



