import java.util.Scanner;

public class Main{

public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the marks from the teacher
        System.out.print("Enter the student's marks: ");
        int marks = scanner.nextInt();

        // Determine the student's achievement level
        String achievementLevel;
        if (marks >= 90 && marks <= 100) {
            achievementLevel = "Outstanding Achievement!";
        } else if (marks >= 80 && marks < 90) {
            achievementLevel = "Excellent Achievement!";
        } else if (marks >= 70 && marks < 80) {
            achievementLevel = "Good Achievement!";
        } else if (marks >= 60 && marks < 70) {
            achievementLevel = "Average Achievement!";
        } else if (marks >= 50 && marks < 60) {
            achievementLevel = "Below Average Achievement!";
        } else if (marks >= 0 && marks < 50) {
            achievementLevel = "Fail!";
        } else {
            achievementLevel = "Invalid marks entered!";
        }

        // Display the student's achievement level
        System.out.println("The student's achievement level is: " + achievementLevel);
    }
}