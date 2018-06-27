class Solution {
    public int[] plusOne(int[] digits) {
        int checkpoint=1;
            for (int i =digits.length-1;i>=0;i--){
                if (digits[i]+checkpoint>9){
                    digits[i]=0;
                }else{
                    digits[i]=digits[i]+checkpoint;
                    checkpoint=0;
                }
            }
            if (checkpoint!=0){
                int[] res = new int[digits.length+1];
                res[0]=1;
                return res ;
            }
        return  digits;
    }
}