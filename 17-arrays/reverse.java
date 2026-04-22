// Reverse array using two pointers

public class ReverseArray {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            // swap
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

        // print result
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
