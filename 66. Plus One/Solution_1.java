class Solution {
    public int[] plusOne(int[] digits) {
        int checkpoint=1;
            for (int i =digits.length-1;i>=0;i--){
                if (checkpoint==0){
                    return digits;
                }
                int pos = digits[i]+checkpoint;
                checkpoint = pos/10;
                digits[i]=pos%10;
            }
            if (checkpoint!=0){
                int[] res = new int[digits.length+1];
                res[0]=1;
                return res ;
            }
        return  digits;
    }
}