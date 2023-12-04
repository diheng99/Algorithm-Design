public class InsertionSort {
    
    public InsertionSort() {}

    public static int[] useInsertionSort(int []array) {
        for(int i = 1; i < array.length; i++) {
            for(int j = i; j > 0; j--) {
                if(array[j - 1] > array[j]) 
                    swap(array, j - 1, j);
                else 
                    break;
            } 
        }

        return array;
    }

    public static void swap(int []array, int left, int right) {
        int temp = array[left];
        array[left] = array[right];
        array[right] = temp;
    }

    public static void print(int []array) {
        System.out.println("After Insertion sort");
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
    }
}
