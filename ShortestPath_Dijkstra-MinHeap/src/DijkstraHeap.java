public class DijkstraHeap {
    private int v;
    private int src;
    private int[] distance;
    private int[] pi;
    private boolean[] s;
    LinkedList[] adjList;

    public DijkstraHeap(int v, int src, LinkedList[] adjList) {
        this.v = v;
        this.src = src;
        this.adjList = adjList;
        this.distance = new int[v];
        this.s = new boolean[v];
        this.pi = new int[v];
        initialize();
    }

    public void initialize() {
        for(int i = 0; i < v; i++) {
            distance[i] = Integer.MAX_VALUE;
            pi[i] = -1;
            s[i] = false;
        }

        distance[src] = 0;
    }

    public void useDijkstra() {
        MinHeap heap = new MinHeap();
        Node temp;
        heap.addNode(new Edge(src, src, 0, 0));
        int count = 0;

        while(!heap.isEmpty()) {
            Edge min = heap.extractMin();
            int curSrc = min.getDest();
            System.out.println(curSrc);
            if(s[curSrc] == true) continue;
            temp = adjList[curSrc].head;
            s[curSrc] = true;
            
            while(temp != null) {
                int adj = temp.edge.getDest();
                int weight = temp.edge.getWeights();
                if(!s[adj] && (distance[curSrc] + weight) < distance[adj]) {
                    distance[adj] = distance[curSrc] + weight;
                    pi[adj] = curSrc;
                    temp.edge.setTotalPathWeight(distance[adj]);
                    heap.addNode(temp.edge);
                }
            
                temp = temp.next;
            }
            count ++;
            if(count == 6) break;
        }
    }

    public void print()
	{
		System.out.println("Spanning tree");
		for(int i = 0; i < v; i++)
		{
			System.out.print(s[i] + "\t");
		}
		System.out.println();
		System.out.println("Distance");
		for(int i = 0; i < v; i++)
		{
			System.out.print(distance[i] + "\t");
		}
		System.out.println();
		System.out.println("pi");
		for(int i = 0; i < v; i++)
		{
			System.out.print(pi[i] + "\t");
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
