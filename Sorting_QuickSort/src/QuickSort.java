public class QuickSort {
    public static void quickSort(int[] array, int start, int end){

        int pivot_pos;

        if(start >= end) return;

        pivot_pos = partition(array, start, end);
        quickSort(array, start, pivot_pos - 1);
        quickSort(array, pivot_pos + 1, end);
    }

    public static int partition(int[] array, int low, int high) {

        int i, last_small, pivot;

        int mid = (low + high) / 2;
        swap(array, low, mid);

        pivot = array[low];
        last_small = low;

        for(i = low + 1; i <= high; i++) {
            if(array[i] < pivot) {
                swap(array, ++last_small, i);
            }
        }
        swap(array, low, last_small);

        return last_small;
    }

    public static void swap(int[] array, int low, int mid) {
        int temp = array[low];
        array[low] = array[mid];
        array[mid] = temp;
    }

    public static void print(int[] array){
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
    }
}
