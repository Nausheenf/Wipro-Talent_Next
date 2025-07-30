import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask user how many elements they want to enter
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Input the elements
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Initialize max and min with first element
        int max = arr[0];
        int min = arr[0];

        // Find max and min
        for (int i = 1; i < n; i++) {
            max = Math.max(max, arr[i]);
            min = Math.min(min, arr[i]);
        }

        // Output the results
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);

        sc.close();
    }
}
