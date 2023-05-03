
public class Student {

	// Attributi di istanza
	String firstName;
	String lastName;
	String id;

	// Attributi statici
	static String school = "Epicode";

	// Costruttori
	public Student() { // COSTRUTTORE I
		this.firstName = "Giacomo";
		this.lastName = "Poretti";
	}

	public Student(String fn) { // COSTRUTTORE II
		this.firstName = fn;
		this.lastName = "Cognome Generico";
	}

	public Student(String fn, String ln) { // COSTRUTTORE III
		this.firstName = fn;
		this.lastName = ln;
	}

	// Metodi di istanza
	void sayHello() {
		System.out.println("Ciao! Sono " + this.firstName);
	}

	// Metodi statici
	static void staticMethod() {
		System.out.println("Ciao sono un metodo statico!");
	}

	@Override
	public boolean equals(Object obj) {
		Student s = (Student) obj;
		if (this.firstName == s.firstName && this.lastName == s.lastName) {
			return true;
		} else {
			return false;
		}
	}
}

//public class Math{
//	static final double PI = 3.14;
//	
//	static double sqrt() {
//		return 0;
//	}
//}
//
//Math.sqrt(4); // --> 2
//Math.PI; // --> 3.14
