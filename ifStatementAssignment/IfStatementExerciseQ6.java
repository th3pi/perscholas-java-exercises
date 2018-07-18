package ifStatementAssignment;
/*
 * @author th3pi
 */
import java.util.Scanner;
public class IfStatementExerciseQ6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter your current Earth weight: ");
		double w = kb.nextDouble();
		System.out.println("Select one of the planets you want to visit 1-6: \n"
				+ "1. Venus \n"
				+ "2. Mars \n"
				+ "3. Jupiter \n"
				+ "4. Saturn \n"
				+ "5. Uranus \n"
				+ "6. Neptune");
		int n = kb.nextInt();
		System.out.printf("Your weight would be %.2f pounds on %s.", planetGravity(n,w), planet(n));
	}
	static double planetGravity(int n, double w) {
		switch(n) {
		case 1:
			return w * 0.75;
		case 2:
			return w * 0.39;
		case 3:
			return w * 2.65;
		case 4:
			return w * 1.17;
		case 5:
			return w * 1.05;
		case 6:
			return w * 1.23;
		default:
			return 0.0;
		}
		}
	static String planet(int n) {
		switch(n) {
		case 1:
			return "Venus";
		case 2:
			return "Mars";
		case 3:
			return "Jupiter";
		case 4:
			return "Saturn";
		case 5:
			return "Uranus";
		case 6:
			return "Neptune";
		default:
			return "Error";
		}
	}

}
