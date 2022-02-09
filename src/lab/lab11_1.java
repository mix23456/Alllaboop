package lab;

public class lab11_1 {

	public static void main( String[] args ) {
		int damagetaken ;
		int damagetaken2 ;
		int i = 1;
		
		NormalTank TankA = new NormalTank();
		TankA.SetHP(200);
		TankA.SetStr(12);
		TankA.SetVit(9);
		TankA.SetBaseDamage(11);
		
		NormalTank TankB = new NormalTank();
		TankB.SetHP(250);
		TankB.SetStr(8);
		TankB.SetVit(10);
		TankB.SetBaseDamage(10);
		
		while( TankA.GetHp() != 0 && TankB.GetHp() != 0 ){
		
		damagetaken = (int)TankA.Attack( TankB.GetHp() , TankB.GetVit() ) ;
		damagetaken2 = (int)TankB.Attack( TankA.GetHp() , TankA.GetVit() );

		if( TankB.GetHp() - damagetaken <= 0 ) {
			TankB.SetHP(0);
		}else {
			TankB.SetHP(TankB.GetHp() - damagetaken);
		}
		
		if( TankA.GetHp() - damagetaken2 <= 0 ) {
			TankA.SetHP(0);
		}else {
			TankA.SetHP(TankA.GetHp() - damagetaken2 );
		}
		System.out.println( "------------------Round " + i + "------------------" );
		System.out.println( "TankA Attack TankB --> " + damagetaken + " Damage " );
		System.out.println( "TankB has --> " + (int)TankB.GetHp() + " HPLeft" );
		System.out.println( "TankB Attack TankA back --> " + damagetaken2 + " Damage " );
		System.out.println( "TankA has --> " + (int)TankA.GetHp() + " HPLeft" );
		i++;
		}
		if( TankA.GetHp() > TankB.GetHp() ) { 
			System.out.println( "------------------TankA WIN!------------------" ); 
		}else
			System.out.println( "------------------TankB WIN!------------------" ); 
		
		
	}
}
