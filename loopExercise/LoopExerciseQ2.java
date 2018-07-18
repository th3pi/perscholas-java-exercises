package loopExercise;
/*
 * @author th3pi
 */
import java.util.Scanner;
public class LoopExerciseQ2 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = 0, i = 0;
		System.out.println("Enter an integer: ");
		n = kb.nextInt();
		if(n <= 0)
			System.out.println("HEY! That's against the rules!");
		else {
			while (true){
				if(n == 1) {
					System.out.println("Enter an integer: ");
					n = kb.nextInt();
					if(n <= 0) {
						System.out.println("HEY! That's against the rules!");
						break;
					}
				}
				if(n % 2 != 0) {
					n = (n + 1) / 2;
					System.out.println(n);
				}else if (n % 2 == 0){
					n = n / 2;
					System.out.println(n);
				}
			}
		}
	}
}
