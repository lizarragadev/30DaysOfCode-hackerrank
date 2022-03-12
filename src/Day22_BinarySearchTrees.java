import java.util.*;
import java.io.*;
class Node2{
    Node2 left,right;
    int data;
    Node2(int data){
        this.data=data;
        left=right=null;
    }
}
class Day22_BinarySearchTrees{

    public static int getHeight(Node2 root){
        int rightHeight = 0;
        int leftHeight = 0;
        if(root == null) {
            return 0;
        }
        if(root.left != null) {
            leftHeight = getHeight(root.left) + 1;
        }
        if(root.right != null) {
            rightHeight = getHeight(root.right) + 1;
        }
        if(leftHeight > rightHeight) {
            return leftHeight;
        } else {
            return rightHeight;
        }
    }

    public static Node2 insert(Node2 root,int data){
        if(root==null){
            return new Node2(data);
        }
        else{
            Node2 cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        Node2 root=null;
        while(T-->0){
            int data=sc.nextInt();
            root=insert(root,data);
        }
        int height=getHeight(root);
        System.out.println(height);
    }
}