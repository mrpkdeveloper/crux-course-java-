package linked_list;

public class LLClient {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		link_list list = new link_list();
		list.addlast(12);
		list.addlast(2);
		list.addlast(6);
		list.addlast(4);
		list.addlast(8);
		// list.addlast(60);
		list.addlast(10);
		// list.addlast(80);
		list.partition();
		list.disp();

		// list.mergesortedll(list2);
		// list.disp();
		// System.out.println(list.isPalindrome());
		// list.kappend(15);
		// list.disp();
		// list.kreverse(4);
		// list.disp();
		// list.create_dummy_list();
		// System.out.println(list.detectloop());
		// list.disp();
		// System.out.println(list.kthfromlast(5));
		// System.out.println(list.findcommonnode());
		//
		// list.fold();

		// System.out.println(list.midnode());

		// list.reverseDataI(list);
		// list.reversepointerI();
		// list.reversepointer_r();
		// list.rdr();
		// list.rdrhm();
		// list.disp();

	}
}
