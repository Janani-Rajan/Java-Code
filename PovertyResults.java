//Janani Rajan, 8/6/19
//import PrintWriter, Scanner, and File
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.PrintWriter;

public class PovertyResults {

	public static void main(String[] args) {
		Scanner scanner = null;
		PrintWriter results = null;

		Scanner input = new Scanner(System.in);

		try {
			System.out.println("Please enter the full path for PovertyData input text file.");
			System.out.println("Example: C:\\\\Downloads\\\\povertyData.txt");
			String sInputFile = input.nextLine();

			// Open the input File using scanner
			scanner = new Scanner(new File(sInputFile));

			System.out.println("Now, please enter the full path for output result text file:");
			System.out.println("Example: C:\\\\Downloads\\\\povertyResults.txt");
			String sOutputFile = input.nextLine();

			// Create the output File, use PrintWriter to write to file
			results = new PrintWriter(new File(sOutputFile));

			processPovertyData(scanner, results);
			System.out.println("All done!");
		} catch (FileNotFoundException ex) {
			if (scanner == null) {
				System.out.println("Invalid input Poverty Data text file");
			} else if (results == null) {
				System.out.println("Invalid output Poverty Results text file");
			}
		} finally {
			input.close();
			if (scanner != null) {
				scanner.close();
			}

			if (results != null) {
				results.close();
			}
		}
	}

	public static void processPovertyData(Scanner scanner, PrintWriter writer) {
		// Create an array of 57 (using 1 based, instead of 0 based) Summary objects to
		// hold the results
		Summary[] arrSummary = new Summary[57];

		// populate the array with the summary object for each state code
		for (int i = 1; i < arrSummary.length; i++) {
			Summary s = new Summary();
			// If integer State Code is less than 10, sets state code to "0" + that integer.
			// else convert the integer to string and set it as state code
			if (i < 10) {
				s.setStateCode("0" + String.valueOf(i));
			} else {
				s.setStateCode(String.valueOf(i));
			}
			arrSummary[i] = s;
		}

		// Create a dataElement that holds a line of input poverty data file
		// This dataElement is re-used for each line in the file
		DataElement d = new DataElement();

		// Read each line and process them till we have lines in the file
		while (scanner.hasNextLine()) {
			String line = scanner.nextLine();
			d.setCompleteLine(line);
			int stateCode = d.getIntStateCode();

			// Pick up the summary object from the array based on the state code
			Summary s = arrSummary[stateCode];

			// Add data from the file to the summary object
			s.addToTotalPopulation(d.getTotalPopulation());
			s.addToChildPopulation(d.getChildPopulation());
			s.addToChildPoverty(d.getChildPovertyPopulation());
		}

		// Write out the line for each state summary Object if it has values
		for (int i = 1; i < arrSummary.length; i++) {
			if (arrSummary[i].hasValue()) {
				writer.println(arrSummary[i].getSummaryString());
			}
		}
	}
}