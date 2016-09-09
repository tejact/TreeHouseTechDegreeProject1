package GuessFromJar;

import java.util.Random;

class Player {

	Jar jar;
	Prompter prompter;

	Player(Jar jar, Prompter prompter) {
		this.jar = jar;
		this.prompter = prompter;
	}

	public void play() {
		String prompt;
		String itemType = jar.getItemType();
		int maxItemsAllowed = jar.getMaxNoOfItems();
		Random rando = new Random();
		int noOfItemsInJar = rando.nextInt(maxItemsAllowed) + 1;
		//Debug test statement
		//System.out.println("The nubmer of items in the Jar are "+noOfItemsInJar);
        int noOfGuesses = 0;
        int guess;
		//Execute this loop till the noOfItemsInJar and user guess are not equal
        do{
            prompt = "How many " +itemType+" are in the jar?";
			prompter.outToUser(prompt);
			prompt = "Pick a number between 1 and "+maxItemsAllowed;
            guess = Integer.parseInt(prompter.getDataFromUser(prompt));
			//Check if user guesses more than maxItemsAllowed
			if(guess > maxItemsAllowed) {
				System.out.println("Your guess must be less than maximum fill amount");
			}
			else {
				//Check if the guess is lesses/greater than noOfItemsInJar
				//For every guess noOfGuesses is incremented by 1
				if(guess > noOfItemsInJar) {
					System.out.println("Your guess is too high");
					noOfGuesses++;
				} else if(guess < noOfItemsInJar) {
					System.out.println("Your guess is too low");
					noOfGuesses++;
				}
			}
        }while(guess != noOfItemsInJar);
        prompt = "You got it in "+noOfGuesses+" attempts";
        prompter.outToUser(prompt);
	}
}