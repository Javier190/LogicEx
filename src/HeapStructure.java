import java.util.Iterator;
import java.util.PriorityQueue;

//TIPICA DE ENTREVISTAS

public class HeapStructure {

    public static void main(String[] args) {

        System.out.println("Hello Heap!");

        int[] arr = {102, 3, 2, 1, 15, 5, 4, 45, 88, 96, 50, 45};
        int size = arr.length;
        int k = 3;
        FirstKelements(arr, size, k);
    }


    public static void FirstKelements(int arr[], int size, int k) {

        System.out.println("ALA probando");

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int i = 0; i < k; i++) {
            minHeap.add(arr[i]);
        }

        for (int i = k; i < size; i++) {

            if (minHeap.peek() > arr[i]) {
                continue;
            } else {
                minHeap.poll();
                minHeap.add(arr[i]);
            }
        }

        Iterator iterator = minHeap.iterator();

        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }

}
