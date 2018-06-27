class Solution {
    public int singleNumber(int[] nums) {
        int i=0;
        int res=0;
        for(;i<nums.length;i++){
            res^=nums[i];
        }
        return res;
    }
}