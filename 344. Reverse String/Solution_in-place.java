class Solution {
    public String reverseString(String s) {
        char[] a=s.toCharArray();
        int j=0;
        int i=s.length()-1;
        while(j<i){
            char temp=a[j];
            a[j]=a[i];
            a[i]=temp;
            j++;
            i--;
        }
        return new String(a);
    }
}