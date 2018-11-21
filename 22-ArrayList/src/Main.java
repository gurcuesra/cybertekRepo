import java.util.*;

public class Main {
	
	private static Scanner scanner = new Scanner(System.in);
	private static GroceryList groceryList = new GroceryList();

	public static void main(String[] args) {
		boolean quit = false;
		int choice=0;
		printInstructions();
		
		while(!quit) {
			System.out.println("Enter your choice:");
			choice = scanner.nextInt();
			scanner.nextLine();      // -> if we add some string
			
			switch(choice) {
			case 0:
				printInstructions();
				break;
			case 1:
				groceryList.printGroceryList();
				break;
			case 2:
				addItem(scanner.nextLine());
				break;
			case 3:
				modifyItem(scanner.nextLine(), scanner.nextLine() ,scanner.nextInt());
				break;
			case 4:
				removeItem(scanner.nextInt(), scanner.nextLine());
				break;
			case 5: 
				searchForItem(scanner.nextLine());
				break;
			case 6: 
				quit = true;
				System.out.println("You exit to the program");
				break;
			}
		}

	}




	private static void printInstructions() {
		System.out.println("Please enter a number: \n0- Main Menu \n1- Print List \n2- Add item \n3- Replace item \n4-Remove item \n5- Search Item \n6- Exit");
		
	}
	
	private static void addItem(String item) {
		groceryList.addGroceryItem(item);
		System.out.println(item + " is added to list");
		
	}
	
	private static void modifyItem(String newItem, String searchItem, int position) {
		groceryList.modifyGorceryItem(position, newItem);
		System.out.println(groceryList.findItem(searchItem) + " is changed with " + newItem);
		
	}
	
	private static void removeItem(int position, String searchItem) {
		groceryList.removeGroceryItem(position);
		System.out.println(groceryList.findItem(searchItem) + " is removed");
		
	}
	
	private static void searchForItem(String searchItem) {
		groceryList.findItem(searchItem);
	
		if(groceryList.findItem(searchItem) != null) {
			System.out.println(searchItem + " is in list");
		}else {
			System.out.println(searchItem + " is NOT in list");
		}
		
		
	}

}
