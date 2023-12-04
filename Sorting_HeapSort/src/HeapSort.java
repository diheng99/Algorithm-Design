public class HeapSort {
    
    public static void heapify(int[] array, int H) {
        
        if(2 * (H + 1) <= array.length) {
            heapify(array, 2 * (H + 1) - 1);
            heapify(array, 2 * (H + 1));
            fixHeap(array, H);
        }
    }

    public static void fixHeap(int[] array, int H) {
        int largest = H;
        int leftChild = 2 * (H + 1) - 1;
        int rightChild = 2 * (H + 1);

        if(leftChild < array.length && array[leftChild] > array[largest]) {
            largest = leftChild;
        }
        if(rightChild < array.length && array[rightChild] > array[largest]) {
            largest = rightChild;
        }

        if(largest != H) {
            int temp = array[H];
            array[H] = array[largest];
            array[largest] = temp;
        }
    }

    public static void printHeap(int[] array) {
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
    }
}
