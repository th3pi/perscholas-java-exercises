/**
 * 
 */
package coreJava.DAO;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import coreJava.Models.Attending;
import coreJava.Models.Course;
/**
 * @author th3pi
 *
 */
public class AttendingDAO {
	
	public List<Attending> getAttending()throws IOException{
		File file = new File("C:\\Users\\th3pi\\Desktop\\sms\\Attending.csv");
		Scanner input = new Scanner(file);
		List<Attending> data = new ArrayList<Attending>();
		while(input.hasNextLine()) {
			String[] str = input.nextLine().split(",");
			data.add(new Attending(Integer.parseInt(str[0]),str[1]));
		}
		input.close();
		return data;
	}
	
	public void registerStudentToCourse(List<Attending> attending, String student_email, int course_id)throws IOException {
		boolean flag = false;
		for(Attending a : attending) {
			if(student_email.equalsIgnoreCase(a.getStudentEmail()) && course_id == a.getCourseId()) {
				flag = true;
				break;
			}
		}
		if(!flag) {
			attending.add(new Attending(course_id,student_email));
			saveAttending(attending);
		}
	}
	public List<Course> getStudentCourses(List<Attending> attending, String studentEmail)throws IOException{
		List<Course> courseData = new ArrayList<Course>();
		List<Course> attendingCourse = new ArrayList<Course>();
		for(Attending a : attending) {
			if(studentEmail.equalsIgnoreCase(a.getStudentEmail())) {
				CourseDAO c =  new CourseDAO();
				courseData = c.getAllCourses();
				for(Course i : courseData) {
					if(i.getCourseId() == a.getCourseId()) {
						attendingCourse.add(i);
					}
				}
			}
		}
		return attendingCourse;
	}
	public void saveAttending(List<Attending> attending) throws IOException {
		File file = new File("C:\\Users\\th3pi\\Desktop\\sms\\Attending.csv");
		PrintStream fileStream = new PrintStream(file);
		Scanner input = new Scanner(file);
		for(Attending a : attending) {
			fileStream.println(a.getCourseId() + ","+a.getStudentEmail());
		}
		fileStream.close();
	}
}
