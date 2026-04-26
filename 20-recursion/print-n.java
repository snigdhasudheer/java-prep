// Print 1 to N using recursion

public class PrintN {

    static void print(int n) {
        if (n == 0) return;

        print(n - 1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        print(5);
    }
}
