class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> tar = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int mark = Math.abs(nums[i]) - 1;
            if (nums[mark] > 0) {
                nums[mark] = -nums[mark];
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                tar.add(i + 1);
            }
        }
        return tar;
    }
}