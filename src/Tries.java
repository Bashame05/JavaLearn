public class Tries {
    static class Node{
        Node[] children;
        boolean eow;

        public Node(){
            children = new Node[26];
            for(int i = 0 ; i<26 ; i++){
                children[i] = null;
            }
            eow = false;
        }
    }
    static Node root = new Node();
        public static void insert(String word){
            Node curr = root;
            for(int i = 0; i<word.length();i++){
                 int idx = word.charAt(i) - 'a';
                 //if that letter or its prefix doesn't exist we create
                //a new node in the char array for that root
                 if(curr.children[idx]==null){
                     curr.children[idx]=new Node();
                 }
                 //we check if it's the end of word and set our flag to true
                 if(i==word.length()-1){
                     curr.children[idx].eow = true;
                 }
                 //we pass on the root reference to our current idx
                 curr = curr.children[idx];
            }
        }
        public static boolean search(String key){
            Node curr = root;
            for(int i=0 ; i<key.length() ; i++){
                int idx = key.charAt(i)-'a';

                if(curr.children[idx]==null){
                    return false;
                }

                if(i==key.length()-1 && curr.children[idx].eow == false){
                    return false;
                }
                curr=curr.children[idx];
            }
            return true;
        }

    public static void main(String[] args) {
        System.out.println("but if you're too drunk to drive and the music is right");
        String[] words = {"the","a","there","their","any"};
        for(String i : words){
            insert(i);
        }
        System.out.println(search("there"));
    }
}
