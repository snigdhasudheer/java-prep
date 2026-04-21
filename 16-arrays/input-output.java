// Input and print array

import java.util.Scanner;

public class ArrayIO {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Input
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Output
        System.out.println("Array elements:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
