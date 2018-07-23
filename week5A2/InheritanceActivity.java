/**
 * 
 */
package week5A2;

/**
 * @author th3pi
 *
 */
public class InheritanceActivity {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Test case #1
		 */
		//Invokes the salary method from parent class to calculate real salary
		//Invokes the calculateTransportAllowance method to calculate their transportation allowance
		Manager m = new Manager(126534,"Peter","Chennai India",237844,65000);
		System.out.printf("Manager Peter's salary is %.2f \n"
				+ "And his transport allowance is %.2f \n",m.calculateSalary(),m.calculateTransportAllowance());
		/*
		 * Test case #2
		 */
		Trainee t = new Trainee(29846,"Jack","Mumbai India",442085,45000);
		
		
		//Invokes the salary method from parent class to calculate real salary
		//Invokes the calculateTransportAllowance method to calculate their transportation allowance
		System.out.printf("Trainee Jack's salary is %.2f \n"
				+ "And his transport allowance is %.2f",t.calculateSalary(),t.calculateTransportAllowance()); 
		
		
	}

}
