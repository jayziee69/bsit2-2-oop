import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("ENTER STUDENT ID: ");
        String studentId = scanner.nextLine();

        System.out.print("ENTER FIRST NAME: ");
        String firstName = scanner.nextLine();

        System.out.print("ENTER LAST NAME: ");
        String lastName = scanner.nextLine();

        System.out.print("ENTER COURSE: ");
        String course = scanner.nextLine();

        System.out.print("ENTER SECTION: ");
        String section = scanner.nextLine();

        System.out.println("\nSTUDENT SCORE");
        System.out.println("STUDENT ID: " + studentId);
        System.out.println("STUDENT NAME: " + firstName + " " + lastName);
        System.out.println("COURSE: " + course);
        System.out.println("SECTION: " + section);

        System.out.print("\nENTER YOUR MIDTERM EXAM SCORE (out of 100): ");
        int midtermScore = scanner.nextInt();

        System.out.print("ENTER YOUR FINAL EXAM SCORE (out of 100): ");
        int finalScore = scanner.nextInt();

        System.out.print("ENTER YOUR PROJECT SCORE (out of 100): ");
        int projectScore = scanner.nextInt();

        System.out.print("ENTER YOUR ATTENDANCE SCORE (out of 100): ");
        int attendanceScore = scanner.nextInt();

        int totalScore = midtermScore + finalScore + projectScore + attendanceScore;
        double averageScore = (double) totalScore / 400 * 100;

        String remarks = (averageScore < 75) ? "FAILED" : "PASSED";

        System.out.println("\nSTUDENT SCORE");
        System.out.println("MIDTERM EXAM SCORE: " + midtermScore);
        System.out.println("FINAL EXAM SCORE: " + finalScore);
        System.out.println("PROJECT SCORE: " + projectScore);
        System.out.println("ATTENDANCE SCORE: " + attendanceScore);
        System.out.println("AVERAGE SCORE: " + averageScore + "%");
        System.out.println("REMARKS: " + remarks);

        scanner.close();
    }
}