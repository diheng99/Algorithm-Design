package kruskalAlgorithm;

public class Test {
    
    public static void main(String[] args) {
        Graph graph = new Graph(9);
		graph.addEdge(new Edge(1, 2, 4));
		graph.addEdge(new Edge(1, 8, 8));	
		graph.addEdge(new Edge(2, 3, 8));
		graph.addEdge(new Edge(2, 8, 11));	
		graph.addEdge(new Edge(3, 4, 7));
		graph.addEdge(new Edge(3, 9, 2));
		graph.addEdge(new Edge(3, 6, 4));
		graph.addEdge(new Edge(9, 8, 7));
		graph.addEdge(new Edge(9, 7, 6));
		graph.addEdge(new Edge(7, 8, 1));
		graph.addEdge(new Edge(7, 6, 2));	
		graph.addEdge(new Edge(6, 4, 14));
		graph.addEdge(new Edge(6, 5, 10));	
		graph.addEdge(new Edge(4, 5, 9));


        long startTime = System.currentTimeMillis();
        KruskalAlgorithm test = new KruskalAlgorithm(graph.v);
        test.useKruskalAlgorithm(graph.getHeap());
        long endTime = System.currentTimeMillis();

        long executionTime = endTime - startTime;
        System.out.println("Execution Time: " + executionTime + " milliseconds");
    }
}
