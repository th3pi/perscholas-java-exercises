package arrayExercise;
/*
 * @author th3pi
 */
import java.util.Random;
import java.util.Scanner;

public class ArrayExerciseQ4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[10];
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
		 * Line 29-36 is dedicated to find how many times user's favorite number appears in the array.
		 * @param a holds the number of times the number appears;
		 * @param y holds the users favorite number
		 * for loop iterates through the entire array
		 * increments @param a every time it find user's favorite number
		 */
		System.out.println("Which one u like? ");
		int y = kb.nextInt();
		int a = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == y) {
				a++;
			}
		}
		
		//Prints out how many times user's favorite number appears.
		System.out.printf("Your favorite number appears %d times.", a);
	}

}
