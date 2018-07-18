package arrayExercise;
/*
 * @author th3pi
 */
public class ArrayExerciseQ1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {1,2,3,4,5,6,7,8,9,10};
		int[] arr2 = new int[10];
		
		System.arraycopy(arr1, 0, arr2, 0, arr1.length);
		
		for(int x : arr2) {
			System.out.println(x);
		}
	}

}
