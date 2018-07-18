package loopExercise;
/*
 * @author th3pi
 */
public class LoopExerciseQ7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 4;
		for(int i = 1; i <= 3; i++) {
			if(i == 1) {
				System.out.println("1.");
				for(int j = 0; j <= 5; j++) {
					System.out.println("88888888");
				}
			}else if( i == 2) {
				System.out.println("2.");
				for(int l = 1; l <= 4; l++) {
					for(int k = 5; k > l; k--) {
						System.out.print("8");
					}
					System.out.println();
				}
			}else if( i == 3) {
				System.out.println("3. ");
			}
		}
	}

}
