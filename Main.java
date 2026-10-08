import java.util.Scanner;

class Student {
    String studentName;
    int rollNumber;
    int marks;
    String courseName;
    int courseCredits;

    Student(String studentName, int rollNumber, int marks, String courseName, int courseCredits) {
        this.studentName = studentName;
        this.rollNumber = rollNumber;
        this.marks = marks;
        this.courseName = courseName;
        this.courseCredits = courseCredits;
    }

    public double calculateFee() {
        return courseCredits * 1500;
    }

    public boolean checkEligibility() {
        return marks >= 50;
    }

    public double calculateScholarship(double fee) {
        if (marks >= 85) {
            return fee * 0.20;
        } else if (marks >= 70) {
            return fee * 0.10;
        } else {
            return 0;
        }
    }

    public double calculateFinalFee(double fee, double scholarship) {
        return fee - scholarship;
    }

    public void displayDetails() {
        double fee = calculateFee();
        double scholarship = calculateScholarship(fee);
        double finalFee = calculateFinalFee(fee, scholarship);

        System.out.println("\n--- Student Course Registration Details ---");
        System.out.println("Name: " + studentName);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
        System.out.println("Course: " + courseName);
        System.out.println("Credits: " + courseCredits);
        System.out.println("Eligibility: " + (checkEligibility() ? "Eligible" : "Not Eligible"));
        System.out.println("Total Fee: Rs. " + fee);
        System.out.println("Scholarship: Rs. " + scholarship);
        System.out.println("Final Fee: Rs. " + finalFee);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Roll Number: ");
        int roll = sc.nextInt();

        System.out.print("Enter Marks: ");
        int marks = sc.nextInt();

        sc.nextLine();
        System.out.print("Enter Course Name: ");
        String course = sc.nextLine();

        System.out.print("Enter Course Credits: ");
        int credits = sc.nextInt();

        Student s = new Student(name, roll, marks, course, credits);

        if (s.checkEligibility()) {
            s.displayDetails();
        } else {
            System.out.println("\nStudent is not eligible for registration (marks below 50).");
        }

        sc.close();
    }
}
