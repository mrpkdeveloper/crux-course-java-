package data_Structures;

public class dynamic_static_client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		dynamic_Stack d = new dynamic_Stack();
		d.push(10);
		d.push(20);
		d.push(30);
		d.push(40);
		d.push(50);
		d.push(60);
		d.push(70);
		d.push(80);
		d.push(90);
		d.disp();
		System.out.println(d.pop());
		System.out.println(d.pop());
		System.out.println(d.pop());
	}

}
