package practise;

import java.util.Scanner;

public class string_maxfrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		String s = scn.next();
	    char ch,chbig=s.charAt(0);
	    int i,j;int count=0,big=0;
		for(i=0;i<s.length();i=i+count) {
			count=1;
			ch=s.charAt(i);
			for(j=i+1;j<s.length();j++) {
				if(ch==s.charAt(j))
					count++;
			}
			if(count>big) {
				big=count;
				chbig=ch;
			}
		}
		System.out.println(chbig);
	}

}
