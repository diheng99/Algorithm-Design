public class App {
    public static void main(String[] args) throws Exception {
        int[] array = new int[]{1, 2, 3, 4, 5};
        //        1
        //     2     3
        //   4   5
        HeapSort.heapify(array, 0);
        HeapSort.printHeap(array);
        //       5  
        //     1   3
        //   4   2
    }
}
