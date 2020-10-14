import java.util.Scanner;

public class Assignment6 {

	public static void main(String[] args) {

		System.out.print("Enter an upper bound for the range: ");
		Scanner input = new Scanner(System.in);

		int a = input.nextInt(); // Input
		int b = 0; // Used in the for construct
		int d = 0; // Numbers divisible by 3
		int e = 0; // Numbers NOT divisible by 3
		int f = 0; // Sum of all numbers divisible by 3
		int g = 0; // Sum of all numbers divisible by 3

		for (b = 1; b <= a; b += 1) {
			if (b % 3 == 0) {
				d++;
				f += b;
			} else {
				e++;
				g += b;
			}
		}

		System.out.println("There are " + d + " numbers in the range 1 - " + a
				+ " which are divisible by 3 and their sum is " + f + " .");
		System.out.println("There are " + e + " numbers in the range 1 - " + a
				+ " which are not divisible by 3 and their sum is " + g + " .");

		input.close();
	}
}
