//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Scanner;

public class Student_Grading {
    public Student_Grading() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter student name: ");
        String name = sc.nextLine();
        int Subjects = 5;
        int TotalMarks = 0;
        int[] Marks = new int[Subjects];
        String[] SubjectName = new String[Subjects];
        System.out.println("Enter the Name and Marks in " + Subjects + " subjects: ");

        for(int i = 0; i < Subjects; ++i) {
            System.out.println("Enter Subject " + (i + 1) + " Name");
            SubjectName[i] = sc.nextLine();
            System.out.println("Enter Marks for " + SubjectName[i] + " :");
            Marks[i] = sc.nextInt();
            sc.nextLine();
            TotalMarks += Marks[i];
        }

        double AvgPercentage = (double)(TotalMarks / Subjects);
        String Grade;
        if (AvgPercentage >= 90.0) {
            Grade = "A";
        } else if (AvgPercentage >= 80.0) {
            Grade = "B";
        } else if (AvgPercentage >= 70.0) {
            Grade = "C";
        } else if (AvgPercentage >= 60.0) {
            Grade = "D";
        } else if (AvgPercentage >= 50.0) {
            Grade = "E";
        } else {
            Grade = "F";
        }

        System.out.println(" Results of " + name + " :");

        for(int i = 0; i < Subjects; ++i) {
            System.out.println(SubjectName[i] + ":" + Marks[i] + "/100");
        }

        System.out.println("Total Marks: " + TotalMarks + "/" + Subjects * 100);
        System.out.println("Percentage: " + AvgPercentage);
        System.out.println("Grade: " + Grade);
    }
}
