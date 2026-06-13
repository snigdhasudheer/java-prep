public class ActivitySelection {

    public static void main(String[] args) {

        int start[] = {1,3,0,5,8};
        int end[] = {2,4,6,7,9};

        int count = 1;

        int lastEnd = end[0];

        for(int i=1;i<start.length;i++) {

            if(start[i] >= lastEnd) {

                count++;

                lastEnd = end[i];
            }
        }

        System.out.println(
                "Activities: " + count
        );
    }
}
