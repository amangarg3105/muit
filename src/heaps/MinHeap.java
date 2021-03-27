package heaps;

import java.util.ArrayList;

/**
 * @author amgarg
 */
public class MinHeap {

    ArrayList<Integer> data;


    MinHeap() {
        data = new ArrayList<>();
        data.add(null);
    }


    /**
     * T.C - O(log n)
     *
     * @param element
     */
    public void add(int element) {

        data.add(element);

        int currentIndex = data.size() - 1;
        int parentIndex = currentIndex / 2;


        while (currentIndex != 1) {
            if (data.get(currentIndex) >= data.get(parentIndex)) {
                break;
            }
            int currentData = data.get(currentIndex);
            int parentData = data.get(parentIndex);


            data.set(currentIndex, parentData);
            data.set(parentIndex, currentData);

            currentIndex = parentIndex;
            parentIndex = currentIndex / 2;
        }

    }

    public int removeMin() {

        int min = data.get(1);
        int last = data.get(data.size() - 1);

        data.set(1, last);
        data.remove(data.size() - 1);


        int currentIndex = 1;
        int leftChildIndex = currentIndex * 2;
        int rightChildIndex = currentIndex * 2 + 1;


        while (leftChildIndex < data.size() - 1) {
            int minIndex = currentIndex;
            int currentData = data.get(currentIndex);
            int leftData = data.get(leftChildIndex);
            int rightData = data.get(rightChildIndex);

            if (leftData < currentData) {
                minIndex = leftChildIndex;
            }

            if (rightChildIndex < data.size()) {
                if (rightData < data.get(minIndex)) {
                    minIndex = rightChildIndex;
                }
            }

            if(minIndex == currentIndex) {
                break;
            }

            data.set(currentIndex, data.get(minIndex));
            data.set(minIndex, currentData);
            leftChildIndex = currentIndex * 2;
            rightChildIndex = currentIndex * 2 + 1;
        }

        return  min;
    }
}
