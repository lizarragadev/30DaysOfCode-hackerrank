import java.util.Scanner;

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