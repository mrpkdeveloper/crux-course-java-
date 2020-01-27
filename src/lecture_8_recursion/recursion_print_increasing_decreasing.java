package lecture_8_recursion;

public class recursion_print_increasing_decreasing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pdi(3);

	}
	
	public static void pdi(int n) {
		if(n==0)
			return;
		//Decreasing
		System.out.println(n);
		pdi(n-1);
		//Increasing
		System.out.println(n);
		
	}

}
