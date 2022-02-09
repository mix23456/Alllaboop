package lab4;

public class lab4_1 {
	
	public static void main( String[] args ) {
		MyClassicalArray array = new MyClassicalArray() ;
		MyCurrentArray array1 = new MyCurrentArray() ;
		array.showarray();
		array.FindMax();
		array.FindMin();
		array1.Sort();
		array1.Search(8);
		
	}//end main
}
