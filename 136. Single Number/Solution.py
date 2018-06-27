class Solution:
    def singleNumber(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        res =0
        for i in range(0,len(nums)):
            res ^=nums[i]
        return res