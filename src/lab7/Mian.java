package lab7;

public class Mian {
	
	public static void main( String[] arg ) {

		Car C = new Car() ;
		C.Move();
		C.Move( 4 ,  (float) 45.5 );
		
		Motorbike M = new Motorbike() ;
		M.Move();
		M.Move("Hally" , 2);
		
		Balloon B = new Balloon() ;
		B.Move();
		
		SuperCar SU = new SuperCar();
		SU.Move();
		
		Drone D = new Drone();
		D.Move('R');
		
		
	}

}
