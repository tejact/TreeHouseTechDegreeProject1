package GuessFromJar;

import java.util.Scanner;

public class Game {

    public static void main(String[] args) {    	
        Game.startGame();
    }
    public static void startGame() {
        Scanner scanner = new Scanner(System.in);
        Prompter prompter = new Prompter(scanner);
        //Admin set up the game
        //Admin creates the Jar and this Jar is passed to player.
        Administrator admin = new Administrator(prompter);
        Jar jar = admin.setUpGame();
        Player player = new Player(jar,prompter);
        player.play();
    }


}
