/**
 * 
 */
package week5A4;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author th3pi
 *
 */
public class MainActivity2 {

	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\th3pi\\Desktop\\courseCode.txt");
		File file2 = new File("C:\\Users\\th3pi\\Desktop\\courseName.txt");
		ArrayList<String> data = new ArrayList<String>();
		ArrayList<String> data2 = new ArrayList<String>();
		Scanner input = new Scanner(file);
		Scanner input2 = new Scanner(file2);
		while(input.hasNextLine()) {
			data.add(input.nextLine());
		}
		while(input2.hasNextLine()) {
			data2.add(input2.nextLine());
		}
		
		for(int i = 0; i < data.size(); i++) {
			System.out.println(data.get(i) + " - " + data2.get(i));
		}
	}

}
