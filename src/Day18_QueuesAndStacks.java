import java.io.*;
import java.util.*;

public class Day18_QueuesAndStacks {
    // Write your code here.
    Stack<Character> stack = new Stack<Character>();
    Queue<Character> queue = new LinkedList<Character>();

    public void pushCharacter(char c) {
        stack.push(c);
    }

    public void enqueueCharacter(char c) {
        queue.add(c);
    }

    public char popCharacter() {
        return stack.pop();
    }

    public char dequeueCharacter() {
        return queue.poll();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        char[] s = input.toCharArray();

        Day18_QueuesAndStacks p = new Day18_QueuesAndStacks();

        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        boolean isPalindrome = true;
        for (int i = 0; i < s.length/2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println( "The word, " + input + ", is "
                + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
    }
}