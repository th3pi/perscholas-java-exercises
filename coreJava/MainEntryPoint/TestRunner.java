/**
 * 
 */
package coreJava.MainEntryPoint;

import coreJava.Models.*;

import java.io.IOException;

import coreJava.DAO.*;

public class TestRunner {

	public static void main(String[] args) throws IOException {
		StudentDAO s = new StudentDAO();
		CourseDAO c = new CourseDAO();
		AttendingDAO a = new AttendingDAO();
		for(Student stu : s.getStudents()) {
			System.out.println(stu.getName()+stu.getEmail()+stu.getPass());
		}
//		for(Course stu : c.getAllCourses()) {
//			System.out.println(stu.getCourseName());
//		}
//		for(Attending stu : a.getAttending()) {
//			System.out.println(stu.getCourseId());
//		}
	}

}
