package no.hib.DAT100;



public class Switch {
	public static void main(String[] args) {
		String[][][] hei = {{{ "1 ", "2 ", "3 " }, 
							{ "4 ", "5 " },	
							{ "6 ", "7 " }
							}, 
							{{"8 ", "9 ", "10 "}, 
							{"11 ", "12 ", "13"}
							}};
		int i;
		int j;
		int k;
		String string = "";
		for (i = 0; i < hei.length; i++) {
			for (j = 0; j < hei[i].length; j++) {
				for (k=0;k<hei[i][j].length;k++){
					string += hei[i][j][k];
					
				}
			}
		}
		System.out.println(string);
	}
}
