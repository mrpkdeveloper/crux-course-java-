package lecture_2;

public class pattern_32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 9;
		int row = 1, nst = 1,val=1;

		while (row <= 2*n-1) {
			int cst = 1;
			while (cst <= nst) {
				if (cst % 2 == 0)
					System.out.print("*");
				else {
					
					System.out.print(val);}
				cst++;
			}
			// prep
			
			if (row <= n / 2) {
				nst = nst + 2;
				val++;}
			else {
				nst=nst-2;
				val--;}
			row++;
			System.out.println();
		}

	}

}
