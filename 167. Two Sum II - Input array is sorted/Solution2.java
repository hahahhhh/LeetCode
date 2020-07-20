class Solution2 {
    public int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        int start = 0;
        int end = numbers.length-1;
        while (start + 1 < end) {
            int middle = start + (end-start)/2;
            if (numbers[start] + numbers[end] < target) {
                if (numbers[middle] + numbers[end] < target) {
                    start = middle;
                }
                else {
                    start++;
                }
            }
            else if(numbers[start] + numbers[end] > target) {
                if (numbers[middle] + numbers[start] > target) {
                    end = middle;
                }
                else {
                    end--;
                }
            }
            else {
                break;
            }
        }
        result[0] = start+1;
        result[1] = end+1;
        return result;
    }

}