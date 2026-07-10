public class StringHash {

    public static void main(String[] args){

        String s = "JAVA";

        int hash = 0;

        for(char c:s.toCharArray()){

            hash += c;
        }

        System.out.println(hash);
    }
}
