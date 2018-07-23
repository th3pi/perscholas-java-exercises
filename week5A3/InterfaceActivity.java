/**
 * 
 */
package week5A3;

/**
 * @author th3pi
 *
 */
public class InterfaceActivity {
	public static void main(String[] args) {
		
		/*
		 * Test case #1
		 */
		System.out.println("---------Kid User Test Case---------");
		KidUser k = new KidUser();
		
		
		//Should be valid test since age requirement is less than 10.
		k.registerAccount(10);
		
		//Should be invalid test since above age requirement.
		k.registerAccount(18);
		
		//Should be valid since kids can only borrow kids book.
		k.requestBook("Kids");
		
		//Should be invalid since kids cannot borrow fiction book.
		k.requestBook("Fiction");
		
		/*
		 * Test case #2
		 */
		System.out.println("---------Adult User Test Case---------");
		AdultUser a = new AdultUser();
		
		//Should be invalid since user need to above 12 to be registered as an adult
		a.registerAccount(5);
		
		//Should be valid since age is high
		a.registerAccount(23);
		
		//Should be invalid since adults cannot borrow kids book
		a.requestBook("Kids");
		
		//Should be valid since adults are allowed to borrow fiction books.
		a.requestBook("Fiction");
	}

}
