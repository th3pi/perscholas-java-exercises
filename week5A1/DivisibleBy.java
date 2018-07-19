/**
 * Create two functions:

public static boolean isEven( int n )
The function should return the value true if n is an even number (divisible by 2) and false otherwise.

And

public static boolean isDivisibleBy3( int n )
The function should return the value true if n is evenly divisible by 3 and false otherwise.

Write a main() that contains a for loop to generate all the numbers from 1 to 20. Use if statements 
inside the loop to mark the number with a "<" if it's even, with a "=" if it's evenly divisible by 3, 
and with both if it's divisible by both 2 and 3.

For example, numbers 1-6 would look like this:
1
2 <
3 =
4 <
5
6 <
6 =
 */
package week5A1;

/**
 * @author th3pi
 *
 */
public class DivisibleBy {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Creates a for loop that iterates from 1 to 20. Checks which numbers are divisible by 2 and 3
		 * without having a remainder. If a number is divisible by both, they are displayed twice.
		 * Numbers divisible by are indicated by <
		 * Numbers divisible by are indicated by =
		 */
		for(int i = 1; i <=20; i++) {
			if(isEven(i)) { //Checks if number is even
				System.out.printf("%d < \n", i); //If yes display with even indicator
				if(isDivisibleBy(i))	//Checks if the same number is also divisible by 3
					System.out.printf("%d = \n", i); //If yes then number is printed again with divisble by 3 indicator
			}
			else if(isDivisibleBy(i)) { //Checks if number is divisible by if 3
				System.out.printf("%d = \n", i); //If yes prints out the number with divisible by 3 indicator
			}
			else //If number is not divisible by either
				System.out.printf("%d \n", i); //Just prints out the number with a blank space next to it
		}
		
	}
	static boolean isEven(int n) {
		return n % 2 == 0; //return true if number is divided by 2 without any remainder as a result
	}
	static boolean isDivisibleBy(int n) {
		return n % 3 == 0; //return true if number is divided by 3 without any remainder as a result
	}
}
