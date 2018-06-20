class Solution {
    public int reverse(int x) {
        long a = 0;
        boolean negative = x<0;
        if (negative) x=-x;
        while(x>0){
            a = x % 10 + a * 10;
            x /= 10;
        }
        if(negative) a=-a;
        if (a > Integer.MAX_VALUE || a < Integer.MIN_VALUE) return 0;
        return (int) a;
    }

}