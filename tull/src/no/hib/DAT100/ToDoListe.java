package no.hib.DAT100;

public class ToDoListe {
	private ToDoElement[] todoTab;
	private int antall;

	public ToDoListe(int maksAntall) {
		todoTab = new ToDoElement[maksAntall];
		antall = 0;
	}

	public void leggTil(ToDoElement tde) {
		todoTab[antall] = tde;
		antall++;
	}

	public ToDoElement finnViktig() {
		ToDoElement viktig = todoTab[0];
		for (int i = 1; i < antall; i++) {
			if (todoTab[i].getPri() > viktig.getPri()) {
				viktig = todoTab[i];
			}
		}

		return viktig;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < antall; i++) {
			sb.append(todoTab[i].toString());
		}
		String s = sb.toString();
		return s;
	}
}

