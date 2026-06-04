package javaapplication28;

import java.util.Scanner;

public class Institution {
    String institutionName = "Mag Institution";
    class Student {
        String studentName;
        int rollNo;
        int[] marks;
        double average;
        String grade;
        public void addStudent(String name, int rollNo, int numSubjects) {
            this.studentName = name;
            this.rollNo = rollNo;
            this.marks = new int[numSubjects]; // Dynamically sized array
            System.out.println("Student details added successfully.");
        }
        public void addMarks(Scanner sc) {
            if (marks == null) {
                System.out.println("Please add student details first!");
                return;
            }
            System.out.println("Enter Marks:");
            for (int i = 0; i < marks.length; i++) {
                marks[i] = sc.nextInt();
            }
            System.out.println("Marks added successfully.");
        }

        // 3. Calculate Grade
        public void calculateGrade() {
            if (marks == null) {
                System.out.println("No marks available to calculate grade.");
                return;
            }
            
            int sum = 0;
            for (int mark : marks) {
                sum += mark;
            }
            average = (double) sum / marks.length;

            if (average >= 90) {
                grade = "A";
            } else if (average >= 75) {
                grade = "B";
            } else if (average >= 50) {
                grade = "C";
            } else {
                grade = "Fail";
            }
            System.out.println("Grade calculated successfully.");
        }

        public void displayDetails() {
            if (studentName == null) {
                System.out.println("No student data available.");
                return;
            }
            System.out.println("\nInstitution Name: " + institutionName);
            System.out.println("Student Name: " + studentName);
            System.out.println("Roll No: " + rollNo);
            
            System.out.print("Marks: ");
            for (int mark : marks) {
                System.out.print(mark + " ");
            }
            System.out.printf("\nAverage: %.2f\n", average);
            System.out.println("Grade: " + grade + "\n");
        }
    }
}
    
