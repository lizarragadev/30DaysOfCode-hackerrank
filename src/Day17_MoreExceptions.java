import java.util.Scanner;

/**
 * Tutorials > 30 Days of Code > Day 17: More Exceptions
 *
 * https://www.hackerrank.com/challenges/30-more-exceptions/
 * @author lizarragadev
 *
 */

class Calculator {
    int power(int n, int p) throws Exception {
        if(n >= 0 && p >= 0) {
            return (int) Math.pow(n, p);
        } else {
            throw new Exception("n and p should be non-negative");
        }
    }
}

class Day17_MoreExceptions {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int n = in.nextInt();
            int p = in.nextInt();
            Calculator myCalculator = new Calculator();
            try {
                int ans = myCalculator.power(n, p);
                System.out.println(ans);
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        in.close();
    }
}