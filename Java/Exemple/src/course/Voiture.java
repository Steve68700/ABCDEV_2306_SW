package course;

import java.util.ArrayList;
import java.util.Random;

public class Voiture {
	private int vMax, vitesse, acceleration, freinage, agilite, classement; 
	private boolean boost;
	private String nom;
	
	
	public Voiture(String _nom, int _vitesse, int _vMax, int _acceleration, int _freinage, int _agilite, boolean _boost) 
	{
		this.nom = _nom;
		this.vitesse = _vitesse;
		this.vMax = _vMax;
		this.acceleration = _acceleration;
		this.freinage = _freinage;
		this.agilite = _agilite;
		this.boost = _boost;
		this.classement = 0;
	}
	
	public String getName() 
	{
		return this.nom;
	}
	
	public int getVitesse() 
	{
		return this.vitesse;
	}
	
	
	public boolean accelerer() 
	{
		if(this.vitesse < this.vMax) 
		{
			Random rand = new Random();
			this.vitesse += this.acceleration*(rand.nextInt(15-10) + 10);
			if(this.vitesse > this.vMax) 
			{
				this.vitesse = this.vMax;
			} 
			return true;
		}else 
		{
			this.vitesse = this.vMax;
			return false;
		}
		
	}
	
	
	
	public boolean freiner() 
	{
		if(this.vitesse > 0) 
		{
			Random rand = new Random();
			this.vitesse -= this.freinage*(rand.nextInt(15-10) + 10);
			return true;
		}else 
		{
			this.vitesse = 0;
			return false;
		}
	}
	
	public int bonusAgilite() 
	{
		Random rand2 = new Random();
		int agilityBonus = rand2.nextInt(this.agilite - 0);
		return agilityBonus;
	}
	

	public boolean boost() 
	{
		if(this.boost) 
		{
			return false;
		}
		return true;
	}
}