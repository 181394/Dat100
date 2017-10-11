package no.hib.DAT100;

public abstract class Rom {
	private int nummer;
	private String navn;
	
	public int getNummer(){
		return nummer;
	}
	public void setNummer(int nummer){
		this.nummer = nummer;
	}
	public String getNavn(){
		return navn;
	}
	public void setNavn(String navn){
		this.navn = navn;
	}
	
	public Rom(int nummer, String navn){
		this.nummer = nummer;
		this.navn =  navn;
	}
	
	public void skrivUt(){
		System.out.println("Romnr: " + this.nummer + " Rom navn: " + this.navn);
	}
	
}
