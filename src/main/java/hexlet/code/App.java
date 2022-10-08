package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the game number and press Enter."
                + "\n1 - Greet"
                + "\n2 - Even"
                + "\n3 - Calc"
                + "\n0 - Exit"
                + "\nYour choice: ");

        int gameNumber = scanner.nextInt();
        var newPlayer = new Cli();

        switch (gameNumber) {
            case 1:
                newPlayer.greetPlayer();
                break;
            case 2:
                Even.playingGameEven();
                break;
            case 3:
                Calc.playingGameCalc();
            default:
                break;
        }

    }
}
