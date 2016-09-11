package GuessFromJar;

class Administrator {

	final Prompter prompter;
	public Administrator(Prompter prompter) {
		this.prompter = prompter;
	}

	public Jar setUpGame() {
		String prompt;
		prompt = "What type of item?";
		String itemType = prompter.getDataFromUser(prompt);
		prompt = "What is the maximum amount of "+itemType;
        int  maxItemsAllowed = 0;

        try {
            maxItemsAllowed = Integer.parseInt(prompter.getDataFromUser(prompt));
        }
        catch (NumberFormatException e) {
            System.out.println("Please enter a valid number. Existing out now !!!");
            //Can be improved by using a while loop
            System.exit(1);
        }



        Jar jar = new Jar(itemType,maxItemsAllowed);
        return jar;
     }
}