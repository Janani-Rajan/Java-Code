//Janani Rajan, 7/26/19
public class ClassCastExceptionThrown {
	public static void main(String[] args) {
		Object o = new Object();
		String result = convertToString(o);
		System.out.println(result);
	}

	public static String convertToString(Object s) {
		return (String) s;
	}

}
