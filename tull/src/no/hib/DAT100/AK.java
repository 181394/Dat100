package no.hib.DAT100;

public class AK {
	private int tall;
	public AK(){
		tall = 1;
	}
	public AK(int b){
		tall = b * b;
	}
	public int regnUt(){
		return tall * tall;
	}
	public int regnUt(int x){
		return tall * tall * tall;
	}
}

