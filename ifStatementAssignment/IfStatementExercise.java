package ifStatementAssignment;
/*
 * @author th3pi
 */

public class IfStatementExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Declares all the integers
		int people = 11, cats = 12, dogs = 2;

//		Compare count of people with cat
		if(people < cats)
			System.out.println("Too many cats! The world is doomed!");
		else
			System.out.println("Too few cats! The world is saved for another day!");
//		Compare count of people with dogs
		if(people < dogs) 
			System.out.println("The world is drooled on!");
		else
			System.out.println("The world is dry!");
		
	}

}
