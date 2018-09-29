import java.util.Arrays;

public class Solution {
    public int[] sortArrayByPairty(int[] A){
        int[] B =new int[A.length];
        int end = A.length-1;
        int k = 0 ;
        for (int i = 0;i<A.length;i++){
            if (A[i]%2==0){
                B[k]=A[i];
                k++;
            }else {
                B[end] = A[i];
                end--;
            }
        }
        return B;
    }
    
    public static void main(String[] args){
        int[] A = {2,3,4,5,6,7,8};
        Solution a = new Solution();
        System.out.println(Arrays.toString(a.sortArrayByPairty(A)));

    }
}
