// Day 5
// Topic: If-Else Statements

import java.util.Scanner;

public class IfElseExample {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Even or Odd
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("Even Number");
        } else {
            System.out.println("Odd Number");
        }

        // Positive, Negative or Zero
        System.out.print("Enter another number: ");
        int n = sc.nextInt();

        if (n > 0) {
            System.out.println("Positive");
        } else if (n < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }

        // Maximum of Two Numbers
        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        if (a > b) {
            System.out.println("Max is: " + a);
        } else {
            System.out.println("Max is: " + b);
        }

        sc.close();
    }
}
