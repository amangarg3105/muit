package heaps;


import java.util.ArrayList;

public class CustomMinPriorityQueue {


    private ArrayList<Integer> list;

    CustomMinPriorityQueue() {
        list = new ArrayList<>();
    }


    /**
     * T.C - O(1)
     * @param element
     */
    public void add(int element) {
        list.add(element);
    }

    /**
     * This function removes the minimum element from the array list
     *
     * 1. Iterate Over the array list
     * 2. Find the minimum element
     * 3. Remove it
     *
     * T.C - O(n)
     * @return
     */
    public int remove() {

        int minimum = list.get(0);
        int minimumIndex = 0;

        for(int i = 1; i < list.size(); i++) {
            if(minimum > list.get(i)) {
                minimum = list.get(i);
                minimumIndex = i;
            }
        }
        list.remove(minimumIndex);
        return minimum;
    }
}
