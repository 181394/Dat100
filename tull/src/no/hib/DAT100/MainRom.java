package no.hib.DAT100;

public class MainRom {
	public static void main (String[] args){
		Kontor k1 = new Kontor(403, "Personlig kontor" , "Sverre björnsen");
		Møterom m1 = new Møterom(443, "Offentlig møterom", 28 );
		k1.skrivUt();
		m1.skrivUt();

	}

}
