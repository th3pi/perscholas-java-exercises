package twoDArrayExercise;
/*
 * @author th3pi
 */
public class twoDArrayExerciseQ1 {
	public static void main(String[] args) {
		
		/*
		 * @param 2d array initialized with values
		 * 2 rows and 6 columns.
		 */
		int[][] arr = {
						{2,3,4,5,6,7},
						{5,2,8,10,4,6}
					};
		/*
		 * @param largest assumes that the largest value in the array is being held by 
		 * the first element at row 0 column 0. The for loop goes through each element in the array
		 * comparing them with the largest variable. If the element's value is larger 
		 * than the largest variable's value - largest variable gets assigned a new a value
		 * same as the current element's value. This keeps on happening until the loop reaches
		 * end of the array.
		 */
		int largest = arr[0][0];
		for(int i = 0; i < 6; i++) {
			for(int j = 0; j < 2; j++) {
				if(arr[j][i] > largest) {
					largest = arr[j][i];
				}
			}
		}
		
//		prints out the largest value in the 2d array
		
		System.out.println(largest);
	}
}
