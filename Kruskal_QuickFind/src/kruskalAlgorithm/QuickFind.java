package kruskalAlgorithm;

public class QuickFind {

	private int[] index;
	private int v;
	
	public QuickFind(int v)
	{
		this.v = v;
		index = new int[v];
		initialize();
	}
	
	public void initialize()
	{
		for(int i = 0; i < v; i++)
		{
			index[i] = i + 1;
		}

	}
	
	public boolean quickF(Edge min)
	{

		int srcId = min.getSrc();
		int destId = min.getDest();

		
		if(index[srcId - 1] == index[destId - 1]) 
			return false;
		else 
		return true;
	}
	
	public int[] getIndex()
	{
		return this.index;
	}

}