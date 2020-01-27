package data_structure_question;

public class queue_using_stack_dqeff_client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		queue_using_stack_dqeff q = new queue_using_stack_dqeff();
		
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.enqueue(40);
		q.enqueue(50);
		
		q.disp();
		
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		q.disp();
		
	}

}
