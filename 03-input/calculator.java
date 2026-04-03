// Day 3
// Topic: Input using Scanner
// Program: Simple Calculator

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        // Operations
        int sum = a + b;
        int diff = a - b;
        int mul = a * b;

        // Output
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + diff);
        System.out.println("Multiplication: " + mul);

        sc.close();
    }
}
