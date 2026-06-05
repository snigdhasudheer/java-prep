import java.util.*;

public class BFS {

    static void bfs(
        ArrayList<ArrayList<Integer>> graph,
        int start
    ) {

        boolean[] visited =
                new boolean[graph.size()];

        Queue<Integer> queue =
                new LinkedList<>();

        queue.add(start);
        visited[start] = true;

        while(!queue.isEmpty()) {

            int node = queue.poll();

            System.out.print(node + " ");

            for(int neighbor :
                    graph.get(node)) {

                if(!visited[neighbor]) {

                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }
    }
}
