import java.util.Scanner;

public class Assignment9 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a sentence: "); 
		String a = input.nextLine();
		System.out.println();
		System.out.println("Enter 1 to count the characters. Enter 2 to count words.");
		int number = input.nextInt();
		input.close();
		System.out.println();
		if (number == 1) {
			int count = characterCount(a);
			System.out.print("There are " + count + " characters in the sentence.");
		} else {
			int count = wordCount(a);
			System.out.print("There are " + count + " words in the sentence.");
		}
	}

	public static int characterCount(String s) {
		int count = 0; //variable that counts characters
		int length = s.length(); //finding the length of user input
		for (int i = 0; i < length; i++) { //checks whether or not each character is a space
			char c = s.charAt(i);
			if (c != ' ') { //avoids counting spaces because spaces are not characters
				count++;
			}
		}
		return count;

	}

	public static int wordCount(String s) {
		int count = 0; //word counting variable
		int k = 0; //calculate the index of each space
		while (k != -1) {
			k = s.indexOf(' ', k);
			if (k == -1) { //prevents code from going on an infinite loop
				break;
			}
			k += 1;
			if (s.charAt(k) != ' ') //after k + 1, if the character at position k is NOT a space, it counts as a word
				count++;
		}
		count++;
		return count;
	}
}
	
