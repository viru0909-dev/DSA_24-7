package Week_One;

import java.util.Arrays;

class twoSumSolution {
    //writing method for two sum problem from LeetCode.
    public static int[] twoSum(int[] nums, int target){
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1 ; j < nums.length; j++) {
                if(nums[j]==(target-nums[i])){
                    return new int[] {i, j};
                }
            }
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] nums = {2,7,8,9,10};
        int target = 9;

        int[] sol= twoSum(nums,target);

        System.out.println("The resulting indices are: "+ Arrays.toString(sol));

    }
}
