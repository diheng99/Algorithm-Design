package weightedQuickUnion;

public class weightedFind {
    private int v;
    private int[] index;

    public weightedFind(int v) {
        this.v = v;
        this.index = new int[v];
        initialize();
    }

    public void initialize() {
        for(int i = 0; i < v; i++) {
            index[i] = i + 1;
        }
    }

    public boolean connected(Edge edge) {
        int src = edge.getSrc();
        int dest = edge.getDest();

        if(findId(src) == findId(dest)) return true;
        else return false;

    }

    public int findId(int v) {
        if(index[v - 1] != v) {
            int next = index[v - 1];
            return(findId(next));
        }
        else return v;
    }

    public int[] getIndex() {
        return index;
    }
}
