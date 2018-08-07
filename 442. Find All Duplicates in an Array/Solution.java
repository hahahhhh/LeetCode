class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        //用数组自己做标记
        List<Integer> tar = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int mark = Math.abs(nums[i])-1;
            if(nums[mark]<0){
                tar.add(mark+1);
            }else {
                nums[mark]=-nums[mark];
            }
        }
        return tar;
        }
    }
