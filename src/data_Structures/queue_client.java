package data_Structures;

public class queue_client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
      queue_cicular q = new queue_cicular();
      q.enqueue(10);
      q.enqueue(20);
      q.enqueue(30);
      q.enqueue(40);
      q.enqueue(50);
      q.disp();
      q.dequeue();
      q.dequeue();
      q.dequeue();
      q.disp();
      q.enqueue(10);
      q.enqueue(20);
      q.enqueue(30);
      q.enqueue(40);
      q.enqueue(50);
	}

}
