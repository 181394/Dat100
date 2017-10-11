package no.hib.DAT100;
class Person{
	String name;
	int age;
	String occupation;
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getOccupation() {
		return occupation;
	}
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	public Person(String name, int age, String occupation){
		this.name = name;
		this.age = age;
		this.occupation = occupation;
		
	
	}
	public void skrivUt(){
		System.out.println("Name: " + name + "\n" + "Age: " + age + "\n" + "Occupation: " + occupation + "\n");
	}
	
	
}

public class object {
	public static void main(String[] args) {
		Person per1 = new Person("Ole Jordan", 21, "CNC Opperator");
		Person per2 = new Person("Preben Haukebøe", 21, "Coworker at Dekk1");
		Person per3 = new Person("Helene Karlsson", 21, "Coworker at EuroSpar");
		Person per4 = new Person("Pondus Karlsson", 8, "Cutest pusekatt in the world");
		
		per1.skrivUt();
		per2.skrivUt();
		per3.skrivUt();
		per4.skrivUt();
	}

}
