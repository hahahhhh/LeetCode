class Solution {
    public String reverseString(String s) {
        if (s == null || s.length() == 0) return s;
        char[] array = s.toCharArray();
        int length = s.length() - 1;
        for (int i = 0; i < length; i++, length--) {
            array[i] ^= array[length];
            array[length] ^= array[i];
            array[i] ^= array[length];
        }
        return new String(array);
    }
}