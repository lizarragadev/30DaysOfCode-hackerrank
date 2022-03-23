import java.util.Scanner;

/**
 * Tutorials > 30 Days of Code > Day 19: Interfaces
 *
 * https://www.hackerrank.com/challenges/30-interfaces/
 * @author lizarragadev
 *
 */

class CalculatorImp implements AdvancedArithmetic {
    @Override
    public int divisorSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if(n % i == 0) {
                sum+=i;
            }
        }
        return sum;
    }
}

interface AdvancedArithmetic {
    int divisorSum(int n);
}

public class Day19_Interfaces {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();

        AdvancedArithmetic myCalculator = new CalculatorImp();
        int sum = myCalculator.divisorSum(n);
        System.out.println("I implemented: " + myCalculator.getClass().getInterfaces()[0].getName() );
        System.out.println(sum);
    }
}