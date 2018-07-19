package arrayExercise;
/*
 * @author th3pi
 */
import java.util.Scanner;
public class ArrayExerciseQ5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		
		//Asks users to enter a few words seperated by commas
		System.out.println("Enter a few words seperated by commas: ");
		String s = kb.nextLine();
		
		/*
		 * String object's split method is called here to split the string at every comma (",")
		 * Then display the entire string separated by words on a new line each
		 */
		String[] str = s.split(",");
		for(int i = 0; i < str.length; i++) {
			System.out.printf("%d: %s.\n",i,str[i]);
		}
	}

}
