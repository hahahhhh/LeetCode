class Solution {
    public int calPoints(String[] ops) {
        int result = 0;
        int[] nums = new int[ops.length];
        int size = -1;
        for (int i = 0; i < ops.length; i++) {
            int temp;
            switch (ops[i]) {
                case "+":
                    temp = nums[size - 1] + nums[size];
                    nums[++size] = temp;
                    result += temp;
                    break;
                case "D":
                    temp = nums[size] * 2;
                    result += temp;
                    nums[++size] = temp;
                    break;
                case "C":
                    result -= nums[size];
                    size--;
                    break;
                default:
                    nums[++size] = Integer.valueOf(ops[i]);
                    result += nums[size];
                    break;
            }
        }
        return result;
    }
}