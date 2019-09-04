public class Solution {
    public int lengthOfLastWord(String s) {
        String[] result = s.split(" ");
        if (s.length()==0||result.length==0){
            return 0;
        }
        return result[result.length-1].length();
    }
}
