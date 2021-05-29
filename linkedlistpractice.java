public static void main(String[] args) {

		
		LinkedList<String> placesToVisit = new LinkedList<String>();
		
		addInOrder(placesToVisit, "Sydney");
		
		addInOrder(placesToVisit, "Alice Springs");
		
		
		addInOrder(placesToVisit, "Sydney");
		
		
		addInOrder(placesToVisit, "Melbourne");
		
		
		addInOrder(placesToVisit, "Brisbane");
		
		
		addInOrder(placesToVisit, "Perth");
		
		
		addInOrder(placesToVisit, "Adelaide");
		
		addInOrder(placesToVisit, "Darwin");
		
		printList(placesToVisit);
		
		visit(placesToVisit);
		
		
		
	
		
		
	}
	
	private static void printList(LinkedList<String> linkedList) {
		
		Iterator<String> itr = linkedList.iterator();
		while(itr.hasNext()) {
			System.out.println("now visiting: " +itr.next());
		}
		
		System.out.println("=========================");
	}
	
	private static boolean addInOrder(LinkedList<String> linkedList, String newCity) {
		
		
		//addign the cities in alphabetical order
		ListIterator<String> stringListIterator = linkedList.listIterator();
		
		while(stringListIterator.hasNext()) {
			int comparison = stringListIterator.next().compareTo(newCity);
			
			if(comparison ==0) {
				
				//equal city so do not add
				System.out.println(newCity + " is already included");
				return false;
				
			}else if(comparison > 0) {
				//newcity should appear before this city.
				//ex if we currently at Brisbane and we comparing --> Adelaide : adealide is first because its A
				
				//comparison returned .next but moved to the next entry so we actually need to move to the previous entry to add adelaide
				
				stringListIterator.previous(); // goes back to brisbane position.
				
				//list iterator lets us go bacl, but normal iterator doesnt
				stringListIterator.add(newCity); //adds adelaid to that brisbane entry
				return true;
			}else if(comparison<0) {
				//move to next city.
				//but because we did .next up there its already mvoed to the next position so we
				//dont need to do any processing.
			}
		}
		
		// if we've gotten to this point without finding a place for a suitabele entry, we need to jsut add the city to the end
		stringListIterator.add(newCity);
		return true;
		
		//its not a good idea to do this, to be mvoing to the next element and simultaneously changing your
		//linked list.
		
		
		
	}
	
	private static void visit(LinkedList<String> cities) {
		
		Scanner scanner = new Scanner(System.in);
		
		boolean quit = false;
		boolean goingForward = true;
		ListIterator<String> listIterator = cities.listIterator();
		
		if(cities.isEmpty()) {
			System.out.println("No cities in itenirary");
			return;
		}else {
			System.out.println("Now visiting " + listIterator.next());
			printMenu();
		}
		
		while(!quit) {
			int action = scanner.nextInt();
			scanner.nextLine();
			switch(action) {
			case 0:
				System.out.println("Holiday over");
				quit = true;
				break;
			case 1: 
				if(!goingForward) { // make sure there are more cities to visit
					if(listIterator.hasNext()) {
						listIterator.next();
					}
					goingForward = true;
				}
				if(listIterator.hasNext()) {
				System.out.println("Now visitng " + listIterator.next());
				}else {
					System.out.println("reached end of list");
					goingForward = false;
				}
				break;
				
			case 2:
				
				if(goingForward) {
					if(listIterator.hasPrevious()) {
						listIterator.previous();
					}
					goingForward = false;
				}
				if(listIterator.hasPrevious()) {
					System.out.println("Now visitng " + listIterator.previous());
				}else {
					System.out.println("We are at the start of the list");
					goingForward = true;
				}
				break;
				
			case 3:
				printMenu();
				break;
				
		}
		
		
	}

}
	
	private static void printMenu() {
		System.out.println("available actions: \npress " );
		System.out.println("0 - to quit\n + 1- Go to enxt city\n + 2-go to previous city\n + 3-print menu options");
	}
}
