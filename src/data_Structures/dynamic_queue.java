package data_Structures;

public class dynamic_queue extends queue_cicular {

	@Override
	public void enqueue(int item) throws Exception {
		// TODO Auto-generated method stub
		if (isfull()) {
			int[] na = new int[2 * data.length];
			for (int i = 0; i < size; i++) {
				int idx = (i + front) % data.length;
				na[i] = data[idx];
			}
			data = na;
			front=0;

		}

		super.enqueue(item);
	}
}
