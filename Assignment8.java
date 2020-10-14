public class Assignment8 {

	public static void main(String[] args) {
		System.out.println("Original array:");
		int[] arr = new int[100];
		for (int countNum = 0; countNum < 100; countNum++) {
			arr[countNum] = (int) (Math.random() * 100) + 1;
			System.out.print(arr[countNum] + " ");
		}

		int[] arr1 = yes(arr);
		int[] arr2 = no(arr);
		System.out.println(" ");
		System.out.println("Numbers divisible by 4:");
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}

		System.out.println(" ");
		System.out.println("Numbers not divisible by 4:");
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}

	}

	public static int[] yes(int[] input) {
		int divisibles = 0;
		for (int i = 0; i < input.length; i++) {
			if (input[i] % 4 == 0) {
				divisibles++;
			}
		}
		int[] arr_yes = new int[divisibles];
		int count_divisible = 0;
		for (int i = 0; i < input.length; i++) {
			if (input[i] % 4 == 0) {
				arr_yes[count_divisible++] = input[i];
			}
		}

		return arr_yes;
	}

	public static int[] no(int[] input) {
		int not_divisibles = 0;
		for (int i = 0; i < input.length; i++) {
			if (input[i] % 4 != 0) {
				not_divisibles++;
			}
		}
		int[] arr_no = new int[not_divisibles];
		int count_divisible = 0;
		for (int i = 0; i < input.length; i++) {
			if (input[i] % 4 != 0) {
				arr_no[count_divisible++] = input[i];
			}
		}

		return arr_no;
	}

}
