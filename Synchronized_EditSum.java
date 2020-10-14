//Janani Rajan, 9/1/19
public class Synchronized_EditSum extends Thread {
	private static int sum = 0;
	public static int getSum() {
		synchronized(Synchronized_EditSum.class) {
			return Synchronized_EditSum.sum;
		}
	}
	public static void setSum(int i) {
		synchronized(Synchronized_EditSum.class) {		
			Synchronized_EditSum.sum = i;
		}
	}
	private void incrementSum() {
		synchronized(Synchronized_EditSum.class) {
			Synchronized_EditSum.sum += 1;
			System.out.println("This is the value of sum inside :" + sum);
		}
	}
	public void run() {
		incrementSum();
	}
}

