import java.util.Scanner;

public class Assignment7part2 {
	public static void main(String[] args) {
		//Prompting user for input for L, i, and N
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a dollar amount for a loan: $");
		double L = input.nextDouble();
		System.out.print("Enter an interest rate in %: ");
		double I = input.nextDouble();
		System.out.print("Enter a number of years: ");
		int N = input.nextInt();
		
		double r = I/(12*100);//Monthly interest rate + turning I into decimal format
		int n = 12 * N;//Months
		double P = ( r * L ) /( 1 - Math.pow( 1 + r, -1*n ));//Equation
		
		//Rounding P to 2 decimal points
		java.text.DecimalFormat df = new java.text.DecimalFormat( "#####.##" );
		df.format( P );
		
		//Result
		System.out.println("Your monthly payment is $" + df.format(P));
		input.close();
		}

	}


