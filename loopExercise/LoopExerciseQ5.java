package loopExercise;
/*
 * @author th3pi
 */
public class LoopExerciseQ5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 10; i <= 20; i++) {
			if(i == 16) {
				continue;
			}else if( i % 2 == 0) {
				System.out.println(i);
			}
		}
		for(int i = 10; i <= 20; i = i + 2) {
			if(i == 16)
				continue;
			else
				System.out.println(i);
		}
		
		for(int i = 10;;i++) {
			if(i == 16) {
				continue;
			}else if( i % 2 == 0) {
				System.out.println(i);
			}else if( i > 20) {
				break;
			}
		}
	}

}
