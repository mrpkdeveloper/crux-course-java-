package lecture_10_recursion_print;

public class recursion_print_permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         permutation1("2567","");
        // permutation2("abc","");
	}
	
	public static void permutation1(String q , String ans) {
		if(q.length()==0) {
			System.out.println(ans);
			return;
		}
		
		char ch = q.charAt(0);
		String roq = q.substring(1);
		
			for(int i = 0 ; i<=ans.length();i++) {
			permutation1(roq,ans.substring(0,i) + ch + ans.substring(i));
					}
		
	}
	
	
	public static void permutation2(String q , String ans) {
		if(q.length()==0) {
			System.out.println(ans);
			return;
		}
		for(int i = 0 ; i < q.length();i++) {
			char ch = q.charAt(i);	
			String roq = q.substring(0,i)+q.substring(i+1);
			permutation2(roq,ans + ch + " ");
			
			
		}
		
	}
	

}
