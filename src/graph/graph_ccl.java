package graph;

public class graph_ccl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		graph gp = new graph(7);
		gp.addedge(1, 2, 1);
		gp.addedge(1, 3, 1);
		gp.addedge(3, 4, 1);
		gp.addedge(2, 4, 1);
		gp.addedge(2, 5, 1);
		gp.addedge(5, 6, 1);
		gp.addedge(6, 7, 1);
		gp.addedge(5, 7, 1);
		gp.removeedge(5, 7);
		System.out.println(gp);
//		System.out.println(gp.containsedge(1, 6));
//		System.out.println(gp.numedges());
//	    System.out.println(gp.haspath(1, 6));
//		gp.hasALLpath(1, 6);
//		System.out.println(gp.bfs(1, 6));
		// gp.bfT();
		// gp.dfs(1, 6);
//		gp.dfT();
		System.out.println(gp.iscyclic());
		System.out.println(gp.isconnected());
		System.out.println(gp.istree());
		gp.get_conected_comp();
		System.out.println(gp.is_bipertite());

	}

}
