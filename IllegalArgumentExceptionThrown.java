//Janani Rajan, 7/28/19
public class IllegalArgumentExceptionThrown {
	public static void main(String[] args) {
		String s = "Hello!";
		int n = 75;
		char result = getCharacterAt(s, n);
		System.out.println("Char at " + n + " of String '" + s + "' is " + result);
	}

	public static char getCharacterAt(String s, int n) {
		if (n >= s.length())
			throw new IllegalArgumentException("Input is " + n + ". Must be between 0 and " + s.length());

		return s.charAt(n);
	}
}
