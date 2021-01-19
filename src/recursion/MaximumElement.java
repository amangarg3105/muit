package recursion;


public class MaximumElement {


    public static int findMax(int[] arr, int index) {

        if(index == arr.length - 1) {
            return arr[index];
        }


        int smallerProblemMax = findMax(arr, index + 1);

        int mainMax = Math.max(arr[index], smallerProblemMax);

        return mainMax;
    }

    public static void main(String[] args) {

        int [] input = {2,1, 5, 4};

        System.out.println(findMax(input, 0));

    }
}
