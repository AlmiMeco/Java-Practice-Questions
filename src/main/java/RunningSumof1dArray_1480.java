import java.util.Arrays;

public class RunningSumof1dArray_1480 {

    /** Given an array nums. We define a running sum of an array as ---------> runningSum[i] = sum(nums[0]…nums[i]).
     Return the running sum of nums. ---->
     Input: nums = [1,2,3,4] ------------>
     Output: [1,3,6,10] ----------------->
     Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].

     https://leetcode.com/problems/running-sum-of-1d-array/

     **/


        public static int[] runningSum(int[] nums) {

            int sumOfPrevNumbers = 0;               // empty pointer (tally up the sum of all previously passed indecies)

            int[] newArray = new int[nums.length];  // new array created to store the running sum of old array

            for (int i = 0; i < nums.length; i++) {
                sumOfPrevNumbers += nums[i];        // each iteration the current index value {i} is added to the sumOfPrevNumbers
                newArray[i] = sumOfPrevNumbers;     // the asigned value (sumOfPrevNumbers) is added to the current index


            }

            System.out.println("Original Array --(input)--> "+ Arrays.toString(nums));
            System.out.println("New Array  ----(output)---> "+ Arrays.toString(newArray));
            return newArray;
        }

    public static void main(String[] args) {

            int nums[] = {1,2,3,4};
//            int nums[] = {1,1,1,1,1};
//            int nums[] = {3,1,2,10,1};

            runningSum(nums);
    }


}
