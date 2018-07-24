/**
 * 
 */
package coreJava.Models;

/**
 * @author th3pi
 *
 */
public class Attending {
	private int courseId;
	private String studentEmail;
	
	public Attending() {
		courseId = 0;
		studentEmail = "";
	}
	
	public Attending(int courseId, String studentEmail) {
		this.courseId = courseId;
		this.studentEmail = studentEmail;
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
	 * @return the studentEmail
	 */
	public String getStudentEmail() {
		return studentEmail;
	}

	/**
	 * @param studentEmail the studentEmail to set
	 */
	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}
	
}
