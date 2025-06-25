package ArrayBasic;

import java.util.Scanner;

public class simple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Declare array and sum variable
        int[] numbers = new int[5];
        int sum = 0;

        // Take 5 input numbers
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < 5; i++) {
            numbers[i] = sc.nextInt();
            sum += numbers[i];  // Add to sum
        }

        // Display the result
        System.out.println("Sum of the array elements is: " + sum);
    }
}

