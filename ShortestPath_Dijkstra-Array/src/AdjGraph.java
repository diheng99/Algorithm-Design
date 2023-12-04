public class AdjGraph {
    
    private int v;
    private int[][] adjGraph;

    public AdjGraph(int v) {
        this.v = v;
        adjGraph = new int[v][v];
        initialize(this.adjGraph);
    }

    public void initialize(int[][] adjGraph) {
        for(int i = 0; i < v; i++) {
            for(int j = 0; j < v; j++) {
                if(i == j) adjGraph[i][j] = 0;
                else 
                    adjGraph[i][j] = Integer.MAX_VALUE;
            }
        }
    }

    public void addEdge(int src, int dest, int weight) {
        this.adjGraph[src][dest] = weight;
        this.adjGraph[dest][src] = weight;
    }

    public void printGraph() {
        for(int i = 0; i < v; i++) {
            for(int j = 0; j < v; j++) {
                if(adjGraph[i][j] == Integer.MAX_VALUE)
                    System.out.print("INF" + "\t");
                else
                    System.out.print(adjGraph[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public int[][] getAdjGraph() {
        return this.adjGraph;
    }

    public int getV() {
        return this.v;
    }
}
