package dijkstraAlgoMinheap;
public class Main {

	public static void main(String[] args)
	{
		Graph graph = new Graph(5);
		
		graph.addEdge(new Edge(1, 2, 4));
		graph.addEdge(new Edge(1, 3, 2));
		graph.addEdge(new Edge(1, 4, 6));
		graph.addEdge(new Edge(1, 5, 8));
		graph.addEdge(new Edge(2, 4, 4));
		graph.addEdge(new Edge(2, 5, 3));
		graph.addEdge(new Edge(3, 4, 1));
		graph.addEdge(new Edge(4, 2, 1));
		graph.addEdge(new Edge(4, 5, 5));
		
		graph.print();
		System.out.println();
		DijkstraAlgoMinHeap test = new DijkstraAlgoMinHeap(5, 1, graph.getAdjList());
		test.dijkstraAlgoMinheap();
		test.print();
		System.out.println(DijkstraAlgoMinHeap.count);
		
	}
}