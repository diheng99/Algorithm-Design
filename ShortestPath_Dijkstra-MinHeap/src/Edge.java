public class Edge {
    private int src;
    private int dest;
    private int weights;
    private int totalPathWeight;

    public Edge(int src, int dest, int weights, int totalPathWeight) {
        this.src = src;
        this.dest = dest;
        this.weights = weights;
        this.totalPathWeight = totalPathWeight;
    }

    public int getSrc() {
        return src;
    }

    public int getDest() {
        return dest;
    }

    public int getWeights() {
        return weights;
    }

    public int getTotalPathWeight() {
        return totalPathWeight;
    }

    public void setTotalPathWeight(int totalPathWeight) {
        this.totalPathWeight = totalPathWeight;
    }
}
