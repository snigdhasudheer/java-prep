public class TwoPointers {

    public static void main(String[] args){

        int[] arr =
                {1,2,3,4,6};

        int target = 6;

        int left = 0;
        int right =
                arr.length-1;

        while(left < right){

            int sum =
                    arr[left]
                    + arr[right];

            if(sum == target){

                System.out.println(
                        left + " "
                        + right);

                break;
            }

            if(sum < target)
                left++;

            else
                right--;
        }
    }
}
