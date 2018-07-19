package week5A1;
import java.util.Scanner;
/**
 * @author th3pi
 *
 */
public class StudentMain1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		//Instantiate 3 students
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		//to hold average
		double avg = 0;
		
		//Get values from user for Student 1
		System.out.println("Enter Student 1's name: ");
		s1.setName(kb.nextLine());
		System.out.println("Enter Student 1's grade: ");
		s1.setGrade(kb.next().charAt(0));
		System.out.println("Enter Student 1's GPA: ");
		s1.setGPA(kb.nextDouble());
		kb.nextLine();
		
		//Get values from user for Student 2
		System.out.println("Enter Student 2's name: ");
		s2.setName(kb.nextLine());
		System.out.println("Enter Student 2's grade: ");
		s2.setGrade(kb.next().charAt(0));
		System.out.println("Enter Student 2's GPA: ");
		s2.setGPA(kb.nextDouble());
		kb.nextLine();
		
		//Get values from user for Student 3
		System.out.println("Enter Student 3's name: ");
		s3.setName(kb.nextLine());
		System.out.println("Enter Student 3's grade: ");
		s3.setGrade(kb.next().charAt(0));
		System.out.println("Enter Student 3's GPA: ");
		s3.setGPA(kb.nextDouble());
		kb.nextLine();
		
		
		/*
		 * Calculates the average GPA of all 3 students.
		 * Using the equation avg = (total of all 3 student gpa) / (number of students);
		 */
		avg = ((s1.getGPA()+s2.getGPA()+s3.getGPA())/3);
		System.out.printf("Average GPA for 3 students is: %.2f", avg); //prints average GPA with 2 max value after decimal
	}

}
