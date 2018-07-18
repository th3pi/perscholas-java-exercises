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
		for(int i = 0 ; i < arr.length; i++) {
			arr[i] = rd.nextInt(20);
			System.out.println(arr[i]);
		}
		System.out.println("Which one u like? ");
		int y = kb.nextInt();
		int a = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == y) {
				a++;
			}
		}
		System.out.printf("Your favorite number appears %d times.", a);
	}

}
