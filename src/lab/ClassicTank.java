package lab;

public abstract class ClassicTank {
	double HP ;
	double Str ;
	int Vit ;
	double BaseDamage ;
	
	public abstract double GetHp() ;
	public abstract int GetVit() ;
	public abstract void SetHP( double Sethp ) ;
	public abstract void SetStr( double Setstr );
	public abstract void SetVit( int Setvit );
	public abstract void SetBaseDamage( double SetDm );
	public abstract double Attack( double enermyhp , int enermyvit ) ;
	
}
