package heap;

import java.util.Collections;
import java.util.Iterator;
import java.util.PriorityQueue;

public class KthLargestElementArray_215 {


    /**
     Given an integer array nums and an integer k, return the kth-largest element in the array.

     Note that it is the kth-largest element in the sorted order, not the kth distinct element.

     You must solve it in O(n) time complexity.


     Input: nums = [3,2,1,5,6,4], k = 2
     Output: 5
     **/


    private static int kthLargestElemOfArray(int[] array, int k){

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < array.length; i++) {
            pq.add(array[i]);
        }

        for (int i = 0; i < k - 1; i++) {
            pq.remove();
        }

        System.out.println(pq);


        return pq.peek();
    }







    public static void main(String[] args) {

        int[] ints = {3, 2, 1, 5, 6, 4};

        System.out.println(kthLargestElemOfArray(ints, 2));
//        kthLargestElemOfArray(ints, 2);

    }


}
