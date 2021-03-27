package heaps;


public class MinHeapUse {


    public static void main(String[] args) {
        MinHeap minHeap = new MinHeap();


        minHeap.add(4);
        minHeap.add(5);
        minHeap.add(1);
        minHeap.add(10);
        minHeap.add(-5);

        System.out.println(minHeap.removeMin());
    }
}
