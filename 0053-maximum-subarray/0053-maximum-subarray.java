class Solution {
    public int maxSubArray(int[] nums) {
        int max_sum=nums[0];
        int current_max=nums[0];
        for(int i=1;i<nums.length;i++){
            if(current_max+nums[i]>nums[i]){
                current_max=current_max+nums[i];
            }
            else{
                current_max=nums[i];
            }
            if(current_max>=max_sum){
                max_sum=current_max;
            }
        }
        return max_sum;
    }
}