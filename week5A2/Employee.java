/**
 * 
 */
package week5A2;

/**
 * @author th3pi
 *
 */
public class Employee {
	private long employeeId;
	private String employeeName;
	private String employeeAddress;
	private long employeePhone;
	protected double basicSalary;
	private double specialAllowance = 250.80;
	private double hra = 1000.50;
	
	public Employee(long Id, String name, String address, long phone, double salary) {
		this.employeeId = Id;
		this.employeeName = name;
		this.employeeAddress = address;
		this.employeePhone = phone;
		this.basicSalary = salary;
	}
	
	double calculateSalary() {
		return this.basicSalary + ((this.basicSalary*this.specialAllowance) / 100) + ((this.basicSalary * this.hra) / 100);
	}
	double calculateTransportAllowance() {
		return this.basicSalary * 0.1;
	}
	
}
