/**
 * 
 */
package week5A4;

/**
 * @author th3pi
 *
 */
public class Student2 {
	String name;
	String grade;
	double gpa;
	
	public Student2(String name, String grade, double gpa) {
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
	
	String getInfo() {
		return String.format("My name is %s. I'm in grade %s and I have a %.2f GPA. For now, at least...", name, grade, gpa);
	}
}
