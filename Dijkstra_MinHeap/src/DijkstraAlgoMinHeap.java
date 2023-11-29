package dijkstraAlgoMinheap;
import dijkstraAlgoMinheap.LinkedList.Node;

public class DijkstraAlgoMinHeap {
	
	private int v;
	private int src;
	private int[] distance;
	private int[] pi;
	private boolean[] s;
	public static int count = 0;
	LinkedList[] list;
	
	public DijkstraAlgoMinHeap(int v, int src, LinkedList[] list)
	{
		this.v = v;
		this.src = src;
		this.list = list;
		initialize();
	}
	
	public void initialize()
	{
		distance = new int[v];
		pi = new int[v];
		s = new boolean[v];
		
		for(int i = 0; i < v; i++)
		{
			distance[i] = Integer.MAX_VALUE;
			pi[i] = -1;
			s[i] = false;
		}
		
		distance[src - 1] = 0;
	}
	
	public void dijkstraAlgoMinheap()
	{
		Node temp;
		
		MinHeap heap = new MinHeap();
		heap.addNode(new Edge(1, 1, 0));
		
		while(!heap.isEmpty())
		{
			count++;
			Edge cur = heap. getMin();
			int curVal = cur.getDest();
			temp = list[curVal - 1].head;
			if(s[curVal - 1]) continue;
			s[curVal - 1] = true;

			while(temp != null)
			{
				int adj = temp.edge.getDest();
				int weight = temp.edge.getWeights();
				if(!s[adj - 1] && distance[adj - 1] > distance[curVal - 1] + weight)
				{
					distance[adj - 1] = distance[curVal - 1] + weight;
					pi[adj - 1] = curVal;
					heap.addNode(temp.edge);
				}
				
				temp = temp.next;

			}
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
	
}
