import java.util.Scanner;

public class Assignment7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the weight of an object on Earth: ");
		double earth_weight = input.nextDouble();
		//Calling back Earth_to_Moon and Earth_to_Mars
		System.out.println();
		Earth_to_Moon(earth_weight);
		System.out.println();
		Earth_to_Mars(earth_weight);

		System.out.print("Enter the weight of an object on the Moon: ");
		double moon_weight = input.nextDouble();
		//Calling back Moon_to_Earth
		System.out.println();
		Moon_to_Earth(moon_weight);

		System.out.print("Enter the weight of an object on Mars: ");
		double mars_weight = input.nextDouble();
		//Calling back Mars_to_Earth
		System.out.println();
		Mars_to_Earth(mars_weight);

		input.close();
	}

	public static void Earth_to_Moon(double earth) {
		double moon = (earth / 9.81) * 1.622;
		System.out.println("This object's weight on the Moon is " + moon);

	}

	public static void Earth_to_Mars(double earth) {
		double mars = (earth / 9.81) * 3.711;
		System.out.println("This object's weight on Mars is " + mars);

	}

	public static void Moon_to_Earth(double moon) {
		double earth = (moon / 1.622) * 9.81;
		System.out.println("This object's weight on Earth is " + earth);

	}

	public static void Mars_to_Earth(double mars) {
		double earth = (mars / 3.711) * 9.81;
		System.out.println("This object's weight on Earth is " + earth);
	}
}
