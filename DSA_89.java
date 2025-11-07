public class DSA_89 {
    private static void heapify(int[] arr, int n, int i ){
        int largest  = i;
        int left = 2*i+1;
        int right = 2*i+2;
        if(left < n && arr[left] > arr[largest]){
            largest = left;
        }
        if(right < n && arr[right] > arr[largest]){
            largest = right;
        }
        if(largest != i){
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;
        
            heapify(arr, n, largest);
        }
    }
    public static void buildMaxHeap(int[] arr, int n){
        int start = n/2-1;
        for(int i = start; i>= 0; i--){
            heapify(arr, n, i);
        }
    }
    public static void printHeap(int[] arr){
        for(int num: arr){
            System.out.print(num+ " ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        int[] arr = {21,65, 13, 15, 19, 20, 27};
        int n = arr.length;
        System.out.println("THE ORIGINAL HEAP ARRAY: ");
        printHeap(arr);
        System.out.println("THE MAX HEAP AFTER BUIDING HEAP: ");
        buildMaxHeap(arr, n);
        printHeap(arr);

    }
}
