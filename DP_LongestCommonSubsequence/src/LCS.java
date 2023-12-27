public class LCS {
    public static int[][] findLCS(String s1, String s2) {
        int[][] tabulation = new int[s2.length() + 1][s1.length() + 1];
        
        for(int i = 1; i <= s2.length(); i++) {
            for(int j = 1; j <= s1.length(); j++) {
                if(s1.charAt(j - 1) == s2.charAt(i - 1)) {
                    tabulation[i][j] = tabulation[i - 1][j - 1] + 1; 
                }
                else {
                    tabulation[i][j] = Math.max(tabulation[i - 1][j], tabulation[i][j - 1]);
                }
            }
        }

        return tabulation;
    }
}
