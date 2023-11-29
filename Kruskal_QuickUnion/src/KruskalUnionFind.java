package kruskalUnion;
import java.util.*;

public class KruskalUnionFind {
    private int v;
    private int size;
    private List<Edge> mst;
    MinHeap mstheap;

    public KruskalUnionFind(int v) {
        this.v = v;
        this.size = 0;
        this.mst = new ArrayList<Edge>();
    }

    public void useUnionFind(MinHeap heap) {
        UnionFind ufind = new UnionFind(v);
        Union quickUnion = new Union();

        while(!heap.isEmpty()) {

            Edge min = heap.getMin();
            if(!ufind.unionfind(min)){
                quickUnion.union(min, ufind.getIndex());
                mst.add(min);
                this.size++;
            }
        }

    }
    public void print()
	{
		for (Edge edges1 : mst) 
		 
		{
	           System.out.println(edges1.getSrc() + " - " + edges1.getDest() + " : " + edges1.getWeights());
		}
	}

    public int getSize() {
        return size;
    }

}
