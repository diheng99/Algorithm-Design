public class App {
    public static void main(String[] args) throws Exception {
        /*     https://www.geeksforgeeks.org/program-for-nth-fibonacci-number/
         *   
         *     Applicable in Stock Market Analysis or Population Growth
         * 
         * 
         *      F(n) = F(n-1) + F(n-2)    F(0) =  0, F(1) = 1
         *                   F(4)
         *           F(3)             F(2)  
         *       F(2)    F(1)     F(1)    F(0)
         *   F(1)    F(0)
         */

        int dict[] = Fibonacci.fib(9);
        for(int i = 0; i <= 9; i++) {
            System.out.print(dict[i] + "\t");
        }
    }
}
