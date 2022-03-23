import java.util.Scanner;

/**
 * Tutorials > 30 Days of Code > Day 14: Scopes
 *
 * https://www.hackerrank.com/challenges/30-scope/
 * @author lizarragadev
 *
 */

public class Day14_Scopes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();
        Difference difference = new Difference(a);
        difference.computeDifference();
        System.out.print(difference.maximumDifference);
    }
}

class Difference {
    private int[] elements;
    public int maximumDifference;
    int elementSize;
    int absoluteDiff;

    Difference(int[] elements) {
        this.elements = elements;
        this.maximumDifference = 0;
        this.elementSize = elements.length;
    }

    void computeDifference() {
        for (int i = 0; i < elementSize; i++) {
            for(int j = 0; j < elementSize; j++) {
                absoluteDiff = elements[i] - elements[j];
                if(absoluteDiff > maximumDifference)
                    maximumDifference = absoluteDiff;
            }
        }
    }
}