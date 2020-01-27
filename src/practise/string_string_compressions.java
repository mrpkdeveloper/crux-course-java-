package practise;

import java.util.Scanner;

public class string_string_compressions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		String s = scn.next();
	    char ch;
	    int i,j;int count=0;
		for(i=0;i<s.length();i=i+count) {
			count=1;
			ch=s.charAt(i);
			for(j=i+1;j<s.length();j++) {
				if(ch==s.charAt(j))
					count++;
				else
					break;
			}
			System.out.print(ch);
			if(count!=1)
			System.out.print(count);
		}
	}

}
