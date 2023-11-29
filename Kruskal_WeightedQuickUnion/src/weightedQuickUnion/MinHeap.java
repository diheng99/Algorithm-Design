package weightedQuickUnion;
import java.util.*;

public class MinHeap {
    
    private List<Edge> heap;
    private int size;

    public MinHeap() {
        this.heap = new ArrayList<Edge>();
        this.size = 0;
    }

    public MinHeap(List<Edge> heap) {
        this.heap = new ArrayList<Edge>(heap);
        this.size = heap.size();
    }

    public void heapifying(int H) {
        if(2 * (H + 1) <= size) {
            heapifying(2 * (H + 1) - 1);
            heapifying(2 * (H + 1));

            Edge temp = heap.get(H);
            fixHeap(H, temp);
        }
    }

    public void fixHeap(int H, Edge edge) {
        Edge temp = null;
        int parent = H;
        int leftChild = 2 * (H + 1) - 1;
        int rightChild = 2 * (H + 1);

        if(leftChild < size && heap.get(leftChild).getWeights() < heap.get(parent).getWeights()) {
            temp = heap.get(leftChild);
            parent = leftChild;
        }
        if(rightChild < size && heap.get(rightChild).getWeights() < heap.get(parent).getWeights()) {
            temp = heap.get(rightChild);
            parent = rightChild;
        }
        if(parent != H) {
            heap.set(parent, edge);
            heap.set(H, temp);
        }
    }

    public Edge getMin() {
        Edge temp = heap.get(0);
        deleteMin();
        return temp;
    }

    public void deleteMin() {
        Edge temp = heap.get(0);
        heap.set(0, heap.get(size - 1));
        heap.set(size - 1, temp);

        heap.remove(size - 1);
        size--;
        if(heap.size() > 0) heapifying(0);
    }

    public boolean isEmpty() {
        if(heap.size() == 0) return true;
        else return false;
    }

    public void addHeap(Edge edge) {
        heap.add(edge);
        size ++;
        heapifying(0);
    }
}
