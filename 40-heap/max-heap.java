// Max Heap using PriorityQueue

import java.util.Collections;
import java.util.PriorityQueue;

public class MaxHeapDemo {

    public static void main(String[] args) {

        PriorityQueue<Integer> pq =
            new PriorityQueue<>(
                Collections.reverseOrder()
            );

        pq.add(40);
        pq.add(10);
        pq.add(30);
        pq.add(20);

        while(!pq.isEmpty()) {

            System.out.print(
                pq.poll() + " "
            );
        }
    }
}
