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
	
	
	public void addBuddy(BuddyInfo newBuddy) {
		if(newBuddy != null)
			listOfBuddies.add(newBuddy);
	}
	

	public void removeBuddy(int index) {
		if(index >= 0 && index < listOfBuddies.size())
			listOfBuddies.remove(index);
	}
	
	
	
	public static void main(String[] args) {
		System.out.println("Addres Book");

		BuddyInfo buddy = new BuddyInfo();
		AddressBook Book1 = new AddressBook();
		
		Book1.addBuddy(buddy);
		Book1.removeBuddy(0);
				
		
		
		
	}
	
	
	
}
