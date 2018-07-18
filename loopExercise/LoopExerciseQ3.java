package loopExercise;
/*
 * @author th3pi
 */
import java.util.Scanner;
public class LoopExerciseQ3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter a string of words: ");
		String s = kb.nextLine();
		
		for(int i = 0; i < s.length(); i++) {
			System.out.printf("%d: '%c' \n", i, s.charAt(i));
		}
	}

}
