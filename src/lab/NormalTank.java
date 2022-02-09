package lab;

import java.util.Random;

public class NormalTank extends ClassicTank {

	@Override
	public double GetHp() { return HP; }
	@Override
	public int GetVit(){ return Vit; }
	@Override
	public void SetHP( double Sethp ) { this.HP = Sethp ; }
	@Override
	public void SetStr( double Setstr ) { this.Str = Setstr ; }
	@Override
	public void SetVit(int Setvit) { this.Vit = Setvit ; }
	@Override
	public void SetBaseDamage( double SetDm) { this.BaseDamage = SetDm ; }
	@Override
	
	public double Attack( double enermyhp , int enermyvit ) {
		double DamagePoint = BaseDamage * ( Str / enermyvit ) * getRandomNumber( 0.7 , 0.9 ) ;
		return( DamagePoint );
	}
	
	public double getRandomNumber(double min, double max) {
		Random r = new Random();
		double randomValue = min + (max - min) * r.nextDouble();
	    return (double)randomValue;
	}
}
