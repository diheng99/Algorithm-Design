package kruskalAlgorithm;
import java.util.*;

public class KruskalAlgorithm {

	private int v;
	private int size;
	private List<Edge> mst;
	
	public KruskalAlgorithm(int v)
	{
		this.v = v;
		this.mst = new ArrayList<Edge>();
		this.size = 0;
	}
	
	public void useKruskalAlgorithm(MinHeap heap)
	{
		QuickFind qfind = new QuickFind(v);
		Union union = new Union(v);

		
		while(!heap.isEmpty()) 
		{
			Edge min = heap.getMin();
			
			if(qfind.quickF(min))
			{
				union.merge(min, qfind.getIndex());
				mst.add(min);
				size++;
				
			}
		}
		
	}
	
	public List<Edge> getList()
	{
		return this.mst;
	}
	
	public int getSize()
	{
		return size;
	}
}