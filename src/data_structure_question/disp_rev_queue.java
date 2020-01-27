package data_structure_question;

import data_Structures.dynamic_queue;

public class disp_rev_queue {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		dynamic_queue q = new dynamic_queue();
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.enqueue(40);
		q.enqueue(50);
		q.disp();
		display_rev(q,0);
		q.disp();
	}

	public static void display_rev(dynamic_queue q,int c) throws Exception {
		// TODO Auto-generated method stub
	if(c==q.size()) {
		return;
	}
	int temp = q.dequeue();
	q.enqueue(temp);
	display_rev(q,c+1);
	System.out.println(temp);
		
	}

}
