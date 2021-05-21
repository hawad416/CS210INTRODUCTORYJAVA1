import java.util.Arrays;

public class GroceryList {
	
	public static final int MAX_ITEMS = 10;

	
	private GroceryItemOrder[] items;
	private int numItems;
	
	//constructs a new empty grocerylist
	public GroceryList() {
		items = new GroceryItemOrder[MAX_ITEMS];
		numItems = 0;
	}
	
	public void add(GroceryItemOrder item) {
		items[numItems] = item;
		numItems++;
	}
	
	public double getTotalCost() {
		double cost =0.0;
		for(int i=0; i< numItems; i++) {
			cost+=items[i].getCost();
		}
		return cost;
	}
	
	public String toString() {
		
		System.out.println("Grocery Items You Bought:");
		for(GroceryItemOrder a: items) {
			System.out.println("- " + a);
		}
		return "\n Your total is: " + getTotalCost() + "\n Thank you for shopping, have a great day!";
	}
	
}
