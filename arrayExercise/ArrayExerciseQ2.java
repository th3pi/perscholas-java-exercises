/*
 * Find a value in an Array

Create an integer array of length 10 and fill it up with random numbers.
Print the values in the array for the user to see.

Ask the user for a value they'd like you to search for.
Search through the array.
If the value is in the array, tell them which position you found.

It's okay if the program prints the message more than once.
 */
package arrayExercise;
/*
 * @author th3pi
 */
import java.util.Random;
import java.util.Scanner;
public class ArrayExerciseQ2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//@param arr initialized to hold 10 values
		int[] arr = new int[10];
		
		//@param rd a random generator to generate random values.
		Random rd = new Random();
		Scanner kb = new Scanner(System.in);
		
		/*
		 * This for loop iterates as long as the array is and 
		 * assigns a random value to each element as it proceeds at the same 
		 * time printing out the values
		 */
		for(int i = 0 ; i < arr.length; i++) {
			arr[i] = rd.nextInt(20);
			System.out.println(arr[i]);
		}
		
		//User picks a number
		System.out.println("Which one u like? ");
		int y = kb.nextInt();
		
		/*
		 * The program goes through the entire array again to find the where location
		 * of user's pick is and the prints it out
		 */
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == y) {
				System.out.println("Your favorite number is in location " + (i+1));
			}
		}
		

	}

}
