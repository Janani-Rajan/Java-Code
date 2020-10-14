//Janani Rajan, 7/28/19
public class NullPointerExceptionThrown {
	public static void main (String [] args) {
		String s = null;
			int n = getLength(s);
			System.out.println("Length of string '" + s +"' is : " + n);
	}

	public static int getLength(String s) {
		return s.length();
	}
}
