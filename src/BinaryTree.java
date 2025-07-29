import java.util.Queue;
import java.util.LinkedList;


public class BinaryTree {
    static int diameter = 0;
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
            while(!q.isEmpty()){
                int levelSize = q.size();
                for(int i = 0; i<levelSize ; i++){
                    Node currNode = q.remove();
                    System.out.print(currNode.data+" ");
                    if(currNode.leftSubTree != null){
                        q.add(currNode.leftSubTree);
                    }
                    if(currNode.rightSubTree != null){
                        q.add(currNode.rightSubTree);
                    }
                }
                System.out.println();
            }
        }
        public int countNodes(Node root){
            if(root==null) return 0;
            int leftNodes = countNodes(root.leftSubTree);
            int rightNodes= countNodes(root.rightSubTree);
            return leftNodes + rightNodes + 1;
        }
        public int sumOfNodes(Node root){
            if(root==null) return 0;
            int leftSum = sumOfNodes(root.leftSubTree);
            int rightSum = sumOfNodes(root.rightSubTree);
            return leftSum + rightSum + root.data;
        }
        public int heightOfTreeByEdges(Node root){
            if(root==null) return -1;
            int leftHeight = heightOfTreeByEdges(root.leftSubTree);
            int rightHeight = heightOfTreeByEdges(root.rightSubTree);
            diameter = Math.max(diameter,leftHeight+rightHeight+2);
            return Math.max(leftHeight,rightHeight)+1;
        }
        public int heightOfTreeByNodes(Node root){
            if(root==null) return 0;
            int leftHeight = heightOfTreeByNodes(root.leftSubTree);
            int rightHeight = heightOfTreeByNodes(root.rightSubTree);
            return Math.max(leftHeight,rightHeight)+1;
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
        System.out.println("The total no of nodes in our tree are "+tree.countNodes(root));
        System.out.println("The sum of the elements of the nodes in our tree is "+tree.sumOfNodes(root));
        System.out.println("The height of our current tree by edges is "+tree.heightOfTreeByEdges(root));
        System.out.println("The height of our current tree by nodes is "+tree.heightOfTreeByNodes(root));
        System.out.println("The diameter of our current tree is "+diameter);
    }
}
