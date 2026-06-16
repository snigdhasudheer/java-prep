public class CoinChange {

    public static void main(String[] args) {

        int amount = 49;

        int[] coins =
                {20,10,5,2,1};

        int count = 0;

        for(int coin : coins) {

            while(amount >= coin) {

                amount -= coin;

                count++;

                System.out.print(
                        coin + " "
                );
            }
        }

        System.out.println(
                "\nCoins Used: "
                        + count
        );
    }
}
