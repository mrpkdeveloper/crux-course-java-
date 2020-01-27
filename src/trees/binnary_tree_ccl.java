package trees;

public class binnary_tree_ccl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 10 true -20 true 40 false false true -50 false false true 30 false true 60
		// false false
		// 10 true 20 true 40 true 60 true 80 false false false false true 50 false true
		// 70 false true 90 false false true 30 false false

		int[] pre = { 10, 20, 70, 30, 40, 50, 60 };
		int[] in = { 20, 70, 10, 40, 50, 30, 60 };
		binary_tree bt = new binary_tree(pre, in);
		bt.disp();
		System.out.println(bt.istreebst());

		// binary_tree bt2 = new binary_tree();
		// bt2.disp();
		// System.out.println(bt.size());
		// System.out.println(bt.max());
		// System.out.println(bt.find(500));
		// System.out.println(bt.height());
		// System.out.println(bt.dia());
		// System.out.println(bt.dia1());
		// System.out.println(bt.diapair());
		// System.out.println(bt.balancetree());
		// System.out.println(bt.balancetreepair());
		// System.out.println(bt1.flipequ(bt2));
		// bt1.preorderI() ;
//		System.out.println(bt.maxsubtree());
//		System.out.println(bt.maxsubtree1());
	}

}
