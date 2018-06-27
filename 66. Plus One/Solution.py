class Solution(object):
    def plusOne(self, digits):
        """
        :type digits: List[int]
        :rtype: List[int]
        """
        check=1
        for i in range(len(digits)-1,-1,-1):
            if digits[i]+check>9:
                digits[i]=0
            else:
                digits[i] =digits[i] +check
                check =0
        if check ==1:
            digits.insert(0,1)
        return digits