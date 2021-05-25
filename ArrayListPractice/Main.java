import java.util.*;

public class Main {

private static Scanner scanner = new Scanner(System.in);

private static MobilePhone mobilePhone = new MobilePhone("4253623372");
	
	public static void main(String[] args) {
		
		boolean quit = false;
		startPhone();
		printActions();
		while(!quit) {
			System.out.println("\n Enter action: (6 to show available actions");
			int action = scanner.nextInt();
			scanner.nextLine();
			
			switch(action) {
			case 0:
				System.out.println("Shutting downs..");
				quit = true;
				break;
				
			case 1:
				mobilePhone.printContacts();
				break;
				
			case 2:
				addNewContact();
				break;
				
			case 3:
				updateContact();
				break;
				
			case 4:
				removeContact();
				break;
				
			case 5:
				queryContact();
				break;
				
			case 6: 
				printActions();
				break;
			
			}
			
		}
	
	}
	
	
	
	private static void queryContact() {
		System.out.println("Enter existing contact name: ");
		String name = scanner.nextLine();
		Contact existingContactRecord = mobilePhone.queryContact(name);
		if(existingContactRecord ==null) {
			System.out.println("Contact not found");
			return;
		}System.out.println("Name" + existingContactRecord.getName() + "phone: " + existingContactRecord.getPhoneNumber());
		if(mobilePhone.removeContact(existingContactRecord)) {
			System.out.println("Contact found");
	}else {
		System.out.println("Error deleting");
	}
	}
	
	
	
	
	private static void removeContact() {
		System.out.println("Enter existing contact name: ");
		String name = scanner.nextLine();
		Contact existingContactRecord = mobilePhone.queryContact(name);
		if(existingContactRecord ==null) {
			System.out.println("Contact not found");
			return;
		}
		if(mobilePhone.removeContact(existingContactRecord)) {
			System.out.println("Succesfully delted");
	}else {
		System.out.println("Error deleting");
	}
	}
		
	
	private static void updateContact() {
		System.out.println("Enter existing contact name: ");
		String name = scanner.nextLine();
		Contact existingContactRecord = mobilePhone.queryContact(name);
		if(existingContactRecord ==null) {
			System.out.println("Contact not found");
			return;
		}
		
		System.out.println("Enter new contact name :");
		String newName = scanner.nextLine();
		System.out.println("Enter new phone numbre: ");
		String newNumber = scanner.nextLine();
		
		Contact newContact = Contact.createContact(newName, newNumber);
		if(mobilePhone.updateContact(existingContactRecord, newContact)) {
			System.out.println("Succesfully updated record");
		}else {
			System.out.println("Error updating record");
		}
		
	}
	
	private static void addNewContact() {
		System.out.println("Enter new contact name: ");
		String name = scanner.nextLine();
		System.out.println("Enter phone number: ");
		String phone = scanner.nextLine();
		Contact newContact = Contact.createContact(name, phone);
		if(mobilePhone.addNewContact(newContact)) {
			System.out.println("New contact added: name = " + name + " phone = " + phone);
		}else {
			System.out.println("Cannot add , name already there");
		}
	}
	
	private static void startPhone() {
		System.out.println("Starting phone...");
	}

	private static void printActions() {
		System.out.println("\n Available Actions:\npress");
		System.out.println("0 - to shutdown\n" +
							"1 - to print contacts\n" +
						"2 - add a new contact\n" +
							"3 - update existing contact\n" +
						"4- remove existing contact\n" +
							"5 - query if existing contact\n" +
						"6 - Print this list of available actions again\n ");
		
		System.out.println("Choose your action: ");
	}
	
	
