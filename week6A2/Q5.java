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
public class Q5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		System.out.println("Which file do you like? We got: \n"
				+ "num1.txt \n"
				+ "num2.txt \n"
				+ "num3.txt \n"
				+ "num4.txt ");
		String s = new Scanner(System.in).nextLine();
		
		switch(s) {
		case "num1.txt":
			calculateFile(new Scanner(new File("C:\\Users\\th3pi\\Desktop\\num1.txt")));
			break;
		case "num2.txt":
			calculateFile(new Scanner(new File("C:\\Users\\th3pi\\Desktop\\num2.txt")));
			break;
		case "num3.txt":
			calculateFile(new Scanner(new File("C:\\Users\\th3pi\\Desktop\\num3.txt")));
			break;
		case "num4.txt":
			calculateFile(new Scanner(new File("C:\\Users\\th3pi\\Desktop\\num4.txt")));
			break;
		default:
			System.out.println("Invalid file selected.");
		}
	}
	
	static void calculateFile(Scanner s) {
		String[] str = s.nextLine().split(" ");
		int a = 0;
		for(int i = 0; i < 3; i++) {
			a += Integer.parseInt(str[i]);
		}
		System.out.println(a);
	}

}
