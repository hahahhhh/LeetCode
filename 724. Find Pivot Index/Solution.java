class Solution {
    public int pivotIndex(int[] nums) {
        int sum1 = 0, sum2 = 0;
        for (int i = 0; i <= nums.length - 1; i++) {
            for (int k = 0; k < i; k++) {
                sum1 += nums[k];
            }
            for (int j = nums.length - 1; j > i; j--) {
                sum2 += nums[j];
            }
            if (sum1 == sum2) {
                return i;
            } else {
                sum1 = 0;
                sum2 = 0;
            }
        }
        return -1;
    }
}