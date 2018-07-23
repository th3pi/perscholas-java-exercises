/**
 * 
 */
package week5A2;

/**
 * @author th3pi
 *
 */
public class Manager extends Employee {

	/**
	 * @param Id refers to the Manager Id
	 * @param name refers to the Manager name
	 * @param address refers to the Manager address
	 * @param phone refers to the Manager phone number
	 */
	public Manager(long Id, String name, String address, long phone, double salary) {
		super(Id, name, address, phone, salary);
		// TODO Auto-generated constructor stub
	}
	/*
	 * Unlike default transportAllowance which is 10%. Manager gets 15%.
	 */
	@Override
	public double calculateTransportAllowance() {
		return 0.15	* basicSalary;
	}
}
