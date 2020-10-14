
//Janani Rajan, 9/1/19
import java.util.Scanner;

public class MyThreads {

	public static void main(String[] args) throws Exception {


		Scanner input = new Scanner(System.in);
		System.out.println("Type '1' if you would like to run the regular program.");
		System.out.println("Type '2' if you would like to run the synchronized program.");
		int inp = input.nextInt();


		if (inp == 2) {
			Synchronized_EditSum[] arrThread = new Synchronized_EditSum[50];
			for (int i = 0; i < 50; i++) {
				arrThread[i] = new Synchronized_EditSum();
				arrThread[i].start();
			}
			System.out.println("Value of sum at the end:" + Synchronized_EditSum.getSum());
		} else if (inp == 1) {
			EditSum [] arrThread = new EditSum[50];
			for (int i = 0; i < 50; i++) {
				arrThread[i] = new EditSum();
				arrThread[i].start();
			}
			System.out.println("Value of sum at the end:" + EditSum.getSum());
		} else {
			System.out.println("Invalid input");
		}
		
		input.close();
	}
}
