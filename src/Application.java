
public class Application {

	public static void main(String[] args) {

		// Creo istanze di Human

		Human myFirstHuman = new Human();
		myFirstHuman.firstName = "Aldo";
		myFirstHuman.lastName = "Baglio";
		System.out.println(myFirstHuman.firstName + " " + myFirstHuman.lastName);
		myFirstHuman.sayHello();

		Human mySecondHuman = new Human();
		mySecondHuman.firstName = "Giovanni";
		mySecondHuman.lastName = "Storti";
		System.out.println(mySecondHuman.firstName + " " + mySecondHuman.lastName);
		mySecondHuman.sayHello();

	}
}

class Human {
	// Attributi
	String firstName;
	String lastName;

	// Metodi
	void sayHello() {
		System.out.println("Ciao!");
	}
}