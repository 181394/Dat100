package no.hib.DAT100;

public class Kontor extends Rom {
	String navnEier;

	public Kontor(int nummer, String navn, String navnEier){
		super(nummer, navn);
		this.navnEier = navnEier;
		
		
		
		
	}
	@Override
	public void skrivUt(){
		super.skrivUt();
		System.out.println("Kontoret tilhører: " + navnEier +"\n");
	}
	
	
}
