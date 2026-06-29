public class Subsets {

    static void generate(
            String str,
            String curr,
            int index){

        if(index==str.length()){

            System.out.println(curr);

            return;
        }

        generate(
                str,
                curr +
                        str.charAt(index),
                index+1);

        generate(
                str,
                curr,
                index+1);
    }

    public static void main(String[] args){

        generate(
                "ABC",
                "",
                0);

    }
}
