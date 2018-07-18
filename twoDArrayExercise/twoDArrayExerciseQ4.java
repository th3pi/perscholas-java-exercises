/**
 * 
 */
package twoDArrayExercise;
import java.util.Scanner;
/**
 * @author th3pi
 *
 */
public class twoDArrayExerciseQ4 {
	public static void main(String[] args) {
		
		
		Scanner kb = new Scanner(System.in);
		char[][] map = new char[5][5];
		
		//Setting up the map with ground
		for(int i = 0; i < map.length; i++) {
			for(int j = 0; j < map[0].length; j++) {
				map[i][j]='0';
			}
		}
		
		//Default value of the avatar
		int row = 0, col = 0;
		map[row][col] = 'X';
		
		//Display map for the first time
		displayMap(map);
		
		
		//Forever do-while loop that keeps on going until the user exits map (goes out of bounds)
		do{System.out.println("Where would you like to move? You have 4 options: \n"
				+ "1. Up \n"
				+ "2. Down \n"
				+ "3. Right \n"
				+ "4. Left \n");
			String s = kb.nextLine();
			//What happens if user goes up
			if(s.equalsIgnoreCase("Up")) {
				map[row][col] = '0';	//Avatar's last location becomes empty
				row--;					//Row reduces by one
				checkBounds(row);		//Checks if avatar is inside bounds
				map[row][col] = 'X';	//Avatar's new position
				displayMap(map);		//Displays updated map
			}else if(s.equalsIgnoreCase("Down")) {
				map[row][col] = '0';	
				row++;
				checkBounds(row);
				map[row][col] = 'X';
				displayMap(map);
			}else if(s.equalsIgnoreCase("Right")) {
				map[row][col] = '0';
				col++;
				checkBounds(col);
				map[row][col] = 'X';
				displayMap(map);
			}else if(s.equalsIgnoreCase("Left")) {
				map[row][col] = '0';
				col--;
				checkBounds(col);
				map[row][col] = 'X';
				displayMap(map);
			}
		}while(true);		//While true means the loop will go on forever
	}
	
	
	//Method to display the map
	static void displayMap(char[][] map) {
		System.out.println("Current map: \n"
				+ "==============");
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				System.out.print(map[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	//Method to check if the avatar is going out of the map
	static void checkBounds(int i) {
		if(i < 0) {
			System.out.println("You just exitted the map. Closing game.");
			System.exit(0);
		}else if(i > 4) {
			System.out.println("You just exitted the map. Closing game.");
			System.exit(0);
		}
	}
}
