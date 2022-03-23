import java.util.*;

/**
 * Tutorials > 30 Days of Code > Day 12: Inheritance
 *
 * https://www.hackerrank.com/challenges/30-inheritance/
 * @author lizarragadev
 *
 */

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
            Student stud = new Student(fiName, laName, idNum, lis);
            stud.displayPerson();
            stud.displayGrade();
        }
    }
}

class Student extends Person2 {
    int[] score;

    public Student(String firstName, String lastName, int idNumber, int[] score) {
        super(firstName, lastName, idNumber);
        this.score = score;
    }

    public char calculate() {
        int average = (int) Arrays.stream(score).average().getAsDouble();
        if(average >= 90 && average <= 100) return 'O';
        else if(average >= 80 && average < 90) return 'E';
        else if(average >= 70 && average < 80) return 'A';
        else if(average >= 55 && average < 70) return 'P';
        else if(average >= 40 && average < 55) return 'D';
        else return 'T';
    }

    public void displayGrade() {
        System.out.println("Grade: " + calculate());
    }
}

class Person2 {
    String firstName;
    String lastName;
    int idNumber;

    public Person2(String firstName, String lastName, int idNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = idNumber;
    }

    public void displayPerson() {
        System.out.println("Name: " + lastName + ", " + firstName+ "\nID: "+ idNumber);
    }
}