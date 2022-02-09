package javalab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class lab2_1 {
	public static void main( String[] args ) throws IOException {
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
		int i = 1;
		int ans = 0;
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
		for( i = 1 ; i <= userIP ; i++ ) {
			System.out.print( i );
			ans = i % 5;
			if( 0 == ans || i == userIP ) {
				System.out.println( "" );
			}else
				System.out.print( ", " );
			
		}//end for
	}// void
}// class
