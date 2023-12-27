public class RodCutting {
    public static int[] findMaxProfit(int[] length, int[] price) {
        int[] dict = new int[price.length + 1];

        for(int i = 1; i < length.length; i++) {
            for(int j = 0; j < i; j++) {
                dict[i] = Math.max(dict[i], price[j] + dict[i - length[j]]);
            }
        }

        return dict;
    }
}
