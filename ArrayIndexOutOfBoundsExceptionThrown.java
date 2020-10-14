//Janani Rajan, 7/26/19
public class ArrayIndexOutOfBoundsExceptionThrown {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		int n = 6;
		getValueAtIndex(arr, n);
	}

	public static int getValueAtIndex(int[] arr, int n) {
		if (n >= arr.length)
			throw new ArrayIndexOutOfBoundsException(
					"Invalid index " + n + ". Please enter integer between 0 and " + arr.length);

		return arr[n];
	}

}

