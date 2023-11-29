package dijkstraAlgoMinheap;
import dijkstraAlgoMinheap.LinkedList.Node;;

public class Graph {

	private LinkedList[] adjlist;
	private int v;
	
	public Graph(int v)
	{
		this.v = v;
		adjlist = new LinkedList[v];
		for(int i = 0; i < v; i++)
			adjlist[i] = new LinkedList();
	}
	
	public void addEdge(Edge edge)
	{
		int src = edge.getSrc();
		adjlist[src - 1].insert(edge);
	}
	
	public LinkedList[] getAdjList()
	{
		return this.adjlist;
	}
	
	public void print()
	{
		for(int i = 0; i < v; i++)
		{
			Node cur = adjlist[i].head;
			if(cur == null) continue;
			while(cur.next != null)
			{
				System.out.print(cur.edge.getDest() + "->");
				cur = cur.next;
			}
			System.out.print(cur.edge.getDest());
			System.out.println();
		}
	}
}