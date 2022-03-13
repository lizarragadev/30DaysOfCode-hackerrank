import java.util.*;
import java.io.*;

class Node3{
    Node3 left,right;
    int data;
    Node3(int data){
        this.data=data;
        left=right=null;
    }
}
class Day23_BSTLevelOrderTraversal{

    static void levelOrder(Node3 root){
        if(root == null) {
            return;
        }
        Queue<Node3> queue = new LinkedList<Node3>();
        queue.add(root);
        while (queue.size() > 0) {
            Node3 top = queue.remove();
            System.out.print(top.data + " ");
            if(top.left != null) {
                queue.add(top.left);
            }
            if(top.right != null) {
                queue.add(top.right);
            }
        }
    }

    public static Node3 insert(Node3 root,int data){
        if(root==null){
            return new Node3(data);
        } else{
            Node3 cur;
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
        Node3 root=null;
        while(T-->0){
            int data=sc.nextInt();
            root=insert(root,data);
        }
        levelOrder(root);
    }
}
