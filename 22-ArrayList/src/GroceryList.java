import java.util.*;

public class GroceryList {
	
	// This list can hold different data type value.
	//List groceryList = new ArrayList();
	
	// This list only can hold String data type value.
	List<String> groceryList = new ArrayList<String>();
	
	public void addGroceryItem(String item) {
		groceryList.add(item);     // -> adding element method. Like push() method.
	}
	
	public void printGroceryList() {
		                              // length of the list method
		System.out.println("You have " + groceryList.size() + " items in your grocery list");
		
		for(int i=0; i< groceryList.size(); i++) {
			System.out.println((i+1) + "." + groceryList.get(i));  // instead of groceryList[i]. because this is not array.
		}
	}
	
	public void modifyGorceryItem(int position, String newItem) {
		groceryList.set(position, newItem);   // This method replaces the element at given position.
	}
	
	public void removeGroceryItem(int position) {
		// String theItem = groceryList.get(position);
		groceryList.remove(position);    // For removing an item
	}
	
	public String findItem(String searchItem) {
		//boolean exists = groceryList.contains(searchItem);  //-> for checking element is inside of the list.
		int position = groceryList.indexOf(searchItem);       //-> looking index of given element.
		
		if(position>=0) {
			return groceryList.get(position);                 //-> getting item at given position.
		}
		
		return null;
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
