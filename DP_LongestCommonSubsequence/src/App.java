public class App {
    public static void main(String[] args) throws Exception {
        /*  https://www.geeksforgeeks.org/longest-common-subsequence-dp-4/
         *
         *  Compute two sequences and determine their similarities
         *  Strings represents DNA or bioinformatics
         * 
        */ 

        String s1 = "GXTXAYB";
        String s2 = "AGGTAB";

        int[][] dict = LCS.findLCS(s1, s2);

        for(int i = 0; i <= s2.length(); i++) {
            for(int j = 0; j <= s1.length(); j++) {
                System.out.print(dict[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
