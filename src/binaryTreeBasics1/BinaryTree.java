package binaryTreeBasics1;
import java.util.Scanner;

class Node{
    int data;
    Node left,right;
    public Node(int data){
        this.data = data;
    }
}
public class BinaryTree {
    Scanner sc = new Scanner(System.in);
    Node root;
//    public BinaryTree(){
//        sc = new Scanner(System.in);
//    }
    Node createBinaryTree(){
        System.out.println("Enter node data");
        int data = sc.nextInt();
        if(data==-1)return null;

        Node node = new Node(data);
        System.out.println("Enter "+data+" 's left data");
        node.left = createBinaryTree();

        System.out.println("Enter "+data+ " 's right data");
        node.right = createBinaryTree();
        return node;
    }

    void inOrderTraversal(Node root){
        if(root==null) return;

        inOrderTraversal(root.left);
        System.out.println(root.data);
        inOrderTraversal(root.right);
    }
    void PreorderTraversal(Node root){
        if(root==null)return;
        System.out.println(root.data);
        PreorderTraversal(root.left);
        PreorderTraversal(root.right);
    }
    void PostorderTraversal(Node root){
        if(root==null)return;
        PostorderTraversal(root.left);
        PostorderTraversal(root.right);
        System.out.println(root.data);
    }
    int height(Node root){
        if(root==null)return 0;
        int lh,rh;
        lh = height(root.left);
        rh = height(root.right);
        return Math.max(lh,rh)+1;
    }
    void printNodesAtKDistance(Node root,int k){
        if(root==null)return;
        if(k==0) System.out.println(root.data);
        printNodesAtKDistance(root.left,k-1);
        printNodesAtKDistance(root.right,k-1);
    }
    public static void main(String[] args) {

        BinaryTree bTree = new BinaryTree();
        Node root = bTree.createBinaryTree();
        bTree.inOrderTraversal(root);
        bTree.PreorderTraversal(root);
        bTree.PostorderTraversal(root);
      //  bTree.height(root);
        System.out.println( bTree.height(root));
        bTree.printNodesAtKDistance(root,1);

    }
}
