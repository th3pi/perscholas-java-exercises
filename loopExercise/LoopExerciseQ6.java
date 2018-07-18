package loopExercise;
/*
 * @author th3pi
 */
import java.util.Scanner;
public class LoopExerciseQ6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter an expression for me to calculate: ");
		String s = kb.nextLine();
		if(s.charAt(0) == '0') {
			System.exit(0);
		}
		String[] splt = s.split(" ");
		
		Double d1 = Double.parseDouble(splt[0]);
		Double d2 = Double.parseDouble(splt[2]);
		
		switch(evaluateType(splt[1])) {
		case "*":
			System.out.println(d1 * d2);
			break;
		case "/":
			System.out.println(d1 / d2);
			break;
		case "+":
			System.out.println(d1 + d2);
			break;
		case "-":
			System.out.println(d1 - d2);
			break;
		}
		
	}
	
	static String evaluateType(String s) {
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == '*') {
				return "*";
			}else if(s.charAt(i) == '/'){
				return "/";
			}else if(s.charAt(i) == '+'){
				return "+";
			}else if(s.charAt(i) == '-'){
				return "-";
			}
		}
		return "+";
	}
}
