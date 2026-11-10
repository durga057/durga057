class Solution {
    public int rob(int[] nums) {
        int l1 = nums.length;
        if(l1 == 0) return 0;
        if(l1 == 1) return nums[0];
        int[] dp = new int[l1 + 1];
        dp[0] = 0;
        dp[1] = nums[0];
        for(int i = 2;i<=l1;i++){
            dp[i] = Math.max(nums[i-1]+dp[i-2],dp[i-1]);
        }
        return dp[l1];


    }
}