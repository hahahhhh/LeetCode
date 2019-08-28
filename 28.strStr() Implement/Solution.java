class Solution {
    public int strStr(String haystack, String needle) {
        if (needle.length() == 0) {
            return 0;
        }
        int i = 0, j = 0;
        boolean matchFound = false;
        while (i < haystack.length() && j < needle.length()) {
            if (haystack.charAt(i) == needle.charAt(j)) {
                i++;
                j++;
                if (j == needle.length()) {
                    matchFount = true;
                    break;
                }
            } else {
                i++;
                i = i - j;
                j = 0;
            }
        }
        if (matchFound) {
            return i - j;
        }
        return -1;
    }
