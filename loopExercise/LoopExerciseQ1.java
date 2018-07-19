package loopExercise;
/*
 * @author th3pi
 */

public class LoopExerciseQ1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * For loop goes from 1 to 100
		 * if @param i is divisible by 3 without a remainder then number should be replaced by Fizz
		 * if @param is is divisible by 5 without a remaind then the number should be replaced by BuzzFizz
		 */
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
