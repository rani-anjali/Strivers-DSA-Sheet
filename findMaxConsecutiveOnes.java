class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0;
        int max=-1;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==1)
            {
            count++;
            if(count>max)
                max=count;
            }
            else if(nums[i]==0)
            {
                if(count>max)
                max=count;
                count=0;
            }
            
        }
        return max; 
    }
}