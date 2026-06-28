public class RatMaze {

    static int N=3;

    static boolean solve(
            int[][] maze,
            int i,
            int j){

        if(i==N-1 &&
           j==N-1){

            return true;
        }

        if(i>=N || j>=N
           || maze[i][j]==0)

            return false;

        maze[i][j]=2;

        if(solve(maze,i+1,j))
            return true;

        if(solve(maze,i,j+1))
            return true;

        maze[i][j]=1;

        return false;
    }

    public static void main(String[] args){

        int[][] maze={
                {1,0,0},
                {1,1,0},
                {0,1,1}
        };

        System.out.println(
                solve(maze,0,0));
    }
}
