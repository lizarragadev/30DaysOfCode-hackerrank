import java.util.Scanner;

public class Day04_ClassVsInstance {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        if(t >= 1 && t <= 4) {
            for(int i = 1; i <= t; i++) {
                int age = in.nextInt();
                if(age >= -5 && age <= 30) {
                    Person1 p = new Person1(age);
                    p.amIOld();
                    for (int j = 0; j < 3; j++) {
                        p.yearPasses();
                    }
                    p.amIOld();
                }
                System.out.println("");
            }
        }
    }
}

class Person1 {
    int age;
    public Person1(int initialAge) {
        if(initialAge > 0) {
            this.age = initialAge;
        } else {
            this.age = 0;
            System.out.println("Age is not valid, setting age to 0.");
        }
    }

    public void yearPasses() {
        this.age++;
    }

    public void amIOld() {
        if(this.age < 13) {
            System.out.println("You are young.");
        } else {
            if(this.age >= 13 && this.age <18) {
                System.out.println("You are a teenager.");
            } else {
                System.out.println("You are old.");
            }
        }
    }
}