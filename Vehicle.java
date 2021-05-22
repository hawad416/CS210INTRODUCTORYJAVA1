/** Inheritance Practice on a Vehicle Model
  * Going to place main class, super Vehicle class, child Car class, and grandchild outlander class all in one file
  **/
//MAIN CLASS
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	
		Outlander outlander = new Outlander(36);
		outlander.steer(45);
		outlander.accelerate(30);
		outlander.accelerate(20);
		outlander.accelerate(-42);
	}

}

//VEHICLE SUPER CLASS
package DrammehHawaHW01;

public class Vehicle {

	private String name;
	private String size;
	
	private int currentVelocity;
	private int currentDirection;
	public Vehicle(String name, String size) {
		super();
		this.name = name;
		this.size = size;
		
		this.currentVelocity = 0;
		this.currentDirection = 0;
	}
	
	public void steer(int direction) {
		this.currentDirection+=direction;
		System.out.println("Vehicle.steer(): Steering at " + currentDirection + "degrees.");
	}
	
	public void move(int velocity, int direction) {
		currentVelocity = velocity;
		currentDirection = direction;
		System.out.println("Vehicle.move(): Moving at" + currentVelocity + " in direction " + currentDirection);
	}

	public String getName() {
		return name;
	}


	public String getSize() {
		return size;
	}



	public int getCurrentVelocity() {
		return currentVelocity;
	}


	public int getCurrentDirection() {
		return currentDirection;
	}

	public void stop() {
		this.currentVelocity = 0;
	}
	
}

// EXTENDED CAR CHILD CLASS
package DrammehHawaHW01;

public class Car extends Vehicle {

	
	private int doors;
	private int wheels;
	private int gears;
	private boolean isManual;
	private int currentGear;
	
	
	public Car(String name, String size, int doors, int wheels, int gears, boolean isManual) {
		super(name, size);
		this.doors = doors;
		this.wheels = wheels;
		this.gears = gears;
		this.isManual = isManual;
		this.currentGear = 1;
	}
	
	public void changeGear(int currentGear) {
		this.currentGear = currentGear;
		System.out.println("Car.changeGear: Changed to " + this.currentGear + "gear" );
	}
	
	public void changeVelocity(int speed, int direction) {
		move(speed, direction);
		System.out.println("Car.changeVelocity() : Velocty" + speed + " direction " + direction);
	}
 
	
	
	
}

//EXTENDED GRANDCHILD OUTLANDER CLASS

package DrammehHawaHW01;

public class Outlander extends Car{

	private int roadServiceMoths;

	public Outlander(int roadServiceMoths) {
		super("Outlander", "4wd", 5, 5, 6, false);
		this.roadServiceMoths = roadServiceMoths;
	}
	
	public void accelerate(int rate) {
		int newVelocity = getCurrentVelocity() + rate;
		
		if(newVelocity ==0) {
			stop();
			changeGear(1);
		}else if(newVelocity >0 && newVelocity <=10) {
			changeGear(1);
		}else if (newVelocity >10 && newVelocity <=20) {
			changeGear(2);
		}else if (newVelocity >10 && newVelocity <=30) {
			changeGear(3);
		}else {
			changeGear(4);
		}
		
		if(newVelocity > 0) {
			changeVelocity(newVelocity, getCurrentDirection());
		}
	}
	
}
