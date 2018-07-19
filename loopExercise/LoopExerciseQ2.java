package loopExercise;
/*
 * @author th3pi
 */
import java.util.Scanner;
public class LoopExerciseQ2 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		/*
		 * This program asks user for an input and then divides it down to 1 by 2.
		 * if the value is an odd number add +1 first then divides.
		 * User cannot enter 0 as its against the business rules.
		 * Program throws an error if user does so.
		 */
		int n = 0, i = 0;
		System.out.println("Enter an integer: ");
		n = kb.nextInt();
		if(n <= 0)
			System.out.println("HEY! That's against the rules!");
		else {
			/*
			 * If user enters anything but 0 a forever while loop is initiated
			 * @param n holds an integer taken from user and then divides it down to
			 * 1 and then breaks when it does so.
			 */
			while (true){
				if(n == 1) {
					System.out.println("Enter an integer: "); //If user enters 1, there's nothing the program can do so it loops
					n = kb.nextInt();
					if(n <= 0) {
						System.out.println("HEY! That's against the rules!");
						break;
					}
				}
				if(n % 2 != 0) { //If user integer is not divisible by 2, add + 1 and then divide
					n = (n + 1) / 2;
					System.out.println(n);
				}else if (n % 2 == 0){ //If integer is divisible by 2, just go ahead
					n = n / 2;
					System.out.println(n);
				}
			}
		}
	}
}
