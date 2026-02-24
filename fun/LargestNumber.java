import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of elements (n): ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a valid number!");
            return;
        }

        int[] numbers = new int[n];

        // Input numbers in array
        for (int i = 0; i < n; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        // Find max in array
        int max = numbers[0];
        for (int i = 1; i < n; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.println("The largest number is: " + max);
        sc.close();
    }
}
