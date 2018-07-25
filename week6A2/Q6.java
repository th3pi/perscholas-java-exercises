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
public class Q6 {

	/**
	 * @param args
	 */
	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Select a puzzle: \n"
				+ "puzzle1.txt \n"
				+ "puzzle2.txt");
		String s = new Scanner(System.in).nextLine();
		
		switch(s) {
		case "puzzle1.txt":
			solvePuzzle(new Scanner(new File("C:\\Users\\th3pi\\Desktop\\puzzle1.txt")));
			break;
		case "puzzle2.txt":
			solvePuzzle(new Scanner(new File("C:\\Users\\th3pi\\Desktop\\puzzle2.txt")));
			break;
		default:
			System.out.println("Invalid value");
		}
	}
	
	static void solvePuzzle(Scanner s) {
		String str = s.nextLine();
		for(int i = 2; i < str.length(); i+= 3) {
			System.out.printf("%s", str.charAt(i));
		}
	}

}
