package GuessFromJar;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main.startGame();
    }
    public static void startGame() {
        Scanner scanner = new Scanner(System.in);
        Prompter prompter = new Prompter(scanner);
        //Admin set up the game
        //Admin creates the Jar and this Jar is passed to game.
        Administrator admin = new Administrator(prompter);
        Jar jar = admin.setUpGame();
        Game game = new Game(jar,prompter);
        game.play();
    }
}
