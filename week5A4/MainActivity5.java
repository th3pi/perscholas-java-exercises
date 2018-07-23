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
public class MainActivity5 {

	public static void main(String[] args) throws IOException{
		File file = new File("C:\\Users\\th3pi\\Desktop\\students.csv");
		Scanner input = new Scanner(file);
		ArrayList<String> name = new ArrayList<String>();
		ArrayList<String> grade = new ArrayList<String>();
		ArrayList<Double> gpa = new ArrayList<Double>();
		while(input.hasNextLine()) {
			String[] str = input.nextLine().split(",");
			name.add(str[0]);
			grade.add(str[1]);
			gpa.add(Double.parseDouble(str[2]));
		}
		Student2[] s = new Student2[10];
		for(int i = 0; i < s.length; i++) {
			s[i] = new Student2(name.get(i),grade.get(i),gpa.get(i));
		}
		for(Student2 stu : s) {
			System.out.println(stu.getInfo());
		}
	}

}
