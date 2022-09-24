package hexlet.code;

import java.util.Scanner;

public class Cli {
    private String playerName;

    public void setPlayerName() {
        Scanner sc = new Scanner(System.in);
        this.playerName = sc.nextLine().trim();
    }

    public String getPlayerName() {
        return playerName;
    }

    public String greetPlayer() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        setPlayerName();
        return "Hello, " + getPlayerName() + "!";
    }
}
