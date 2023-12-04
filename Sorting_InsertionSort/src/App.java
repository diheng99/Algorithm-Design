public class App {
    public static void main(String[] args) throws Exception {
        int[] array = new int[]{5, 4, 3, 2, 1};
        
        InsertionSort.useInsertionSort(array);
        InsertionSort.print(array);
    }
}
