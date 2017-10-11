package no.hib.DAT100;

public class Møterom extends Rom{
	int antall;
	
	public Møterom(int nummer, String navn, int antall){
		super(nummer, navn);
		this.antall = antall;
		
	}
	@Override
	public void skrivUt(){
		super.skrivUt();
		System.out.println("Dette rommet har plass til " + antall + " personer." + "\n");
	}

}
