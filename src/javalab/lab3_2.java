package javalab;

import java.util.Stack;
import java.util.Scanner;

public class lab3_2 {
	public static void main( String[] args ){
		Scanner org = new Scanner(System.in);
		Stack<String> stack = new Stack<>();
		String Input ;
		String count ;
		int count2 = 0;
		int nu = 0;
		do {
			Input = org.nextLine();
			if(Input.compareTo("SetStackSize( 3 )") <= 1) {
			count = Input;
			count = count.replaceAll("[^0-9]+", "");
			nu = Integer.parseInt(count);
			count2 = nu;
			}else if(Input.compareTo("isEmpty") == 0) {
					if ( stack.isEmpty() ){
						System.out.println ( "----| Yes" );
					}else
						System.out.println ( "----| No" );
			}else if(Input.compareTo("top") == 0) {
				if ( stack.isEmpty() ){
					System.out.println ( "----| Is empty" );
				}else
					System.out.println ( stack.peek() );	
			}else if(Input.compareTo("push") == 0) {
				System.out.print ( " : " );
				if( stack.size() <= count2) { 
					Input = org.nextLine();
					stack.push(Input); 
				}else
					System.out.println("----| Stack Overflow");
			}else if(Input.compareTo("checkstack") == 0) {
				if ( stack.isEmpty() ){
					System.out.println ( "----| Is empty" );
				}else
					System.out.println ( stack );	
			}else if(Input.compareTo("pop") == 0) {
				if ( stack.isEmpty() ){
					System.out.println ( "----| Is empty" );
				}else
					stack.pop();
			}
		}while( Input.compareTo("stop") != 0 );
	}
}
