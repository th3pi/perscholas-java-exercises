package twoDArrayExercise;
/*
 * @author th3pi
 */
import java.util.Random;
import java.util.Scanner;
public class twoDArrayExerciseQ2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		Random rd = new Random();
		int[][] arr = new int[10][5];
		/*
		 * This for loop iterates as long as the array is and 
		 * assigns a random value to each element as it proceeds at the same 
		 * time printing out the values
		 */
		for(int i = 0 ; i < arr.length; i++) {
			for(int j = 0; j < arr[0].length; j++) {
				arr[i][j] = rd.nextInt(9);
			}
		}
		//Asks user to select a column to get the total values of
		System.out.println("We have 5 columns. Which one would you like to sum up? ");
		int x = kb.nextInt();
		
		/*
		 * @param a is the accumulator
		 * for loop goes through each values and keeps on adding them to @param a after each iteration.
		 */
		int a = 0;
		for(int i = 0; i < arr.length; i++) {
			a += arr[i][x];
		}
		
		//Prints out the total value
		System.out.println(a);
	}

}
