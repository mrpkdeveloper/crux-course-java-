package data_structure_question;

import data_Structures.dynamic_queue;

public class actual_reverse_queue {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		dynamic_queue q = new dynamic_queue();
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.enqueue(40);
		q.enqueue(50);
		q.disp();
		actual_rev(q);
		q.disp();
		
	}
	
	public static void actual_rev(dynamic_queue q) throws Exception {
	if(q.isEmpty()) {
		return;
	}
	int temp = q.dequeue();
	actual_rev(q);
	q.enqueue(temp);
	System.out.println(temp);

	}
	
	

}
