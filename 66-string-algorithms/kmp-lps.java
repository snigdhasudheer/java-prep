public class KMP {

    static void computeLPS(String pat){

        int n = pat.length();

        int[] lps = new int[n];

        int len = 0;

        int i = 1;

        while(i < n){

            if(pat.charAt(i)==pat.charAt(len)){

                len++;

                lps[i]=len;

                i++;

            }

            else{

                if(len!=0){

                    len=lps[len-1];

                }

                else{

                    lps[i]=0;

                    i++;
                }
            }
        }

        for(int x:lps)
            System.out.print(x+" ");
    }

    public static void main(String[] args){

        computeLPS("ABABCABAB");

    }
}
