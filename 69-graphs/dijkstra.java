import java.util.Arrays;

public class DijkstraDemo {

    static final int INF = Integer.MAX_VALUE;

    static void dijkstra(int[][] graph, int src){

        int n = graph.length;

        int[] dist = new int[n];

        boolean[] visited = new boolean[n];

        Arrays.fill(dist, INF);

        dist[src] = 0;

        for(int count=0; count<n-1; count++){

            int u = -1;
            int min = INF;

            for(int i=0;i<n;i++){
                if(!visited[i] && dist[i] < min){
                    min = dist[i];
                    u = i;
                }
            }

            visited[u] = true;

            for(int v=0; v<n; v++){

                if(graph[u][v] != 0 &&
                   !visited[v] &&
                   dist[u] != INF &&
                   dist[u] + graph[u][v] < dist[v]){

                    dist[v] = dist[u] + graph[u][v];
                }
            }
        }

        System.out.println(Arrays.toString(dist));
    }

    public static void main(String[] args){

        int[][] graph = {
            {0,4,2,0},
            {4,0,5,0},
            {2,5,0,1},
            {0,0,1,0}
        };

        dijkstra(graph,0);
    }
}
