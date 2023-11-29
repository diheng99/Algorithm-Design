package weightedQuickUnion;
public class Graph {
    
    private int v;
    MinHeap heap;

    public Graph(int v) {
        this.v = v;
        heap = new MinHeap();
    }

    public void addEdge(Edge edge) {
        heap.addHeap(edge);
    }

    public int getV() {
        return v;
    }
}
