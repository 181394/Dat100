package no.hib.DAT100;

public class MainRom {
	public static void main (String[] args){
		Kontor k1 = new Kontor(403, "Personlig kontor" , "Sverre bj�rnsen");
		M�terom m1 = new M�terom(443, "Offentlig m�terom", 28 );
		k1.skrivUt();
		m1.skrivUt();

	}

}
