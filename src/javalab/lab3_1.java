package javalab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class lab3_1 {
	public static void main( String[] args ) throws IOException {
		int userIP = 0;
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
		Random rand = new Random();
		
		System.out.print("Please enter your value : ");
		// Read from keyboard
			try {
				userIP = Integer.parseInt( br.readLine() );
				
			}catch(  NumberFormatException nfe ) {
				System.err.println( "Invalid Format" );
			}
		System.out.println("-------------------");
		int[] A = new int[userIP];
		for (int i = 0; i < userIP; i++) {
		    int numrand = rand.nextInt(99);
		    A[i] = numrand;
		    System.out.println("Array[" + i + "]" + " = " + A[i] );
		}
	}
}

