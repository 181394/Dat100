package no.hib.DAT100;

import java.util.HashMap;

public class BrukerKonti {
	HashMap<String, String> konti;
	
	
	
public BrukerKonti(){
	konti = new HashMap<String, String>();
	
}
public void registrerBruker(String Brukernavn, String Passord){
	konti.put(Brukernavn, Passord);

}
public boolean sjekkPassord(String Brukernavn, String Passord ){
	boolean finnes = false;
		finnes = konti.get(Brukernavn).equals(Passord);
	if (finnes){
		return true;
	}
	else {
		return false;
	}
}
}
