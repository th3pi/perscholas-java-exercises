package arrayExercise;
/*
 * @author th3pi
 */
import java.util.Random;
import java.util.Scanner;

public class ArrayExerciseQ3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Initializes a new array with 10 values to hold
		int[] arr = new int[10];
		//Initializes a random number generator
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
		
		/*
		 * @param largest assumes that the largest value in the array is being held by 
		 * the first element. The for loop goes through each element in the array
		 * comparing them with the largest variable. If the element's value is larger 
		 * than the largest variable's value - largest variable gets assigned a new a value
		 * same as the current element's value. This keeps on happening until the loop reaches
		 * end of the array.
		 * @param position captures which element held the largest value and stores the location.
		 */
		int largest = arr[0], position = 0;
		for(int i = 0; i < arr.length; i++) {
			if(largest < arr[i]) {
				largest = arr[i];
				position = i + 1;
			}
		}
		
		//Displays the largest value
		System.out.println("Largest number is " + largest);
		
		//Displays where the largest value is held.
		System.out.println("Position of the largest number is " + position);
		
	}

}
