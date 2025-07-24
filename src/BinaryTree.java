import java.util.Queue;
import java.util.LinkedList;


public class BinaryTree {
    static class Node{
        int data;
        Node leftSubTree;
        Node rightSubTree;

        Node(int data){
            this.data = data;
            this.leftSubTree=null;
            this.rightSubTree=null;
        }
    }
    static class binaryTree{
        static int idx = -1;
        public  Node createBinaryTree(int[] nodes){
            idx++;
            if(nodes[idx]==-1) return null;

            Node newNode = new Node(nodes[idx]);
            newNode.leftSubTree=createBinaryTree(nodes);
            newNode.rightSubTree=createBinaryTree(nodes);
            return newNode;
        }
        public  void preOrderTraversal(Node root){
            if(root==null) return;
            System.out.print(root.data+" ");
            preOrderTraversal(root.leftSubTree);
            preOrderTraversal(root.rightSubTree);
        }
        public  void inOrderTraversal(Node root){
            if(root == null) return;
            inOrderTraversal(root.leftSubTree);
            System.out.print(root.data + " ");
            inOrderTraversal(root.rightSubTree);
        }
        public void postOrderTraversal(Node root){
            if(root==null) return;
            postOrderTraversal(root.leftSubTree);
            postOrderTraversal(root.rightSubTree);
            System.out.print(root.data+" ");
        }
        public void levelOrderTraversal(Node root){
            if(root == null) return;
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);
            while(!q.isEmpty()){
                Node currNode = q.remove();
                if(currNode==null){
                    System.out.println();
                    if(q.isEmpty()){
                        break;
                    }else{
                        q.add(null);
                    }
                }else{
                    System.out.print(currNode.data+" ");
                    if(currNode.leftSubTree != null){
                        q.add(currNode.leftSubTree);
                    }
                    if (currNode.rightSubTree != null){
                        q.add(currNode.rightSubTree);
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] nodes = {1, 2, 3, -1, -1, 4, -1, 5, -1, -1, -1};

        binaryTree tree = new binaryTree();
        Node root = tree.createBinaryTree(nodes);
        System.out.print("Pre Order Traversal -> ");
        tree.preOrderTraversal(root);
        System.out.println();
        System.out.print("In Order Traversal -> ");
        tree.inOrderTraversal(root);
        System.out.println();
        System.out.print("Post Order Traversal -> ");
        tree.postOrderTraversal(root);
        System.out.println();
        System.out.println("Level Order Traversal");
        tree.levelOrderTraversal(root);
    }
}
