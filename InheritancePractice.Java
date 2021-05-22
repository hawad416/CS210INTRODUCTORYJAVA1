package DrammehHawaHW01;

// base class basic definition of an animal.
public class Animal {
	
	//declaring private fields to represent state of animal.
	private String name;
	private int brain;
	private int body;
	private int size;
	private int weight;
	
	public Animal(String name, int brain, int body, int size, int weight) {
		super();
		this.name = name;
		this.brain = brain;
		this.body = body;
		this.size = size;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBrain() {
		return brain;
	}

	public void setBrain(int brain) {
		this.brain = brain;
	}

	public int getBody() {
		return body;
	}

	public void setBody(int body) {
		this.body = body;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public void eat() {
		System.out.println("Animal.eat() called on dog");
	}
	public void move(int speed) {
		System.out.println("Animal.move called ; animal is moving at speed:" + speed);
	}
	
	

}

//-------------------------------------


public class Dog extends Animal{
	
	private int eyes;
	private int legs;
	private int tail;
	private int teeth;
	private String coat;

	public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
		super(name, 1, 1, size, weight);
		this.eyes = eyes;
		this.legs = legs;
		this.tail = tail;
		this.teeth = teeth;
		this.coat = coat;
		// TODO Auto-generated constructor stub
		
		
	}
	private void chew() {
		System.out.println("Dog.chew called");
	}
	
	public void eat() {
	
		System.out.println("Dog.eat called.");
		chew();
		super.eat();
	}
	
	public void walk() {
		System.out.println("dog.walk called");
		super.move(10);
	}
	
	public void run() {
		System.out.println("dog.run called");
		super.move(20);
	}
	private void moveLegs(int speed) {
		System.out.println("Dog.moveLegs called");
	}
	
	public void move(int speed) {
		System.out.println("Dog.move called");
		moveLegs(speed);
		super.move(speed);
	}

}
//----------------------------


public class Fish extends Animal {
	
	private int gills;
	private int eyes;
	private int fins;
	public Fish(String name, int size, int weight, int gills, int eyes, int fins) {
		super(name, 1, 1, size, weight);
		this.gills = gills;
		this.eyes = eyes;
		this.fins = fins;
	}
	
	private void rest() {
		
	}
	
	
	private void moveMuscles() {
		
	}
	private void moveBackFin() {
		
	}
	private void swim(int speed) {
		moveMuscles();
		moveBackFin();
		super.move(speed);
	}
	
	

}
