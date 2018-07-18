package arrayExercise;
/*
 * @author th3pi
 */
import java.util.Random;
import java.util.Scanner;

public class ArrayExerciseQ3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[10];
		Random rd = new Random();
		Scanner kb = new Scanner(System.in);
		for(int i = 0 ; i < arr.length; i++) {
			arr[i] = rd.nextInt(20);
			System.out.println(arr[i]);
		}
		int largest = arr[0], position = 0;
		for(int i = 0; i < arr.length; i++) {
			if(largest < arr[i]) {
				largest = arr[i];
				position = i + 1;
			}
		}
		System.out.println("Largest number is " + largest);
		System.out.println("Position of the largest number is " + position);
		
	}

}
