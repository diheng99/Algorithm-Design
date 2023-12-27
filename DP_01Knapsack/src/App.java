public class App {
    public static void main(String[] args) throws Exception {
        /*
         *  https://www.geeksforgeeks.org/0-1-knapsack-problem-dp-10/
         */

         int[] weight = new int[] {1, 2, 3};
         int[] profit = new int[] {10, 15, 40};
         int c = 6;

         int[][] bag = Knapsack.findMaxProfit(weight, profit, c);

         for(int i = 0; i <= weight.length; i++) {
            for(int j = 0; j <= c; j++) {
                System.out.print(bag[i][j] + "\t");
            }
            System.out.println();
         }
    }
}
