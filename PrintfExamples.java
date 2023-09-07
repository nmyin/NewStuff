
/**
 * Examples of printf formatting
 * 
 * @author Nishka
 * @since september 7, 2023
 */

public class PrintfExamples {
	
	public static void main (String[] args) {
		int i = 987;
		double f = 32.45678;
		String str = "Hello World";
		
		//output string
		System.out.printf("%s after\n", str); //open format
		System.out.printf("%20s after\n", str); //right justify
		System.out.printf("%-20s after\n", str); //left justify
		
		//output integers
		System.out.printf("%d after\n", i); //open format
		System.out.printf("%20d after\n", i); //right justify
		System.out.printf("%-20d after\n", i); //left justify
		//if a number has more than 20 digits, it will revert back to open format
		
		//output double number
		System.out.printf("%f after\n", f);
		System.out.printf("%20f after\n", f);
		System.out.printf("%-20f after\n", f);
		System.out.printf("%20.3f after\n", f);
		System.out.printf("%20e after\n", f);
		
		//formatting text
		String myStr = String.format("%15s %10d %15f\n");
		System.out.println(myStr);
	}
}

