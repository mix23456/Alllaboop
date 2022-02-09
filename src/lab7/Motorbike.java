package lab7;

public class Motorbike extends Vehicle {
	
	public Motorbike() {
		System.out.println(" Motorbike Start! ");
	}
	
	public void Move() {
		System.out.println(" Go Ahead but can't Backward ");
		
	}
	
	public void Move( String name , int w ) {
		Wheel = w ;
		System.out.println(" My Car '" + name + "' She has " + Wheel + " Wheel ");
		
	}
}
