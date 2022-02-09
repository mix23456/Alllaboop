package lab4;

//import java.util.Random;

public class MyClassicalArray {
	
	public int[] MyArray = { 2, 1, 0, 3, 8, 6, 5, 7, 4, 9 }  ;
	
	/*
	public void Array( String[] args ) {
		
		Random rand = new Random();
		int temp;
		for (int i = 0; i <= 9; i++) {
		    temp = rand.nextInt(99);
		    MyArray[i] = temp;
		    System.out.println("Array[" + i + "]" + " = " + MyArray[i] );
		}//end for
	}//end method
	*/
	public void showarray() {
		
		System.out.print("Myarray :");
		for (int i = 0; i <= 9; i++) {
			System.out.print(" " + MyArray[i] );
		}//end for
		System.out.println();
	}//end method
	
	public void FindMax() {
		
		int M = MyArray[0] ;
		for( int i = 1 ; i <= 9 ; i++ ){ if( M < MyArray[i] ) 
			{ M = MyArray[i]; } 
		}//end for
		System.out.println("Max = " + M);
	}//end method
	
	public void FindMin() {
		
		int m = MyArray[0] ; 
		for( int i = 1 ; i <= 9 ; i++ ){ if( m > MyArray[i] )
			{ m = MyArray[i] ; }
		}//end for
		System.out.println("Min = " + m);
	}//end method
 
	
}
