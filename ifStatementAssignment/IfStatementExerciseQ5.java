package ifStatementAssignment;
/*
 * @author th3pi
 */
import java.util.Scanner;
public class IfStatementExerciseQ5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter a number between 1 - 7: ");
		int n = kb.nextInt();
		System.out.printf("Weekday %d is %s!", n, dayOfTheWeek(n));
	}
	
	static String dayOfTheWeek(int n) {
		switch(n) {
		case 1:
			return "Monday";
		case 2:
			return "Tuesday";
		case 3:
			return "Wednesday";
		case 4:
			return "Thursday";
		case 5:
			return "Friday";
		case 6:
			return "Saturday";
		case 7:
			return "Sunday";
		default:
			return "Error";
		}
	}

}
