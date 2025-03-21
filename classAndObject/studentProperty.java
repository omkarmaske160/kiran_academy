package classAndObject;

import java.util.Scanner;

class StudentProperty {
    String name;
    int age;
    int rollNo;
    int subj1, subj2, subj3, subj4, subj5;

    public void getProp() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name, Age, RollNo, Subject 1, Subject 2, Subject 3, Subject 4, Subject 5");
        name = sc.next();
        age = sc.nextInt();
        rollNo = sc.nextInt();
        subj1 = sc.nextInt();
        subj2 = sc.nextInt();
        subj3 = sc.nextInt();
        subj4 = sc.nextInt();
        subj5 = sc.nextInt();
    }

    public void printProp() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Subject 1: " + subj1);
        System.out.println("Subject 2: " + subj2);
        System.out.println("Subject 3: " + subj3);
        System.out.println("Subject 4: " + subj4);
        System.out.println("Subject 5: " + subj5);
    }

    public void total() {
        int totalMarks = subj1 + subj2 + subj3 + subj4 + subj5;
        System.out.println("Total Marks: " + totalMarks);
    }

    public void percentage() {
        int totalMarks = subj1 + subj2 + subj3 + subj4 + subj5;
        double percentage = (totalMarks / 5.0);
        System.out.println("Percentage: " + percentage + "%");
    }

    public void grade() {
        double percentage = (subj1 + subj2 + subj3 + subj4 + subj5) / 5.0;
        if (percentage >= 90) {
            System.out.println("Grade: A");
        } else if (percentage >= 75) {
            System.out.println("Grade: B");
        } else if (percentage >= 60) {
            System.out.println("Grade: C");
        } else if (percentage >= 40) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F (Fail)");
        }
    }
}
