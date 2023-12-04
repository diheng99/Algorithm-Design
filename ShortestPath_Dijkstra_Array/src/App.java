public class App {
    public static void main(String[] args) throws Exception {
        // https://www.geeksforgeeks.org/dijkstras-shortest-path-algorithm-greedy-algo-7/
        AdjGraph adjGraph = new AdjGraph(9);
        adjGraph.addEdge(0, 1, 4);
        adjGraph.addEdge(0, 7, 8);
        adjGraph.addEdge(1, 7, 11);
        adjGraph.addEdge(1, 2, 8);
        adjGraph.addEdge(7, 8, 7);
        adjGraph.addEdge(7, 6, 1);
        adjGraph.addEdge(2, 8, 2);
        adjGraph.addEdge(6, 8, 6);
        adjGraph.addEdge(2, 5, 4);
        adjGraph.addEdge(6, 5, 2);
        adjGraph.addEdge(2, 3, 7);
        adjGraph.addEdge(3, 5, 14);
        adjGraph.addEdge(5, 4, 10);

        adjGraph.printGraph();

        DijkstraArray dijkstra = new DijkstraArray(adjGraph.getV(), 0, adjGraph.getAdjGraph());
        dijkstra.useDijkstra();
        dijkstra.print();
        System.out.println();
        for(int i = 1; i < adjGraph.getV(); i++) {
            dijkstra.printShortestPath(0, i);
            System.out.println();
        }
        
    }
}
