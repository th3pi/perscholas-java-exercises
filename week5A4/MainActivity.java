/**
 * 
 */
package week5A4;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author th3pi
 *
 */
public class MainActivity {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		File file = new File("C:\\Users\\th3pi\\Desktop\\file.txt");
		Scanner r = new Scanner(file);
		String s = "";
		while(r.hasNextLine()) {
			s += r.nextLine();
		}
		for(int i = s.length()-1; i >= 0; i--) {
			System.out.print(s.charAt(i));
		}
	}

}
