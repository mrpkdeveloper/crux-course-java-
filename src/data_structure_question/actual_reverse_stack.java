package data_structure_question;

import data_Structures.dynamic_Stack;

public class actual_reverse_stack {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		dynamic_Stack d = new dynamic_Stack();
		dynamic_Stack temp = new dynamic_Stack();
		d.push(10);
		d.push(20);
		d.push(30);
		d.push(40);
		d.push(50);
		d.disp();
		actual_rev(d,temp);
		d.disp();
	}

	public static void actual_rev(dynamic_Stack d,dynamic_Stack temp) throws Exception {
		if(d.isEmpty()) {
			actual_rev2(d, temp);
			return;
		}
		 
		temp.push(d.pop());
		actual_rev(d, temp);
		
	}
	
	public static void actual_rev2(dynamic_Stack d,dynamic_Stack temp) throws Exception {
		if(temp.isEmpty()) {
			return;
		}
		int t = temp.pop();
		actual_rev2(d, temp);
		d.push(t);
		
	}
	
}
