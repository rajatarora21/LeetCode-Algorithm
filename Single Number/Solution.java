class Solution {
    public int singleNumber(int[] nums) 
    {
       HashMap<Integer,Boolean> map=new HashMap<Integer,Boolean>();
        for(int i=0;i<nums.length;i++)
        {
        
            if(map.containsKey(nums[i]))
            {
                map.put(nums[i],true);    
            }
            else
            {
                 map.put(nums[i],false);  
            }
            
        }
        for(int i=0;i<nums.length;i++)
        {
            if(map.get(nums[i])==false)
                return nums[i];
        }
        return 0;
    }
}