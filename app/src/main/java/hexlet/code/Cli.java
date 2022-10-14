package hexlet.code;

import java.util.Scanner;

public class Cli {
    private static String playerName;

    public static void setPlayerName() {
        Scanner sc = new Scanner(System.in);
        playerName = sc.nextLine().trim();
    }

    public static String getPlayerName() {
        return playerName;
    }

    public static void greetPlayer() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        setPlayerName();
        System.out.println("Hello, " + getPlayerName() + "!");
    }
}
