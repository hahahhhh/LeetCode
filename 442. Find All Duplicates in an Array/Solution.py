class Solution:
    def findDuplicates(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        List = []
        for i in range(len(nums)):
            mark = abs(nums[i]) - 1
            if nums[mark] < 0:
                List.append(mark + 1)
            else:
                nums[mark] = -nums[mark]
        return List
            