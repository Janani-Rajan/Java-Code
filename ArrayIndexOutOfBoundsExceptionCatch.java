//Janani Rajan, 7/28/19
import java.util.Scanner;

public class ArrayIndexOutOfBoundsExceptionCatch {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] arr = { 1, 2, 3, 4, 5 };
		try {
			System.out.println("Please enter an integer: ");
			int n = input.nextInt();
			int result = getValueAtIndex(arr, n);
			System.out.println(result);
		} catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("ArrayIndexOutOfBoundsException: " + ex.getMessage());
		}
		input.close();

	}

	public static int getValueAtIndex(int[] arr, int n) {
		if (n >= arr.length)
			throw new ArrayIndexOutOfBoundsException(
					"Invalid index " + n + ". Please enter integer between 0 and " + arr.length);

		return arr[n];
	}

}
