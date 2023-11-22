import java.util.Scanner;

public class Main {
    // Define the students
    static String[] students = {"Sari", "Rina", "Yani", "Dwi", "Lusi"};

    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Create a 2D array to store the grades
        int[][] grades = new int[students.length][7];

        // Loop over each student
        for (int i = 0; i < students.length; i++) {
            System.out.println("Enter the grades for " + students[i] + ":");

            // Loop over each week
            for (int j = 0; j < 7; j++) {
                System.out.println("Week " + (j + 1) + ": ");
                grades[i][j] = scanner.nextInt();
            }
        }

        // Close the scanner
        scanner.close();

        // Print the grades
        printGrades(students, grades);
    }

    // Function to print out the grades for each student for each week
    static void printGrades(String[] students, int[][] grades) {
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i] + "'s grades:");
            for (int j = 0; j < grades[i].length; j++) {
                System.out.println("Week " + (j + 1) + ": " + grades[i][j]);
            }
            System.out.println();
        }
    }
}
