//Janani Rajan, 9/1/19
public class EditSum extends Thread {
	private static int sum = 0;
	public static int getSum() {
		return sum;
	}
	public static void setSum(int i) {
		EditSum.sum = i;
	}
	private void incrementSum() {
		EditSum.sum += 1;
		System.out.println("This is the value of sum inside :" + sum);		
	}
	public void run() {
		incrementSum();
	}
}
