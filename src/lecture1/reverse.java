package lecture1;
import java.util.Scanner;

public class reverse {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int r = 0, sum = 0;
		while (n != 0) {
			r = n % 10;
			n = n / 10;
			sum = sum * 10 + r;
		}
		System.out.println(sum);
	}

}
