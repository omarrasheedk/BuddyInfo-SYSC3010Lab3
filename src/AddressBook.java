/**
 * 
 */

/**
 * @author MRKhan
 *
 */

import java.util.*;

public class AddressBook {

	private ArrayList<BuddyInfo> listOfBuddies;
	public AddressBook(){
		ArrayList<BuddyInfo> listOfBuddies = new ArrayList<BuddyInfo>();
	}
	
	
	/**
	 * @param newBuddy the new buddy to be added
	 */
	public void addBuddy(BuddyInfo newBuddy) {
		listOfBuddies.add(newBuddy);
	}
	
	
	/**
	 * @return the Buddy that was removed
	 */
	public BuddyInfo removeBuddy() {
		return listOfBuddies.remove(listOfBuddies.size());
	}
	
	
	
	public static void main(String[] args) {
		
		System.out.println("Addres Book");

	}
	
	
	
}
