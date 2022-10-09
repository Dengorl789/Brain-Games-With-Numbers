package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.print("Please enter the game number and press Enter."
                + "\n1 - Greet"
                + "\n2 - Even"
                + "\n3 - Calc"
                + "\n4 - GCD"
                + "\n0 - Exit"
                + "\nYour choice: ");
        Scanner scanner = new Scanner(System.in);
        int gameNumber = scanner.nextInt();

        switch (gameNumber) {
            case 1 -> Cli.greetPlayer();
            case 2, 3, 4 -> Engine.mainEngineMethod(gameNumber);
            default -> {
            }
        }

    }
}
