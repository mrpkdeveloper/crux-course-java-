package data_structure_question;

import data_Structures.dynamic_Stack;

public class display_Stack_reverse_stack {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		dynamic_Stack d = new dynamic_Stack();
		d.push(10);
		d.push(20);
		d.push(30);
		d.push(40);
		d.push(50);
		d.disp();
		reverse_disp(d);
		d.disp();

	}
	
	public static void reverse_disp(dynamic_Stack d) throws Exception {
		if(d.isEmpty()) {
			return;
		}
		int temp=d.pop();
		reverse_disp(d);
		d.push(temp);
		System.out.print(temp+" ");
	}

}
