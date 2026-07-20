public class SegmentTree{

    static int[] tree =
            new int[100];

    static void build(
            int[] arr,
            int node,
            int start,
            int end){

        if(start==end){

            tree[node]=
                    arr[start];

            return;
        }

        int mid =
                (start+end)/2;

        build(arr,
                2*node,
                start,
                mid);

        build(arr,
                2*node+1,
                mid+1,
                end);

        tree[node]=
                tree[2*node]
                        +
                tree[2*node+1];
    }

    public static void main(String[] args){

        int[] arr =
                {1,2,3,4};

        build(arr,1,0,3);

        System.out.println(
                tree[1]);
    }
}
