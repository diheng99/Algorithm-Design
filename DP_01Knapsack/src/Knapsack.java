public class Knapsack {
    public static int[][] findMaxProfit(int[] weight, int[] profit, int c) {
        int[][] dict = new int[weight.length + 1][c + 1];
        
        for(int i = 1; i <= weight.length; i++) {
            for(int j = 1; j <= c; j++) {
                if(weight[i - 1] <= j) {
                    // dict[i - 1][j] -> previous weight choice
                    // profit[i - 1] + dict[i - 1][j - weight[i-1]] -> current profit item + (capacity - current weight) 
                    dict[i][j] = Math.max(dict[i - 1][j], profit[i - 1] + dict[i - 1][j - weight[i - 1]]);
                } else
                    dict[i][j] = dict[i - 1][j];
            }
        }

        return dict;
    }
}
