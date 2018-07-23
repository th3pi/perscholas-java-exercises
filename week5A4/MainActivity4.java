/**
 * 
 */
package week5A4;

import java.io.File;
import java.io.IOException;
import java.util.*;

/**
 * @author th3pi
 *
 */
public class MainActivity4 {
	public static void main(String[] args)throws IOException {
		ArrayList<String> nameArr = new ArrayList<String>();
		ArrayList<String> gradeArr = new ArrayList<String>();
		ArrayList<Double> gpaArr = new ArrayList<Double>();
		File nameFile = new File("C:\\Users\\th3pi\\Desktop\\names.txt");
		Scanner inputName = new Scanner(nameFile);
		File gradeFile = new File("C:\\Users\\th3pi\\Desktop\\grades.txt");
		Scanner inputGrade = new Scanner(gradeFile);
		File gpaFile = new File("C:\\Users\\th3pi\\Desktop\\gpa.txt");
		Scanner inputGpa = new Scanner(gpaFile);
		while(inputName.hasNextLine()) {
			nameArr.add(inputName.nextLine());
		}
		while(inputGrade.hasNextLine()) {
			gradeArr.add(inputGrade.nextLine());
		}
		while(inputGpa.hasNextLine()) {
			gpaArr.add(Double.parseDouble(inputGpa.nextLine()));
		}
		Student2[] s = new Student2[10];
		for(int i = 0; i < s.length; i++) {
			s[i] = new Student2(nameArr.get(i),gradeArr.get(i),gpaArr.get(i));
		}
		for(Student2 stu : s) {
			System.out.println(stu.getInfo());
		}
	}

}
