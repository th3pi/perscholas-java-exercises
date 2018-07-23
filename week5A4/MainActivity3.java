/**
 * 
 */
package week5A4;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
/**
 * @author th3pi
 *
 */
public class MainActivity3 {

	/**
	 * @param args
	 */
	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter your name: ");
		String name = kb.nextLine();
		System.out.println("Enter your grade: ");
		String grade = kb.nextLine();
		System.out.println("Enter your gpa: ");
		double gpa = kb.nextDouble();
		Student s = new Student(name,grade,gpa);
		
		File nameFile = new File("C:\\Users\\th3pi\\Desktop\\names.txt");
		FileWriter nameWrite = new FileWriter(nameFile,true);
		if(!nameFile.exists()) {
			nameFile.createNewFile();
		}
		nameWrite.write(s.getName());
		nameWrite.close();
		File gradeFile = new File("C:\\Users\\th3pi\\Desktop\\grades.txt");
		FileWriter gradeWriter = new FileWriter(gradeFile,true);
		if(!gradeFile.exists()) {
			gradeFile.createNewFile();
		}
		gradeWriter.write(s.getGrade());
		gradeWriter.close();
		File gpaFile = new File("C:\\Users\\th3pi\\Desktop\\gpa.txt");
		FileWriter gpaWriter = new FileWriter(gpaFile,true);
		if(!gpaFile.exists()) {
			gpaFile.createNewFile();
		}
		gpaWriter.write((Double.toString(s.getGpa())));
		gpaWriter.close();
	}

}
