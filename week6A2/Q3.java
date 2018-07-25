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
public class Q3 {

	/**
	 * @param args
	 */
	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		File file = new File("C:\\Users\\th3pi\\Desktop\\score.txt");
		Scanner input = new Scanner(file);
		if(!input.hasNextLine()) {
			file.createNewFile();
		}
		Scanner kb = new Scanner(System.in);
		Formatter fmt = new Formatter(file);
		
		System.out.println("Enter your name: ");
		String name = kb.nextLine();
		System.out.println("Enter your math score: ");
		int score = kb.nextInt();
		fmt.format("%s got a %d in the Math test %n", name,score);
		fmt.close();
	}

}
