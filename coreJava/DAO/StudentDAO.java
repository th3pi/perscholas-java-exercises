/**
 * 
 */
package coreJava.DAO;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import coreJava.Models.Student;

/**
 * @author th3pi
 */
public class StudentDAO {
	/*
	 * @param file fetches the data from Student.csv
	 * @param input reads file from Student.csv
	 * @param data adds the data from Student.csv to an Array
	 */
	public List<Student> getStudents() throws IOException{
		File file = new File("C:\\Users\\th3pi\\Desktop\\sms\\Student.csv");
		Scanner input = new Scanner(file);
		List<Student> data = new ArrayList<Student>();
		while(input.hasNextLine()) {
			String[] str = input.nextLine().split(",");
			data.add(new Student(str[0],str[1],str[2]));
		}
		input.close();
		return data;
	}
	
	/*
	 * Finds the arg student email from StudentList array.
	 */
	public Student getStudentByEmail(List<Student> studentList, String email) {
		
		for(Student s : studentList) {
			if(email.equalsIgnoreCase(s.getEmail())) {
				return s;
			}
		}
		
		return null;
	}
	
	/*
	 * Validates student password and email from the StudentList array
	 */
	public boolean validateUser(List<Student> studentList, String email, String pass) {
		for(Student s : studentList) {
			if(email.equalsIgnoreCase(s.getEmail()) && pass.equalsIgnoreCase(s.getPass())) {
				return true;
			}
		}
		return false;
	}
}
