/**
 * 
 */
package coreJava.Models;

/**
 * @author th3pi
 *
 */
public class Course {
	private int courseId;
	private String courseName;
	private String instructorName;
	
	public Course() {
		courseId = 0;
		courseName = "";
		instructorName = "";
	}
	public Course(int courseId, String courseName, String instructorName) {
		this.courseId = courseId;
		this.courseName = courseName;
		this.instructorName = instructorName;
	}
	/**
	 * @return the courseId
	 */
	public int getCourseId() {
		return courseId;
	}
	/**
	 * @param courseId the courseId to set
	 */
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	/**
	 * @return the courseName
	 */
	public String getCourseName() {
		return courseName;
	}
	/**
	 * @param courseName the courseName to set
	 */
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	/**
	 * @return the instructorName
	 */
	public String getInstructorName() {
		return instructorName;
	}
	/**
	 * @param instructorName the instructorName to set
	 */
	public void setInstructorName(String instructorName) {
		this.instructorName = instructorName;
	}
}
