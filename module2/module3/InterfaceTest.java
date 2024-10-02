package module3;
interface Vehicle {
	// all are the abstract methods.
	final static String obtype="Vehicle";
	void changeGear(int a);
	void speedUp(int a);
	void applyBrakes(int a);
}
class Vtype{
	String vname;
	Vtype(String vname){
		this.vname=vname;
	}
	void vehname()
	{	
		System.out.println(vname);}
}
class Bicycle extends Vtype implements Vehicle{
	Bicycle(String vname){
				super(vname);
		System.out.println("Different types of "+obtype+" and current status");
	}
	int speed;
	int gear;
	public void changeGear(int newGear){
			gear = newGear;
	}
	public void speedUp(int increment){
			speed = speed + increment;
	}
	public void applyBrakes(int decrement){
		
		speed = speed - decrement;
	}
	public void printStates() {
		System.out.println("speed: " + speed
			+ " gear: " + gear);
	}
}

class Bike implements Vehicle {
	int speed,gear;
	public void changeGear(int newGear){
			gear = newGear;
	}
	public void speedUp(int increment){
			speed = speed + increment;
	}
	public void applyBrakes(int decrement){
			speed = speed - decrement;
	}
	public void printStates() {
		System.out.println("speed: " + speed
			+ " gear: " + gear);
	}
	}
class InterfaceTest{
	public static void main (String[] args) {
	// doing some operations
		Bicycle bicycle = new Bicycle("Bicycle");
		bicycle.changeGear(2);
		bicycle.speedUp(3);
		bicycle.applyBrakes(1);
		bicycle.vehname();
		bicycle.printStates();
		// creating instance of the bike.
		Bike bike = new Bike();
		bike.changeGear(1);
		bike.speedUp(4);
		bike.applyBrakes(3);
		System.out.println("Bike present state :");
		bike.printStates();
	}
}
