
public class Application {

	public static void main(String[] args) {
		// Creo istanze di Human

		Student myFirstHuman = new Student("Aldo", "Baglio"); // III COSTRUTTORE
		Student aldo = new Student("Aldo", "Baglio");
//		Student x = myFirstHuman;
//		x.firstName = "Marina";
//		myFirstHuman.firstName = "Aldo";
//		myFirstHuman.lastName = "Baglio";
		System.out.println(myFirstHuman.firstName + " " + myFirstHuman.lastName);
		myFirstHuman.sayHello();
		Student.staticMethod();

		Student mySecondHuman = new Student("Giovanni", "Storti"); // III COSTRUTTORE
//		mySecondHuman.firstName = "Giovanni";
//		mySecondHuman.lastName = "Storti";
		System.out.println(mySecondHuman.firstName + " " + mySecondHuman.lastName);
		mySecondHuman.sayHello();

		Student myThirdHuman = new Student(); // I COSTRUTTORE
		System.out.println(myThirdHuman.firstName + " " + myThirdHuman.lastName);
		myThirdHuman.sayHello();

		Student myFourthHuman = new Student("Claudio"); // II COSTRUTTORE
		System.out.println(myFourthHuman.firstName + " " + myFourthHuman.lastName);
		myFourthHuman.sayHello();

		System.out.println("Nome scuola: " + Student.school);

		boolean areTheSameObject = myFirstHuman.equals(aldo);

		System.out.println("Sono uguali? " + areTheSameObject);

		// ********************** COMPARAZIONE TRA NUMERI ***************
//		int x = 10;
//		double y = 10.0;
//
//		if (x == y) {
//			System.out.println("Sono uguali");
//		} else {
//			System.out.println("Sono diversi");
//		}

		// *********************** COMPARAZIONE TRA STRINGHE **************

		String s1 = "ciao";
		String s2 = "ciao";
		s2 = "asdasda";
		if (s1 == s2) {
			System.out.println("Sono uguali");
		} else {
			System.out.println("Sono diversi");
		}

		String s3 = new String("ciao");

		if (s1 == s3) {
			System.out.println("Sono uguali");
		} else {
			System.out.println("Sono diversi");
		}

	}

}
