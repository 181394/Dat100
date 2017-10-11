package no.hib.DAT100;

public class Oppgave4 {
public static void main(String[] args) {
	BrukerKonti b1 = new BrukerKonti();
	b1.registrerBruker("prebenha", "hallo123");
	
	System.out.println(b1.sjekkPassord("prebenha", "hallo123"));
}

}
