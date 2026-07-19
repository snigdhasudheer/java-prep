class TrieNode{

    TrieNode[] child =
            new TrieNode[26];

    boolean isEnd;
}

public class TrieDemo{

    static TrieNode root =
            new TrieNode();

    static void insert(String word){

        TrieNode curr = root;

        for(char c :
                word.toCharArray()){

            int index = c-'a';

            if(curr.child[index]==null)

                curr.child[index] =
                        new TrieNode();

            curr =
                    curr.child[index];
        }

        curr.isEnd = true;
    }

    static boolean search(String word){

        TrieNode curr = root;

        for(char c :
                word.toCharArray()){

            int index = c-'a';

            if(curr.child[index]==null)

                return false;

            curr =
                    curr.child[index];
        }

        return curr.isEnd;
    }

    public static void main(String[] args){

        insert("java");

        System.out.println(
                search("java"));

        System.out.println(
                search("jav"));
    }
}
