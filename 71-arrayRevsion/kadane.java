public class Kadane {

    public static void main(String[] args){

        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};

        int current = arr[0];
        int best = arr[0];

        for(int i = 1; i < arr.length; i++){

            current = Math.max(arr[i], current + arr[i]);

            best = Math.max(best, current);
        }

        System.out.println(best);
    }
}
