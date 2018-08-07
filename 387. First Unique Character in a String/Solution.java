class Solution {
    public int firstUniqChar(String s) {
       int[] b =new int[256];
            char[] a = s.toCharArray();
            for (int i=0;i<s.length();i++){
                b[(int)a[i]]+=1;
            }
            for (int i =0;i<s.length();i++){
                if (b[(int)a[i]]==1){
                    return i;
                }
            }
            return -1;
    }
}