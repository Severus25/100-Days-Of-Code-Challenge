class Solution {
    public boolean canJump(int[] nums) {
        boolean[] dp = new boolean[nums.length];
        Arrays.fill(dp, false);
        dp[nums.length-1] = true;
        for(int i = nums.length - 2; i >= 0; i--){
            if(nums[i] == 0)
                dp[i] = false;
            else{
                if(nums[i] + i >= nums.length)
                    dp[i] = true;
                else{
                   for(int j = 1; j <= nums[i]; j++){
                       dp[i] = dp[i] || dp[i + j];
                       j += nums[i + j];
                   } 
                }
            }
        }
        return dp[0];
    }
}
