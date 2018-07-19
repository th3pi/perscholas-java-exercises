/**
 * 
 */
package week5A1;
import java.util.Scanner;
/**
 * @author th3pi
 *
 */
public class PythagoreanTheorum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		
		//Initialize variables
		double l,h;
		
		//Get values from user
		System.out.println("Enter length of the triangle: ");
		l = kb.nextDouble();
		System.out.println("Enter height of the triangle: ");
		h = kb.nextDouble();
		
		//Calling the method and getting hypotenuse results.
		System.out.printf("The hypotenuse is : %.2f", calcH(l,h));
		
	}
	
	static double calcH(double a, double b) {
		return Math.sqrt((a*a)+(b*b)); //Calculates and returns the hypotenuse based on the sqrt(a^2 + b^2) formula.
	}

}
