/** Composition Practice , Using PC represemtation that has a case, motherboard, monitor. **/
public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dimensions dimensions = new Dimensions(20,20,5);
	
		Case theCase = new Case("220B", "Dell", "240", dimensions);
		
		Monitor theMonitor = new Monitor("27 inch beast", "Apple", 27, new Resolution(2540, 1440));
		
		Motherboard theMotherboard = new Motherboard("83-200", "Asus", 4, "v2.44");
		
		// Now put your PC together
		
		PC thePC = new PC(theCase, theMonitor, theMotherboard); // created PC class by passing 3 objects to it as parameters.
		
		
		thePC.getMonitor().drawPixelAt(1500, 1200, "red"); //using getter to return monitor object, and then call drawPixel that is stored within the pc object in monitor.
		thePC.getMotherboard().loadProgram("windows 1.0");
		
		thePC.getTheCase().pressPowerButton();
		
	}

//---------------------------------------------
//PC CLASS
public class PC { // new class called PC that has a case, monitor, and a motherboard. 
	// this is advantage of compostion because if we use inheritance, in Java we can only extend
	// from one class at a time. so composition is useful to represent differnt things an object HAS

	
	//inseatd of using extends, we create all of our objects like this
	private Case theCase; //case is a java keyword
	private Monitor monitor;
	private Motherboard motherboard;
	
	public PC(Case theCase, Monitor monitor, Motherboard motherboard) {
		super();
		this.theCase = theCase;
		this.monitor = monitor;
		this.motherboard = motherboard;
	}

	public Case getTheCase() {
		return theCase;
	}

	public Monitor getMonitor() {
		return monitor;
	}

	public Motherboard getMotherboard() {
		return motherboard;
	}
	
	
	
	
}

//-------------------------------------------
// MONITOR CLASS
public class Monitor {

	private String model;
	private String manufacturer;
	private int size;
	private Resolution nativeResolution; // hasA relationship. This is compostion. Resolution class
										// is part of the moniotr. The monitor hasA resolution.
	
	public Monitor(String model, String manufacturer, int size, Resolution nativeResolution) {
		super();
		this.model = model;
		this.manufacturer = manufacturer;
		this.size = size;
		this.nativeResolution = nativeResolution; 
	}
	
	public void drawPixelAt(int x, int y, String color) {
		System.out.println("Drawing pixel at " + x + "," + y + "in color " + color);
	}

	public String getModel() {
		return model;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public int getSize() {
		return size;
	}

	public Resolution getNativeResolution() {
		return nativeResolution;
	}
	
	
	// RESOLUTION CLASS THAT THE MONITOR HAS
  
public class Resolution {
	private int width;
	private int height;
	public Resolution(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}
	public int getWidth() {
		return width;
	}
	public int getHeight() {
		return height;
	}


}

  //MOTHERBOARD CLASS -----------------------
  public class Motherboard {

	private String model;
	private String ramSlots;
	private int cardSlots;
	private String bios;
	public Motherboard(String model, String ramSlots, int cardSlots, String bios) {
		super();
		this.model = model;
		this.ramSlots = ramSlots;
		this.cardSlots = cardSlots;
		this.bios = bios;
		
	}
	
	public void loadProgram(String programName) {
		System.out.println("Program " + programName + "is loading.");
	}
	public String getModel() {
		return model;
	}
	public String getRamSlots() {
		return ramSlots;
	}
	public int getCardSlots() {
		return cardSlots;
	}
	public String getBios() {
		return bios;
	}
	
	
	//CASE CLASS -------------------------------------
    public class Case {
	private String model;
	private String manufacturer;
	private String powerSupply;
	private Dimensions dimensions; // case has dimensions that is a width height and depth.
	public Case(String model, String manufacturer, String powerSupply, Dimensions dimensions) {
		super();
		this.model = model;
		this.manufacturer = manufacturer;
		this.powerSupply = powerSupply;
		this.dimensions = dimensions;
	}
	
	
	public void pressPowerButton() {
		System.out.println("Power button pressed.");
	}


	public String getModel() {
		return model;
	}


	public String getManufacturer() {
		return manufacturer;
	}


	public String getPowerSupply() {
		return powerSupply;
	}


	public Dimensions getDimensions() {
		return dimensions;
	}
	
	
// DIMEIONS CLASS THE CASE HAS
      
public class Dimensions {

	
	private int width;
	private int height;
	private int depth;
	public Dimensions(int width, int height, int depth) {
		super();
		this.width = width;
		this.height = height;
		this.depth = depth;
	}
	public int getWidth() {
		return width;
	}
	public int getHeight() {
		return height;
	}
	public int getDepth() {
		return depth;
	}
	
	
	
