package twoDArrayExercise;
/*
 * @author th3pi
 */
public class twoDArrayExerciseQ1 {
	public static void main(String[] args) {
		int[][] arr = {
						{2,3,4,5,6,7},
						{5,2,8,10,4,6}
					};
		
		int largest = arr[0][0];
		for(int i = 0; i < 6; i++) {
			for(int j = 0; j < 2; j++) {
				if(arr[j][i] > largest) {
					largest = arr[j][i];
				}
			}
		}
		System.out.println(largest);
	}
}
