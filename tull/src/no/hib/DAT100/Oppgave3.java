package no.hib.DAT100;


public class Oppgave3 {
		public static void main(String[] args) {
			int r=2;
			int s=5;
		Kino sjekkLedig = new Kino();
		System.out.println(sjekkLedig.erLedig(r, s));
		Kino antallLedig = new Kino();
		System.out.println(antallLedig.antallLedige());
		Kino finnLedig = new Kino();
		finnLedig.finnLedig();
		}
}
