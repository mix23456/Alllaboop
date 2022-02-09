package lab7;

public class Car extends Vehicle {
	
	public Car() {
		System.out.println(" Car Start! ");
	}
	
	public void Move() {
		System.out.println(" Go Ahead ");
	}
	
	public void Move( int a , float b ) {
		System.out.println(" Go Ahead with Speed " + b + "Km/H And " + a + " Passenger ");
	}
	
}
