
public class Application {

	public static void main(String[] args) {
		// Creo istanze di Human

		Human myFirstHuman = new Human("Aldo", "Baglio"); // III COSTRUTTORE
		Human x = myFirstHuman;
		x.firstName = "Marina";
//		myFirstHuman.firstName = "Aldo";
//		myFirstHuman.lastName = "Baglio";
		System.out.println(myFirstHuman.firstName + " " + myFirstHuman.lastName);
		myFirstHuman.sayHello();

		Human mySecondHuman = new Human("Giovanni", "Storti"); // III COSTRUTTORE
//		mySecondHuman.firstName = "Giovanni";
//		mySecondHuman.lastName = "Storti";
		System.out.println(mySecondHuman.firstName + " " + mySecondHuman.lastName);
		mySecondHuman.sayHello();

		Human myThirdHuman = new Human(); // I COSTRUTTORE
		System.out.println(myThirdHuman.firstName + " " + myThirdHuman.lastName);
		myThirdHuman.sayHello();

		Human myFourthHuman = new Human("Claudio"); // II COSTRUTTORE
		System.out.println(myFourthHuman.firstName + " " + myFourthHuman.lastName);
		myFourthHuman.sayHello();

	}
}
