
//Janani Rajan, 7/22/19

import java.util.Scanner;

public class CreateVehicles {
	public static void main(String[] args) {

		Car car1 = new Car();
		Car car2 = new Car();
		Boat boat1 = new Boat();
		Boat boat2 = new Boat();

		Scanner input = new Scanner(System.in);

		Vehicle[] arr = { car1, boat1, car2, boat2 };

		String inputMake;
		int inputYear;
		int inputDraft;
		int inputLength;

		// Car 1:
		System.out.println("Please type the make of the Car 1: ");
		inputMake = input.nextLine();
		car1.setMake(inputMake);
		System.out.println("Please type the year Car 1 was made: ");
		inputYear = input.nextInt();
		car1.setYear(inputYear);

		// Boat 1:
		System.out.println("Please type the draft of Boat 1: ");
		inputDraft = input.nextInt();
		boat1.setDraft(inputDraft);
		System.out.println("Please type the length of Boat 1: ");
		inputLength = input.nextInt();
		boat1.setLength(inputLength);

		// Car 2:
		System.out.println("Please type the make of the Car 2: ");
		inputMake = input.next();
		car2.setMake(inputMake);
		System.out.println("Please type the year Car 2 was made: ");
		inputYear = input.nextInt();
		car2.setYear(inputYear);

		// Boat 1:
		System.out.println("Please type the draft of Boat 2: ");
		inputDraft = input.nextInt();
		boat2.setDraft(inputDraft);
		System.out.println("Please type the length of Boat 2: ");
		inputLength = input.nextInt();
		boat2.setLength(inputLength);

		input.close();

		for (int i = 0; i < arr.length; i++) {
			arr[i].display();
			System.out.println("--------------------");
		}
		

	}
}
