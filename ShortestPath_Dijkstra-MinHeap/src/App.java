public class App {
    public static void main(String[] args) throws Exception {
        // https://www.geeksforgeeks.org/dijkstras-shortest-path-algorithm-greedy-algo-7/
        AdjList adjList = new AdjList(9);
        adjList.addEdge(new Edge(0, 1, 4, 0));
        adjList.addEdge(new Edge(0, 7, 8, 0));
        adjList.addEdge(new Edge(1, 7, 11, 0));
        adjList.addEdge(new Edge(1, 2, 8, 0));
        adjList.addEdge(new Edge(7, 8, 7, 0));
        adjList.addEdge(new Edge(7, 6, 1, 0));
        adjList.addEdge(new Edge(2, 8, 2, 0));
        adjList.addEdge(new Edge(6, 8, 6, 0));
        adjList.addEdge(new Edge(2, 5, 4, 0));
        adjList.addEdge(new Edge(6, 5, 2, 0));
        adjList.addEdge(new Edge(2, 3, 7, 0));
        adjList.addEdge(new Edge(3, 5, 14, 0));
        adjList.addEdge(new Edge(5, 4, 10, 0));

        adjList.print();

        DijkstraHeap dijkstraHeap = new DijkstraHeap(9, 0, adjList.getAdjList());
        dijkstraHeap.useDijkstra();
        dijkstraHeap.print();
        System.out.println();
        for(int i = 1; i < 9; i++) {
            dijkstraHeap.printShortestPath(0, i);
            System.out.println();
        }
    }
}
