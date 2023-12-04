public class App {
    public static void main(String[] args) throws Exception {
        int[] array = new int[] {5, 4, 3, 2, 1};

        MergeSort.useMergeSort(array, 0, array.length - 1);
        MergeSort.printArray(array);
    }
}
