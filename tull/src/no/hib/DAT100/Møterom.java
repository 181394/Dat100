package no.hib.DAT100;

public class M�terom extends Rom{
	int antall;
	
	public M�terom(int nummer, String navn, int antall){
		super(nummer, navn);
		this.antall = antall;
		
	}
	@Override
	public void skrivUt(){
		super.skrivUt();
		System.out.println("Dette rommet har plass til " + antall + " personer." + "\n");
	}

}
