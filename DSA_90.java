import java.util.*;
public class DSA_90 {
    public static int kthLargestelement(int[] arr, int k){
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for(int num: arr){
            queue.add(num);
            if(queue.size() > k){
                queue.poll();
            }
        }
        return queue.peek();


    }
    public static void main(String[] args){
        int[] arr = {21, 31, 14, 15, 16, 18, 19};
        int k = 3;
        int result = kthLargestelement(arr, k);
        System.out.println("THE "+ k +" LARGEST ELEMeNT : "+result);

    }
}
