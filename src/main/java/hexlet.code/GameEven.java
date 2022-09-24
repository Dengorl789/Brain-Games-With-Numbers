package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class GameEven {
    public static void playingGameEven() {
        var ourPlayer = new Cli();
        ourPlayer.greetPlayer();

        int bottomBorder = 1;
        int upperBorder = 50;
        int diff = upperBorder - bottomBorder;

        for (int i = 0; i <= 2; i++) {
            Random rn = new Random();
            int number = rn.nextInt(diff + 1) + bottomBorder;
            int parity = number % 2;

            System.out.print("Answer 'yes' if the number is even, otherwise answer 'no'."
                    + "\nQuestion: " + number + "\nYour answer: ");
            String correctAnswer = "Correct!";
            String incorrectAnswer = "'yes' is wrong answer ;(. Correct answer was 'no'."
                    + "\nLet's try again, " + ourPlayer.getPlayerName() + "!";

            Scanner scan = new Scanner(System.in);
            String answer = scan.nextLine();

            String message = (((parity == 0) && (answer.equals("yes")))
                    || ((parity == 1) && (answer.equals("no")))) ? correctAnswer : incorrectAnswer;

            System.out.println(message);

            if (message.equals(incorrectAnswer)) {
                return;
            }
        }
        System.out.println("Congratulations, " + ourPlayer.getPlayerName() + "!");
    }
}
