package heap;

public class heap_ccl {

	public static void main(String[] args) {
		heap list = new heap();
		list.add(5);
		list.add(10);
		list.add(15);
		list.add(20);
		list.add(25);
		
		list.display();

		System.out.println(list.remove());
		list.display();
		
		System.out.println(list.remove());
		list.display();
		
		System.out.println(list.get());

	}

}
