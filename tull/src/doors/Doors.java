package doors;

public class Doors {
	boolean[] doors;

	Doors(int size) {
		doors = new boolean[size];
	}

	public void writeAll() {
		System.out.println("---------------------------------------------------------------------------------");
		for (int i = 0; i < doors.length; i++) {
			System.out.print("| " + doors[i] + "\t");
		}
		System.out.print("|");
		System.out.println("\n---------------------------------------------------------------------------------");
	}

	public void toggleAll() {
		int counter = 1;
		for (int i = 1; i < doors.length; i++)
		for (int j = 0; j < doors.length; j++) {
				if (j % i == 0) {
					if (!doors[j]) {
					doors[j] = true;
				} else {
					doors[j] = false;
			}
					System.out.println(counter);
					writeAll();
					counter++;
		}

	}
	}

}
