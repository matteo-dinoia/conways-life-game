package roba;


public class Pesce {
	private static final int EN_BASE=6;
	public boolean isSqualo;
	public boolean morto=false;
	public int energia=0;
	public int conterRip=3;
	
	Pesce(boolean isSqualo){
		this.isSqualo=isSqualo;
		if(isSqualo) {
			energia=EN_BASE;
		}
	}

}
