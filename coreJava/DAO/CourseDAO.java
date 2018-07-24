/**
 * 
 */
package coreJava.DAO;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import coreJava.Models.Course;

/**
 * @author th3pi
 *
 */
public class CourseDAO {
	
	public List<Course> getAllCourses()throws IOException{
		File file = new File("C:\\Users\\th3pi\\Desktop\\sms\\Courses.csv");
		Scanner input = new Scanner(file);
		List<Course> data = new ArrayList<Course>();
		while(input.hasNextLine()) {
			String[] str = input.nextLine().split(",");
			data.add(new Course(Integer.parseInt(str[0]),str[1],str[2]));
		}
		input.close();
		return data;
	}
}
