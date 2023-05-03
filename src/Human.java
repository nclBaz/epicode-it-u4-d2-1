
public class Human {
	// Attributi
	String firstName;
	String lastName;

	// Costruttori
	public Human() { // COSTRUTTORE I
		this.firstName = "Giacomo";
		this.lastName = "Poretti";
	}

	public Human(String fn) { // COSTRUTTORE II
		this.firstName = fn;
		this.lastName = "Cognome Generico";
	}

	public Human(String fn, String ln) { // COSTRUTTORE III
		this.firstName = fn;
		this.lastName = ln;
	}

	// Metodi
	void sayHello() {
		System.out.println("Ciao! Sono " + this.firstName);
	}
}