package no.hib.DAT100;
class sau{
	int age;
	
	int bananAge() {
		return age;
	}
}

class Eple {
	String name;

	String setName() {
		return name;
	}

	

}

public class Ting {

	public static void main(String[] args) {
		System.out.println("Hello World!");

		Eple e1 = new Eple();
		e1.name = "Kåre";
		
		sau s1 = new sau();
		s1.age=58;
		
		
		int tiss = s1.bananAge();
		String ball = e1.setName();
		
		System.out.println(tiss + ball);
		String a = "abc";
		String b = "def";
		System.out.println(a.compareTo(b));
		System.out.println();
		System.out.println();
		int b1 = 11;
		oppgave1b(b1);
		System.out.println("Etter første kall, b = " + b1);
		b1 = 14;
		oppgave1b(b1);
		System.out.println("Etter andre kall, b = " + b1);

	}
	public static void oppgave1b(int a) {
		if (a % 2 == 1) {
			a = a * 2;
		} else {
			a = a / 2;
		}
		System.out.println("a = " + a);

	}

	public class hei {
	}
}
