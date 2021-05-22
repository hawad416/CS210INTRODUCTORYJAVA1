// Practice With Multiple Constructors & Access Modifiers

package DrammehHawaHW01;

public class VipCustomer {

	private String name;
	private String email;
	private double creditLimit;
	
	
	public VipCustomer() {
		this("Default Name", "defaultemail@gmail.com", 600);
	}
	
	
	public VipCustomer(String name, String email) {
		this(name, email, 0.0);
		
	}
	
	
	public VipCustomer(String name, String email, double creditLimit) {
		this.name = name;
		this.email = email;
		this.creditLimit = creditLimit;
	}


	public String getName() {
		return this.name;
	}


	public String getEmail() {
		return this.email; 
	}


	public double getCreditLimit() {
		return this.creditLimit;
	}
	
	public static void printVip(VipCustomer p) {
		System.out.println(p.getCreditLimit() + " " + p.getName() + " " + p.getEmail());
	}
	
	
	public static void main(String[] args) {
		VipCustomer hawa = new VipCustomer();
		//System.out.println("Credit: " + hawa.getCreditLimit() + "  Name: " + hawa.getName() + "  Email " + hawa.getEmail());
		
		printVip(hawa);
		
		VipCustomer jake = new VipCustomer("Jake", "jake1@gmail", 540);
		//System.out.println(jake.getCreditLimit() + " " + jake.getName() + " " + jake.getEmail());
		printVip(jake);
		
		VipCustomer ami = new VipCustomer("Ami", "ami@gmail");
		//System.out.println(ami.getCreditLimit() + " " + ami.getName() + " " + ami.getEmail());
		printVip(ami);
	}
	
	
}
