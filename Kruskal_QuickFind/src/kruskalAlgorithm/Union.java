package kruskalAlgorithm;

public class Union {

	private int v;
	
	public Union(int v)
	{
		this.v = v;
	}
	
	public void merge(Edge min, int[] index)
	{
		int srcId = min.getSrc();
		int destId = min.getDest();
		
		int src = index[srcId - 1];
		for(int i = 0; i < v; i++)
		{
			if(index[i] == src)
				index[i] = index[destId - 1];
		}
	}

}