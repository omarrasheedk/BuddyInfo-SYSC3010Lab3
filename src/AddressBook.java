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
		listOfBuddies = new ArrayList<BuddyInfo>();
	}
	
	
	public void addBuddy(BuddyInfo newBuddy) {
		if(newBuddy != null)
			listOfBuddies.add(newBuddy);
	}
	

	public void removeBuddy(int index) {
		if(index >= 0 && index < listOfBuddies.size())
			listOfBuddies.remove(index);
	}
	
	
	public static void main(String[] args) {
		BuddyInfo buddy = new BuddyInfo("Tom", "Carleton", 1234);
		AddressBook addressBook = new AddressBook();
		addressBook.addBuddy(buddy);
		addressBook.removeBuddy(0);		
	}
	
	
	
}
