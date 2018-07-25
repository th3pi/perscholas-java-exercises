/**
 * 
 */
package week6A2;

/**
 * @author th3pi
 *
 */
public class Q1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String stamp = "####";
		String blank = "";
		String name = "Bill Gates";
		String address = "1 Microsoft Way";
		String cityZipCode = "Redmond, WA 98104";
		System.out.format("+-----------------------------------------+%n");
		for(int i = 0; i < 4; i++)
			System.out.format("|%40s |%n",stamp);
		System.out.format("|%40s |%n",blank);
		System.out.format("|%40s |%n",blank);
		System.out.format("|%40s |%n",name);
		System.out.format("|%40s |%n",address);
		System.out.format("|%40s |%n",cityZipCode);
		System.out.format("+-----------------------------------------+%n");
		
	}
	

}
