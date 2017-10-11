package no.hib.DAT100;


public class Oppgave1 {
public static void main(String[] args) {
	System.out.println(3-5+1);
	System.out.println("7 != 5" + (7 != 5));
	
	int k = 2;
	switch (k){
	case 1: 
		System.out.println("DAT100");
		break;
	case 2:
		System.out.println("DAT101");
		break;
	default:
		System.out.println("ING101");
		break;
	}
	
	int x = 3;
	int y = 4;
	if ((y<0) || (x==3)){
		System.out.println("DAT100");
	}
	else if (x!=3){
		System.out.println("DAT101");
	}
	else {
		System.out.println("ING101");
	}
	
	int b = 0;
	for (int i = 0;i<5;i++){
		b=1-b;
		System.out.println(b);
	}
}
}
