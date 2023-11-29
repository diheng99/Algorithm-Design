package kruskalUnion;

public class Edge
{

    private int src;
    private int dest;
    private int weights;

    public Edge(int src, int dest, int weights)
    {
        this.src = src;
        this.dest = dest;
        this.weights = weights;
    }

    public void addEdge(int src, int dest, int weights)
    {
        this.src = src;
        this.dest = dest;
        this.weights = weights;
    }

    public int getSrc()
    {
        return src;
    }
    public int getDest()
    {
        return dest;
    }
    public int getWeights()
    {
        return weights;
    }
}