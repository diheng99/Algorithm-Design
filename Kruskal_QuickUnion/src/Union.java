package kruskalUnion;

public class Union {

    public void union(Edge min, int[] index) {
        int src = min.getSrc();
        int dest = min.getDest();

        index[src - 1] = dest;

    }
}
