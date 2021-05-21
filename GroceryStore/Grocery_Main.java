import java.util.*;
public class GroceryMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		GroceryList shop = new GroceryList();
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Which item would you like to buy?");
		String user = scan.nextLine();
		System.out.println("How many " + user + "?");
		int quantity = scan.nextInt();
		scan.nextLine();
		System.out.println("How much is it?");
		double price = scan.nextDouble();
			
		GroceryItemOrder userpick = new GroceryItemOrder(user,quantity, price);
		
		System.out.println("Great, here are the items in your cart.");
		GroceryItemOrder item1 = new GroceryItemOrder("Rice", 3, 4.4);
		GroceryItemOrder item2 = new GroceryItemOrder("chocolate", 7, 3.4);
		GroceryItemOrder item3 = new GroceryItemOrder("water", 10, 1.0);
		GroceryItemOrder item4 = new GroceryItemOrder("orange juice", 5, 2.0);
		GroceryItemOrder item5 = new GroceryItemOrder("gator", 3, 4.4);
		GroceryItemOrder item6 = new GroceryItemOrder("takis", 3, 4.4);
		GroceryItemOrder item7 = new GroceryItemOrder("chip", 3, 4.4);
		GroceryItemOrder item8 = new GroceryItemOrder("cookies", 3, 4.4);
		GroceryItemOrder item9 = new GroceryItemOrder("broc", 3, 4.4);
		GroceryItemOrder item10 = new GroceryItemOrder("book", 3, 4.4);
		
		shop.add(item1);
		shop.add(item2);
		shop.add(item3);
		shop.add(item4);
		shop.add(item5);
		shop.add(item6);
		shop.add(item7);
		shop.add(item8);
		shop.add(item9);
		shop.add(userpick);
		
		
		System.out.println(shop);
		
	}

}
