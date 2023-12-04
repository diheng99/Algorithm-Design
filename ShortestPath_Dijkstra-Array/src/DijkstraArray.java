public class DijkstraArray {
    private int[] distance;
    private int[] pi;
    private boolean[] s;
    private int v;
    private int src;
    private int[][] adjMatrix;

    public DijkstraArray(int v, int src, int[][] adjMatrix) {
        this.v = v;
        this.src = src;
        this.adjMatrix = adjMatrix;
        initialize();
    }

    public void initialize() {
        this.distance = new int[v];
        this.pi = new int[v];
        this.s = new boolean[v];

        for(int i = 0; i < v; i++) {
            distance[i] = Integer.MAX_VALUE;
            s[i] = false;
            pi[i] = -1;
        }

        distance[src] = 0;
    }

    public void useDijkstra() {
        while(!fullSpanningTree()) {
            int min = Integer.MAX_VALUE;
            int index = -1;

            for(int i = 0; i < v; i++) {
                if(!s[i] && distance[i] < min) {
                    min = distance[i];
                    index = i;
                }          
            }
            if(index == -1) continue;

            s[index] = true;

            for(int i = 0; i < v; i++) {
                if(!s[i] && adjMatrix[index][i] != Integer.MAX_VALUE && (distance[index] + adjMatrix[index][i]) < distance[i]) {
                    distance[i] = distance[index] + adjMatrix[index][i];
                    pi[i] = index;
                }
            }

        }
    }

    public boolean fullSpanningTree() {
        for(int i = 0; i < v; i++) {
            if(s[i] == false) return false;
        }

        return true;
    }

    public void print() {
        System.out.println("Distance");
        for(int i = 0; i < v; i++) {
            System.out.print(distance[i] + "\t");
        }
        System.out.println();
        System.out.println("Pi");
        for(int i = 0; i < v; i++) {
            System.out.print(pi[i] + "\t");
        }
        System.out.println();
        System.out.println("Spanning Tree");
        for(int i = 0; i < v; i++) {
            System.out.print(s[i] + "\t");
        }
    }

    public void printShortestPath(int src, int dest){
		if(src == dest){
			System.out.print(src);
			return;
		}
		printShortestPath(src, pi[dest]);
		System.out.print("->" + dest);
	}
}

