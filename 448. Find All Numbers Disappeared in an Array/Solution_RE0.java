class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
       List<Integer> tar = new ArrayList<>();
        int[] a = new int[nums.length + 1];
        for (int i = 1; i <=nums.length; i++) {
            a[i] = i;
        }
        for (int i = 0; i < nums.length; i++) {
            a[nums[i]] = 0;
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] != 0) {
                tar.add(a[i]);
            }
        }
        return tar;
    }
}