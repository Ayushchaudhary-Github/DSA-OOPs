//Inheritance

class Vehicle {
	String engine;
	String Type;	
}

class Car extends Vehicle {
	int wheels;
	String gearBox;
}


public class Inheritance {

	public static void main(String[] args) {
	
		Car c = new Car();
		c.engine = "1200 CC";  // access vehcile properties due to inheritance
		c.Type = "Land Vehicle";
		c.wheels = 4;
		c.gearBox = "Automatic";
		
		System.out.println("Properties of my vehicle is ");
		System.out.println("Engine "+c.engine);
		System.out.println("Type "+c.Type);
		System.out.println("Wheels "+c.wheels);
		System.out.println("gearBox "+c.gearBox);
	
		
	}

}
