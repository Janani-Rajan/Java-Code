import java.util.Scanner;
public class Assignment5 {

	public static void main(String [] args) {
		Scanner input = new Scanner (System.in);
		System.out.print("Enter a package weight in pounds: ");
		double weight = input.nextDouble();
		double cost = 0;
		
		
		if (weight > 0 & weight <= 1 ) {
			
			System.out.println("cost = $2.95");
			
		} else if (weight > 1 & weight <= 3) {
			
			System.out.println("cost = $4.95");
			
		} else if (weight > 3 & weight <= 10) {
			
			System.out.println("cost = $9.45");
			
		} else if (weight > 10 & weight <= 20) {
			
			System.out.println("cost = $12.50");
			
		} else if (weight > 20) {
			
			System.out.println("This item is too heavy to be shipped.");
			
		} else if (weight <= 0)
			
			System.out.println("Weight value must be over zero.");
		
		
		input.close();
		
		
	}
	
}
