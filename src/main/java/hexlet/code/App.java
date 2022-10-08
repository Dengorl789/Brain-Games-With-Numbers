package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        var newPlayer = new Cli();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the game number and press Enter."
                + "\n1 - Greet"
                + "\n2 - Even"
                + "\n3 - Calc"
                + "\n0 - Exit"
                + "\nYour choice: ");
        int gameNumber = scanner.nextInt();

        switch (gameNumber) {
            case 1:
                newPlayer.greetPlayer();
                break;
            case 2:
                Engine.mainEngineMethod(gameNumber);
                break;
            case 3:
                Engine.mainEngineMethod(gameNumber);
            default:
                break;
        }

    }
}
