import java.util.*;

public class Day12_Inheritance {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fiName = sc.next();
        String laName = sc.next();
        int idNum = sc.nextInt();
        if(!fiName.equals("") && !laName.equals("") && Integer.toString(idNum).length() == 7) {
            int n = sc.nextInt();
            int[] lis = new int[n];
            for (int i = 0; i < n; i++) {
                lis[i] = sc.nextInt();
            }
            Student st = new Student(fiName, laName, idNum, lis);
            System.out.println("Name: " + st.lastName + ", " + st.firstName +
                    "\nID: "+ st.idNumber+
                    "\nGrade: " + st.grade);
        }
    }
}

class Student extends Person2 {
    int idNumber;
    int[] score;
    char grade;

    public Student(String fn, String ln, int id, int[] score) {
        super(fn, ln);
        this.idNumber = id;
        this.score = score;
        int average = (int) Arrays.stream(score).average().getAsDouble();
        if(average >= 90 && average <= 100) grade = 'O';
        else if(average >= 80 && average < 90) grade = 'E';
            else if(average >= 70 && average < 80) grade = 'A';
                else if(average >= 55 && average < 70) grade = 'P';
                    else if(average >= 40 && average < 55) grade = 'D';
                        else grade = 'T';
    }
}

class Person2 {
    String firstName;
    String lastName;

    public Person2(String fn, String ln) {
        this.firstName = fn;
        this.lastName = ln;
    }
}