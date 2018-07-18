package twoDArrayExercise;
/*
 * @author th3pi
 */
import java.util.Scanner;
public class twoDArrayExerciseQ3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] arr = {
				{' ',' ',' '},
				{' ',' ',' '},
				{' ',' ',' '}
		};
		Scanner kb = new Scanner(System.in);
		int[] row = new int[9];
		int[] col = new int[9];
		for(int i = 1; i < 10; i++) {
			if(i % 2 == 0) {
				System.out.println("Enter row for the Y team: ");
				row[i] = kb.nextInt();
				System.out.println("Enter column for the Y team: ");
				col[i] = kb.nextInt();
				arr[row[i]][col[i]] = 'Y';
			}else {
				System.out.println("Enter row for the X team: ");
				row[i] = kb.nextInt();
				System.out.println("Enter column for the X team: ");
				col[i] = kb.nextInt();
				arr[row[i]][col[i]] = 'X';
			}
			for(int k = 0; k < arr.length; k++) {
				for(int j = 0; j < arr[0].length; j++) {
					System.out.print("[" + arr[k][j] + "]");
				}
				System.out.println();
			}
		}
	}
		
		
}


