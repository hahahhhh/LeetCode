class Solution:
    def findDisappearedNumbers(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        mark = [0]*(len(nums)+1)
        res =[]
        for num in nums:
            mark[num] = 1
        for i in range(1,len(nums)+1):
            if mark[i]==0:
                res.append(i)
        return res
                
            