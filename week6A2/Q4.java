/**
 * 
 */
package week6A2;
import java.util.*;
import java.io.*;
/**
 * @author th3pi
 *
 */
public class Q4 {

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(new File("C:\\Users\\th3pi\\Desktop\\num1.txt"));
		String[] str = input.nextLine().split(" ");
		int a = 0;
		for(int i = 0; i < 3; i++) {
			a += Integer.parseInt(str[i]);
		}
		System.out.println(a);
	}

}
