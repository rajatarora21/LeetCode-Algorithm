class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        int start=-1,end=-1;
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==target)
            {
                end=i;
                count=count+1;
            }
            
        }
        int[] temp= {start,end};
        if(end!=-1)
        {
            start=end-count+1;
            int[] temp1= {start,end};
            return temp1;
        }
        return temp;
            
    }
}