package no.hib.DAT100;


	public class ToDoElement {
		private String beskrivelse;
		private int nummer;
		private int pri;

		public ToDoElement(String beskrivelse, int nummer, int pri) {
			this.beskrivelse = beskrivelse;
			this.nummer = nummer;
			this.pri = pri;
		}

		public String getBeskrivelse() {
			return beskrivelse;
		}

		public void setBeskrivelse(String beskrivelse) {
			this.beskrivelse = beskrivelse;
		}

		public int getNummer() {
			return nummer;
		}

		public void setNummer(int nummer) {
			this.nummer = nummer;
		}

		public int getPri() {
			return pri;
		}

		public void setPri(int pri) {
			this.pri = pri;
		}

		@Override
		public String toString() {
		return beskrivelse + "\nNummer : " + nummer + "\nPrioritet : " + pri + "\n";
		}
	}


