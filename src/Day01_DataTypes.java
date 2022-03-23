import java.util.*;

/**
 * Tutorials > 30 Days of Code > Day 1: Data Types
 *
 * https://www.hackerrank.com/challenges/30-data-types/
 * @author lizarragadev
 *
 */

public class Day01_DataTypes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\n");
        int i = 4;
        double d = 4.0;
        String s = "HackerRank";

        System.out.println(i + sc.nextInt());
        System.out.println(d + sc.nextDouble());
        System.out.println(s + " " + sc.next());
    }
}
