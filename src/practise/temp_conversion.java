package practise;

import java.util.Scanner;

public class temp_conversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        Scanner scn = new Scanner(System.in);
		        int minf=scn.nextInt();
		        int maxf=scn.nextInt();
		        int step=scn.nextInt();
		        while(minf<=maxf){
		            
		            int c = (int)((5.0/9)*(minf-32));
		            System.out.println(minf + "\t" + c);
		            minf=minf+step;
		        }
		        
		    }
}
