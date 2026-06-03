// Largest element using Max Heap

import java.util.Collections;
import java.util.PriorityQueue;

public class LargestElement {

    public static void main(String[] args) {

        int[] arr = {4,2,9,1,7};

        PriorityQueue<Integer> pq =
            new PriorityQueue<>(
                Collections.reverseOrder()
            );

        for(int num : arr)
            pq.add(num);

        System.out.println(
            "Largest: " + pq.poll()
        );
    }
}
