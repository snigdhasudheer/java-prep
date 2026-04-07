// Problem 1: Calculator using if-else

import java.util.Scanner;

public class CalcIfElse {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.print("Enter operator (+, -, *, /): ");
        char op = sc.next().charAt(0);

        if (op == '+') {
            System.out.println("Result: " + (a + b));
        } else if (op == '-') {
            System.out.println("Result: " + (a - b));
        } else if (op == '*') {
            System.out.println("Result: " + (a * b));
        } else if (op == '/') {
            if (b != 0)
                System.out.println("Result: " + (a / b));
            else
                System.out.println("Cannot divide by zero");
        } else {
            System.out.println("Invalid operator");
        }

        sc.close();
    }
}
