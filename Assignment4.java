import java.util.Scanner;

public class Assignment4 {
  public static void main(String [] args) {
	  
	  Scanner input = new Scanner (System.in);
	  
	  System.out.println("Enter a value for the first test score: ");
	  double score1 = input.nextDouble();
	  
	  System.out.println("Enter a value for the second test score: ");
	  double score2 = input.nextDouble(); 
	  
	  System.out.println("Enter a value for the third test score: ");
	  double score3 = input.nextDouble();
	  
	  double average = (score1 + score2 + score3)/3; 
	  
	  if (97.5 <= average) {
	     System.out.println(" Your average is " + average + ". You have an A+."); 
	  } else if ( average >= 93.5 && average <= 97.49) {
         System.out.println(" Your average is " + average + ". You have an A.");
	  } else if (average >= 89.5 && average <= 93.49) {
	     System.out.println("Your average is " + average + ". You have an A-.");
	  } else if (average >= 86.5 && average <= 89.49) {
		 System.out.println("Your average is " + average + ". You have a B+.");
	  } else if (average >= 82.5 && average <= 86.49 ) {
		  System.out.println("Your average is " + average + ". You have a B.");
	  } else if (average >= 79.5 && average <= 82.49 ) {
		  System.out.println("Your average is " + average + ". You have a B-.");
	  }else if (average >= 69.5 && average <= 79.49 ) {
		  System.out.println("Your average is " + average + ". You have a C.");
	  }else{ //  average < 69.5
		  System.out.println("Your average is " + average + ". You have an F.");
	  }
	  
	  
	 input.close();
  }
}
