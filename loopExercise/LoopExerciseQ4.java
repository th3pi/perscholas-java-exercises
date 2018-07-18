package loopExercise;
/*
 * @author th3pi
 */
import java.util.Scanner;
public class LoopExerciseQ4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.println("What's the maximum x value? ");
		int x = kb.nextInt();
		System.out.println("What's the maximum y value? ");
		int y = kb.nextInt();
		for(int i = 0; i <= x; i++) {
			for(int j = 0; j <= y; j++) {
				System.out.printf("(%d,%d)\n",i,j);
			}
		}
	}

}
