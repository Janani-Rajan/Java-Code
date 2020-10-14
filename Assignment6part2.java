import java.util.Scanner;

public class Assignment6part2 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Enter any whole number: ");

		int rows = input.nextInt();
		input.close();

		int firstrow = rows;

		while (firstrow >= 1) {
			int numberofasterisks = firstrow;
			String asterisks = "";

			String spaces = "";
			for (int i = 0; i < rows - firstrow; i++) {
				spaces += " ";
			}

			while (numberofasterisks >= 1) {
				asterisks += '*';
				numberofasterisks--;
			}
			System.out.println(spaces + asterisks);
			firstrow--;
		}

	}
}

