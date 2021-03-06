/**
 * 
 */
package week5A3;

/**
 * @author th3pi
 *
 */
public class KidUser implements LibraryUser{
	int age;
	String bookType;

	
	@Override
	public void registerAccount(int age) {
		this.age = age;
		if(age < 12) {
			System.out.println("You have successfully registered under a kids account.");
		}else {
			System.out.println("Sorry, Age must be less than 12 years to register as a kid.");
		}
	}

	
	@Override
	public void requestBook(String bookType) {
		if(bookType.equalsIgnoreCase("Kids")) {
			System.out.println("Book Issued successfully, please return the book within 10 days.");
		}else {
			System.out.println("Oops, you are allowed to take only kids books.");
		}
	}
}
