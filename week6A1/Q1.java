/**
 * 
 */
package week6A1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.*;
import java.util.*;
/**
 * @author th3pi
 *
 */
public class Q1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		List<String> str = new ArrayList<>();
		File file = new File("C:\\Users\\th3pi\\Desktop\\largestFile.txt");
		longestWordInTheFile(file, str);
		
	}
	
	static void readFile(File file) throws FileNotFoundException {
		Scanner input = new Scanner(file);
		while(input.hasNextLine()) {
			System.out.println(input.nextLine());
		}
	}
	
	static void readFileStoreItToAVariable(File file, String str)throws IOException {
		Scanner input = new Scanner(file);
		while(input.hasNextLine()) {
			str += input.nextLine();
		}
	}
	
	static void readFileStoreItToAnArray(File file, List<String> arr)throws IOException{
		Scanner input = new Scanner(file);
		while(input.hasNextLine()) {
			arr.add(input.nextLine());
		}
	}
	
	static void writeAndReadToAPlainText(File file, Scanner input, PrintStream fileStream)throws IOException{
		while(input.hasNextLine()) {
			System.out.println(input.nextLine());
			fileStream.println("Writing...");
		}
		fileStream.close();
	}
	
	static void appendToFile(File file, String str)throws IOException{
		BufferedWriter out = new BufferedWriter(new FileWriter(file,true));
		out.write(str);
		out.close();
	}
	
	static void readFirstThreeLines(File file)throws IOException{
		Scanner input = new Scanner(file);
		for(int i = 0; i < 3; i++)
			System.out.println(input.nextLine());
	}
	
	static void longestWordInTheFile(File file, List<String> str)throws IOException{
		Scanner input = new Scanner(file);
		while(input.hasNextLine()) {
			str.add(input.nextLine());
		}
		String[] words;
		int largest = 0;
		String larg = "";
		for(String s : str) {
			words = s.split(" ");
			for(int i = 0; i < words.length; i++) {
				if(words[i].length() > largest)
					larg = words[i];
			}
		}
		System.out.println(larg);
	}

}
