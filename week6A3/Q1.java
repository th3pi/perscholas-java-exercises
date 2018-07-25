/**
 * 
 */
package week6A3;
import java.util.*;
/**
 * @author th3pi
 *
 */
public class Q1 {
	public static void main(String[] args) {
		
		//Q1
		ArrayList<String> str = new ArrayList<String>();
		str.addAll(Arrays.asList("Red","Green","Orange","White","Black"));
		sorting(str);
	}
	
	//Q2
	
	static void iterateThru(List<String> str) {
		for(String s : str) {
			System.out.printf("Today's color is %s",s);
		}
	}
	
	//Q3
	
	static void changeFifth(List<String> str) {
		str.set(4,"Magenta");
	}
	
	//Q4
	
	static void removing(List<String> str) {
		str.remove(2);
	}
	
	//Q5
	
	static void searching(List<String> str, String color) {
		boolean flag = false;
		for(int i = 0; i < str.size(); i++) {
			if(color.equals(str.get(i))) {
				flag = true;
			}else {
				flag = false;
			}
		}
		System.out.println(flag);
	}
	
	//Q6
	
	static void sorting(List<String> str) {
		Collections.sort(str);
		System.out.println(str);
	}
}
