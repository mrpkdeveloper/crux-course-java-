package practise;

import java.util.Scanner;

public class basic_calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		char ch;
		do {ch=scn.next().charAt(0);
			int ans = 0;
			if (ch == '*' || ch == '/' || ch == '+' || ch == '-' || ch == '%') {
				int n1 = scn.nextInt();
				int n2 = scn.nextInt();
				if (ch == '*')
					ans = n1 * n2;
				else if (ch == '/')
					ans = n1 / n2;
				else if (ch == '+')
					ans = n1 + n2;
				else if (ch == '-')
					ans = n1 - n2;
				else
					ans = n1 % n2;
				System.out.println(ans);
			} else if(ch != 'X' && ch != 'x')
				System.out.println("Invalid operation");

			
		} while (ch != 'X' && ch != 'x');

	}

}
