package ifStatementAssignment;
/*
 * @author th3pi
 */
public class IfStatementExerciseQ3 {

		public static void main(String[] args) {
//			Declares all the integers
			int people = 11, cars = 12, buses = 2;

//			Compare count of people with cat
			if(people < cars)
				System.out.println("We should take the car.");
			else if(cars < people)
				System.out.println("Too few cats! The world is saved for another day!");
			else
				System.out.println("We can't decide.");
//			Compare count of people with dogs
			if(buses < cars) 
				System.out.println("Maybe we should take the buses.");
			else if(cars < buses)
				System.out.println("That's too many buses");
			else
				System.out.println("We still can't decide.");
			
			if(people > buses)
				System.out.println("Alright, let's just take the buses");
			else
				System.out.println("Let's just take the cars.");
			
		}
}
