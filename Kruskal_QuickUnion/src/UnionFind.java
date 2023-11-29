package kruskalUnion;

public class UnionFind{
    private int v;
    private int[] index;

    public UnionFind(int v){

        this.v = v;
        this.index = new int[v];
        initialize();
    }

    public void initialize()  {
        for(int i = 0; i < v; i++)
            index[i] = i + 1;
    }

    public boolean unionfind(Edge edge) {

        int src = edge.getSrc();
        int dest = edge.getDest();
        if(findId(src) == findId(dest)) {
            return true;
        }
        
        else {

            return false;
        }
    }

    public int findId(int v){
        if(index[v - 1] != v) {
            int next = index[v - 1];
            return(findId(next));
        }
        return v;
    }

    public int[] getIndex() {
        return this.index;
    }
}