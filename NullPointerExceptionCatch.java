//Janani Rajan, 7/28/19
public class NullPointerExceptionCatch {
	public static void main(String[] args) {
		String s = null;
		try {
			int n = getLength(s);
			System.out.println("Length of string '" + s + "' is : " + n);
		} catch (NullPointerException ex) {
			System.out.println("NullPointerException: Value of String is Null.");
			ex.printStackTrace();
		}
	}

	public static int getLength(String s) {
		return s.length();
	}
}
