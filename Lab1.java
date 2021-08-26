import java.util.InputMismatchException;
import java.util.Scanner;
import java.text.DecimalFormat;


/**
 * CET - CS Academic Level 3
 * Declaration: I declare that this is my own original work and is free from Plagiarism
 * This class contains the dynamically allocated array and it's processing
 * Student Name: Younes Boutaleb
 * Student Number: 041019068 
 * Section #: 303
 * Course: CST8130 - Data Structures
 * @author/Professor: James Mwangi PhD. 
 * 
  */
public class Lab1 {

	/**
	 * This is the method main where we test our program
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		//Scanner object used to get the user's inputs
		Scanner keyboard = new Scanner(System.in);
		
		
		Numbers numb = new Numbers();
		
		//While loop variable
		boolean exit = true;
		 
		while(exit == true) {
			
		displayMainMenu();
		
		
		//Switch variable
		int option =0;
		 try {
		 option = keyboard.nextInt();
		 }catch(InputMismatchException ex) {
				 System.out.println("Invalid option\n");
				 keyboard.nextLine();
		 }
		 
		 switch (option) {
		 
		 case 1: 
			 numb = new Numbers();
			 break;
			 
		 case 2: 
			 System.out.print("Enter new size of array: ");
			 int size=0;
			 try {
				 size = keyboard.nextInt();
				 numb = new Numbers(size);
				 }catch(InputMismatchException ex) {
					 System.out.println("Invalid size\n");
					 keyboard.nextLine();
				 }
			 break;
			 
		 case 3: 
			 
			 try {
			 numb.addValue(keyboard);
			 }catch(InputMismatchException ex){
				 System.out.println("Invalid value\n");
				 keyboard.nextLine();
			 }
			 break;
			 
		 case 4: 
			 System.out.println(numb.toString() + "\n");
			 break;
			 
		 case 5:
			 DecimalFormat df = new DecimalFormat("0.0#");
			 System.out.println("Average is: " + df.format(numb.calcAverage()) + " " + "Minimum value is " + numb.findMinMax()[0] + " " + "Maximum value is " + numb.findMinMax()[1] + "\n");
			 break;
		 
		 case 6:
			 System.out.println("Exiting...");
			 exit = false;
			 break;
			 
		default :
			System.out.println("invalid option");
			break;
			 
		 }
		 }
		  
	}
	
	/**
	 * Outputs the main menu to the console
	 * @throws InputMismatchException 
	 */
	public static void displayMainMenu() {
		
		System.out.print(
				"Please select one of the following:" +
				"\n1: Initialize a default array" +
				"\n2: To specify the max size of the array" +
				"\n3: Add value to the array" +
				"\n4: Display values in the array" +
				"\n5: Display average of the values, minimum value, maximum value" +
				"\n6: To Exit" +
				"\n>"
				);
	}

}
