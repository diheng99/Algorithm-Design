public class App {
    public static void main(String[] args) throws Exception {
        /*
         *  https://www.geeksforgeeks.org/unbounded-knapsack-repetition-items-allowed/?ref=lbp
         * 
         *  Financial modelling, control of traffic overload in communication systems.
         */

         int[] weight = new int[] {5, 10, 15};
         int[] profit = new int[] {10, 30, 20};
         int c = 100;

         int[] result = UnboundedKnapsack.findMaxProfit(weight, profit, c);

         for(int i = 0; i <= c; i++) 
            System.out.print(result[i] + "\t");
    }
}
