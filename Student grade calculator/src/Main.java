import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("***Enter marks for five subjects ***");

        // Input marks for five subjects
        double[] subjectMarks = new double[5];
        for (int i = 0; i < 5; i++) {
            System.out.print(" Enter marks for subject " + (i + 1) + ": ");
            subjectMarks[i] = scanner.nextDouble();
        }

        // Calculate average
        double average = calculateAverage(subjectMarks);

        // Determine grade based on average
        char grade = calculateGrade(average);

        // Display results
        System.out.println("The average marks are: " + average);
        System.out.println("The grade is: " + grade);

        // Close the scanner to prevent resource leak
        scanner.close();
    }

    private static double calculateAverage(double[] marks) {
        double total = 0;
        for (double mark : marks) {
            total += mark;
        }
        return total / marks.length;
    }

    private static char calculateGrade(double average) {
        char grade;

        if (average >= 90) {
            grade = 'A';
        } else if (average >= 80) {
            grade = 'B';
        } else if (average >= 70) {
            grade = 'C';
        } else if (average >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        return grade;
    }
}
