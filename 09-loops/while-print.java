// Print numbers from 1 to N using while

import java.util.Scanner;

public class WhilePrint {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = sc.nextInt();

        int i = 1;

        while (i <= n) {
            System.out.println(i);
            i++;
        }

        sc.close();
    }
}
