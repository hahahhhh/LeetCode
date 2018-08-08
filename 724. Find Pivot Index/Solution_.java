class Solution {
    public int pivotIndex(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        int left = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i != 0) {
                left += nums[i - 1];
            }
            int right = sum - nums[i] - left;
            if (right == left) {
                return i;
            }
        }
        return -1;
    }
}