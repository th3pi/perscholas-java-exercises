/**
 * 
 */
package week6A2;
import java.util.*;
import java.io.*;
/**
 * @author th3pi
 *
 */
public class Q2 {

	/**
	 * @param args
	 */
	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		File file = new File("C:\\Users\\th3pi\\Desktop\\Letters.txt");
		Formatter fmt = new Formatter(file);
		file.createNewFile();
		String stamp = "####";
		String blank = "";
		String name = "Bill Gates";
		String address = "1 Microsoft Way";
		String cityZipCode = "Redmond, WA 98104";
		fmt.format("+-----------------------------------------+%n");
		for(int i = 0; i < 4; i++)
			fmt.format("|%40s |%n",stamp);
		fmt.format("|%40s |%n",blank);
		fmt.format("|%40s |%n",blank);
		fmt.format("|%40s |%n",name);
		fmt.format("|%40s |%n",address);
		fmt.format("|%40s |%n",cityZipCode);
		fmt.format("+-----------------------------------------+%n");
		fmt.close();
	}
}
