class Solution2 {
    public int searchInsert(int[] nums, int target) {
        if(nums == null || nums.length == 0){
            return -1;
        }

        int left = 0;
        int right = nums.length - 1;
        int min = 0;
        while (left <= right){
            min = (left + right) / 2;
            if (nums[min] == target){
                return min;
            }else if(nums[min] > target){
                right = min - 1;
            }else {
                left = min + 1;
            }
        }

        if(nums[min] > target){
            return min;
        }else {
            return min + 1;
        }
    }
}