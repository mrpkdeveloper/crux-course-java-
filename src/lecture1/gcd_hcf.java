package lecture1;
import java.util.Scanner;

public class gcd_hcf {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int divedent = scn.nextInt();
		int divisor = scn.nextInt();
		
		while(divedent%divisor!=0)
		{ int rem = divedent%divisor;
		   divedent = divisor;
		   divisor = rem;
			
		}
System.out.println(divisor);
	}

}
