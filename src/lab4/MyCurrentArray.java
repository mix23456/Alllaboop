package lab4;

public class MyCurrentArray extends MyClassicalArray {
	
	public void Sort() {

		int collect ;
		for( int i = 0 ; i <= 9 ; i++ ) {
			for(int j = i; j <= 9 ; j++ ) {
				if( MyArray[i] > MyArray[j] ) {
					collect = MyArray[i];
					MyArray[i] = MyArray[j];
					MyArray[j] = collect;
				}//end if
			}//end for
		}//end for
		System.out.print("Sort : ");
		for( int i = 0 ; i <= 9 ; i++ ) {
			System.out.print( MyArray[i] + " ");
		}//end for
		System.out.println();
	}//end method
	
	public void Search(int find) {
		
		for(int i = 0; i <= 9; i++){
			if(find == MyArray[i]){
				System.out.println("Found : " + find );
				break;
			}//end if
			
			if(i == 9) {
				System.out.print("Not found : " + find );
			}//end if
		}//end for
	}//end method

}
