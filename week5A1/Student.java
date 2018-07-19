/**
 * 
 */
package week5A1;

/**
 * @author th3pi
 *
 */
public class Student {
	private String name;
	private char grade;
	private double GPA;
	
	public void setName(String name) {
		this.name = name;
	}
	void setGrade(char grade) {
		this.grade = grade;
	}
	void setGPA(double GPA) {
		this.GPA = GPA;
	}
	String getName() {
		return name;
	}
	char getGrade() {
		return grade;
	}
	double getGPA() {
		return GPA;
	}
}
