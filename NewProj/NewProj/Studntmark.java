package NewProj;

import java.util.Scanner;

class Student {
    int studentID;
    String studentName;
    int marks1;
    int marks2;
    int marks3;
    int totalMarks;
    double percentage;
    char grade;

    void inputDetails() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Student ID: ");
        studentID = scanner.nextInt();
        scanner.nextLine();  

        System.out.print("Enter Student Name: ");
        studentName = scanner.nextLine();

        System.out.print("Enter Marks for Subject 1: ");
        marks1 = scanner.nextInt();

        System.out.print("Enter Marks for Subject 2: ");
        marks2 = scanner.nextInt();

        System.out.print("Enter Marks for Subject 3: ");
        marks3 = scanner.nextInt();
        
      
    }

    void calculatePercentage() {
        totalMarks = marks1 + marks2 + marks3;
        percentage = (double) totalMarks / 3.0;
    }

    void calculateGrade() {
        if (percentage >= 90) {
            grade = 'A';
        } else if (percentage >= 80) {
            grade = 'B';
        } else if (percentage >= 70) {
            grade = 'C';
        } else if (percentage >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
    }

    void displayDetails() {
        System.out.println("Student ID: " + studentID);
        System.out.println("Student Name: " + studentName);
        System.out.println("Marks for Subject 1: " + marks1);
        System.out.println("Marks for Subject 2: " + marks2);
        System.out.println("Marks for Subject 3: " + marks3);
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Percentage: " + percentage);
        System.out.println("Grade: " + grade);
    }
}


public class Studntmark {
	 public static void main(String[] args) {
	        Student student = new Student();
	        student.inputDetails();
	        student.calculatePercentage();
	        student.calculateGrade();
	        student.displayDetails();
	    }
	}


