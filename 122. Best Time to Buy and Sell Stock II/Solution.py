class Solution:
    def maxProfit(self, prices):
        """
        :type prices: List[int]
        :rtype: int
        """
        maxprofit = 0
        for i in range(1,len(prices)):
            d=prices[i]-prices[i-1]
            if d>0:
                maxprofit += d
        return maxprofit
        