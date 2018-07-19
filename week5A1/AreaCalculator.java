/**
 * 
 */
package week5A1;
import java.util.Scanner;
/**
 * @author th3pi
 *
 */
public class AreaCalculator {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		int c;
		
		//Do-while loop that goes on forever until user quits.
		do {
			//Menu options
			System.out.println("What do you want to calculate? Enter between 1 - 4 \n"
					+ "1. Circle Area \n"
					+ "2. Rectangle Area \n"
					+ "3. Square Area \n"
					+ "4. Triangle Area \n"
					+ "0. To exit");
			c = kb.nextInt(); //Choice storage variable
			
			//Switch case based on all user choice
			switch(c) {
			case 1: //If user picks 1 Circle radius gets calculated
				System.out.println("Enter radius: "); //Takes radius from user
				System.out.printf("Circle area is: %.2f \n", area_circle(kb.nextDouble())); //Calculates and displays circle area
				break;
			case 2: //If user picks 2 rectangle area gets calculated
				System.out.println("Enter length: "); //Takes length from user
				int l = kb.nextInt();
				System.out.println("Enter width: "); //Takes width from user
				int w = kb.nextInt();
				System.out.printf("Rectange area is: %d \n", area_rectangle(l,w)); //Calculates and displays rectangle area
				break;
			case 3: //If user picks 3 square area gets calculated
				System.out.println("Enter side size: ");	//Takes one side size from user
				System.out.printf("Square area is: %d \n", area_square(kb.nextInt()));	//Calculates and display square area
				break;
			case 4: //If user picks 4 triangle area gets calculated
				System.out.println("Enter base: "); //Takes base size from user
				double b = kb.nextDouble();
				System.out.println("Enter height"); //Takes height size from user
				double h = kb.nextDouble();
				System.out.printf("Triange area is: %.2f \n", area_triangle(b,h)); //Calculates and displays triangle area
				default: break; //Switch statement breaks if anything other than the menu option's entered.
			}
		}while(c != 0);
		System.out.println("See ya soon!");
	}
	static double area_circle(double r) {
		return Math.PI * (r*r); // returns circle area based on pi * radius^2 formula for circle area
	}
	static int area_rectangle(int l, int w) {
		return l * w;	//returns rectangle area based on length * width formula for rectangle area
	}
	static int area_square(int side) {
		return side * side;	//returns square area based on side * side formula for square area
	}
	static double area_triangle(double b, double h) {
		return 0.5 * (b * h);	//returns triangle area based on 0.5 * height * base formula for triangle area
	}
}
