package GuessFromJar;

class Administrator {
	//Declared final to ???
	final Prompter prompter;
	public Administrator(Prompter prompter) {
		this.prompter = prompter;
	}

	public Jar setUpGame() {
		String prompt;
		//// Debug statements
		//Methods in object can be used directly
		//System.out.println(getClass());
		//System.out.println(toString());
		/////
		prompt = "What type of item?";
		String itemType = prompter.getDataFromUser(prompt);
		prompt = "What is the maximum amount of "+itemType;
		int  maxItemsAllowed = Integer.parseInt(prompter.getDataFromUser(prompt));
        Jar jar = new Jar(itemType,maxItemsAllowed);
        return jar;
     }
}