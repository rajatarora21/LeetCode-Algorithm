class Solution {
    public int findMin(int[] nums) {
        
        int temp=nums[0];
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<temp)
            {
                temp=nums[i];
            }
        }
        return temp;
    }
}