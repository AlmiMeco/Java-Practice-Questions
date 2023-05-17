import java.util.*;

public class ContainsDuplicate_217 {


    /** Given an integer array nums, return true if any value appears at least twice in the array, and return false
        if every element is distinct.

     Input: nums = [1,2,3,1]
     Output: true
     **/


    public static boolean containsDuplicate(int[] nums) {

        Set<Integer> uniques = new HashSet<>();

        for (int i = 0; i < nums.length; i++)
        {
            if (uniques.contains(nums[i])) {
                return true;

            }
            uniques.add(nums[i]);
        }
        return false;

    }




    public static void main(String[] args) {

        int[] array = {1,2,3,4};
        int[] array2 = {1,1,1,3,3,4,3,2,4,2};
        int[] array3 = {1,1};

        System.out.println(containsDuplicate(array3));

    }



}
