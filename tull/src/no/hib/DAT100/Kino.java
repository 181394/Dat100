package no.hib.DAT100;


	
	public class Kino{
		private boolean[][] seter = {
				{false,false, false, false, false, false, false, false},
				{false, true, true, true, true, true, true, true},
				{false, true, false, true, true, true, true, true}
				};
	
	public boolean erLedig(int r, int s){
			return (seter[r][s]);
			
		}		
	int antallLedige(){
		int antall = 0;
		for (int i = 0;i<seter.length;i++){
			for (int j=0;j<seter[i].length;j++){
				if (seter[i][j]){
					antall++;
				}
			}
			
		}
		return antall;
	}
	
	void finnLedig(){
		boolean bool = false;
		for (int i = 0; i< seter.length && !bool; i++){
			for (int j =0; j< seter[i].length && !bool;j++){
				if (seter[i][j]){
					System.out.println("Det er ledig plass på setenr. " + j + " på radnr. " + i);
					bool = true;
				}
			}
			
		}
	}

	}
