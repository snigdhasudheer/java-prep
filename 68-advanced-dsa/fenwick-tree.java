public class FenwickTree{

    static int[] bit =
            new int[100];

    static void update(
            int index,
            int value){

        while(index < bit.length){

            bit[index] += value;

            index +=
                    index & -index;
        }
    }

    static int query(
            int index){

        int sum = 0;

        while(index > 0){

            sum += bit[index];

            index -=
                    index & -index;
        }

        return sum;
    }

    public static void main(String[] args){

        update(1,5);

        update(2,3);

        update(3,2);

        System.out.println(
                query(3));
    }
}
