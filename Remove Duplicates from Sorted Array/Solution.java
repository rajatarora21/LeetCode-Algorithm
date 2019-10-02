class Solution {
    public int removeDuplicates(int[] nums) 
    {
       int temp=1;
        
        for(int i=0,j=1;j<nums.length;j++)
        {
            if(nums[i]!=nums[j])
            {
                temp++;
                nums[i+1]=nums[j];
                i++;
            }
            
           
        }
        return temp;        
    }
}