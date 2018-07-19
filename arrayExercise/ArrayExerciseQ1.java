/*
 * 1. Copy an Array

Create an integer array of length 10 and fill it up with random numbers.
Create a second integer array of length 10.

Write a program that will copy the values of the first array into the second.

Print the values in both arrays at the end to prove your answer is valid.
 */
package arrayExercise;
/*
 * @author th3pi
 */
public class ArrayExerciseQ1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Initializes two arrays.
		 * @param arr1 with values
		 * @param arr2 without values.
		 */
		int[] arr1 = {1,2,3,4,5,6,7,8,9,10};
		int[] arr2 = new int[10];
		
		//This copies all the values from arr1 to arr2
		System.arraycopy(arr1, 0, arr2, 0, arr1.length);
		
		/*
		 * As proof of copy this for loop iterates through all the 
		 * new data in arr2 and prints them out.
		 */
		for(int x : arr2) {
			System.out.println(x);
		}
	}

}
