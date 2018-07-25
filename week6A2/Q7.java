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
public class Q7 {

	/**
	 * @param args
	 */
	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		File file = new File("C:\\Users\\th3pi\\Desktop\\CrazyTextModified.txt");
		file.createNewFile();
		Scanner input = new Scanner(new File("C:\\Users\\th3pi\\Desktop\\CrazyText.txt"));
		PrintStream fileStream = new PrintStream(file);
		while(input.hasNextLine()) {
			fileStream.println(input.nextLine());
		}
		fileStream.close();
	}

}
