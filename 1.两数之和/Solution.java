import java.util.*;

public class Solution {

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0 ; i < nums.length ; i++){
                if(map.containsKey(target - nums[i])){
                    return new int[] {map.get(target-nums[i]),i};
                }
                map.put(nums[i],i);
        }
       return  null;
    }


    public static void main(String[] args) {
       // int[] nums = new int[] {1,2,3,4,5,6,7,8};
        int[] nums = new int[] {2,7,11,15};
        int [] result =twoSum(nums,9);
        System.out.println(Arrays.toString(result));
    }
}
