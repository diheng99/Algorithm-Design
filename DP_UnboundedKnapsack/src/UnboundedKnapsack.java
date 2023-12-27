public class UnboundedKnapsack {
    public static int[] findMaxProfit(int[] weight, int[] profit, int c) {
        int[] dict = new int[c + 1];

        for(int i = 1; i <= c; i++) {
            for(int j = 0; j < profit.length; j++) {
                if(weight[j] <= i) {
                    dict[i] = Math.max(dict[i], profit[j] + dict[i - weight[j]]);
                }
            
            }
        }
        return dict;
    }
    
}