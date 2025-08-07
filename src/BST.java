public class BST {
   static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static class binarySearchTree{
       public Node insert(Node root , int val){
           if(root == null){
               root = new Node(val);
               return root;
           }else if(root.data>val){
               root.left = insert(root.left,val);
           }else{
               root.right = insert(root.right , val);
           }
           return root;
       }
       public void inOrderTraversal(Node root){
           if(root != null){
               inOrderTraversal(root.left);
               System.out.print(root.data + " ");
               inOrderTraversal(root.right);
           }
       }
       public boolean search(Node root , int key){
           if(root==null){
               return false;
           }
           if(root.data == key){
               return true;
           }else if(key> root.data){
               return search(root.right,key);
           }else{
               return search(root.left,key);
           }
       }
    }
    public static void main(String[] args) {
        System.out.println("ever since she cut her blue hair off...");
        int[] values = {5,1,4,3,2,7};
        Node root = null;
        binarySearchTree bst = new binarySearchTree();
        for(int i : values){
           root =  bst.insert(root,i);
        }
        bst.inOrderTraversal(root);
        System.out.println();
        if(bst.search(root,5)){
            System.out.println("key found inside the bst");
        }else{
            System.out.println("key not found inside the bst");
        }
    }
}
