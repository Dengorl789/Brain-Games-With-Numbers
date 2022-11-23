package hexlet.code;

import hexlet.code.games.OddOrEvenGame;
import hexlet.code.games.CalculateTheExpressionGame;
import hexlet.code.games.FindGreatestCommonDividerGame;
import hexlet.code.games.CompleteTheProgressionGame;
import hexlet.code.games.GuessPrimeNumberGame;

import java.util.Scanner;

public class App {
    private static final int GREET = 1;
    private static final int GAME_EVEN = 2;
    private static final int GAME_CALC = 3;
    private static final int GAME_GCD = 4;
    private static final int GAME_PROGRESSION = 5;
    private static final int GAME_PRIME = 6;
    public static void main(String[] args) throws Exception {
        System.out.print("Please enter the game number and press Enter."
                + "\n1 - Greet"
                + "\n2 - Even"
                + "\n3 - Calc"
                + "\n4 - GCD"
                + "\n5 - Progression"
                + "\n6 - Prime"
                + "\n0 - Exit"
                + "\nYour choice: ");
        Scanner scanner = new Scanner(System.in);
        int gameNumber = scanner.nextInt();

        switch (gameNumber) {
            case GREET -> Cli.greetPlayer();
            case GAME_EVEN -> OddOrEvenGame.play();
            case GAME_CALC -> CalculateTheExpressionGame.play();
            case GAME_GCD -> FindGreatestCommonDividerGame.play();
            case GAME_PROGRESSION -> CompleteTheProgressionGame.play();
            case GAME_PRIME -> GuessPrimeNumberGame.play();
            default -> {
            }
        }

    }
}
