public class MergeSort {
    
    public static void useMergeSort(int[] array, int start, int end) {
        if(end == start) return;

        int mid = (start + end)/ 2;
        useMergeSort(array, start, mid);
        useMergeSort(array, mid + 1, end);

        useMerge(array, start, mid, end);
    }

    public static void useMerge(int[] array, int start, int mid, int end) {
        if(start == end) return;
        int a, b;

        a = start;
        b = mid + 1;

        while(a <= mid && b <= end) {
            if(array[a] > array[b]) {
                int temp = array[b];

                for(int i = b; i > a; i--) {
                    array[i] = array[i-1];
                }

                array[a] = temp;
                a++;
                b++;
                mid++;
            } else if(array[a] < array[b]) {
                b++;
            } else {
                a++;
                int temp = array[b];

                for(int j = b; j > a; j--) {
                    array[j] = array[j - 1];
                }

                array[a] = temp;
                a++;
                b++;
                mid++;
            }
        } 
    }

    public static void printArray(int[] array) {
        System.out.println("After sorting with MergeSort");
        for(int i = 0; i < array.length; i++)
            System.out.print(array[i] + "\t");
    }
}
