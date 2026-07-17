public class SingleNumber {

    public static void main(String[] args){

        int[] arr =
                {2,3,2,4,4};

        int ans = 0;

        for(int x : arr)

            ans ^= x;

        System.out.println(ans);
    }
}
