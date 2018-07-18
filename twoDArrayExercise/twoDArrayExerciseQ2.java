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
		for(int i = 0 ; i < arr.length; i++) {
			for(int j = 0; j < arr[0].length; j++) {
				arr[i][j] = rd.nextInt(9);
			}
		}
		System.out.println("We have 5 columns. Which one would you like to sum up? ");
		int x = kb.nextInt();
		int a = 0;
		for(int i = 0; i < arr.length; i++) {
			a += arr[i][x];
		}
		System.out.println(a);
	}

}
