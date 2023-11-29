package weightedQuickUnion;

import java.util.*;

public class WeightedQuickUnion {
    private int v;
    private List<Edge> mst;

    public WeightedQuickUnion(int v) {
        this.v = v;
        mst = new ArrayList<Edge>();

    }

    public void useWeightedQuickUnion(MinHeap heap) {

        weightedFind wfind = new weightedFind(v);
        WeightedUnion wUnion = new WeightedUnion(v);

        while(!heap.isEmpty()) {

            Edge min = heap.getMin();

            if(!wfind.connected(min)) {

                wUnion.weightedUnion(wfind.findId(min.getSrc()), wfind.findId(min.getDest()), wfind.getIndex());
                mst.add(min);
            }
        }
    }

    public void printMst() {

        for(Edge edges: mst) {
            System.out.println(edges.getSrc() + " - " + edges.getDest() + " : " + edges.getWeights());   
        }
    }
}
