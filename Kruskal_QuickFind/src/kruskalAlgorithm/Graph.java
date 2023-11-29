package kruskalAlgorithm;

import java.util.*;

public class Graph {

	public int v;
	MinHeap heap;
	
	public Graph(int v)
	{
		this.v = v;
		heap = new MinHeap();
	}
	
	public void addEdge(Edge edge)
	{
		heap.addNode(edge);
	}
	
	public void print()
	{
		List<Edge> edges = heap.getList();
		for (Edge edges1 : edges) 
		 
		{
	           System.out.println(edges1.getSrc() + " - " + edges1.getDest() + " : " + edges1.getWeights());
		}
	}
	
	public MinHeap getHeap()
	{
		return heap;
	}
}
