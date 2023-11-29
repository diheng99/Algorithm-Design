package weightedQuickUnion;
public class Main {
    public static void main(String[] args){

        Graph graph = new Graph(6);
		graph.addEdge(new Edge(1, 2, 7));
		graph.addEdge(new Edge(1, 3, 8));
		graph.addEdge(new Edge(2, 3, 3));
		graph.addEdge(new Edge(2, 4, 6));
		graph.addEdge(new Edge(2, 6, 5));
		graph.addEdge(new Edge(3, 4, 4));
		graph.addEdge(new Edge(3, 6, 3));
		graph.addEdge(new Edge(4, 6, 2));
		graph.addEdge(new Edge(4, 5, 5));
		graph.addEdge(new Edge(5, 6, 2));

        WeightedQuickUnion wqUnion = new WeightedQuickUnion(graph.getV());
        wqUnion.useWeightedQuickUnion(graph.heap);
        wqUnion.printMst();
		WeightedUnion.print();
    }
}
