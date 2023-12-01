public class App {
    public static void main(String[] args) throws Exception {
        int[] array = new int[]{5, 4, 3, 2, 1};
        QuickSort.quickSort(array, 0, array.length - 1);
        QuickSort.print(array);
    }
}
