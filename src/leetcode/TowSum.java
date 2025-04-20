package leetcode;

import java.util.HashMap;

public class TowSum {
/*

    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];

        for (int i = 0; i < nums.length; i++) {
            int num1 = nums[i];

            for (int j = 0; j < nums.length; j++) {
                int num2 = nums[j];

                if (i !=j && num1 + num2 == target){
                    result[0] = num1;
                    result[1] = num2;
                }
            }
        }

        return result;
    }
*/

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if(map.containsKey(complement)){
                return new int[]{ map.get(complement), i };
            }

            map.put(nums[i], i);
        }

        return new int[0];
    }

    public static void main(String[] args) {

        int[] nums = {2,5,8,9};
        int target = 7;

        int[] result = twoSum(nums, target);

        System.out.printf("num1 = " + result[0] + ", num2 = " + result[1]);

    }

}
