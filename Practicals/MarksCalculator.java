package Array;

import java.util.Scanner;

public class MarksCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Accepting 5 subject marks from user
        double[] marks = new double[5]; // Create an array to store the marks
        for (int i = 0; i < 5; i++) { // Use a for loop to iterate over each subject
            System.out.print("Enter marks for subject " + (i+1) + ": ");
            marks[i] = scanner.nextDouble(); // Read the marks from the user and store them in the array
        }
        
        // Calculating total marks
        double total = 0; // Initialize the total to 0
        for (double mark : marks) { // Use a for-each loop to iterate over each mark in the array
            total += mark; // Add each mark to the total
        }
        
        // Calculating percentage
        double percentage = (total / 500) * 100; // Divide the total by 500 and multiply by 100 to get the percentage
        
        // Printing results
        System.out.println("Total marks: " + total); // Print the total marks
        System.out.println("Percentage: " + percentage + "%"); // Print the percentage
        
        scanner.close(); // Close the scanner to release its resources
    }
}