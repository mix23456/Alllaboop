package javalab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class lab2_2 {
	public static void main( String[] args ) throws IOException {
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
		int i = 1;
		int j = 1;
		int userIP = 0;
		System.out.print("Please enter your value : ");
		// Read from keyboard
			try {
			userIP = Integer.parseInt( br.readLine() );

			}catch(  NumberFormatException nfe ) {
				System.err.println( "Invalid Format" );
			}
		// end of input
		System.out.println("-------------------");
		for( i = 2 ; i <= userIP ; i++ ) {
			System.out.print( i );
			if( (i == 1 || i % 2 == 0 || i % 3 == 0 || i % 5 == 0 || i % 7 == 0 ||
				i % 11 == 0 || i % 13 == 0 || i % 17 == 0 || i % 19 == 0 || i % 23 == 0 )
				&&( i != 2 && i != 3 && i != 5 && i != 7 && i != 11  && i != 13  
				&& i != 17&& i != 19 && i != 23)) {
				System.out.print( " = Not Prime : Divide by " );
				
				for( j = 2 ; j <= userIP ; j++ ) {
					if( i % j == 0 && i != j ) {
						System.out.print( j );
						if( i / 2 != j ) { System.out.print( ", " ); }
					}if( i / 2 == j ) {
						System.out.println( "" );
						break; 
					}	
				}	
			}else
				System.out.println( " = Prime Number" );
			
		}//end for
	}// void
}// class
