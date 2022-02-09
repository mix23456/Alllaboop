package lab7;

public class Drone extends Balloon {
	int Wheel = 9 ;
	
	public Drone() {
		System.out.println(" Drone Start! ");
		
	}
	
	public void Move( char grade ) {
		System.out.println(" Go to The Moon with gear " + grade + " with " + Wheel + " Fans");
	}
	
}
