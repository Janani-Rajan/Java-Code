import java.util.Scanner;

public class Project1 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter 1 to encode a message and 2 to decode one. ");
		String userinp = input.nextLine();
		System.out.println("Enter your message. ");
		String Message = input.nextLine();

		if (userinp.equals("1")) {
			encode(Message);
		} else {
			decode(Message);
		}
		input.close();
	}

	public static void encode(String str) {
		String finalstr = ""; 
		char letter; 
		char letter2;
		for (int count = 0; count < str.length(); count++) {
			letter = str.charAt(count);
			if (letter >= 'a' && letter <= 'm') {
				letter2 = (char) ('z' - (letter - 'a'));
				finalstr += letter2;
			} else if (letter > 'm' && letter <= 'z') {
				letter2 = (char) (('z' - letter) + 'a');
				finalstr += letter2;
			} else if (letter >= 'A' && letter <= 'M') {
				letter2 = (char) ('Z' - (letter - 'A'));
				finalstr += letter2;
			} else if (letter > 'M' && letter <= 'Z') {
				letter2 = (char) (('Z' - letter) + 'A');
				finalstr += letter2;
			} else {
				letter2 = letter;
				finalstr += letter2;
			}
		}
		System.out.println(finalstr);
	}

	public static void decode(String str) {
		String finalstr = "";
		int index = 0;
		int count;
		char letter = str.charAt(index);
		char[] lowercase = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r',
				's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
		char[] lowercase_reverse = { 'z', 'y', 'x', 'w', 'v', 'u', 't', 's', 'r', 'q', 'p', 'o', 'n', 'm', 'l', 'k',
				'j', 'i', 'h', 'g', 'f', 'e', 'd', 'c', 'b', 'a' };
		for (index = 0; index < str.length(); index++) {
			letter = str.charAt(index);
			char lowerletter = Character.toLowerCase(letter);

			for (count = 0; count < 26; count++) {
				if (lowerletter == lowercase[count]) {
					if (lowerletter == letter) {
						finalstr += lowercase_reverse[count];
					} else {
						finalstr += Character.toUpperCase(lowercase_reverse[count]);
					}
					break;
				}
			}

			if (count > 25) {
				finalstr += letter;
			}

		}
		System.out.println(finalstr);
	}
}
