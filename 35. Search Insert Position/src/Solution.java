public class Solution {
    public int searchInsert(int[] nums, int target) {
        int index = 0;
        for (int i = 0;i<nums.length;i++) {
            if (nums[0]>target){
                return 0;
            }
            if (nums[i] == target) {
                return i;
            } else if (nums[i] < target) {
                index = i;
            }
        }
        return index+1;
    }
}
