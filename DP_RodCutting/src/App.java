public class App {
    public static void main(String[] args) throws Exception {
        /*
         *  https://www.geeksforgeeks.org/cutting-a-rod-dp-13/
         * 
         */

        int n = 8; 
        int[] length = new int[n];
        int[] price = new int[] {1, 5, 8, 9, 10, 17, 17, 20};

        for(int i = 0; i < n; i++) {
            length[i] = i + 1;
         }

         int[] result =  RodCutting.findMaxProfit(length, price);
         for(int i = 0; i < result.length; i++) {
            System.out.print(result[i] + "\t");
         }
    }
}
