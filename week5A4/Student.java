/**
 * 
 */
package week5A4;

/**
 * @author th3pi
 *
 */
public class Student {
	String name;
	String grade;
	double gpa;
	
	public Student(String name, String grade, double gpa) {
		this.name = name;
		this.grade = grade;
		this.gpa = gpa;
	}
	
	String getName() {
		return name;
	}
	
	String getGrade() {
		return grade;
	}
	
	double getGpa() {
		return gpa;
	}
}
