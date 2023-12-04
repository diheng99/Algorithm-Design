public class AdjList {
    private LinkedList[] adjList;
    private int v;

    public AdjList(int v) {
        this.v = v;
        adjList = new LinkedList[v];

        for(int i = 0; i < v; i++) {
            adjList[i] = new LinkedList();
        }
    }

    public void addEdge(Edge edge) {
        // UNDIRECTED GRAPH
        int src = edge.getSrc();
        int dest = edge.getDest();
        adjList[src].insert(edge);
        adjList[dest].insert(new Edge(dest, src, edge.getWeights(), 0));
    }

    public LinkedList[] getAdjList() {
        return this.adjList;
    }

    public void print() {
        for(int i = 0; i < v; i++) {
            Node cur = adjList[i].head;
            System.out.print(i + "->");
            while(cur.next != null) {
                System.out.print(cur.edge.getDest() + "->");
                cur = cur.next;
            }
            System.out.print(cur.edge.getDest());
            System.out.println();
        }
    }
}
