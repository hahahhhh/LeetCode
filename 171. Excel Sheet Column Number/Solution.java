public class Solution123 {
    public int titleToNumber(String s) {
        int temp = 0;
        for (int i = 0; i < s.length(); i++) {
            int num = s.charAt(i) - 'A' + 1;
            temp = temp * 26 + num;
        }
        return temp;
    }

}
