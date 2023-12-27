public class App {
    public static void main(String[] args) throws Exception {
        String s1 = "RACECAR";

        boolean[][] result = Palindrome.findPalindrome(s1);

        for(int i = 0; i < s1.length(); i++) {
            for(int j = 0; j < s1.length(); j++) {
                System.out.print(result[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
