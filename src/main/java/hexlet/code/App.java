package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.print("Please enter the game number and press Enter."
                + "\n1 - Greet"
                + "\n2 - Even"
                + "\n3 - Calc"
                + "\n4 - GCD"
                + "\n5 - Progression"
                + "\n0 - Exit"
                + "\nYour choice: ");
        Scanner scanner = new Scanner(System.in);
        int gameNumber = scanner.nextInt();

        switch (gameNumber) {
            case 1 -> Cli.greetPlayer();
            case 2 -> Even.playGameEven();
            case 3 -> Calc.playGameCalc();
            case 4 -> GCD.playGameGCD();
            case 5 -> Progression.playGameProgression();
            default -> {
            }
        }

    }
}
