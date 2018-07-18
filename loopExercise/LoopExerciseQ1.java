package loopExercise;
/*
 * @author th3pi
 */

public class LoopExerciseQ1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 1; i <= 100; i++) {
			if(i % 3 == 0)
				System.out.println("Fizz");
			else if(i % 5 == 0)
				System.out.println("BuzzFizz");
			else
				System.out.println(i);
		}
	}

}
