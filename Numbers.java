
import java.util.InputMismatchException;
import java.util.Scanner;

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
public class Numbers {
	/**
	 * Stores Float values.
	 */
	private Float [] numbers;
	
	/**
	 * Store the number of items currently in the array.
	 */
	private int numItems;

	/**
	 * Default Constructor
	 */
	public Numbers() {
		numbers = new Float [5];
	}

	/**
	 * Constructor that initializes the numbers array.
	 * @param size - Max size of the numbers array
	 */
	public Numbers(int size) {
		numbers = new Float [size];
	}
	
	/**
	 * Adds a value in the array
	 * @param keyboard - Scanner object to use for input
	 * @throws InputMismatchException if the user enters values that are not floats
	 */
	public void addValue(Scanner keyboard) throws InputMismatchException {
		// TODO Write code here to add the values in the array
		if (numItems<numbers.length) {
		System.out.print("Enter value: ");
		numbers[numItems]= keyboard.nextFloat();
		numItems++;
		}		
		else System.out.println("Array full");
	}
	
	/**
	 * Calculates the average of all the values in the numbers array.
	 * @return float value that represents the average
	 */
	public float calcAverage() {

		float total = 0;
		float ave = (float) 0.0;
		if (numItems>0) {
		for(int i=0; i<numItems; i++) {
			total+=numbers[i];
			ave = (float) total/numItems;
		}
		}
		return ave;
	}

	/**
	 * Determines the minimum and maximum values in the array.
	 * @return an array of two float elements which represent the minimum and the maximum values in numbers.
	 */
	public float[] findMinMax(){
		
		float[] pair = new float[2];
		if (numItems>0) {
		pair[0]=pair[1]=numbers[0];
		for(int i=0; i<numItems; i++) {
			if (pair[0]>numbers[i])
				pair[0]=numbers[i];
		}
		
		for(int i=0; i<numItems; i++) {
			if (pair[1]<numbers[i])
				pair[1]=numbers[i];
		}
		}

		return pair;		
	}
	
	/**
	 * This method format the array elements in a string format 
	 * @return the entered values in a String format
	 */
	@Override
	public String toString() {
		
		String formatString = "Numbers are:";
		for (int i=0; i<numItems; i++)
			formatString+= "\n" + numbers[i];
		return formatString;
	}
	
}
