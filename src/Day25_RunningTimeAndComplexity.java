import java.util.Scanner;

/**
 * Tutorials > 30 Days of Code > Day 25: Running Time and Complexity
 *
 * https://www.hackerrank.com/challenges/30-running-time-and-complexity/
 * @author lizarragadev
 *
 */

public class Day25_RunningTimeAndComplexity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            System.out.println(isPrime(n) ? "Prime": "Not prime");
        }
    }

    static boolean isPrime(int n) {
        if(n <= 1) return false;
        else if(n == 2) return true;
        else if(n % 2 == 0) return false;
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if(n % i == 0)
                return false;
        }
        return true;
    }

    static boolean isPrime2(int n) {
        if(n == 1) return false;
        int i = 2;
        while (i <= n/2) {
            if(n % i == 0)
                return false;
            i++;
        }
        return true;
    }

    static int i = 2;
    static boolean isPrime3(int n) {
        if(n == 0 || n == 1)  return false;
        if(n == i) return true;
        if(n % i == 0) return false;
        i++;
        return isPrime3(n);
    }
}
