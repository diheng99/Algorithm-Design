public class Palindrome {
    public static boolean[][] findPalindrome(String s) {
        boolean[][] dict = new boolean[s.length()][s.length()];

        for(int i = 0; i < s.length(); i++) {
            dict[i][i] = true;
        }
        for(int j = 1; j < s.length(); j++) {
            if(s.charAt(j) == s.charAt(j - 1)) {
                dict[j - 1][j] = true;
            }
            else 
                dict[j - 1][j] = false;
        }

        for(int k = 2; k < s.length(); k++) {
            for(int m = 0; m < (s.length() - k); m++) {
                if(s.charAt(m) == s.charAt(k) && dict[m + 1][k - 1]) {
                    System.out.println(s.charAt(m) + s.charAt(k));
                    dict[m][k] = true;
                }
                else 
                    dict[m][k] = false;
            }
        }

        return dict;
    }
}
