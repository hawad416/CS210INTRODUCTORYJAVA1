/**The requirements for this program are as follows.  



*	Prompt the user to enter a list of strings.  This could be a list of names, cities, sports teams, etc.  
*	The user can enter the list of words in one list, or individually after pressing enter after each entry.
*	Parse the list of strings into an array.  (There are two primary ways you can design this,
	either using a for loop, with the user entering one word at a time,  or by splitting the entire list in one step.)
*	Prompt the user to enter the word to search for.  (Example; Seattle, or Seahawks, or Canada, etc)
*	The program should search the array for the search word, and determine if the search word exists in the array.  
*	If the word exists more than once, it should produce a count of the number of times it exists.
*	The program will then output the list of words, the search word, whether the search word exists in the list (yes or no), and if it does exist, how many times it is found in the list.
**/
import java.util.*;

public class lala{




	public static void main(String[] args){
		
	
	
	
		System.out.println("If you would like to enter the cities all at once type 'Option 1' , "
				+ "\nif you would like to enter them one by one type 'Option 2' ");
		Scanner o1o2 = new Scanner(System.in);
		String options = o1o2.nextLine();
		
		if(options.equals("Option 1")) {
			Scanner city = new Scanner(System.in);
			System.out.println("Please enter the list of cities seperated by spaces");
			String cityname = city.nextLine();
			
			
			String[] cities = cityname.split(" ");
			System.out.println(Arrays.toString(cities));
			
	
		
		System.out.println("Search for a city you are looking for?");
		Scanner search = new Scanner(System.in);
		
		String searchcity = search.nextLine();
		
		boolean test = Arrays.asList(cities).contains(searchcity);
		
		if(test) {
			System.out.println("City Found!");
		
		int count =0;
		for(int i=0; i<cities.length; i++) {
			if(cities[i].equals(searchcity)) {
				count++;
			
			}
	
		}
		String isFound = "YES";
		System.out.println(isFound + ", " + searchcity+ " was found " + count + " times! Welcome to " + searchcity);
		}else{
			System.out.println("CITY NOT FOUND");
		}
		
		
		}
		
		else {
		
		
			System.out.println("Hello there how many cities would you like to enter today?");
			Scanner numcity = new Scanner(System.in);
			int num = numcity.nextInt();
			
			String[] cities = new String[num];
			
			for(int i=0; i<num; i++) {
				System.out.println("Enter a city");
				Scanner scan = new Scanner(System.in);
				String n = scan.nextLine();
				cities[i] = n;	
				
			}
			
			System.out.println(Arrays.toString(cities));
			
			System.out.println("Search for a city you are looking for?");
			Scanner search = new Scanner(System.in);
			
			String searchcity = search.nextLine();
			
			boolean test = Arrays.asList(cities).contains(searchcity);
			
			if(test) {
				System.out.println("City Found!");
			
			int count =0;
			for(int i=0; i<cities.length; i++) {
				if(cities[i].equals(searchcity)) {
					count++;
				
				}
		
			}
			String isFound = "YES";
			System.out.println(isFound + ", " + searchcity+ " was found " + count + " times! Welcome to " + searchcity);
			}else{
				System.out.println("CITY NOT FOUND");
			}
			
			
		}
		
		
	}
}
	
	
	
     
     
    
	
	

}
