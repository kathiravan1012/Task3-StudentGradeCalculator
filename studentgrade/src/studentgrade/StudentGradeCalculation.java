package studentgrade;
import java.util.Scanner;
public class StudentGradeCalculation {
	    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of grades: ");
        int numberOfGrades = scanner.nextInt();
        double[] grades = new double[numberOfGrades];

        for (int i = 0; i < numberOfGrades; i++) {
            System.out.print("Enter grade " + (i + 1) + ": ");
            grades[i] = scanner.nextDouble();
        }

        double sum = 0;
        for (int i = 0; i < numberOfGrades; i++) {
            sum += grades[i];
        }
        double average = sum / numberOfGrades;

        
        System.out.println("The average grade is: " + average);

        scanner.close();
    }

}
