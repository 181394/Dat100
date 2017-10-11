package no.hib.DAT100;

public class Testmain {
	public static void main(String[] args) {
		ToDoListe tdl = new ToDoListe(10);
		ToDoElement t1 = new ToDoElement("gå på tur!", 1, 2);
		ToDoElement t2 = new ToDoElement("gå på do!", 2, 3);
		tdl.leggTil(t1);
		tdl.leggTil(t2);
		System.out.println(tdl.finnViktig());
		System.out.println(tdl.toString());
	}
}