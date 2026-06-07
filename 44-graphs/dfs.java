import java.util.*;

public class DFS {

    static void dfs(
        ArrayList<ArrayList<Integer>> graph,
        int node,
        boolean[] visited
    ) {

        visited[node] = true;

        System.out.print(node + " ");

        for(int neighbor :
                graph.get(node)) {

            if(!visited[neighbor]) {

                dfs(
                    graph,
                    neighbor,
                    visited
                );
            }
        }
    }
}
