package weightedQuickUnion;
public class WeightedUnion {
    
    private static int v;
    public static int[] size;

    public WeightedUnion(int v) {
        WeightedUnion.v = v;
        size = new int[v];
        initialize();
    }

    public void initialize() {
        for(int i = 0; i < v; i++) {
            size[i] = 1;
        }
    }

    public void weightedUnion(int srcId, int destId, int[] index) {

        if(size[srcId - 1] <= size[destId - 1]) {
            index[srcId - 1] = destId;
            size[destId - 1]++;
        }
        else {
            index[destId - 1] = srcId;
            size[srcId - 1]++;
        }

    }

    public static void print() {
        for(int i = 0; i < v; i++) {
            System.out.println(size[i]);
        }
    }

}
