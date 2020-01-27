package time_comp;

public class polynomial_in_n {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	System.out.println(polynomial(3, 5));
		
	}
	
	public static int polynomial(int x,int n) {
		int sum=0,m=1;
		for(int i = 0 ; i<n;i++) {
			m=m*x;
		}
		for(int i = 0 ; i <n; i++) {
			sum=sum+(i+1)*m;
			m=m/x;
		}
		return sum;
		
	}
	

}
