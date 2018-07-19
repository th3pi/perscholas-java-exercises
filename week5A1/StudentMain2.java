/**
 * 
 */
package week5A1;
import java.util.Scanner;
/**
 * @author th3pi
 *
 */
public class StudentMain2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Instantiate 3 student classes as an array
		Scanner kb = new Scanner(System.in);
		double avg = 0; //Average initialized with a 0 value
		Student[] s = new Student[3];
		
		/*
		 * For loops iterate 3 times asking user for
		 * Student name
		 * Student Grade
		 * Student GPA
		 * and stores it in the student object using mutators declared in the Student class.
		 */
		for(int i = 0; i < s.length; i++) {
			s[i] = new Student();
			System.out.printf("Print your name, Stundent %d: \n", (i+1));
			s[i].setName(kb.nextLine());
			System.out.printf("Print your grade, Student %d: \n", (i+1));
			s[i].setGrade(kb.next().charAt(0));
			System.out.printf("Print your GPA, Student %d: \n", (i+1));
			s[i].setGPA(kb.nextDouble());
			kb.nextLine();
		}
		
		/*
		 * Calculates the average GPA of all 3 students.
		 * Using the equation avg = (total of all 3 student gpa) / (number of students);
		 */
		avg = ((s[0].getGPA()+s[1].getGPA()+s[2].getGPA())/ 3);
		System.out.printf("You guys have an average GPA of: %.2f \n", avg);
		
		System.out.println("---------------------------------------"); //This line exists only for formatting purposes.
		
		/*
		 * Loops through all the student data gathered chronologically
		 * e.g
		 * Student 1's name is John
		 * Student 1's grade is A
		 * Student 1's GPA is 4.00
		 */
		for(int i = 0; i < 3; i++) {
			System.out.printf("Student %d's name is %s \n",(i+1),s[i].getName());
			System.out.printf("Student %d's grade is %c \n",(i+1),s[i].getGrade());
			System.out.printf("Student %d's GPA is %.2f \n",(i+1),s[i].getGPA());
			System.out.println("------------------------");
		}
	}

}
