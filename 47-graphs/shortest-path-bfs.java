import java.util.*;

public class BFSDistance {

    public static void main(String[] args) {

        Queue<Integer> queue =
                new LinkedList<>();

        int[] dist = new int[5];

        Arrays.fill(dist,-1);

        dist[0] = 0;

        queue.add(0);

        while(!queue.isEmpty()) {

            int node =
                    queue.poll();

            // Process neighbors
        }
    }
}
