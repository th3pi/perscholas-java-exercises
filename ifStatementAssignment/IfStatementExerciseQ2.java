package ifStatementAssignment;
/*
 * @author th3pi
 */
import java.util.Scanner;
public class IfStatementExerciseQ2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age;
		String name;
		
		Scanner kb = new Scanner(System.in);
		
		System.out.println("What's your name?");
		name = kb.nextLine();
		System.out.printf("What's your age %s?\n",name);
		age = kb.nextInt();
		
		if(age < 16) {
			System.out.printf("You can't drive, %s.\n",name);
			System.out.printf("You cant vote, %s.\n", name);
			System.out.printf("You can't rent a car.\n", name);

		}
		else if(age < 18) {
			System.out.printf("You can't rent a car.\n", name);
			System.out.printf("You can't drive, %s.\n",name);
		}
		else if(age < 25) {
			System.out.printf("You can't rent a car.\n", name);
		}
		else
			System.out.println("You can do anything that's legal.\n");
	}

}
