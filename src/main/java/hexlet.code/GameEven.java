package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class GameEven {
    public static void playingGameEven() {
        var player = new Cli();
        player.greetPlayer();

        int bottomBorder = 1;
        int upperBorder = 50;
        int diff = upperBorder - bottomBorder;
        String correctAnswer = "'yes'";
        String incorrectAnswer = "'no'";

        for (int i = 0; i <= 2; i++) {
            Random rn = new Random();
            int number = rn.nextInt(diff + 1) + bottomBorder;
            int parity = number % 2;

            if (parity == 1) {
                correctAnswer = "'no'";
                incorrectAnswer = "'yes'";
            }

            System.out.print("Answer 'yes' if the number is even, otherwise answer 'no'."
                    + "\nQuestion: " + number + "\nYour answer: ");

            Scanner scan = new Scanner(System.in);
            String answer = scan.nextLine();

            String incorrectMessage = incorrectAnswer +" is wrong answer ;(. Correct answer was " + correctAnswer + "."
                    + "\nLet's try again, " + player.getPlayerName() + "!";

            String message = (((parity == 0) && (answer.equals("yes")))
                    || ((parity == 1) && (answer.equals("no")))) ? "Correct!" : incorrectMessage;

            System.out.println(message);

            if (message.equals(incorrectMessage)) {
                return;
            }
        }
        System.out.println("Congratulations, " + player.getPlayerName() + "!");
    }
}
