/**
 * 
 */
package week5A1;

import java.util.Scanner;

/**
 * @author th3pi
 *
 */
public class StudentMain3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		double avg = 0; //Variable for the average value
		double total = 0; //Variable for the total GPA value
		int numberStudents; //Variable for total number of students
		
		//Get how many student from user and instantiate an array
		System.out.println("How many students do you have?");
		numberStudents = kb.nextInt();
		Student[] s = new Student[numberStudents];
	
		//for loop goes through each student and gathers all the data
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
		
		//Calculates total GPA
		for(Student d : s) {
			total += d.getGPA();
		}
		avg = (total/ s.length); //Calculates average GPA
		
		//Print the average GPA.
		System.out.printf("You guys have an average GPA of: %.2f \n", avg);
		System.out.println("---------------------------------------");
		
		/*
		 * Loops through all the student data gathered chronologically
		 * e.g
		 * Student 1's name is John
		 * Student 1's grade is A
		 * Student 1's GPA is 4.00
		 */
		for(int i = 0; i < s.length; i++) {
			System.out.printf("Student %d's name is %s \n",(i+1),s[i].getName());
			System.out.printf("Student %d's grade is %c \n",(i+1),s[i].getGrade());
			System.out.printf("Student %d's GPA is %.2f \n",(i+1),s[i].getGPA());
			System.out.println("------------------------");
		}
	}
}
