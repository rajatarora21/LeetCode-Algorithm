class Solution {
    public int majorityElement(int[] nums) 
    {
         HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
         for(int i=0;i<nums.length;i++)
         {
             if(map.containsKey(nums[i]))
             {
                 int temp=map.get(nums[i]);
                 map.replace(nums[i],temp+1);
             }
             else
             {
                map.put(nums[i],1);     
             }
               
         }
        Iterator hmIterator = map.entrySet().iterator();
        int max=0;
        int maxKey=0;
        while(hmIterator.hasNext())
        {
            Map.Entry mapElement = (Map.Entry)hmIterator.next();
            if(max<(int)mapElement.getValue())
            {
                max=(int)mapElement.getValue();
                maxKey=(int)mapElement.getKey();
            }
                
        }
        return maxKey;
            
    }
}