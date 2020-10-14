
import java.util.Scanner;

public class Assignment3 {
	
	public static void main( String [] args ){

		// Create a Scanner object
		Scanner input = new Scanner( System.in );
	
		// Prompt the user to enter fahrenheit temperature
		System.out.print( "Enter a temperature in degrees Farenheit: ");
	
		// Read the value entered
		double fahrenheitTemp = input.nextDouble();
	
		//calculate 
		double kelvinTemp = ( (fahrenheitTemp - 32) / 1.8 ) + 273;

		// close input to prevent leak
		input.close();
	
		// Display Kelvin temp
		System.out.println( "Kelvin Temperature = " + kelvinTemp );
	}
}
