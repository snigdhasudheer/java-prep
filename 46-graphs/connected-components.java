import java.util.*;

public class ConnectedComponents {

    static void dfs(
            int node,
            ArrayList<ArrayList<Integer>> graph,
            boolean[] visited) {

        visited[node] = true;

        for(int neighbor :
                graph.get(node)) {

            if(!visited[neighbor])
                dfs(
                        neighbor,
                        graph,
                        visited);
        }
    }

    public static void main(String[] args) {

        int V = 5;

        ArrayList<ArrayList<Integer>>
                graph = new ArrayList<>();

        for(int i=0;i<V;i++)
            graph.add(
                    new ArrayList<>());

        graph.get(0).add(1);
        graph.get(1).add(0);

        graph.get(2).add(3);
        graph.get(3).add(2);

        boolean[] visited =
                new boolean[V];

        int count = 0;

        for(int i=0;i<V;i++) {

            if(!visited[i]) {

                dfs(
                        i,
                        graph,
                        visited);

                count++;
            }
        }

        System.out.println(
                "Components: "
                        + count);
    }
}
