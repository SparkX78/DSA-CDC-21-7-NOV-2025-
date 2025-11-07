import java.util.*;
public class DSA_92 {
    static class Node{
        int data;
        Node left, right;
        Node(int data){
            this.data = data;
            left=right=null;
        }
        
        public static boolean isValid_maxHeap(Node root){
            if(root == null) return true;
            Queue<Node> queue = new LinkedList<>();
            boolean nullSeen = false;
            queue.add(root);
            while(!queue.isEmpty()){
                Node current = queue.poll();
                if(current.left != null){
                    if(nullSeen || current.left.data > current.data) return false;
                    queue.add(current.left);
                }
                else{
                    nullSeen = true;
                }

                if(current.right != null){
                    if(nullSeen || current.right.data > current.data) return false;
                    queue.add(current.right);
                }
                else{
                    nullSeen = true;
                }
            }
            return true;

        }
    }
    public static void main(String[] args){
        Node root = new Node(97);
        root.left = new Node(46);
        root.right = new Node(37);
        root.right.left = new Node(7);
        root.right.right = new Node(31);
        root.left.left = new Node(12);
        root.left.left.left = new Node(6);
        root.left.left.right = new Node(9);
        root.left.right = new Node(3);

        System.out.println(root.isValid_maxHeap(root));

    }
}
