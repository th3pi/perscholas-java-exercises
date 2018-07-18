package arrayExercise;
/*
 * @author th3pi
 */
import java.util.Scanner;
public class ArrayExerciseQ5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter a few words seperated by commas: ");
		String s = kb.nextLine();
		
		String[] str = s.split(",");
		for(int i = 0; i < str.length; i++) {
			System.out.printf("%d: %s.\n",i,str[i]);
		}
	}

}
