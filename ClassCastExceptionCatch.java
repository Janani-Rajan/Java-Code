//Janani Rajan, 7/28/19
public class ClassCastExceptionCatch {
	public static void main(String[] args) {
		Object o = new Object();
		try {
			String result = convertToString(o);
			System.out.println(result);
		} catch (ClassCastException ex) {
			System.out.println("ClassCastException: " + ex.getMessage());
		}
	}

	public static String convertToString(Object s) {
		return (String) s;
	}
}
