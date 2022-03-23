import java.util.Scanner;

/**
 * Tutorials > 30 Days of Code > Day 16: Exceptions String to Integer
 *
 * https://www.hackerrank.com/challenges/30-exceptions-string-to-integer/
 * @author lizarragadev
 *
 */

class Day16_ExceptionsStringToInteger {

    public static void main(String []argh){
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        try {
            int s = Integer.parseInt(S);
            System.out.println(s);
        } catch (Exception e) {
            System.out.println("Bad String");
        }
    }
}