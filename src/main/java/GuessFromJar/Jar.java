package GuessFromJar;

public class Jar {
	
	final String itemType;
	final int maxNoOfItems;

	Jar(String itemType,int maxNoOfItems) {
		this.itemType = itemType;
		this.maxNoOfItems = maxNoOfItems;
	}	

	public String getItemType() {
		return itemType;		
	}

	public int getMaxNoOfItems() {
		return maxNoOfItems;
	}
} 

