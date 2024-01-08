class Solution {
    public int missingNumber(int[] nums) {
	//Approach 1
        // int n=nums.length;
        // int sum1=0;
        // for(int i=0;i<nums.length;i++)
        // {
        //     sum1=sum1+nums[i];
        // }
        // int sum2 = (n * (n + 1)) / 2;
        // int ans=sum2-sum1;
        // return ans;
	//Approach 2
        int n=nums.length;
        int xor1=0; int xor2=0;
        for(int i=0;i<n;i++)
        {
            xor1=xor1^i;
            xor2=xor2^nums[i];
        }
        return xor1^n^xor2;
    }
}